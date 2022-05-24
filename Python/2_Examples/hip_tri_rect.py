#   calcule la hipotenusa de un triángulo rectángulo, dados los catetos
'''
El problema nos pide el uso de la raíz cuadrada debido a que la hipotenusa es c = √ a^2 + b^2,  y para ello utilizaremos la librería matemática de Python en sus diferentes métodos o funciones 
que dispone. Utilizaremos las fórmulas conocidas:

a y b son catetos, y el valor hallar será c.
Python dispone del método o función sqrt para la raíz 
cuadrada y de hypot para encontrar la hipotenusa ingresando sólo los valores de los catetos y aplica el teorema de Pitágoras
'''

import math

a = 3
b = 4

c1 = math.sqrt(a*a + b*b)
c2 = math.hypot(a, b)

print("Hipotenusa de C1: ", c1)
print("Hipotenusa de C2: ", c2)