/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comensales;

/**
 *
 * @author HP
 */
public class silla {
    public int Silla = 4;
    public synchronized void tomar (int idf) throws InterruptedException{
    while(Silla == 0) wait();
        //System.out.println("el filosofo "+ idf+ " tomo la silla");
        Silla --;
    }
    
    public synchronized void soltar (int idf){
    Silla ++;
       // System.out.println("el filosofo "+idf+" solto la silla");
    notify();
    }
    
}
