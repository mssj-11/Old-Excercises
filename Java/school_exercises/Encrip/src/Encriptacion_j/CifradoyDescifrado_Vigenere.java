/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encriptacion_j;

import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class CifradoyDescifrado_Vigenere extends JFrame {

    //CifradoyDescifrado_Vigenere metodos = new CifradoyDescifrado_Vigenere();
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String texto;
        char opc;
        do {
            //MENU A DESPLEGAR
            System.out.println("\nCIFRADO & DESCIFRADO DE VIGENERE\n");
            System.out.println("1) Cifrar");
            System.out.println("2) Descifrar");
            System.out.println("0) Salir\n");
            System.out.print("Ingresa Tu Opcion: ");
            opc = leer.nextLine().charAt(0);

            if (opc == '1') {
                //UNA VEZ DADA LA OPCION 1 SE DESPLEGARAN LOS SIGUIENTES MENSAJES
                System.out.print("\nIngrese el MENSAJE: ");
                texto = leer.nextLine();
                System.out.print("\nMENSAJE ya Cifrado: ");
                System.out.print(Cifrar(texto));

                //UNA VEZ DADA LA OPCION 2 SE DESPLEGARAN LOS SIGUIENTES MENSAJES
            } else if (opc == '2') {
                System.out.print("\nIngrese el MENSAJE: ");
                texto = leer.nextLine();
                System.out.print("\nMENSAJE Descifrado: \n");
                System.out.print(Descifrar(texto));
            }
        } while (opc != '0');

    }

    //METODO PARA CIFRAR EL MENSAJE INTRODUCIDO
    public static String Cifrar(String Mensaje) {
        String salida = "";
        String Abcedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String clave = "ISIS";
        char[] claveEquals = new char[Mensaje.length()];
        char[] Msj = Mensaje.toUpperCase().toCharArray();
        int cont = 0;
        for (int c = 0; c < Mensaje.length(); c++) {

            if (Mensaje.charAt(c) == ' ') {
                c++;
            }
            claveEquals[c] = clave.charAt(cont);
            cont++;
            if (cont == clave.length()) {
                cont = 0;
            }
        }//
        // Para cifrar realizamos esta operación
        int x = 0, y = 0, z;
        for (int c = 0; c < Mensaje.length(); c++) {
            if (Mensaje.charAt(c) == ' ') {
                salida += " ";
                c++;
            }
            for (int f = 0; f < Abcedario.length(); f++) {
                if (Msj[c] == Abcedario.charAt(f)) {
                    x = f;

                }
                if (claveEquals[c] == Abcedario.charAt(f)) {
                    y = f;

                }

            }
            // Z es el tamaño del alfabeto
            z = (x + y) % 27;
            salida += Abcedario.charAt(z);

        }

        return salida;
    }

    //METODO PARA DESCIFRAR EL MENSAJE INTRODUCIDO
    public static String Descifrar(String Mensaje) {
        String salida = "";
        String Abcedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String clave = "ISIS";
        char[] claveEquals = new char[Mensaje.length()];
        char[] Msg = Mensaje.toUpperCase().toCharArray();
        int cont = 0;
        for (int c = 0; c < Mensaje.length(); c++) {

            if (Mensaje.charAt(c) == ' ') {
                c++;
            }
            claveEquals[c] = clave.charAt(cont);
            cont++;
            if (cont == clave.length()) {
                cont = 0;
            }
        }
        cont = 0;
        int x = 0, y = 0, z, t;
        for (int c = 0; c < Mensaje.length(); c++) {
            if (Mensaje.charAt(c) == ' ') {
                salida += " ";
                c++;
            }
            for (int f = 0; f < Abcedario.length(); f++) {
                if (Msg[c] == Abcedario.charAt(f)) {
                    x = f;

                }
                if (claveEquals[c] == Abcedario.charAt(f)) {
                    y = f;

                }

            }
            // Para descifrar realizamos la operación inversa
            z = (y - x);

            if (z <= 0) {
                if (z == 0) {
                    salida += "A";
                } else {
                    for (int j = 1; j <= Abcedario.length(); j++) {
                        cont++;
                        if (cont == (z * -1)) {
                            salida += Abcedario.charAt(j);
                            break;
                        }
                    }
                }

            } else {
                for (int i = 26; i >= 0; i--) {
                    cont++;
                    if (cont == z) {
                        salida += Abcedario.charAt(i);
                        break;
                    }
                }
            }

            cont = 0;

        }

        return salida;
    }
}