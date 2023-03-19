#   Crear Arreglos
import numpy as np


#   Defininedo el tipo de dato en un Arreglo
#   FUNCIONES
a = np.array([True, True, False, True, True])   # Estableciendo el tipo BOOLEANO
b = np.arange(0, 100)   # Arreglo a partir de un rango (inicio, fin) -1
c = np.arange(0, 100, 5)   # Arreglo a partir de un rango (inicio, fin) -1, agregando SALTOS a autilizar
d = np.zeros(11)   # Arreglo de CEROS, como parametro la longitud, de tipo FLOTANTE por defecto
df = np.zeros(11, dtype=int)   # Arreglo de CEROS, como parametro la longitud, agregando el TIPO de los datos
e = np.ones(11, dtype=int)   # Arreglo de UNOS, de tipo entero



#   Mostrando arreglos
print(f'El arreglo (a): {a}')
print(f'El arreglo (b): {b}')
print(f'El arreglo (c): {c}')
print(f'El arreglo (d): {d}')
print(f'El arreglo (df): {df}')
print(f'El arreglo (df) es de tipo: {df.dtype}')
print(f'El arreglo (e): {e}')