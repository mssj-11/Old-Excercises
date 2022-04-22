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
public class EXCEPCIONES {

    public static void main(String[] args) {
        Scanner ent=new Scanner (System.in);
        boolean V=true;
        
        while (V){
            
            try {
                System.out.println("Ingrese el Dato:");
                int n=ent.nextInt();
          
                System.out.println("Ingrese el Otro Dato:");
                int n2=ent.nextInt();
                int res=n/n2;
                System.out.println("El Resultado es:"+res);
                V=false;
                 
            }
            catch (Exception e){
                ent.next();
                System.out.println("Ingrese un valor de Tipo Entero: " +e);
            } 
        } 
    }
    
}
