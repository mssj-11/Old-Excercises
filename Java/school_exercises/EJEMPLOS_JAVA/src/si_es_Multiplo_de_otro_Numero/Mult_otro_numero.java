/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si_es_Multiplo_de_otro_Numero;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Mult_otro_numero {

    public static void main(String[] args) {

        Scanner Num = new Scanner(System.in);

        //Pedir dos números y decir si uno es múltiplo del otro
        int n1, n2;
        System.out.print("Introduce un número: ");
        n1 = Num.nextInt();
        System.out.print("Introduce otro número: ");
        n2 = Num.nextInt();

        if (n1 % n2 == 0) {
            System.out.println("Los numeros son múltiplos");
        } else {
            System.out.println("Los numeros no son múltiplos");
        }
    }

}
