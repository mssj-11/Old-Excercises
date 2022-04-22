/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERIE;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SerieSeno {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x = 0, cterminos, fac = 1;
        double s;
        System.out.print("\n\033[34mCantidad de Terminos: ");
        cterminos = scanner.nextInt();

        System.out.print("\n\033[34mValor de X: ");
        cterminos = scanner.nextInt();
        s = x;

        for (int i = 2; i < cterminos; i++) {

            fac = fac * ((i * 2) - 2) * ((i * 2) - 1);
            if (i % 2 == 0) {
                s = s - Math.pow(x, i * 2 - 1) / fac;
            } else {
                s = s + Math.pow(x, i * 2 - 1) / fac;
            }

        }
        System.out.print("\n\033[34mSen(x) se aproxima a: " + s);
    }
}
