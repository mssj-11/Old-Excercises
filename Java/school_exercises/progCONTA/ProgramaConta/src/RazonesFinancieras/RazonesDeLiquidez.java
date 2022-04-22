/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RazonesFinancieras;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class RazonesDeLiquidez {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2, inventarios, efectivo, eye, it;
        double ini, inf, cv, cxci, cxcf,cxpi, cxpf, vn;

        System.out.print("\033[31m|||||||||||||||||||||");
        System.out.print("\n\033[34m RAZONES FINANCIERAS ");
        System.out.print("\n\033[31m|||||||||||||||||||||\n");

        System.out.print("\n\033[34m///////////////////////////");
        System.out.print("\n\033[34m//  Razones de Liquidez  //");
        System.out.print("\n\033[34m///////////////////////////");

        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mRazon Circulante");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nIntroduce el Activo Circulante: ");
        n1 = scanner.nextDouble();

        System.out.print("\nIntroduce el Pasivo Circulante: ");
        n2 = scanner.nextDouble();

        double RC = (n1 / n2);

        System.out.println("\n\033[31mLa Razon circulante es de: " + RC);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\033[31m***********************");
        System.out.print("\n\033[34mPrueba de Acido ");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nEl valor de la Razon Circulante es: " + RC);
        System.out.print("\n\nIntroduce Inventarios: ");
        inventarios = scanner.nextDouble();
        System.out.print("\nEl valor del Pasivo Circulante es de: " + n2);
        double PA = ((RC - inventarios) / n2);
        System.out.println("\n\n\033[31mLa Prueba de Acido es de: " + PA);
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.print("\n\033[31m***********************");
        System.out.print("\n\033[34mRazon de efectivo");
        System.out.print("\n\033[31m***********************\n");
        System.out.print("\nIntroduce el Efectivo: ");
        efectivo = scanner.nextDouble();
        System.out.print("\nIntroduce el Efectivo y Equivalente: ");
        eye = scanner.nextDouble();
        System.out.print("\nIntroduce las Inversiones Temporales: ");
        it = scanner.nextDouble();
        System.out.print("\nEl valor del Pasivo Circulante es de: " + n2);
        double RE = (efectivo + eye + it / n2);
        System.out.println("\n\n\033[31mLa Razon de efectivo es de: " + RE);
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\033[31m***********************");
        System.out.print("\n\033[34mRotacion de Inventarios");
        System.out.print("\n\033[31m***********************\n");
        System.out.print("\nInventario de Inicio del Periodo: ");
        ini = scanner.nextDouble();
        System.out.print("\nInventario Final del Periodo: ");
        inf = scanner.nextDouble();
        System.out.print("\nCosto de Ventas: ");
        cv = scanner.nextDouble();

        double RI = (ini + inf / 2 / cv / 365);

        System.out.println("\n\033[31mLa Rotacion de Inventarios es de: " + RI);
        ///////////////////////////////////////////////////////////////////////////////////////////////////7

        System.out.print("\n\033[31m***********************");
        System.out.print("\n\033[34mRotacion de cuentas por Cobrar");
        System.out.print("\n\033[31m***********************\n");
        System.out.print("\nCuentas por cobrar al inicio del Periodo: ");
        cxci = scanner.nextDouble();
        System.out.print("\nCuentas por cobrar al final del Periodo: ");
        cxcf = scanner.nextDouble();
        System.out.print("\nVentas Netas: ");
        vn = scanner.nextDouble();

        double RCXC = (cxci + cxcf / 2 / vn / 365);
        System.out.println("\n033[31mLa Rotacion de Cuentas por Cobrar es de: " + RCXC);
        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.print("\n\033[31m***********************");
        System.out.print("\n\033[34mRotacion de cuentas por Pagar");
        System.out.print("\n\033[31m***********************\n");
        System.out.print("\nCuentas por pagar al inicio del Periodo: ");
        cxpi = scanner.nextDouble();
        System.out.print("\nCuentas por pagar al final del Periodo: ");
        cxpf = scanner.nextDouble();
        System.out.print("\nLas Ventas Netas son: "+vn);
        
        double RCXP = (cxpi + cxpf / 2 / vn / 365);
        System.out.println("\n033[31mLa Rotacion de Cuentas por Pagar es de: " + RCXP);
        //////////////////////////////////////////////////////////////////////////////////////////////////////////
        

    }

}
