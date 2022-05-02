import numpy as np
import cv2


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
    contours, _ = cv2.findContours(prep_image, cv2.RETR_CCOMP, cv2.CHAIN_APPROX_NONE)
    new_contours = []
    height, width = prep_image.shape[:2]

    for contour in contours:
        if len(contour) > min(height, width):
            new_contours.append(contour)

    for (i, c) in enumerate(new_contours):
        x, y, w, h = cv2.boundingRect(c)
        cropped_contour = original[y:y + h, x:x + w]
        cv2.imwrite("crop.jpeg", cropped_contour)

    cv2.drawContours(original, new_contours, -1, (255, 0, 0), 10)
    return original


def align_images(image_name, reference_image_name, ):
    MAX_FEATURES = 100
    GOOD_MATCH_PERCENT = 0.15
    original = cv2.imread(image_name)
    im1 = prepare_image(image_name)
    im2 = prepare_image(reference_image_name)
    cv2.imwrite("reference_bw.png", im2)

    orb = cv2.ORB_create(MAX_FEATURES)

    keypoints1, descriptors1 = orb.detectAndCompute(im1, None)

    keypoints2, descriptors2 = orb.detectAndCompute(im2, None)

    # Match features.

    matcher = cv2.DescriptorMatcher_create(cv2.DESCRIPTOR_MATCHER_BRUTEFORCE_HAMMING)
    matches = matcher.match(descriptors1, descriptors2, None)
    matches = list(matches)
    # Sort matches by score
    matches.sort(key=lambda x: x.distance, reverse=False)
    # Remove not so good matches
    numGoodMatches = int(len(matches) * GOOD_MATCH_PERCENT)
    matches = matches[:numGoodMatches]
    # Draw top matches
    imMatches = cv2.drawMatches(im1, keypoints1, im2, keypoints2, matches, None)
    cv2.imwrite("matches.jpg", imMatches)
    # Extract location of good matches
    points1 = np.zeros((len(matches), 2), dtype=np.float32)
    points2 = np.zeros((len(matches), 2), dtype=np.float32)

    for i, match in enumerate(matches):
        points1[i, :] = keypoints1[match.queryIdx].pt
        points2[i, :] = keypoints2[match.trainIdx].pt

    # Find homography
    h, mask = cv2.findHomography(points1, points2, cv2.RANSAC)
    # Use homography
    height, width = im2.shape[:2]
    im1Reg = cv2.warpPerspective(original, h, (width, height))
    return im1Reg, h


def main():
    # original = cv2.imread('1.jpeg')
    # prep_image = prepare_image("1.jpeg")
    # cv2.imwrite("prep.jpeg", prep_image)
    # contoured_image = contours(prep_image, original)
    # cv2.imwrite("corner.jpeg", contoured_image)
    original = cv2.imread('a4-paper.jpg')
    prep_image = prepare_image("a4-paper.jpg")
    # cv2.imwrite("prep.jpeg", prep_image)
    contoured_image = contours(prep_image, original)
    cv2.imwrite("a4-paper-contour.jpg", contoured_image)
    # ref_image = cv2.imread("reference.png")
    # prep_ref_image = prepare_image("reference.png")
    # ontoured_ref = contours(prep_ref_image, ref_image)
    # cv2.imwrite("reference.jpeg", ontoured_ref, [int(cv2.IMWRITE_JPEG_QUALITY), 100])
    # aligned, _ = align_images("crop.jpeg", "reference.png")
    # cv2.imwrite("aligned.jpeg", aligned)

    # cv2.imwrite("ref.jpeg", contoured_image, [int(cv2.IMWRITE_JPEG_QUALITY), 100])
    # img1 = cv2.imread("reference.png")
    # gray1 = cv2.cvtColor(img1, cv2.COLOR_BGR2GRAY)
    # bi = cv2.bilateralFilter(gray1, 5, 75, 75)
    # canny1 = cv2.Canny(bi, 120, 255, 1)
    # corners = cv2.goodFeaturesToTrack(canny1, 10, 0.5, 500)
    #
    # for corner in corners:
    #     print(corner)
    #     x, y = corner.ravel()
    #     cv2.circle(img1, (int(x), int(y)), 10, (255, 0, 0), -1)
    #
    #
    #
    # # cv2.imwrite('reference_bw.jpeg', img1, [int(cv2.IMWRITE_JPEG_QUALITY), 100])
    # img2 = cv2.imread("prep.jpeg")
    # gray2 = cv2.cvtColor(img2, cv2.COLOR_BGR2GRAY)
    # gray2 = np.float32(gray2)
    #
    #
    #
    # cv2.imwrite("ref2.jpeg", img1, [int(cv2.IMWRITE_JPEG_QUALITY), 100])


if __name__ == '__main__':
    main()
