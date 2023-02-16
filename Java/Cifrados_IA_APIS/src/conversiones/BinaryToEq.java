/*
    Número binario a su equivalente en cadena, número y carácter:
Este código solicita al usuario un número binario a través del objeto Scanner, 
lo convierte en su equivalente decimal utilizando `Integer.parseInt()`, 
y luego lo convierte en su equivalente en carácter utilizando un casting a (char).

Puedes probarlo ejecutando el programa y proporcionando un número binario cuando se te solicite. 
El programa imprimirá el equivalente decimal, cadena y carácter.
 */
package conversiones;
import java.util.Scanner;
/**
 * @author HP - MSS
 */
public class BinaryToEq {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número binario: ");
        String binary = scanner.nextLine();

        int decimal = Integer.parseInt(binary, 2);
        char character = (char) decimal;

        System.out.println("Equivalente en decimal: " + decimal);
        System.out.println("Equivalente en cadena: " + String.valueOf(character));
        System.out.println("Equivalente en carácter: " + character);
    }
    
}