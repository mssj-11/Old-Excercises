/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fil;

import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Filosofo extends Thread {

    public int idf;
    Tenedor tiqz, tder;
    
    
    
    
    @Override
    public void run(){
        
        while(true){
            try{
                
                tiqz.soltar(idf);
                tder.soltar(idf);
                
                System.err.println("El filosofo "+idf+"Esta pensando ");
            }catch(InterruptedException ex){
                Logger.getAnonymousLogger(Filosofo.class)
            }
        }
        
    }

}
