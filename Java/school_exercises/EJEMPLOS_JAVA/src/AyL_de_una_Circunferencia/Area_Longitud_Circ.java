/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AyL_de_una_Circunferencia;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Area_Longitud_Circ {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner valor = new Scanner(System.in); //captura el digito introducido

        //Pedir el radio de un círculo y calcular su área. A=PI*r^2.
        double a, r, l; // área y radio
        System.out.print("Introduce el radio de un circulo: ");
        r = valor.nextInt();
        a = Math.PI * (r * r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)
        System.out.println("El área de una circunferencia de radio es: " + a);
        ////////////////////////////////////////////////////////////////////////////////////

        //Pedir el radio de una circunferencia y calcular su longitud
        //double l,r;// longitud y radio
        //System.out.print("Introduce el radio de una circunferencia: ");
        //r = valor.nextInt();
        l = (2 * Math.PI) * r;

        System.out.println("La longitud de una circunferencia de radio es: " + l);
    }

}
