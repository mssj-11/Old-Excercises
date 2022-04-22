/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PM;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class PM {

    Scanner T = new Scanner(System.in);
    int semilla, semilla2, cen, IT;
    double r;
    String cadena, cenF = "0";
    char aux;

    public void p() {
        do {

            Scanner T = new Scanner(System.in);
            Scanner T1 = new Scanner(System.in);
            Scanner T2 = new Scanner(System.in);
            System.out.println("Dame dos semillas con 4 sifras");
            semilla = T.nextInt();
            semilla2 = T1.nextInt();
            System.out.println("Dame iteracciones desea realizar");
            IT = T2.nextInt();

        } while (semilla < 999);
        System.out.println(" ---------- valor valido ---------- ");
        System.out.println(semilla);
    }

    public void Centro() {
        int cont = 0;
        do {

            cont++;
            System.out.println("iteraccion = " + cont);
            System.out.println("---------------------------------------");
            cen = semilla * semilla2;
            System.out.println("(" + semilla + ")(" + semilla2 + ") = " + cen);
            cadena = String.valueOf(cen);
            int L = cadena.length();
            System.out.println("cuenta con  " + L + "  digitos");
            if (L % 2 == 0) {
                //System.out.println("°|°"+cadena);
                // System.out.println("---------------------------------------");
            } else {
                cadena = "0" + cadena;
                //System.out.println("°|°"+cadena);
                System.out.println("nueva cadena -- " + cadena);
                //System.out.println("---------------------------------------");
            }
            int L1 = cadena.length();

            if (L1 == 8) {
                for (int i = 2; i <= 5; i++) {
                    aux = cadena.charAt(i);
                    cenF = cenF + aux;
                    //System.out.println("cuando tiene 8 valores ---" + cenF);
                }
            } else if (L1 == 6) {
                for (int i = 1; i <= 4; i++) {
                    //charAt("posicion numerica"); empieza de izq a DERECHA
                    aux = cadena.charAt(i);
                    cenF = cenF + aux;
                    //System.out.println("cuando tiene 6 valores ---" + cenF);
                }
            }
            System.out.println("***  X = " + Integer.parseInt(cenF) + "  R = 0." + Integer.parseInt(cenF) + "  ***");
            semilla = semilla2;
            semilla2 = Integer.parseInt(cenF);

            cenF = "0";
            System.out.println("---------------------------------------");
        } while (cont != IT);
    }

    public static void main(String[] args) {
        PM a = new PM();
        a.p();
        System.out.println("---------------------------------------");

        a.Centro();

        System.out.println("---------------------------------------");

    }

}
