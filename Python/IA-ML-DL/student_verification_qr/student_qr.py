import numpy as np  #pip install numpy
from pyzbar.pyzbar import decode    #pip install pyzbar
import cv2

# Reading QR code from an Image
img = cv2.imread("qr1.png")

code = decode(img)

print(code)
for barcode in decode(img):
    print(barcode.data) #in bytes
    text = barcode.data.decode('utf-8')
    print(text)
    print(barcode.rect)