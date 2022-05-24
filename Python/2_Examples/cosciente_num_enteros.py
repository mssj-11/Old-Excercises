#   calcule el cociente dados dos números enteros, muestre el resultado con varios dígitos decimales

'''
El problema nos pide el ingreso de dos valores enteros por teclado y luego obtener el cociente con distintas cantidades de decimales, dos, tres, cuatro, etc.

Un primer valor será el dividendo, el otro será el divisor, luego se obtendrá el cociente de ellos mediante el uso del operador / y 
seguido usaremos un formateo para mostrar su resultado dependiendo de la cantidad de dígitos que obtengamos, 
finalmente usaremos tres nuevas funciones de redondeo, redondeo hacia arriba y hacia abajo
'''

import math

n1 = int(input("Ingrese un numero: "))
n2 = int(input("Ingrese un numero mas: "))

cosciente1 = n1 / n2    # Cociente1 es la división normal
cosciente2 = int(n1 / n2)   #  Cociente2 es la división sin redondeo.
cosciente3 = math.ceil(n1 / n2) # Cociente3 con redondeo hacia arriba
cosciente4 = math.floor(n1 / n2) # Cociente4 con redondeo hacia abajo
cosciente5 = round(n1 / n2)

print("Cosciente 1: ", cosciente1)
print("Cosciente 2 SR: ", cosciente2)
print("Cosciente 3 CR Arriba: ", cosciente3)
print("Cosciente 4 CR Abajo: ", cosciente4)
print("Cosciente 5 CR: ", cosciente5)

print("{:23.6f} ".format(cosciente1))   # Contabiliza 23 espacios para todo el número obtenido con 6 dígitos decimales
print("{:10.5f} ".format(cosciente1))   # Utiliza 10 espacios para todo el número obtenido incluyendo el punto decimal, y llena con espacios en blanco de ser necesario a la izquierda
print("{:010.5f} ".format(cosciente1))  # Utiliza 10 espacios para todo, llenando con ceros a la izquierda si faltase

print("{:21d}".format(cosciente2))  # Utiliza 21 espacios para todo el  número, llena con espacios en blanco
print("{:4d}".format(cosciente2))   # Utiliza 4 espacios para todo el número, llena con espacios en blanco a la izquierda
print("{:3d}".format(cosciente2))   # Utiliza 3 espacios para todo el número, llena con espacios en blanco a la izquierda
print("{:2d}".format(cosciente2))
print("{:1d}".format(cosciente2))
print("{:04d}".format(cosciente2))  # Utiliza 4 espacios para todo el número, llena con ceros a la izquierda
print("{:03d}".format(cosciente2))  # Utiliza 3 espacios para todo el número, llena con espacios en blanco a la izquierda
print("{:02d}".format(cosciente2))
print("{:01d}".format(cosciente2))