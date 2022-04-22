/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonR;

import java.util.*;

/**
 *
 * @author HP
 */
public class menu {

    public static void main(String args[]) {
        Scanner lee = new Scanner(System.in);
        System.out.println(".: Metodo de Newton-Raphson :.\n");
        System.out.println("Introduce un valor para la aproximacion: ");
        double x = lee.nextDouble();
        newton_raphson n1 = new newton_raphson(x);
        double r = n1.calcRaiz();
        System.out.println("Raiz= " + r);
        System.out.println("__________________________/");
    }
}
