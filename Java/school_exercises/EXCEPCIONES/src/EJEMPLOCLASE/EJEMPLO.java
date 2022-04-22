/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJEMPLOCLASE;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class EJEMPLO {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        boolean v = true;

        while (v) {
            try {
                System.err.println("INGRESA EL DATO:\n");

                int a = entrada.nextInt();

                if (a == 0) {
                    Exception e;
                    throw e = new Exception("INGRESA UN VALOR DIFERENTE DE CERO");
                }

                v = false;

                double resultado = 100 / a;
                System.err.println("El Resultado es:\n" + resultado);

            } catch (java.util.InputMismatchException e) {
                entrada.next();
                System.err.println("INGRESE UN VALOR DE TIPO ENTERO:\n" + e);
            } catch (Exception e) {

                System.err.println("INGRESE UN VALOR DE TIPO ENTERO:\n" + e);
            }

        }

    }

}
