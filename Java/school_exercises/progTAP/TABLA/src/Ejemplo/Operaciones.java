/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo;

import com.sun.istack.internal.logging.Logger;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author HP
 */
public class Operaciones extends Thread {

    @Override
    public void run() {

        for (int i = 0; i <= 10; i++) {
            try {

                Thread.sleep(1000);
                System.out.println(i + " * 5 = " + i * 5);

            } catch (InterruptedException ex) {
                Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }

    public static void main(String [] args ) throws  InterruptedException{
        
        
    }
    
    
}
