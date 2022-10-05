# Simplificxando el mismo codigo con ELIF

# Adivinador de numeros
from random import randint


# Defininedo las variables
estimado = 0    # Iniciando en cero
intentos = 0    # Iniciando en cero
num_secreto = randint(1, 100)   # Numeros entre el 1 al 100
nombre = input("Ingresa tu nombre: ")   # Almacenando el Nombre del jugador


print(f"\nHola {nombre}, estoy pensando en un numero entre 1-100\nTienes un limite de 8 intentos para adivinarlo")


# LOOP de tipo While, ya que permite repetirse tantas veces sea necesario
# Mientras los intentos sean menores a 8
while intentos < 8:
    # Realizando la ¿?
    estimado = int(input("\nCual es el numero? "))
    # Agregando los intentos
    intentos += 1
    
    # Realizando las condiciones
    # Si estimado es menor a numero secreto
    if estimado < num_secreto:
        print("\nMi numero es mas alto")
    # Si estimado es mayor a numero secreto
    elif estimado > num_secreto:
        print("\nMi numero es mas bajo")
    # Si estimado es IGUAL a numero secreto
    else:
        print(f"\nFelicidades {nombre}!, El {num_secreto} es mi numero :)\nLo has adivinado en {intentos} intentos")
        break # Terminado el LOOP


# Si el estimado es diferente al numero secreto
if estimado != num_secreto:
    print(f"\nQue mal :( \nSe han agotado los intentos \nEl numero secreto era {num_secreto}")