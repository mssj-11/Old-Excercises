/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ult;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import static ult.prueba.F0;
import static ult.prueba.F1;
import static ult.prueba.F2;
import static ult.prueba.F3;
import static ult.prueba.F4;

/**
 *
 * @author Daniel
 */
public class Filosofo extends Thread {
  
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
            F0.setBackground(Color.green);
            
       }
       if(idf == 1){
            F1.setBackground(Color.green);
            
       }
     if(idf == 2){
            F2.setBackground(Color.green);
            
       }
        if(idf == 3){
            F3.setBackground(Color.green);
            
       }
        if(idf == 4){
            F4.setBackground(Color.green);
            
       }
       
       
      
       
        System.err.println("el filosofo "+idf+" esta comiendo");
        
        Thread.sleep(1500);
        s.soltar(idf);
        der.soltar(idf);
        izq.soltar(idf);
        
       if(idf == 0){
          F0.setBackground(Color.red);
       }
        if(idf == 1){
          F1.setBackground(Color.red);
       }
        if(idf == 2){
          F2.setBackground(Color.red);
       }
        if(idf == 3){
          F3.setBackground(Color.red);
       }
        if(idf == 4){
          F4.setBackground(Color.red);
       }
        
        System.err.println("El filosofo "+idf+" esta pensado");
       
    }   catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
        
    }
    }
    
}
