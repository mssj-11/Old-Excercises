#  Convert any Image to Cartoon / Convierte cualquier imagen en dibujos animados

# install library OpenCV, numpy
import cv2
import numpy as np

# Reading Image / Leer Imagen
img = cv2.imread("imageF.jpg")

# Edges / Bordes
gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
gray = cv2.medianBlur(gray, 5)
edges = cv2.adaptiveThreshold(gray, 255, 
                              cv2.ADAPTIVE_THRESH_MEAN_C,
                              cv2.THRESH_BINARY, 9, 9)

# Cartonization / Cartonización-Animacion
color = cv2.bilateralFilter(img, 9, 250, 250)
cartoon = cv2.bitwise_and(color, color, mask=edges)


cv2.imshow("Image", img)
cv2.imshow("Edges", edges)
cv2.imshow("Cartoon", cartoon)
cv2.waitKey(0)
cv2.destroyAllWindows()

# Create Images
cv2.imwrite("Edges.jpg", edges)
cv2.imwrite("Cartoon.jpg", cartoon)