package Consola;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Nuevooo {
    //Miembros de clase

    static BufferedReader br;
    //Patron de cadenas para cifrar y descifrar
    public final static String str1 = "!#$;*/=&?¿+_¡@*-°1234567890";
    public final static String str2 = "abcdefghijklmnñopqrstuvwxyz";
    public static String mensaje;
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    //Main :P
    public static void main(String[] args) throws IOException {
        //Instacio y defino los datos de entrada
        
        int op;
        do {
            System.out.println(" 1. Cifrar datos");
            System.out.println(" 2. Descifrar datos");
            System.out.println(" 3. Salir :P");
            System.out.print("    Opcion >> ");
            op = Integer.parseInt(entrada.readLine());
            //Evaluo la opcion ingresada
            switch (op) {
                case 1:
                    Criptar();
                    break;
                case 2:
                    DesCriptar();
                    break;
                case 3:
                    System.out.println("Hasta la proxima! :D");
                    System.exit(0);
                    break;
            }
        } while (op != 3);
    }

    /**
     * Codifico los datos del fichero de entrada
     * @throws IOException
     */
    public static void Criptar() throws IOException {
        System.out.print("Ingresa el mensaje a cifrar >> ");
        mensaje = entrada.readLine();
        mensaje = mensaje.toLowerCase();

        System.out.println("\nMensaje legible : " + mensaje);
        for (int i = 0; i < str1.length(); i++) {
            mensaje = mensaje.replace(str2.charAt(i), str1.charAt(i));
        }
        System.out.println("Mensaje cifrado : " + mensaje);
    }

    /**
     * Decodifica los datos del fichero de entrada
     * @throws IOException
     */
    public static void DesCriptar() throws IOException {
        System.out.print("Ingresa el mensaje a descifrar >> ");
        mensaje = entrada.readLine();
        mensaje = mensaje.toLowerCase();

        System.out.println("\nMensaje cifrado  : " + mensaje);
        for (int i = 0; i < str1.length(); i++) {
            mensaje = mensaje.replace(str1.charAt(i), str2.charAt(i));
        }
        System.out.println("Mensaje legible : " + mensaje);
    }
}