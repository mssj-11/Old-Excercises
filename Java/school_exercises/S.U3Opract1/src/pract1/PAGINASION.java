/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PAGINASION {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tdp, tdps, tdm;

        double x;

        System.out.print("\033[31m|||||||||||||||||||||");
        System.out.print("\n\033[34m PAGINACION ");
        System.out.print("\n\033[31m|||||||||||||||||||||\n");
        System.out.print("\n\033[34m///////////////////////////////");
        System.out.print("\n\033[34m// CALCULAR TAMANOS  //");
        System.out.print("\n\033[34m///////////////////////////////");
/////////////////////////////////////////////////////////////////////////////////////////7
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34m Numero de paginas del programa");
        System.out.print("\n\033[31m***********************");
        System.out.print("\nTamano del programa: ");
        tdp = scanner.nextDouble();

        System.out.print("\nTamano de paginas: ");
        tdps = scanner.nextDouble();

        double MB = (tdp / tdps);

        System.out.println("\n\033[31mEl tamano es de = " + MB + " paginas");

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\n\033[31m******************************");
        System.out.print("\n\033[34m Numero de paginas de memoria");
        System.out.print("\n\033[31m******************************");

        System.out.print("\nTamano de memoria: ");
        tdm = scanner.nextDouble();
        System.out.print("\nEl tamano de memoria es de = " + tdm);
        double tmm = (8 * tdm * 8);

        System.out.print("\nEl tamano de las paginas es de = " + tdps + " (2K)");

        double MO = (tdps * 2);

        System.out.print("\n\033[31mEl Numero de paginas en memoria es de = " + MO + " paginas");

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\n\033[31m************************************************");
        System.out.print("\n\033[34mLas posiciones ocupadas en la ultima pagina son:");
        System.out.print("\n\033[34m" + tdp + "- (15 paginas *" + tdps + " posiciones / paginas = 846 posiciones ocupadas)");
        double ss = 846;
        System.out.print("\n\033[31m************************************************");
        System.out.println("\n\n\033[31mCantidad de fragmentacion interna que se produce: ");
        double cdfi = (tdps - ss);

        System.out.print("\nEs = " + cdfi + " bytes");

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
