/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RazonesFinancieras.RazonesDeRentabilidad;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class RazonesDeRentabilidad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ub, vn, uo, uadi, isr, un;
        double in, pat,pcc;

        System.out.print("\033[31m|||||||||||||||||||||");
        System.out.print("\n\033[34m RAZONES FINANCIERAS ");
        System.out.print("\n\033[31m|||||||||||||||||||||\n");
        System.out.print("\n\033[34m///////////////////////////////");
        System.out.print("\n\033[34m//  Razones de Rentabilidad  //");
        System.out.print("\n\033[34m///////////////////////////////");
/////////////////////////////////////////////////////////////////////////////////////////7
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
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mMargen Operativo");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nUtilidad Operativa: ");
        uo = scanner.nextDouble();

        System.out.print("\nLas Ventas Netas son: " + vn);

        double MO = (uo / vn);

        System.out.println("\n\n\033[31mEl Margen Operativo es de: " + MO);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mMargen UAFIDA");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nUtilidad Antes de Impuestos: ");
        uadi = scanner.nextDouble();

        System.out.print("\nLas Ventas Netas son: " + vn);

        double MUAFIDA = (uadi / vn);

        System.out.println("\n\n\033[31mEl Margen UAFIDA es de: " + MUAFIDA);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34m  Margen Neto");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nUtilidad Neta: ");
        un = scanner.nextDouble();

        System.out.print("\nLas Ventas Netas son: " + vn);

        double MN = (un / vn);

        System.out.println("\n\n\033[31mEl Margen Neto es de: " + MN);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mTasa Efectiva de Impuestos");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nImpuestos Sobre la Renta: ");
        isr = scanner.nextDouble();

        System.out.print("\nLa Utilidad Antes de Impuestos es: " + uadi);

        double TEDI = (isr / uadi);

        System.out.println("\n\n\033[31mLa Tasa Efectiva de Impuestos es de: " + TEDI);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34m\t ROA");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nIngresos Netos: ");
        in = scanner.nextDouble();

        System.out.print("\nPromedio de Activos Totales: ");
        pat = scanner.nextDouble();

        double ROA = (in / pat);

        System.out.println("\n\033[31mEl ROA es de: " + ROA);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34m\t ROE");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nLos Ingresos Netos son: "+in);
        

        System.out.print("\nPromedio de Capital Contable: ");
        pcc = scanner.nextDouble();

        double ROE = (in / pcc);

        System.out.println("\n\033[31mEl ROE es de: " + ROE);

    }

}
