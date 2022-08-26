# Preguntando el nombre
nombre = input("Hola que tal, ¿Cual es tu nombre? ")
# Preguntando la cantidad de ventas
ventas = int(input("Ingrese sus ventas totales del mes: "))

# Calculando la comision, redondenado ventas por el porcentaje entre 100, finalmente asignando 2 decimales
comision = round(ventas * 13 / 100, 2)

# Imprimiendo por pantalla el resultado
print(f"\nHola {nombre}, tus comisiones de este mes son ${comision}")