#   Adivina un Numero
import random


nombre = input('Como te llamas? ')
print(f'Muy bien {nombre}, estoy pensando en un numero entre 1 a 23')


intentos = 0
numero = random.randint(1,23)   #   Rango entre el 1-23


while intentos < 6:
    intentos += 1
    posible = int(input('Escribe el numero que crees correcto: '))
    if posible > numero:
        print('El numero ingresado es mayor')
    elif posible < numero:
        print('El numero ingresado es menor')
    elif posible == numero:
        break
if posible == numero:
    print(f'Felicidades {nombre}, este es el numero "{numero}" correcto, lo lograste en "{intentos}" intentos!!')
if intentos == 1:
    print(f'Felicidades lo lograste a la primera, este es el numero "{numero}" correcto!!')