/*
    Convertir entre código ASCII y texto:

En este ejemplo, utilizamos un menú de opciones para permitir al usuario elegir si quiere convertir texto a código ASCII o viceversa. 
Utilizamos el método `textToAscii()` para convertir el texto a su equivalente en código ASCII, y el método `asciiToText()` para convertir el código ASCII a texto.
 
*/
package conversiones;
import java.util.Scanner;
/**
 * @author HP
 */

public class ASCIIConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = "";
        while (!option.equals("3")) {
            System.out.println("\n\n****    Conversor ASCII ****");
            System.out.println("1. Convertir texto a código ASCII");
            System.out.println("2. Convertir código ASCII a texto");
            System.out.println("3. Salir");
            System.out.print("\nSeleccione una opción: ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Ingrese el texto a convertir a ASCII: ");
                    String textToConvert = scanner.nextLine();
                    String asciiResult = textToAscii(textToConvert);
                    System.out.println("El resultado es: " + asciiResult);
                    break;
                case "2":
                    System.out.print("Ingrese el código ASCII a convertir a texto: ");
                    String asciiToConvert = scanner.nextLine();
                    String textResult = asciiToText(asciiToConvert);
                    System.out.println("El resultado es: " + textResult);
                    break;
                case "3":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor seleccione una opción válida.");
                    break;
            }
        }
    }
    
    

    
    public static String textToAscii(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            result.append((int) text.charAt(i));
            if (i != text.length() - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
    
    
    

    public static String asciiToText(String ascii) {
        StringBuilder result = new StringBuilder();
        String[] codes = ascii.split(" ");
        for (String code : codes) {
            result.append((char) Integer.parseInt(code));
        }
        return result.toString();
    }
    
    
    
}