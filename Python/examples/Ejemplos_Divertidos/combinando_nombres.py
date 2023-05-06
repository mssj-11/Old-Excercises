#   Combinando Nombres
import random
nombres = ['Mike', 'Ana', 'Juliana', 'Andrez', 'Paola', 'Jazmin', 'Orlando', 'Pedro', 'Mariana', 'Karla']   #   Lista N

def combinador(nombres):
    aleatorio1 = random.randint(0, len(nombres) - 1)
    aleatorio2 = random.randint(0, len(nombres) - 1)
    return nombres[aleatorio1] + ' ' + nombres[aleatorio2]

while True:
    print('Generador de nombres: \n')
    print(combinador(nombres))
    opcion = input('Quiere ver otros nombres? s/n: ')
    if opcion == 'n' or opcion == 'N':
        break 