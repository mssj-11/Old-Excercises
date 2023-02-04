/*
    Este es un ejemplo básico de cifrado César. Ten en cuenta que este algoritmo es muy fácil de romper y no es seguro para usos reales de cifrado.
 */
package IA;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class CifradoCesar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el texto a cifrar:");
        String textoPlano = scan.nextLine();

        System.out.println("Introduce el número de desplazamientos:");
        int desplazamientos = scan.nextInt();

        String textoCifrado = cifrar(textoPlano, desplazamientos);
        System.out.println("Texto cifrado: " + textoCifrado);

        String textoDescifrado = descifrar(textoCifrado, desplazamientos);
        System.out.println("Texto descifrado: " + textoDescifrado);
    }

    public static String cifrar(String textoPlano, int desplazamientos) {
        StringBuilder textoCifrado = new StringBuilder();

        for (int i = 0; i < textoPlano.length(); i++) {
            char c = (char) (textoPlano.charAt(i) + desplazamientos);
            textoCifrado.append(c);
        }

        return textoCifrado.toString();
    }

    public static String descifrar(String textoCifrado, int desplazamientos) {
        StringBuilder textoDescifrado = new StringBuilder();

        for (int i = 0; i < textoCifrado.length(); i++) {
            char c = (char) (textoCifrado.charAt(i) - desplazamientos);
            textoDescifrado.append(c);
        }

        return textoDescifrado.toString();
    }
}
