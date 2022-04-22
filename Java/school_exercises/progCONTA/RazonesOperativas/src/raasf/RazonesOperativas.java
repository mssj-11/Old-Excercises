/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raasf;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class RazonesOperativas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double it, at, cc, na, pxa, ut,daxa,pda,vde,uai;

        System.out.print("\033[31m|||||||||||||||||||||");
        System.out.print("\n\033[34m RAZONES FINANCIERAS ");
        System.out.print("\n\033[31m|||||||||||||||||||||\n");
        System.out.print("\n\033[34m//////////////////////////");
        System.out.print("\n\033[34m//  Razones Operativas  //");
        System.out.print("\n\033[34m//////////////////////////");
        /////////////////////////////////////////////////////////////////////////////////////////7
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mRotacion de activos");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nIngresos Totales: ");
        it = scanner.nextDouble();

        System.out.print("\nActivos Totales: ");
        at = scanner.nextDouble();

        double RDA = (it / at);

        System.out.println("\n\033[31mLa Rotacion de activos es de: " + RDA);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\033[34m//////////////////////////////////////////////");
        System.out.print("\n\033[34m//  Razones Para Evaluacion de Inversiones  //");
        System.out.print("\n\033[34m/////////////////////////////////////////////");
        /////////////////////////////////////////////////////////////////////////////////////////7
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mValor en Libros");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nCapital contable: ");
        cc = scanner.nextDouble();

        System.out.print("\nNumero de Acciones: ");
        na = scanner.nextDouble();

        double REI = (cc / na);

        System.out.println("\n\033[31mEl Valor en Libros es de: " + REI);

        /////////////////////////////////////////////////////////////////////////////////////////7
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mPrecio / Valor en Libros");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nPrecio por accion: ");
        pxa = scanner.nextDouble();

        System.out.print("\nEl valor en libros es de: " + REI);

        double pvl = (pxa / REI);

        System.out.println("\n\033[31mEl Precio / Valor en Libros es de: " + pvl);

        /////////////////////////////////////////////////////////////////////////////////////////7
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mPrecio / Utilidad");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nEl Precio por accion es de: " + pxa);
        System.out.print("\nEl numero de acciones es de: " + na);
        System.out.print("\nIngrese las utilidades: ");
        ut = scanner.nextDouble();

        double peu = (pxa * na / ut);

        System.out.println("\n\033[31mEl Precio / Utilidad es de: " + peu);
        System.out.print("\nEntonces El Precio / Utilidad = al precio por accion con valor de: " + pxa);
        System.out.print("\nY el precio por accion / las Utilidades con valor de: " + ut);
        System.out.print("\n Estos dos ultimos mencionados / los numeros de acciones con valor de: " + na);
        double peu2 = (pxa / ut / na);
        System.out.print("\nEl total de esto seria de: " + peu2);

        /////////////////////////////////////////////////////////////////////////////////////////7
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mTasa de Dividendos");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nIngrese el Dividendo anual por Accion: ");
        daxa = scanner.nextDouble();
        
        System.out.print("\nIngrese el precio de la accion: ");
        pda = scanner.nextDouble();

        double td = (daxa / pda);

        System.out.println("\n\033[31mLa Tasa de Dividendos es de: " + td);
        
        /////////////////////////////////////////////////////////////////////////////////////////7
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34mValor de la Empresa");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nIngrese el Valor de la Empresa: ");
        vde = scanner.nextDouble();
        
        System.out.print("\nIngrese La utilidad antes de Impuestos (EBITDA): ");
        uai = scanner.nextDouble();

        double ve = (vde / uai);

        System.out.println("\n\033[31mEl Valor de la Empresa es de: " + ve);


    }

}
