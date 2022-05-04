import glob
import sys
from itertools import chain

import cv2
import numpy as np
from wand.image import Image


def closest_node(node, nodes):
    nodes = np.asarray(nodes)
    deltas = nodes - node
    dist_2 = np.einsum("ij,ij->i", deltas, deltas)
    return nodes[np.argmin(dist_2)]


def file_name(original_name, suffix):
    return "{name}-{suffix}.jpeg".format(
        name="".join(original_name.split(".")[:-1]), suffix=suffix
    )


def prepare_image(image_name: str):
    image = cv2.imread(image_name)
    gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
    gray = 255 - gray
    blur = cv2.GaussianBlur(gray, (5, 5), 0)
    thresh = blur.copy()

    cv2.threshold(blur, 127, 255, cv2.THRESH_BINARY, dst=thresh)
    thresh = 255 - thresh
    return thresh


def contours(prep_image, original):
    orig_img = cv2.imread(original)
    contours, _ = cv2.findContours(prep_image, cv2.RETR_CCOMP, cv2.CHAIN_APPROX_NONE)
    new_contours = []
    height, width = prep_image.shape[:2]

    points = []
    for contour in contours:
        # TODO 50%
        if len(contour) > min(height / 2, width / 2):
            for point in contour:
                points.append(tuple(point[0]))
            new_contours.append(contour)

    cv2.drawContours(orig_img, new_contours, -1, (255, 0, 0), 10)
    cv2.imwrite(file_name(original, "contours"), orig_img)
    return orig_img


def corners2(prep_image):
    contours_list, _ = cv2.findContours(
        prep_image, cv2.RETR_CCOMP, cv2.CHAIN_APPROX_NONE
    )
    height, width = prep_image.shape[:2]

    points = []
    for contour in contours_list:
        # TODO 50%
        if len(contour) > min(height / 2, width / 2):
            for point in contour:
                points.append(tuple(point[0]))

    return [
        closest_node((0, 0), points),
        closest_node((width, 0), points),
        closest_node((0, height), points),
        closest_node((width, height), points),
    ]


def corners(prep_image, original_name: str):
    original = cv2.imread(original_name)
    gray = cv2.cvtColor(prep_image, cv2.COLOR_BGR2GRAY)
    bi = cv2.bilateralFilter(gray, 5, 75, 75)
    canny = cv2.Canny(bi, 120, 255, 1)

    corners_ref = cv2.goodFeaturesToTrack(canny, 4, 0.1, 500)
    corner_points = []

    for corner in corners_ref:
        x, y = corner.ravel()
        corner_points.append((x, y))
        cv2.circle(original, (int(x), int(y)), 10, (0, 255, 0), -1)

    cv2.imwrite(
        file_name(original_name, "with-corners"),
        original,
        [int(cv2.IMWRITE_JPEG_QUALITY), 100],
    )
    corner_points = sorted(corner_points, key=lambda k: [k[1], k[0]])
    return corner_points


def main():
    pattern = "resources/images/{}.jpg".format(
        sys.argv[1] if len(sys.argv) > 1 else "*"
    )
    for file in glob.glob(pattern):
        prep = prepare_image(file)
        height, width = prep.shape[:2]
        cv2.imwrite("prep.jpeg", prep)
        contoured_image = contours(prep, file)
        cv2.imwrite("contour.jpeg", contoured_image)
        coordinates = corners2(prep)
        base_corners = list(
            chain.from_iterable(
                zip(coordinates, [(0, 0), (width, 0), (0, height), (width, height)])
            )
        )
        base_corners = list(chain.from_iterable(base_corners))
        with Image(filename=file) as img:
            img.distort("perspective", base_corners)
            img.enhance()
            img.auto_orient()
            img.auto_level()
            img.normalize()
            img.contrast()
            filename = file_name(file, "final")
            img.save(filename=filename)
            print("Saved file - {filename}".format(filename=filename))


if __name__ == "__main__":
    main()
