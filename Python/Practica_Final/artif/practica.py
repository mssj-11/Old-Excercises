from tkinter import *
import os
import cv2
from matplotlib import pyplot
from mtcnn.mtcnn import MTCNN
import numpy as np




"""******************************************************************"""

def registrar_usuario():
    usuario_info = usuario.get() #Obetnemos la informacion alamcenada en usuario
    contra_info = contra.get() #Obtenemos 1a informacion almacenada en contra
    
    archivo = open(usuario_info, "w") #Abriremos la informacion en modo escritura
    archivo.write(usuario_info + "\n") #fescribimos la info
    archivo.write(contra_info)
    archivo.close()

    #Limpiaremos los text variable
    usuario_entrada.delete(0, END)
    contra_entrada.delete(0, END)
    
    #Anora le diremos al usuario que su registro ha sido exitoso
    Label(pantalla1, text = "Registro Convencional Exitoso", fg = "green", font =("Calibri",11)).pack()



"""******************************************************************"""

#funcion para boton registro
def registro():
    global usuario 
    global contra
    global usuario_entrada
    global contra_entrada
    global pantalla1 
    pantalla1 = Toplevel(pantalla)
    pantalla1.title("Registro")
    pantalla1.geometry("300x250")  #Creamos la ventana

"""******************************************************************"""


#Funcion para almacenar el registro facila
def registro_facial():
    cap = cv2.VideoCapture(0)
    while(True):
        ret,frame = cap.read()
        cv2.imshow('Registro Facial',frame)
        if cv2.waitKey(1) == 27:
            break
usuario_img = usuario.get()
cv2.imwrite(usuario_img+".jpg",frame)
cap.release()
cv2.destroyAllWindows()

usuario_entrada.delete(0, END)
contra_entrada.delete(0, END)
Label (pantalla1, text = "Registro Facial Exitoso", fg = "green", font = ("Calibri", 11)).pack()


"""******************************************************************"""

#Creacion de entradas
#Empezaremos a crear las entradas
usuario = StringVar()
contra = StringVar()

Label (pantalla1, text = "Registro facial: debe de asignar un usuario:").pack()
#fLabel (pantallal, text = "").pack() FDejamos un ppco de espacio
Label (pantalla1, text = "Registro tradicional: asignar usuario y contraseña: ").pack()
Label (pantalla1, text = "").pack() #Dejamos un poco de espacio
Label (pantalla1, text = "Usuario * ").pack()# ¿Mostramos en la pantalla 1 el usuario
usuario_entrada = Entry(pantalla1, textvariable = usuario) #fCreamos un text variable para que el usuario ingre
usuario_entrada.pack()
Label (pantalla1, text = "Contraseña * ").pack() #¿Mostramos en la pantalla 1 la contraseña
contra_entrada = Entry(pantalla1, textvariable = contra) #fCzeamos un text variable para que el usuario ingrese
contra_entrada.pack()
Label (pantalla1, text = "").pack() #Dejamos un espacio para la creacion del boton
Button(pantalla1, text = "Registro Tradicional", width = 15, height = 1, command = registrar_usuario).pack()
 

# --- Vamos a crear el boton para hacer el registro facial ==. ----
Label (pantalla1, text = "").pack()
Button (pantalla1, text = "Registro Facial", width = 15, heíght = 1, command = registro_facial).pack()

"""******************************************************************"""




#Detectamos el rostro y exportamos los pixeles
def reg_rostro(img, lista_resultados):
    data = pyplot.imread(img)
    for i in range(len(lista_resultados)):
        x1,y1,ancho, alto = lista_resultados[i]['box']
        x2,y2 = x1 + ancho, y1 + alto
        pyplot.subplot(1, len(lista_resultados), i+1)
        pyplot.axis ('off')
        cara_reg = data[y1:y2, x1:y2]
        cara_reg = cv2.resize(cara_reg,(150,200), interpolation = cv2.INTER_CUBIC)
        cv2.imwrite(usuario_img+".jpg",cara_reg)
        pyplot.imshow(data[y1:y2, x1:x2])
        pyplot.show()

img = usuario_img+".jpg"
pixeles = pyplot.imread(img)
detector = MTCNN()
caras = detector.detect_faces(pixeles)
reg_rostro(img, caras)








#- Funcion pera verificar los datos ingresados al login --
def verificacion_login():
    log_usuario = verificacion_usuario.get()
    log_contra = verificacion_contra.get()

    usuario_entrada2.delete(0, END)
    contra_entrada2.delete(0, END)
    
    lista_archivos = os.listdir()
    if log_usuario in lista_archivos:
        archivo2 = open(log_usuario, "r")
        verificacion = archivo2.read().splitlines()

        if log_contra in verificacion:
            print("Inicio de sesion exitoso")
            Label(pantalla2, text = "Inicio de Sesion Exitoso", fg ="green", font = ("Calibri",11)).pack()
        else:
            print("Contraseña incorrecta,ingrese de nuevo")
            Label(pantalla2, text ="Contraseña incorrecta",fg = "red", font = ("Calibri",11)).pack()
    else:
        print("Usuario no encontrado")
        Label(pantalla2, text = "Usuario encontrado", fg = "red", font = ("Calibri",11)).pack()

#Funcion para el Login Facial
def login_facial():
#vamos a hacer la deteccion
    cap = cv2.VideoCapture(0) #Eleginos la camara
    while(True):
        ret, frame = cap.read() #Leemos 1 video
        cv2.imshow('Login Facial', frame) #Mostramos el video en pantalla
        if cv2.waitkey(1) == 27: # do oprimamos "Escape" rompe el video
            break

usuario_login = verificacion_usuario.get()  #Con esta variable vamos a gu
cv2.imwrite(usuario_login+"LOG.jpg", frame) #Guardamos 1a ultima caputr
cap.release() #Cerramos
cv2.destroyAllWindows()

usuario_entrada2.delete(0, END)  #Limpiamos los text de las variables
contra_entrada2.delete(0, END)


#Funcion para guardar el rostro 
def log_rostro(img, lista_resultados):
    data = pyplot.imread(img)
    for i in range(len(lista_resultados)):
        x1,y1,ancho, alto = lista_resultados[i] ['box']
        x2,y2 = x1 + ancho, y1 + alto
        pyplot.subplot(1, len(lista_resultados), i+1)
        pyplot.axis('off')
        cara_reg = data[y1:y2, x1:x2]
        cara_reg = cv2.resize(cara_reg, (150,200), interpolation = cv2.INTER_CUBIC)
        cv2.imwrite(usuario_login+"LOG.jpg",cara_reg)
        return pyplot.imshow(data[y1:y2, x1:x2])
pyplot.show()

#detectamos el restro
img = usuario_login+"LOG.jpg"
pixeles = pyplot.imread(img)
detector = MTCNN()
caras = detector.detect_faces(pixeles)
log_rostro(img, caras)


# Funcion para comparar los rostros
def orb_sim(imgl, img2):
    orb = cv2.ORB_create() # creamos elobjeto de comparacion

    kpa, descr_a = orb.detectAndCompute(imgl, None)
    kpb, descr_b = orb.detectAndCompute(img2, None)

    comp = cv2.BFMatcher(cv2.NORM_HAMMING, crossCheck = True)  #Creamos comparador de fuerza
    matches = comp.match(descr_a, descr_b) #Aplicamos el comparador a los descriptores
    regiones_similares = [i for i in matches if i.distance < 70] #Extraemos las regiones

    if len(matches) == 0:
        return 0
    return len(regiones_similares)/len(matches)


#Importamos las imagenes y llamamos la funcion de comp
im_archivos = os.listdir()  #Vanos a importar la lista de archivos 
if usuario_login+".jpg" in im_archivos:  #fomparamos los archivos con el que
    rostro_reg = cv2.imread (usuario_login+".jpg",0) #Importamos el rostro del registro
    rostro_log = cv2.imread (usuario_login+"LOG.jpg",0) #Importamos el rostro 
    similitud = orb_sim(rostro_reg, rostro_log)
    if similitud >= 0.9:
        Label(pantalla2, text ="Inicio de Sesion Exitoso", fg = "green", font = ("Calibri",11)).pack()
        print("Bienvenido al sistema usuario: ",usuario_login)
        print("Compatibilidad con la foto del registro: ",similitud)
    else:
        print("Rostro incorrecto, Certifique su usuario")
        print("Compatibilidad con la foto del registro: ",similitud)
        Label(pantalla2, text = "Incompatibilidad de Rostros", fg = "red", font = ("Calibri",11)).pack()
else:
    print("Usuario no encontrado")
    Label(pantalla2, text = "Usuario no encontrado", fg = "red", font = ("Calibri",11)).pack()


#funcion que asignaremos al boton login
def login():
    global pantalla2
    global verificacion_usuario
    global verificacion_contra
    global usuario_entrada2
    global contra_entrada2

    pantalla2 = Toplevel(pantalla)
    pantalla2.title ("Login")
    pantalla2.geometry("300x250")  #Creamos la ventana
    Label(pantalla2, text = "Login facial: debe de asignar un usuario:").pack()
    Label(pantalla2, text = "Login tradicional: debe asignar usuario y contraseña:").pack()
    Label(pantalla2, text = "").pack() #Dejamos un poco de espacio

    verificacion_usuario = StringVar()
    verificacion_contra = StringVar()


    #INGRESANDO los datos
    Label(pantalla2, text ="Usuario * ").pack()
    usuario_entrada2 = Entry(pantalla2, textvariable = verificacion_usuario)
    usuario_entrada2.pack()
    Label(pantalla2, text = "contraseña * ").pack()
    contra_entrada2 = Entry(pantalla2, textvariable = verificacion_contra)
    contra_entrada2.pack()
    Label(pantalla2, text = "").pack()
    Button(pantalla2, text = "Inicio de Sesion Tradicional", width = 20, height = 1, command = verificacion_login).pack()


    #BOTON para el LOGIN FACIAL 
    Label(pantalla2, text = "").pack()
    Button (pantalla2, text = "Inicio de Sesion Facial", width = 20, height = 1, command = login_facial).pack()


#Funcion de nuestra pantalla principal# 
def pantalla_principal():
    global pantalla       #Globalizamos la variable bara
    pantalla = Tk()
    pantalla.geometry ("300x250") #Asignamos el tamafio de la ventana
    pantalla.title("Aprende e Ingenia") #titulo de 1a p
    Label (text = "Login Inteligente", bg = "gray", width = "300",height = "2", font = ("Verdana", 13)).pack()
 

#Vamos a Crear los Botones -
    Label(text = "").pack() #Creamos el espacio entre el titulo y el primer boton
    Button(text = "Iniciar Sesion", height = "2", width = "30", command = login).pack()
    Label(text = "").pack() #Creamos el espacio entre el primer boton
    Button(text = "Registro", height = "2", width = "30", command = registro).pack()
 
    pantalla.mainloop()
pantalla_principal()

"""******************************************************************"""