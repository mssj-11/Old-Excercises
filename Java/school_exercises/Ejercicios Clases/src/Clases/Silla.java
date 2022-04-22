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
public class Silla {
    
   public String material;
   public String color=null;
   private char tamano; //c es  chico , m mediano, g grande 
   protected int n_patas=4;
   double  precio;

   public void imprimir(){
       System.out.println("\nel material es:"+material+"\nel color es"+color+"\nel tamaño es"+tamano+"\nel numero de patas"+n_patas+"\nel precio es "+precio);
       
   } 
   public void setcolor(String col){
       
       color=col;
       
   }
   
    public String getcolor(){
       
       return color;
       
   }
   
            
   public static void main(String [] args){
       
       Silla s1=new Silla(); //instanciar  un objeto 
       s1.imprimir();
       
       
       s1.setcolor("verde");
       s1.imprimir();
       //s1.imprimir();
       
       
   
   }

    public String getColor() {
        return color;
    }

    public char getTamano() {
        return tamano;
    }

    public int getN_patas() {
        return n_patas;
    }

    public double getPrecio() {
        return precio;
    }
}
