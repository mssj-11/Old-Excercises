# pip install mediapipe ,   pip install opencv-python   ,   pip install python-time
import cv2
import mediapipe as mp
import time


capture = cv2.VideoCapture(0)

mpHands = mp.solutions.hands
hands = mpHands.Hands()

mpDraw = mp.solutions.drawing_utils

pTime = 0
cTime = 0

while True:
    success, img = capture.read()
    
imgRGB = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)