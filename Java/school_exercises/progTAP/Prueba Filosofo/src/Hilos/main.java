/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String args[]) {
        Filosofo comensales[];
        comensales = new Filosofo[5];
        Tenedor silla[];
        silla = new Tenedor[5];
        int i, izq = 0, der = 0;
        for (i = 0; i < 5; i++) {
            silla[i] = new Tenedor(i);
        }
        for (i = 0; i < 5; i++) {
           
            if (i == 0) {
                izq = 4;
                der = 0;
            }
            if (i == 1) {
                izq = 0;
                der = 1;
            }
            if (i == 2) {
                izq = 1;
                der = 2;
            }
            if (i == 3) {
                izq = 2;
                der = 3;
            }
            if (i == 4) {
                izq = 3;
                der = 4;
            }
            comensales[i] = new Filosofo(i, silla[izq], silla[der], silla);
        }
    }
}