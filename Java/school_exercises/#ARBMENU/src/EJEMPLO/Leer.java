/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJEMPLO;

/**
 *
 * @author HP
 */
//esta es mi clase leer que me ayuda a ingresar datos de todo tipo por teclado
import java.io.*;

public class Leer {

    public static String dato() {
        String sdato = "";
        try {

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);

            sdato = flujoE.readLine();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return sdato; //devolver dato tecleando
    }

    public static short datoShort() {
        try {
            return Short.parseShort(dato());
        } catch (NumberFormatException e) {
            return Short.MIN_VALUE;//valor más pequeño
        }
    }

    public static int datoInt() {
        try {
            return Integer.parseInt(dato());
        } catch (NumberFormatException e) {
            return Integer.MIN_VALUE;//valor mas pequeño
        }
    }

    public static long datoLong() {
        try {
            return Long.parseLong(dato());
        } catch (NumberFormatException e) {
            return Long.MIN_VALUE; //valor mas pequeño
        }
    }

    public static float datoFloat() {
        try {
            Float f = new Float(dato());
            return f.floatValue();
        } catch (NumberFormatException e) {
            return Float.NaN;//No es un numero Valor float.
        }
    }

    public static double datoDouble() {
        try {
            Double d = new Double(dato());
            return d.doubleValue();
        } catch (NumberFormatException e) {
            return Double.NaN;//no es un numero; valor double.
        }
    }
}
