#   hipotenusa de un triángulo rectángulo, dados un cateto y un ángulo.
'''
El problema nos pide el uso de las funciones trigonométricas.
El ángulo � y uno de los catetos son dados para el problema, 
se debe recordar las identidades trigonométricas

COS � = adyacente / hipotenusa


Para nuestro problema debemos utilizar el arcoseno o coseno inverso para obtener:
hipotenusa = adyacente / COS^-1 �

Si a = 3, b = 4, entonces c = 5
Para ello el ángulo � es 53.13010235415598  lo vamos a demostrar.
Recordar que el cambio de grados a radianes viene dado por PI / 180 o al revés
'''

import math

from numpy import mat

a = 3
b = 4
c = 5

angulo = 53.13010235415598
hipotenusa = a / math.cos(angulo * math.pi / 180)


print("Hipotenusa :", hipotenusa)

identidad = 3 / 5
te = math.acos(identidad)

print("Angulo: ", te * 180 / math.pi)