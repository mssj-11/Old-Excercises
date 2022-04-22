/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo;

/**
 *
 * @author HP
 */
class DistNorm {

    public DistNorm() {
    }

    public double calculaz(double v) { //funcion de densidad de probabilidad normal
        double N = Math.exp(-Math.pow(v, 2) / 2) / Math.sqrt(2 * Math.PI);
        return N;
    }

    public double calculazacum(double v) {  //Funcion de distribucion de probabilidad normal
        double acumulador = 0.00000028666;
        for (double i = -5; i < v; i = i + 0.00001) {
            acumulador = acumulador + (0.00001 * calculaz(i - 0.000005));
        }
        return acumulador;
    }

}
