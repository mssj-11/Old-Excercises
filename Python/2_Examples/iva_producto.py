#   Cobro del valor de IVA de un producto comprado
'''
Calcular el valor a cancelar de un producto que cuesta $ 1 dólar, el programa debe mostrar 
cómo se presenta en una factura, subtotal (cantidad por precio), IVA (del subtotal) y total a 
pagar (la suma del subtotal + el IVA). Use de IVA el 12%

El problema requiere de fórmulas específicas, una de ellas es IVA = subtotal ∗ 0.12
Se ingresa al programa la cantidad de un producto comprado, por ejemplo 1 litro de leche, que 
cuesta $ 1 dólar, el subtotal sería cantidad por lo que cuesta
'''

cantidad = int(input("Ingrese el valor del producto: "))
precio = 1
subtotal = cantidad * precio

IVA = subtotal * 0.12
total = subtotal + IVA

print("Subtotal : ", subtotal)
print("IVA : ", IVA)
print("TOTAL : ", total)