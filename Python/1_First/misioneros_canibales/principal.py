from estructura import estructura
import os
 
"""
   TEAM BITS
   Juego de (misionarios y canibales)
"""

def main():
    os.system("clear")
    print("TEAM BITS: Juego de (misionarios y canibales)")
    # donde empezamos
    inicio = estructura([[3, 3], [0, 0]], 0)
    # a donde queremos llegar
    final = estructura([[0, 0], [3, 3]], 1)
 
    # los viaje posibles (legales)
    viajes = [[1, 0], [0, 1], [1, 1], [2, 0], [0, 2]]
 
    # los viajes que probamos desde cada estado
    viajes_posibles = list(viajes)
 
    # guardamos el recorrido y las opciones que no hemos usado
    # para poder 'volver atras' si hay problemas (backtracking)
    recorrido = []
    viajes_restantes = []
 
    while inicio != final and viajes_posibles:
        while viajes_posibles:
            # probamos un viaje cualquiera
            viaje = viajes_posibles.pop()
 
            try:
                nuevo = inicio.viaja(viaje)
 
                # si no hemos estado nunca algoritmo A*
                if nuevo not in recorrido:
                    # guarda el estado y las opciones restantes
                    recorrido.append(inicio)
                    viajes_restantes.append(viajes_posibles)
 
                    # continuamos desde la nueva posicion
                    inicio = nuevo
                    viajes_posibles = list(viajes)
            except ValueError:
                # no es valido, probamos el siguiente
                pass
 
        # si no hemos encontrado nada, backtracking
        if not viajes_posibles and recorrido:
            inicio = recorrido.pop()
            viajes_posibles = viajes_restantes.pop()
 
    if inicio == final:
        print("Tenemos un Resultado !!!!!!")
        for estado in recorrido:
            print(estado)
        print(inicio)
    else:
        # no va a pasar ;)
        print("No Hemos Encontrado Un resultado - Intente de Nuevo")
if __name__ == "__main__":
    main()