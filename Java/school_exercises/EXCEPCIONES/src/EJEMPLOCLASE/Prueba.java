/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJEMPLOCLASE;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author HP
 */
public class Prueba {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean v = true;

        while (v) {
            try {

                System.err.println("INGRESA EL DATO:\n");
                int n = entrada.nextInt();
                System.err.println("INGRESA OTRO DATO:\n");
                int n2 = entrada.nextInt();
                System.err.println("INGRESA UN NUMERO DIFERENTE DE CERO:\n");
                int n3 = entrada.nextInt();
                System.err.println("INGRESA OTRO DATO:\n");
                int n4 = entrada.nextInt();

                v = false;

                double resultado = n / n2;
                System.err.println("EL RESULTADO ES:\n" + resultado);

            } catch (InputMismatchException e) {
                entrada.next();
                System.err.println("INGRESE UN VALOR DE TIPO ENTERO:\n" + e);

            } catch (ArithmeticException e) {

                System.err.println("INGRESE UN VALOR DE TIPO ENTERO:\n" + e);
            } finally {
                System.err.println("");
            }

        }

    }
}
