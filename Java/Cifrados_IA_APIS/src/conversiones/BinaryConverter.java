/*  
    Convertir cadenas, números y caracteres a binario en Java utilizando Scanner para obtener la entrada del usuario:

    - En este ejemplo, utiliza la clase `Scanner` para leer la entrada del usuario desde la consola para comprobar si la entrada es un número o un carácter. 
    - Si es un número, lo convertimos a binario utilizando `Integer.toBinaryString()`. 
    - Si es un carácter, lo convertimos a binario utilizando el mismo método. 
    - Si la entrada es una cadena, recorremos cada carácter en la cadena y lo convertimos a binario.
    - Contiene un método `isNumeric()` para comprobar si la entrada es un número o no. 
    - Esto se hace utilizando una expresión regular que verifica si la cadena contiene solo dígitos y un posible signo negativo.
 */
package conversiones;
/**
 * @author HP - MSS
 */
import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEscriba una cadena, un número o un caracter: ");
        String input = scanner.nextLine();

        if (isNumeric(input)) {
            int number = Integer.parseInt(input);
            String binary = Integer.toBinaryString(number);
            System.out.println("El número " + number + " en binario es: " + binary);
        } else if (input.length() == 1) {
            char character = input.charAt(0);
            String binary = Integer.toBinaryString(character);
            System.out.println("El caracter " + character + " en binario es: " + binary);
        } else {
            for (int i = 0; i < input.length(); i++) {
                char character = input.charAt(i);
                String binary = Integer.toBinaryString(character);
                System.out.println("El caracter " + character + " en binario es: " + binary);
            }
        }
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
    
}