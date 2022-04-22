package Num;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class TABLITA extends Thread {

    @Override
    public void run() {

        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Soy el hilo" + this.getName() + " " + i + " * 5 = " + i * 5);
            } catch (InterruptedException ex) {
                Logger.getLogger(TABLITA.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        TABLITA U = new TABLITA();
        TABLITA y = new TABLITA();
        TABLITA o = new TABLITA();
        TABLITA U1 = new TABLITA();
        TABLITA U2 = new TABLITA();
        TABLITA U0 = new TABLITA();
        U.start();
        U.join();
        y.start();
        o.start();
        U1.start();
        U2.start();
        U0.start();
    }

}
