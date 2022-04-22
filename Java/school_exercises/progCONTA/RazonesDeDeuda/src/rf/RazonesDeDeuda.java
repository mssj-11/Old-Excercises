package rf;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class RazonesDeDeuda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pt, at, cc, ddlp,uai,gxi;

        System.out.print("\033[31m|||||||||||||||||||||");
        System.out.print("\n\033[34m RAZONES FINANCIERAS ");
        System.out.print("\n\033[31m|||||||||||||||||||||\n");
        System.out.print("\n\033[34m////////////////////////");
        System.out.print("\n\033[34m//  Razones de Deuda  //");
        System.out.print("\n\033[34m////////////////////////");
        /////////////////////////////////////////////////////////////////////////////////////////7
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mRazon de Deuda");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nPasivos Totales: ");
        pt = scanner.nextDouble();

        System.out.print("\nActivos Totales: ");
        at = scanner.nextDouble();

        double RD = (pt / at);

        System.out.println("\n\033[31mLa Razon de Deuda es de: " + RD);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mRazon de Deuda a Capital");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nPasivos Totales: ");
        pt = scanner.nextDouble();

        System.out.print("\nCapital Contable: ");
        cc = scanner.nextDouble();

        double RDC = (pt / cc);

        System.out.println("\n\033[31mLa Razon de Deuda a Capital es de: " + RDC);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mRazon de Capitalizacion");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nDeuda de Largo plazo: ");
        ddlp = scanner.nextDouble();

        System.out.print("\nCapital Contable: ");
        cc = scanner.nextDouble();

        double RDCN = (ddlp / ddlp + cc);

        System.out.println("\n\033[31mLa Razon de Deuda Capitalizacion es de: " + RDCN);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mRazon de Cobertura de Interes");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nUtilidad antes de impuestos e interes: ");
        uai = scanner.nextDouble();

        System.out.print("\nGastos por Interes: ");
        gxi = scanner.nextDouble();

        double RDCI = (uai / gxi);

        System.out.println("\n\033[31mLa Razon de Deuda Capitalizacion es de: " + RDCI);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

}
