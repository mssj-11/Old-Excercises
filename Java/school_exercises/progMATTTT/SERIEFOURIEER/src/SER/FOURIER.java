/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SER;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class FOURIER {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ub, vn;
        

        System.out.print("\033[31m|||||||||||||||||||||");
        System.out.print("\n\033[34m SERIE DE FOURIER ");
        System.out.print("\n\033[31m|||||||||||||||||||||\n");

//////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mMargen Bruto");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nUtilidad Bruta: ");
        ub = scanner.nextDouble();

        System.out.print("\nVentas Netas: ");
        vn = scanner.nextDouble();

        double MB = (ub / vn);

        System.out.println("\n\033[31mEl Margen Bruto es de: " + MB);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

}
