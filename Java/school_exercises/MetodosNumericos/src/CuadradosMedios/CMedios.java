/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuadradosMedios;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CMedios {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String semilla, snumero2, snumero3;
        int tam1, tam2, i, primerc;
        long numero1, numero2;

        System.out.println("**************************************");
        System.out.println("***** Metodo de Cuadrados Medios *****");
        System.out.println("**************************************\n\n");
        System.out.println("Digite la semilla: ");
        semilla = entrada.next();
        tam1 = semilla.length();

        System.out.println("\nNumero de digitos: " + tam1);
        System.out.println("\n");
        numero1 = Integer.parseInt(semilla);
        for (i = 0; i <= 26; i++) {
            numero2 = (long) Math.pow(numero1, 2);
            snumero2 = Long.toString(numero2);
            tam2 = snumero2.length();
            primerc = (tam2 - tam1) / 2;
            snumero3 = snumero2.substring(primerc, primerc + tam1);
            System.out.println("**************************************");
            System.out.println("Y" + i + " = 0." + snumero3);

            numero1 = Integer.parseInt(snumero3);
        }

    }

}
