/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fil;

/**
 *
 * @author HP
 */
public class Tenedor {

    public int idt;
    public boolean ocupado = false;

    public Tenedor(int idt) {

        this.idt = idt;

    }

    public synchronized void tomar(int idf) throws InterruptedException {

        while (ocupado) {
            wait();

            System.out.println("El Filosofo " + idf + " tomo el tenedor " + idt);
            ocupado = true;
        }

    }

    public synchronized void soltar(int idf) {
        ocupado = false;
        System.out.println("El Filosofo " + idf + " solto el tenedor " + idt);
        notifyAll();
    }
}
