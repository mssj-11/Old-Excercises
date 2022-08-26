'''
TEMAS:

-Operaciones matematicas
-Conversiones
-Formatear de cadenas
-Redondeo


Ejercicio:
Calcular comisiones de trabajadores, el cual debera preguntarles su nombre y la cantidad que han vendido(ventas).
Asi mismo, el resultado que le debera mostrar es:
(Nombre + Monto de comisiones(13%))
'''
# Preguntando el nombre
nombre = input("Hola que tal, ¿Cual es tu nombre? ")
# Preguntando la cantidad de ventas
ventas = input("Ingrese sus ventas totales del mes: ")

# Sobreescribiendo ventas, transformando de string a integer
ventas = int(ventas)

# Calculando la comision, ventas por el porcentaje entre 100
comision = ventas * 13 / 100

# Sobreescribiendo comision, sera igual al redondeo de si misma, agregando 2 decimales
comision = round(comision, 2)

# Imprimiendo por pantalla el resultado
print(f"\nHola {nombre}, tus comisiones de este mes son ${comision}")