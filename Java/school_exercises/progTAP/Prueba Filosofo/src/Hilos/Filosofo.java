/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import java.util.Random;

/**
 *
 * @author HP
 */
public class Filosofo implements Runnable {

    public int id;
    Thread t;
    Tenedor derecho, izquierdo;
    int espera;
    Random r;
    Tenedor silla[];

    public Filosofo(int id, Tenedor derecho, Tenedor izquierdo, Tenedor silla[]) {
        this.id = id;
        this.derecho = derecho;
        this.izquierdo = izquierdo;
        System.out.println("\nEl filosofo " + (id + 1) + " puede usar el tenedor " + (derecho.id + 1) + " y el tenedor " + (izquierdo.id + 1));
        System.out.println("");
        this.silla = silla;
        r = new Random();
        t = new Thread(this);
        t.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (this.derecho) {
                synchronized (this.izquierdo) {
                    comer();
                }
            }
            pensar();
        }
        System.out.println("**********************");
        System.out.println("Filosofo " + (id + 1) + " termino ");
        System.out.println("**********************");
    }

    public void comer() {
        System.out.println(checar_mesa() + "\nFilosofo " + (id + 1) + " comera con los  tenedores " + (this.izquierdo.id + 1) + " y " + (this.derecho.id + 1));
        derecho.tomar(id);
        izquierdo.tomar(id);
        espera = r.nextInt(1000);
        System.out.println(checar_mesa() + "\n >>>>> Filosofo " + (id + 1) + " tomo silla y esta comiendo <<<<<");
        try {
            Thread.sleep(espera);
        } catch (InterruptedException e) {
        }
        derecho.soltar();
        izquierdo.soltar();
        System.out.println(checar_mesa() + "\nFilosofo " + (id + 1) + " termino de comer y libero los tenedores " + (this.izquierdo.id + 1) + " y " + (this.derecho.id + 1));
        System.out.println("");
    }

    public void pensar() {
        espera = (r.nextInt(1000));
        try {
            System.out.println(checar_mesa() + "\n El Filosofo " + (id + 1) + " esta comienzando a pensar !!!!!!!!!!!!!! ");
            System.out.println("");
            Thread.sleep(espera);
        } catch (InterruptedException e) {
        }
    }

    public String checar_mesa() {
        String a = "";
        for (int i = 0; i < silla.length; i++) {
            //a = a + ("\n " + silla [i].ban + " \n");
        }
        return a;
    }
}
