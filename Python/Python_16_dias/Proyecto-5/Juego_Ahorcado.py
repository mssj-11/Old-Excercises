# Importando choice para obtener objetos de una lista aleatoriamente
from random import choice


# Coleccion(lista) de palabras
nombres = ['goku', 'vegeta', 'naruto', 'gaara', 'meliodas', 'saitama', 'levi', 'eren', 'oliver', 'ash', 'edward', 'roy', 'winry', 'seiya', 'kenichi', 'ranma']
# Conteo de letras correctas que lleva el jugador
letras_correctas = []
# Conteo de letras incorrectas que lleva el jugador
letras_incorrectas = []
# Conteo de intentos(vidas)
intentos = 6
# Conteo de aciertos ganados
aciertos = 0
# Por si el juego esta terminado sera igual a FALSE
juego_terminado = False


# Funcion para tomar un NOMBRE aleatorio de la list
def elegir_nombres(lista_nombres):
    # nombre_elegido sera igual al valor(nombre) aleatorio elegido en lista_nombres
    nombre_elegido = choice(lista_nombres)
    # letras_unicas sera igual a la cantidad de letras del NOMBRE elegido aleatoriamente
    letras_unicas = len(set(nombre_elegido))
    
    # Obteniendo el NOMBRE elegido y la cantidad de letras unicas
    return nombre_elegido, letras_unicas


# Funcion para pedirle al jugador que ingrese una letra mediante un ciclo con las vidas
def pedir_letra():
    # Generando variables
    letra_elegida = ''  # Iniciara como un string vacio
    # Evaluando que la informacion ingresada sea valida
    es_valida = False
    # Comparando que lo que se ingrese sea una letra del abecedario
    abecedario = 'abcdefghijklmnñopqrstuvwxyz'
    
    # LOOP para crear un bucle para pedirle al usuario intentar hasta acertar una letras valida
    while not es_valida:
        letra_elegida = input('Ingresa una letra: ')    # Lo ingresado se almacenara en la variable letra_elegida
        # Si la letra elegida se encuentra en el Abecedario y que sea una sola letra(caracter)
        if letra_elegida in abecedario and len(letra_elegida) == 1:
            # Si se cumplen las 2 condiciones, entonces
            es_valida= True # es_valida sera verdadero y se podra salir del bucle
            # Si no se cumplen
        else:
            print("\n\nLa letra ingresada no es correcta")
    # Una vez que salga del bucle, se obtendra la letra valida
    return letra_elegida


# Funcion para mostrar por pantalla el TABLERO
def mostrar_tablero(nombre_elegido):
    # Creacion de la lista oculta
    lista_oculta = []
    # Por cada letra elegida en nombre_elegido
    for letra in nombre_elegido:
        # Verificara SI esa letra se encuentra en esas letras_correctas
        if letra in letras_correctas:
            # Si se encuentra bien sera agregada a lista_oculta
            lista_oculta.append(letra)
        # Si la letra no se encuentra dentro de la letras_correctas
        else:
            lista_oculta.append('-')    # Se le agregara un guion
    # Una vez finalizado el bucle, se mostrara por pantalla la UNION de las letras en la lista_oculta
    print(' '.join(lista_oculta))


# Funcion para confirmar si la letra ingresada por el usuario se encuentra en 
def confirmar_letra(letra_elegida, palabra_oculta, vidas, coincidencias):
    fin = False # Confirmacion de  que el juego aun no termina
    # Si la letra elegida se encuentra dentro de de palabra_oculta
    if letra_elegida in palabra_oculta:
        # Si se encuentra entonces, a letras_correctas se le agregara la letra_elegida
        letras_correctas.append(letra_elegida)
        coincidencias += 1  # Aumentando la cantidad de coincidencias se leagregara 1
    # Si el jugador no acerto
    else:
        letras_incorrectas.append(letra_elegida)  # De igual manera se le agregra la letra_eleiga a letras_incorrectas
        vidas -= 1  # Tambien se le restara una vida
        
        
    # Verificando si aun tiene vidas
    if vidas == 0:
        fin = perder() # El fin del juego sera verdadero y se invocara el metodo perder()
    # Si las coincidencias son iguales a la cantidad de letras
    elif coincidencias == letras_unicas:
        # Si son iguales entonces, fin sera = al metodo ganar() con la palabra ocultas
        fin = ganar(palabra_oculta)
        
    # Devolviendo los estados de las vidas, fin y las coincidencias
    return vidas, fin, coincidencias


# Funcion para verificar si el jugador a perdido el juego
def perder():
    print("\nDesafortunadamente te has quedado sin vidas :(")
    print("\nEl nombre oculto era " + nombre)
    
    return True # Terminando el juego


# Funcion para verificar si el jugador a ganado el juego
def ganar(nombre_descubierto):
    # Mostrando el estado del tablero
    mostrar_tablero(nombre_descubierto)
    print("\n\nFelicidades, has encontrado el nombre")
    
    return True # Se termina el juego



# Invocando las funciones
nombre, letras_unicas = elegir_nombres(nombres) # Invocando la funcion elegir_nombres y agregando como parametro nombres

# Condicion para terminar el juego
while not juego_terminado:
    print('\n' + '*' * 20 + '\n')   # Separando el tablero
    # Mostrando el tablero
    mostrar_tablero(nombre)
    print('\n')
    print("\nLetras incorrectas: " + ' | '.join(letras_incorrectas))
    print(f"Cantidad de vidas: {intentos}")
    print('\n' + '*' * 20 + '\n')   # Separando el tablero
    
    # Alamacenado lo capturado en funcion perdir_letra en la variable letra
    letra = pedir_letra()
    intentos, terminado, aciertos = confirmar_letra(letra, nombre, intentos, aciertos)
    juego_terminado = terminado