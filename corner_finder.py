import glob

import numpy as np
import cv2
from itertools import chain
from wand.image import Image


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

    for contour in contours:
        # TODO 50%
        if len(contour) > min(height / 2, width / 2):
            new_contours.append(contour)

    print(len(contours))
    print(len(new_contours))
    # print(len(new_contours))
    # for (i, c) in enumerate(new_contours):
    #     x, y, w, h = cv2.boundingRect(c)
    #     cropped_contour = original[y:y + h, x:x + w]
    #     cv2.imwrite("crop.jpeg", cropped_contour)

    cv2.drawContours(orig_img, new_contours, -1, (255, 0, 0), 10)
    cv2.imwrite("{}-contours.jpg".format("".join(original.split(".")[:-1])), orig_img)
    return orig_img


def corners(prep_image, original_name: str):
    # image = cv2.imread(image_name)
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
    cv2.imwrite("{}-with-corners.jpeg".format("".join(original_name.split(".")[:-1])), original,
                [int(cv2.IMWRITE_JPEG_QUALITY), 100])
    corner_points = sorted(corner_points, key=lambda k: [k[1], k[0]])
    return corner_points

    # for corner in corners:
    #     x, y = corner.ravel()
    #     cv2.circle(image, (int(x), int(y)), 10, (36, 255, 12), -1)
    #
    # cv2.imwrite("a4-dots.jpeg", image, [int(cv2.IMWRITE_JPEG_QUALITY), 100])
    # corners = cv2.goodFeaturesToTrack(, 10, 0.5, 500)
    #
    # for corner in corners:
    #     print(corner)
    #     x, y = corner.ravel()
    #     cv2.circle(img1, (int(x), int(y)), 10, (255, 0, 0), -1)

    # def align_images(image_name, reference_image_name, ):
    #     MAX_FEATURES = 100
    #     GOOD_MATCH_PERCENT = 0.15
    #     original = cv2.imread(image_name)
    #     im1 = prepare_image(image_name)
    #     im2 = prepare_image(reference_image_name)
    #     cv2.imwrite("reference_bw.png", im2)
    #
    #     orb = cv2.ORB_create(MAX_FEATURES)
    #
    #     keypoints1, descriptors1 = orb.detectAndCompute(im1, None)
    #
    #     keypoints2, descriptors2 = orb.detectAndCompute(im2, None)
    #
    #     # Match features.
    #
    #     matcher = cv2.DescriptorMatcher_create(cv2.DESCRIPTOR_MATCHER_BRUTEFORCE_HAMMING)
    #     matches = matcher.match(descriptors1, descriptors2, None)
    #     matches = list(matches)
    #     # Sort matches by score
    #     matches.sort(key=lambda x: x.distance, reverse=False)
    #     # Remove not so good matches
    #     numGoodMatches = int(len(matches) * GOOD_MATCH_PERCENT)
    #     matches = matches[:numGoodMatches]
    #     # Draw top matches
    #     imMatches = cv2.drawMatches(im1, keypoints1, im2, keypoints2, matches, None)
    #     cv2.imwrite("matches.jpg", imMatches)
    #     # Extract location of good matches
    #     points1 = np.zeros((len(matches), 2), dtype=np.float32)
    #     points2 = np.zeros((len(matches), 2), dtype=np.float32)
    #
    #     for i, match in enumerate(matches):
    #         points1[i, :] = keypoints1[match.queryIdx].pt
    #         points2[i, :] = keypoints2[match.trainIdx].pt
    #
    #     # Find homography
    #     h, mask = cv2.findHomography(points1, points2, cv2.RANSAC)
    #     # Use homography
    #     height, width = im2.shape[:2]
    #     im1Reg = cv2.warpPerspective(original, h, (width, height))
    #     return im1Reg, h


def main():
    for file in glob.glob("resources/images/*.jpg"):
        prep = prepare_image(file)
        height, width = prep.shape[:2]
        cv2.imwrite("prep.jpeg", prep)
        contoured_image = contours(prep, file)
        cv2.imwrite("contour.jpeg", contoured_image)
        coordinates = corners(contoured_image, file)
        # print(coordinates)
        # todo find coordinates based on image height/width

        base_corners = list(
            chain.from_iterable(zip(coordinates, [(0, 0), (960, 0), (0, 1280), (960, 1280)]))
        )
        base_corners = list(chain.from_iterable(base_corners))
        print(base_corners)
        with Image(filename=file) as img:
            img.distort('perspective', base_corners)
            img.save(filename="{}-final.jpg".format("".join(file.split(".")[:-1])))


if __name__ == '__main__':
    main()
