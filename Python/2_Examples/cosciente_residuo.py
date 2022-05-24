#    calcule el cociente y el residuo dados dos números enteros
'''
El problema nos pide el ingreso de dos valores enteros por teclado y luego obtener el residuo.

Un primer valor será el dividendo, el otro será el divisor, el resultado de dividirlos, será el cociente y un valor final llamado residuo es el que debemos mostrar.
Para cada uno de ellos, cociente y residuo, podemos obtenerlos mediante una división simple usando su operador o una función (dependiendo del lenguaje varía el nombre de la función)

Para este ejercicio debemos ingresar dos números y obtener el residuo, usamos MOD (de módulo o resto) o el operador % para obtenerlo
'''

n1 = int(input("Ingrese un numero: "))
n2 = int(input("Ingrese un numero mas: "))

cosciente1 = n1 / n2
cosciente2 = int(n1 / n2)
residuos = (n1 % n2)

print("Primer Cosciente: ", cosciente1)
print("Segundo Cosciente: ", cosciente2)
print("Residuo: ", residuos)