/*
    Cifrado de Vigenère 
    Este algoritmo no es seguro para usos reales de cifrado de informacion.
 */
package IA;
/**
 * @author HP - MSS
 */
import java.util.Scanner;
public class CifradoVigenere {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("*****   CIFRADO VIGENERE  *****");
        System.out.print("Introduce el texto a cifrar: ");
        String textoPlano = scan.nextLine();

        System.out.print("Introduce la clave: ");
        String clave = scan.nextLine();

        String textoCifrado = cifrar(textoPlano, clave);
        System.out.println("Texto cifrado: " + textoCifrado);

        String textoDescifrado = descifrar(textoCifrado, clave);
        System.out.println("Texto descifrado: " + textoDescifrado);
    }
    

    public static String cifrar(String textoPlano, String clave) {
        StringBuilder textoCifrado = new StringBuilder();

        int j = 0;
        for (int i = 0; i < textoPlano.length(); i++) {
            char c = (char) (textoPlano.charAt(i) + clave.charAt(j));
            textoCifrado.append(c);

            j = ++j % clave.length();
        }

        return textoCifrado.toString();
    }

    
    public static String descifrar(String textoCifrado, String clave) {
        StringBuilder textoDescifrado = new StringBuilder();

        int j = 0;
        for (int i = 0; i < textoCifrado.length(); i++) {
            char c = (char) (textoCifrado.charAt(i) - clave.charAt(j));
            textoDescifrado.append(c);

            j = ++j % clave.length();
        }

        return textoDescifrado.toString();
    }
    
    
}