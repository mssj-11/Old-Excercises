#   Install OpenCV cv2 --> pip install opencv-python
import cv2

image = cv2.imread("palm.jpg")

cv2.imshow("palm", image)
cv2.waitKey(0)

gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)#   Paint Palm  
edges = cv2.Canny(gray, 40, 55, apertureSize=3)

cv2.imshow("Edges in Palm", edges)  #   Bordes en la palma
cv2.waitKey(0)

edges = cv2.bitwise_not(edges)

cv2.imwrite("palmlines.jpg", edges)
palmlines = cv2.imread("palmlines.jpg")

img = cv2.addWeighted(palmlines, 0.3, image, 0.7, 0)