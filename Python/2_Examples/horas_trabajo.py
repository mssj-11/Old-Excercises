#   Horas trabajadas de un empleado
'''
Calcular el sueldo mensual de un trabajador conociendo la cantidad de horas trabajadas y el 
pago por hora

El problema requiere de una fórmula específica, sueldo = horas trabajadas * costo hora
Se ingresan valores como entrada y se obtienen valores enteros o reales de salida.
Valor de entrada 1 al programa = cantidad de horas trabajadas = CHT
Valor de entrada 2 al programa = pago por hora = PPH
Valor de salida del programa = sueldo = CHT * PPH
Proceso = fórmula identificad
'''

CHT = input("Ingrese horas de trabajo: ")
print("Costo hora: ", end=" ")

PPH = input()

sueldo = int(CHT) * int(PPH)
print("El sueldo es: ", sueldo)