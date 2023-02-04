/*
    Este error significa que estás tratando de acceder a un índice fuera de los límites del arreglo. Esto puede ocurrir si estás tratando de acceder a un índice negativo o si el índice es mayor o igual al tamaño del arreglo.

Para corregirlo, debes asegurarte de que el índice que estás usando para acceder a un elemento del arreglo sea válido, es decir, que esté dentro de los límites del arreglo. Puedes hacer esto verificando que el índice sea mayor o igual a 0 y menor que el tamaño del arreglo. Por ejemplo:
 */
package IA;

/**
 *  EJEMPLO:    https://www.gaussianos.com/critpografia-cifrado-por-sustitucion/
 * @author HP
 */
import java.util.Scanner;

public class CifradoSustitucion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un mensaje: ");
        String mensaje = sc.nextLine();
        System.out.print("Ingrese una clave: ");
        String clave = sc.nextLine();

        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String cifrado = "";

        for (int i = 0; i < mensaje.length(); i++) {
            char letra = mensaje.charAt(i);
            int index = -1;
            for (int j = 0; j < alfabeto.length; j++) {
                if (alfabeto[j] == letra) {
                    index = j;
                    break;
                }
            }

            if (index == -1) {
                cifrado += letra;
            } else {
                int claveIndex = i % clave.length();
                char letraClave = clave.charAt(claveIndex);
                int clavePos = -1;
                for (int j = 0; j < alfabeto.length; j++) {
                    if (alfabeto[j] == letraClave) {
                        clavePos = j;
                        break;
                    }
                }
                int nuevoIndex = (index + clavePos) % alfabeto.length;
                cifrado += alfabeto[nuevoIndex];
            }
        }

        System.out.println("Mensaje cifrado: " + cifrado);
    }
}