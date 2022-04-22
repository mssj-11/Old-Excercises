/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPERACIONES;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Prueba {

    public static void main(String[] args) {

        Operaciones O = new Operaciones();
        boolean OO = true;
        while (OO) {
            System.out.println("\t\033[34m==OPERACIONES==");

            System.out.println("\t");
            System.out.println("\t 1.- Suma");
            System.out.println("\t 2.- Resta");
            System.out.println("\t 3.- Multiplicacion");
            System.out.println("\t 4.- Division");
            System.out.println("\t 5.- Salir");

            Scanner entrada = new Scanner(System.in);
            int op = 0;
            try {

                op = entrada.nextInt();
            } catch (Exception e) {
                System.err.println(" Error " + e);
            }
            if (op == 1) {
                O.Suma();
            } else if (op == 2) {
                O.Resta();
            } else if (op == 3) {
                O.Multiplicacion();
            } else if (op == 4) {
                O.Division();
            } else if (op == 5) {
                OO = false;
            } else {
                System.out.println(" ESTA NO ES UNA OPCION ");
            }

        }
    }

}
