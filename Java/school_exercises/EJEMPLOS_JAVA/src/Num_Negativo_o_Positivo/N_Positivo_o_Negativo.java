/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Num_Negativo_o_Positivo;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class N_Positivo_o_Negativo {

    public static void main(String[] args) {

        Scanner Num = new Scanner(System.in);

        //Pedir un número e indicar si es positivo o negativo
        int num;
        System.out.print("Introduce un número: ");
        num = Num.nextInt();

        if (num < 0) {
            System.out.println("El numero es Negativo");
        } else // suponemos que el 0 es positivo.
        {
            System.out.println("El numero es Positivo");
        }
    }

}
