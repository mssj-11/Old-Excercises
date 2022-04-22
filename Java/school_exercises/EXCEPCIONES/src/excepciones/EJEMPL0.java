/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class EJEMPL0 {
    
    public static void main(String[] args) {
        
        //catch (InterruptedException ex){
                //Logger.getLogger();
                
                
                //}
        
        //System.out.println("Hola Termine");//*
        
        Scanner ent=new Scanner (System.in);
        boolean V=true;
        
        
        while (V){
            
           
            try {
                System.out.println("Ingrese el Dato:");
                int n=ent.nextInt();
                V=false;
 
                
            }
            
            
            catch (Exception e){
                
                ent.next();
                System.out.println("Ingrese un valor de Tipo Entero: " +e);
            }
                
                
        }
        //Todo code aplication logic here   
    }
    
}
