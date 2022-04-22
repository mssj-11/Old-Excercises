/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fde;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Flujo_de_Efectivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fo,vn,fde,fdo;

        
        System.out.print("\033[31m|||||||||||||||||||||");
        System.out.print("\n\033[34m RAZONES FINANCIERAS ");
        System.out.print("\n\033[31m|||||||||||||||||||||\n");
        System.out.print("\n\033[34m/////////////////////////");
        System.out.print("\n\033[34m//  Flujo de Efectivo  //");
        System.out.print("\n\033[34m/////////////////////////");
        /////////////////////////////////////////////////////////////////////////////////////////7
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mFlujo de Efectivos a Ventas");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nIngrese El Flujo Operativo: ");
        fo = scanner.nextDouble();

        System.out.print("\nIngrese las Ventaas Netas: ");
        vn = scanner.nextDouble();

        double fdeav = (fo / vn);

        System.out.println("\n\033[31mEl Flujo de Efectivos a Ventas es de: " + fdeav);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mFLE Flujo de Operacion");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nIngrese El Flujo libre de Efectivo: ");
        fde = scanner.nextDouble();

        System.out.print("\nIngrese El Flujo de Opearcion: ");
        fdo = scanner.nextDouble();

        double FLE = (fde / fdo);

        System.out.println("\n\033[31mEl Flujo libre de Efectivo es de: " + FLE);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
    }

}
