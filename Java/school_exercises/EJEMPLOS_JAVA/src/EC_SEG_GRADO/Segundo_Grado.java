/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EC_SEG_GRADO;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Segundo_Grado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Pedir los coeficientes de una ecuación de 2º grado, y muestre sus soluciones reales. Si no existen,debe indicarlo.
        double a, b, c; // coeficientes ax^2+bx+c=0
        double x1, x2, d; // soluciones y determinante
        System.out.print("Introduzca primer coeficiente (a):");
        a = scan.nextInt();
        System.out.print("Introduzca segundo coeficiente: (b):");
        b = scan.nextInt();
        System.out.print("Introduzca tercer coeficiente: (c):");
        c = scan.nextInt();
        // calculamos el determinante
        d = ((b * b) - 4 * a * c);
        if (d < 0) {
            System.out.println("No existen soluciones reales");
        } else {
            // queda confirmar que a sea distinto de 0.
// si a=0 nos encontramos una división por cero.

            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Solución: " + x1);
            System.out.println("Solución: " + x2);
        }
    }

}
