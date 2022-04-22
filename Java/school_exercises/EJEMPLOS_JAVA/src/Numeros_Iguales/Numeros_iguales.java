/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numeros_Iguales;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Numeros_iguales {

    public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);

        //Pedir dos números y decir si son iguales o no
        int n1, n2;
        System.out.print("Introduce un número: ");
        n1 = Num.nextInt();
        System.out.print("Introduce otro número: ");
        n2 = Num.nextInt();
        if (n1 == n2) {
            System.out.println("Los Numeros son iguales :)");
        } else {
            System.out.println("Los Numeros no son iguales :(");
        }
    }

}
