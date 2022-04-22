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
public class Tenedor {

    int id;
    boolean ban;
    int quien;

    public Tenedor(int id) {
        this.id = id;
        ban = false;
        quien = 10;
    }

    public void tomar(int quien) {
        this.quien = quien;
        ban = true;
        notifyAll();
    }

    public void soltar() {
        quien = 10;
        ban = false;
        notifyAll();
    }
}
