/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ult;

/**
 *
 * @author Daniel
 */
public class run {
    public static void main(String[] args) {
        palillo [] p =new palillo[5];
        silla s = new silla ();
        Filosofo [] f =new Filosofo[5];
    
        for (int i = 0; i < p.length; i++) {
            p[i] = new palillo(i);
        }
        for (int i = 0; i < f.length; i++) {
            f[i] = new Filosofo(i, p[i], p[(i+1)%5], s);
        }
        for (int i = 0; i < 5; i++) {
            f[i].start();
            
        }
        
    }
}
