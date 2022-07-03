from itertools import chain
from os.path import basename, dirname, join

import cv2
from wand.image import Image

from transformer.utils import closest_node, file_name


def process(file, folder=None):
    prep = prepare(file)
    if not folder:
        folder = dirname(file)
    height, width = prep.shape[:2]
    coordinates = corners(prep)
    base_corners = list(
        chain.from_iterable(
            zip(coordinates, [(0, 0), (0, height), (width, height), (width, 0)])
        )
    )
    base_corners = list(chain.from_iterable(base_corners))
    filename = file_name(join(folder, basename(file)), "final")
    with Image(filename=file) as img:
        img.distort("perspective", base_corners)
        img.enhance()
        img.auto_orient()
        img.auto_level()
        img.normalize()
        img.contrast()
        img.save(filename=filename)
        print(f"Saved file - {filename}")
    return filename


def fix_colors(file, folder=None):
    filename = file_name(join(folder, basename(file)), "final-colors")
    with Image(filename=file) as img:
        img.enhance()
        img.auto_orient()
        img.auto_level()
        img.normalize()
        img.contrast()
        img.save(filename=filename)
        print(f"Saved file - {filename}")
    return filename


def prepare(image_name: str):
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
    image_contours, _ = cv2.findContours(
        prep_image, cv2.RETR_CCOMP, cv2.CHAIN_APPROX_NONE
    )
    new_contours = []
    height, width = prep_image.shape[:2]

    points = []
    for contour in image_contours:
        # TODO 50%
        if len(contour) > min(height / 2, width / 2):
            for point in contour:
                points.append(tuple(point[0]))
            new_contours.append(contour)

    cv2.drawContours(orig_img, new_contours, -1, (255, 0, 0), 10)
    cv2.imwrite(file_name(original, "contours"), orig_img)
    return orig_img


def corners(prep_image):
    contours_list, _ = cv2.findContours(
        prep_image, cv2.RETR_CCOMP, cv2.CHAIN_APPROX_NONE
    )
    height, width = prep_image.shape[:2]

    points = []
    for contour in contours_list:
        if len(contour) > min(height / 2, width / 2):
            for point in contour:
                points.append(tuple(point[0]))

    return (
        tuple(closest_node((0, 0), points)),
        tuple(closest_node((0, height), points)),
        tuple(closest_node((width, height), points)),
        tuple(closest_node((width, 0), points)),
    )


def corners_lab(prep_image, original_name: str):
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
