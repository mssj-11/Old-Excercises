#   Animacion de Cargando
import time
import os

cargando = 'Cargando'
procesando = 'Procesando'
puntos = 0


while True:
    print(cargando + '.' * puntos)
    if puntos == 3:
        puntos = 0
    puntos += 1
    os.system('cls')   #   Limpiando pantalla('cls' en windows)