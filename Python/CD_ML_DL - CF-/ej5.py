#   Tipos de datos en un Array
import numpy as np


#   Defininedo el tipo de dato en un Arreglo
a = np.array([1, 2, 3, 4, 5])
flotantes = np.array([1, 2, 3, 4, 5], dtype=float)
cadenas = np.array([1, 2, 3, 4, 5], dtype=str)
booleanos = np.array([1, 2, 3, 4, 5], dtype=bool)
#complejos = np.array([1, 2, 3, 4, 5], dtype=np.complex)


#   Operaciones con 2 o mas arreglos
print(f'El arreglo es de tipo ENTERO: {a.dtype}')
print(f'El arreglo es de tipo FLOTANTE: {flotantes}')
print(f'El arreglo es de tipo STRING: {cadenas}')
print(f'El arreglo es de tipo BOOLEANOS: {booleanos}')  #   Cualquier valo ! a 0 es TRUE
#print(f'El arreglo es de tipo NUMEROS COMPLEJOS: {complejos}')