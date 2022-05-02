import cv2

image = cv2.imread('a4-paper-contour.jpg')
gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
bi = cv2.bilateralFilter(gray, 5, 75, 75)
# canny = cv2.Canny(bi, 120, 255, 1)

corners_ref = cv2.goodFeaturesToTrack(bi, 4, 0.1, 500)
points1 = []
for corner in corners_ref:
    x, y = corner.ravel()
    points1.append((x, y))
points1 = sorted(points1, key=lambda k: [k[1], k[0]])

# for corner in corners:
#     x, y = corner.ravel()
#     cv2.circle(image, (int(x), int(y)), 10, (36, 255, 12), -1)
#
# cv2.imwrite("a4-dots.jpeg", image, [int(cv2.IMWRITE_JPEG_QUALITY), 100])


image = cv2.imread('corner.jpeg')
gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
bi = cv2.bilateralFilter(gray, 5, 75, 75)
# canny = cv2.Canny(bi, 120, 255, 1)

corners_target = cv2.goodFeaturesToTrack(bi, 4, 0.1, 500)
points2 = []
for corner in corners_target:
    x, y = corner.ravel()
    points2.append((x, y))
points2 = sorted(points1, key=lambda k: [k[1], k[0]])
# print(len(corners))
#
# for corner in corners:
#     x, y = corner.ravel()
#     cv2.circle(image, (int(x), int(y)), 10, (36, 255, 12), -1)
#
# cv2.imwrite("corner-contour.jpeg", image, [int(cv2.IMWRITE_JPEG_QUALITY), 100])

# Compute the perspective transform M
h, mask = cv2.findHomography(points1, points2, cv2.RANSAC)
# M = cv2.getPerspectiveTransform(corners_target, corners_ref)

# Apply the perspective transformation to the image
out = cv2.warpPerspective(image, h, (image.shape[1], image.shape[0]), flags=cv2.INTER_LINEAR)

# out = cv2.warpPerspective(image, M, (image.shape[1], image.shape[0]), flags=cv2.INTER_LINEAR)

cv2.imwrite("corner-upd.jpeg", out)
