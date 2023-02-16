/*
    Convertir de binario a su equivalente en carácter, cadena o número, y si el valor binario ingresado representa un número en decimal, se muestra su valor en decimal

Este ejemplo primero verifica si el valor binario ingresado representa un carácter o una cadena. 
Si es un carácter, lo convierte a su equivalente y lo muestra en pantalla. Si es una cadena, la convierte a su equivalente y la muestra en pantalla.

Si el valor binario ingresado no representa ni un carácter ni una cadena, se verifica si representa un número en decimal. 
Si es un número en decimal, lo convierte a su equivalente y lo muestra en pantalla.

Si el valor binario no representa ni un carácter ni una cadena ni un número en decimal, se muestra un mensaje de error en pantalla.
 */
package conversiones; 
import java.util.Scanner;
/**
 * @author HP - MSS
 */
public class BinariToResult{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor binario: ");
        String binaryValue = scanner.nextLine();
        
        // Verificar si el valor binario representa un carácter o una cadena
        try {
            int charValue = Integer.parseInt(binaryValue, 2);
            System.out.println("El valor binario representa el carácter: " + (char) charValue);
        } catch (NumberFormatException e) {
            try {
                String stringValue = binaryToString(binaryValue);
                System.out.println("El valor binario representa la cadena: " + stringValue);
            } catch (IllegalArgumentException ex) {
                // Verificar si el valor binario representa un número en decimal
                try {
                    int decimalValue = Integer.parseInt(binaryValue, 2);
                    System.out.println("El valor binario representa el número decimal: " + decimalValue);
                } catch (NumberFormatException ex2) {
                    System.out.println("El valor ingresado no es válido");
                }
            }
        }
        
    }
    
    
    
    
    
    public static String binaryToString(String binaryValue) throws IllegalArgumentException {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        
        while (i + 8 <= binaryValue.length()) {
            int charValue = Integer.parseInt(binaryValue.substring(i, i + 8), 2);
            if (charValue == 0) {
                break;
            }
            stringBuilder.append((char) charValue);
            i += 8;
        } if (i != binaryValue.length()) {
            throw new IllegalArgumentException();
        }
        
        return stringBuilder.toString();
    }
    
    
    
    
}