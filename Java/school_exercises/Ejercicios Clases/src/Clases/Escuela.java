/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author HP
 */
public class Escuela {
   String n_edificios; //1 es  grande , 2 chicos, 3 medianos
   String n_aulas;
   char n_puertas;
   String n_alumnos;
            

   public void imprimir(){
       System.out.println("\nel numero de edificios es:"+n_edificios+"\nel numer de aulas es"+n_aulas+"\nel numero de puertas es"+n_puertas+"\nel numero de alumnos es"+n_alumnos);
       
   } 
   public void setn_edificios(String edi){
       
       n_edificios=edi;
       
   }
   
    public String getn_edificios(){
       
       return n_edificios;
       
   }
   
            
   public static void main(String [] args){
       
       Escuela n1=new Escuela();
       n1.imprimir();
       
       
       n1.setn_edificios("2");
       n1.imprimir();
       //n1.imprimir();
       
       
   
   }

    public String getN_edificios() {
        return n_edificios;
    }

    public String getN_aulas() {
        return n_aulas;
    }

    public char getN_puertas() {
        return n_puertas;
    }

    public String getN_alumnos() {
        return n_alumnos;
    }
    
}
