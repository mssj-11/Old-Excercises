#instalar la libreria ---> pip install opencv-python   DESDE CMD
#Ingresamos al link de GitHub --> para agregar la deteccion de objetos con IA
#Repositorio de OpenCV (Haarcascade reconocimiento facial): https://github.com/opencv/opencv/tree/master/data/haarcascades
#una vez elegido el Haarcascade entre toda la lista ---> daremos en RAW y despues (guardarcomo) y agregarlo en la carpeta donde esta nuestro archivo py

import cv2  #importacion de la libreria instalada 
face_cascade = cv2.CascadeClassifier('haarcascade_frontalface_default.xml')    #Hacemos referencia a la (Haarcascade) que agregamos

cap = cv2.VideoCapture(0)    #Hacemos referencia a nuestra webCAM --> para deteccion facial

#Creacion de ciclo whil infinito para los fotogramas del video (analizar-->deteccion facial)
while True:
    _, img = cap.read()
    gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
    faces = face_cascade.detectMultiScale(gray, 1.1, 4)

    for (x, y , w , h) in faces: #dibujando rectangulos en todas las caras que detecte
        cv2.rectangle(img, (x, y),  (x+w, y+h), (255, 0, 0), 3)
        cv2.imshow('PRACTICA', img)
        k = cv2.waitKey(40)
        if k == 27: # el Num -->27 en codigo ASCII es = a ESC
            break
cap.release()










