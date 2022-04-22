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
public class fourier{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double p, vn;
        //f(t)= a 0 2 + ∑ k=1 ∞ ( a k cos( k 2π P t )+ b k sin( k 2π P t ) )
        
        System.out.print("\033[31m|||||||||||||||||||||");
        System.out.print("\n\033[34m SERIE DE FOURIER ");
        System.out.print("\n\033[31m|||||||||||||||||||||\n");
//////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mSenos");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nValor de P: ");
        p = scanner.nextDouble();

        System.out.print("\nVentas Netas: ");
        vn = scanner.nextDouble();

        double MB = (p / vn);

        System.out.println("\n\033[31mEl Margen Bruto es de: " + MB);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

}

