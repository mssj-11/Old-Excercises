#   Crear Arreglos
import numpy as np


#   Defininedo el tipo de dato en un Arreglo
#   FUNCIONES
a = np.empty(10)    #   Arreglo de 3 elementos de tipo BASURA, que almacenan espacion de memoria y posteriormente se podran usar, para almacenar otros datos
b = np.empty(10, dtype=int)    #   Lo mismo, pero defininedo su TIPO de datos
c = np.random.randint(0, 50, 5)    #   Numero de enteros aleatorios, Recibira 3 argumentos de LEY (RANGO y longitu(cantidad de los numeros aleatorios dentro del RANGO))


#   Mostrando arreglos
print(f'El arreglo (a): {a}')
print(f'El arreglo (b): {b}')
print(f'El arreglo (c): {c}')