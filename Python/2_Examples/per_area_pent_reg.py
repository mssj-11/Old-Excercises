#    calcule el área y perímetro de un pentágono regular
'''
El problema nos pide el uso de fórmulas para encontrar el perímetro y área de una figura 
geométrica regular, para ello hay que recordar las fórmulas requeridas 

n = 5 por el número de lados
Para el perímetro tenemos: p = lado * n
Para el área tenemos: A = p * a donde a es la apotema
'''

lado = 3
n = 5
apotema = 2

p = lado * n
A = p * apotema


print("Perimetro : ", p)
print("Area :      ", A)