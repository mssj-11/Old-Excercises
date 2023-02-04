/*
    CIFRADO por SUSTITUCION
    El índice debe de ser mayor o igual a 0 y menor que el tamaño del arreglo. 
 */
package IA;
/**
 *  EJEMPLO:    https://www.gaussianos.com/critpografia-cifrado-por-sustitucion/
 * @author HP - MSS
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