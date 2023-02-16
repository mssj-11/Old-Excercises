/*
    Convertir binario a un numero decimal:

En este ejemplo, primero importamos la clase Scanner y creamos un objeto de esta clase llamado `scanner`. 
Luego, le pedimos al usuario que ingrese un número binario utilizando el método `next()` del objeto scanner para leer la entrada del usuario.

Despues creamos dos variables `decimal` y `power`. 
La variable decimal se inicializa en 0 y es donde vamos a ir acumulando el resultado de la conversión, mientras que la variable `power` la usamos para calcular las potencias de 2 necesarias para convertir cada dígito binario.

Luego, utilizamos un bucle for para iterar a través de cada dígito binario, comenzando desde el dígito menos significativo (es decir, el dígito más a la derecha) y avanzando hacia la izquierda.
Dentro del bucle, convertimos el dígito actual en un número entero y lo multiplicamos por la potencia correspondiente de 2, que se calcula utilizando la variable `power` y el método `Math.pow()`. 
Luego, agregamos este valor a la variable decimal.

Finalmente, imprimimos el resultado de la conversión en la consola utilizando System.out.println().
 */
package conversiones;
/**
 * @author HP - MSS
 */
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número binario: ");
        String binary = scanner.next();
        int decimal = 0;
        int power = 0;
        
        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, power);
            power++;
        }
        
        System.out.println("El número decimal correspondiente es: " + decimal);
    }
    
    
}