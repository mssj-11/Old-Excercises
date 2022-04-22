/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonR;

/**
 *
 * @author HP
 */
public class newton_raphson {

    int i = 0;
    double x[] = new double[50];
    double e = 10;

    newton_raphson(double aprox_i) {

        x[0] = aprox_i;

    }

    double f(double x) {
        double fx;
        fx = Math.exp(-x) - x;
        return fx;

    }

    double fp(double x) {

        double fpx;
        fpx = -Math.exp(-x) - 1;
        return fpx;
    }

    double calcRaiz() {
        i = 0;
        while (e > 0.0001) {
            x[i + 1] = x[i] - (f(x[i]) / fp(x[i]));
            e = Math.abs((x[i + 1] - x[i]) / x[i + 1]);
            e = e * 100;
            System.out.println("__________________________________________________________________________");
            System.out.println("La raiz es = " + x[i] + "  Error =" + e);
            System.out.println("__________________________________________________________________________");
            System.out.println("\n");
            i++;
        }

        return (x[i]);
    }

}
