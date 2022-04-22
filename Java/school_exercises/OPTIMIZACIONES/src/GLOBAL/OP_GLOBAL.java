/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GLOBAL;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class OP_GLOBAL {

    public static void main(String[] args) {
        String cadena = "";
        Scanner entradaScanner = new Scanner(System.in);
        System.out.println("Introduce una cadena por teclado");
        cadena = entradaScanner.nextLine();
        System.out.println("La cadena introducida es: " + cadena);
        if (cadena.length() < 5) {
            if (cadena.substring(0, 1).equalsIgnoreCase("a")) {
                System.out.println("La cadena introducida tiene menos de 5 caracteres y empieza por la letra a");
            } else {
                System.out.println("La cadena introducida tiene menos de 5 caracteres y no empieza por la letra a");
            }
        }
        if (cadena.length() >= 5 && cadena.length() <= 15) {
            if (cadena.substring(0, 1).equalsIgnoreCase("a")) {
                System.out.println("La cadena introducida tiene entre 5 y 15 caracteres y empieza por la letra a");
            } else {
                System.out.println("La cadena introducida tiene entre 5 y 15 caracteres y no empieza por la letra a");
            }
        }
        if (cadena.length() > 15) {
            if (cadena.substring(0, 1).equalsIgnoreCase("a")) {
                System.out.println("La cadena introducida tiene mas de 15 caracteres y empieza por la letra a");
            } else {
                System.out.println("La cadena introducida tiene mas de 15 caracteres y no empieza por la letra a");
            }
        }
    }//Cierre del método main
}
