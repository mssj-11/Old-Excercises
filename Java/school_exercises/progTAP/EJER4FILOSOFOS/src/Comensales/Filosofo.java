/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comensales;

import java.awt.Color;
import static java.security.spec.RSAKeyGenParameterSpec.F0;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Filosofo extends Thread {
    
    public static boolean f1 ,f2 ,f3 ,f4 ,f5;
    public int idf;
    palillo der, izq;
silla s;
    public Filosofo(int idf, palillo der, palillo izq, silla s) {
        this.idf = idf;
        this.der = der;
        this.izq = izq;
        this.s=s;
    }
    
    @Override
    public void run(){
    while (true){
    
    try{
        s.tomar(idf);
       der.tomar(idf);
       izq.tomar(idf);
       
       if(idf == 0){
           f1 = true;
       }
       else if(idf == 1){
            f2 = true;
       }
       else if(idf == 2){
            f3 = true;
       }
       else  if(idf == 3){
            f4 = true;
       }
       else if(idf == 4){
           f5 = true;
       }
       
       
      
       
        //System.err.println("el filosofo "+idf+" esta comiendo");
        
        Thread.sleep(1000);
        s.soltar(idf);
        der.soltar(idf);
        izq.soltar(idf);
        
       if(idf == 0){
           f1 = false;
       }
       else if(idf == 1){
            f2 = false;
       }
       else if(idf == 2){
            f3 = false;
       }
       else if(idf == 3){
            f4 = false;
       }
       else if(idf == 4){
           f5 = false;
       }
        
        //System.err.println("El filosofo "+idf+" esta pensado");
       
    }   catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
        
    }
    }
    
}
