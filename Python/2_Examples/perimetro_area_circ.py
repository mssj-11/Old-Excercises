#   Calcule al perímetro y área de un círculo dado su radio
'''
El problema nos pide el uso de fórmulas para encontrar el perímetro y área de una figura 
geométrica, para ello hay que recordar las fórmulas requeridas :

Para el perímetro tenemos: p = 2PIr
Para el área tenemos: a = PIr^2

Asignamos un valor a la variable radio, r, con el valor de 1. Con esto el resultado a obtenerse 
debe ser el valor de Pi.
'''

import math

r = 1
p = 2 * r * math.pi
a = math.pi * r * r

print("Perimetro :", p)
print("Area :", a)