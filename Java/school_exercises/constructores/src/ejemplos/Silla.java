/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author HP
 */
public class Silla {
   public String material;
   public String color;
   public String tamano; 
   public int n_patas;
   public double precio;
   
   
   public Silla (String material, String color, String tamano, int n_patas, double precio){
    this.material=material;
    this.color=color;
    this.tamano=tamano;
    this.n_patas=n_patas;
    this.precio=precio;
    }
   

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
       
       Silla s1=new Silla("Madera","Cafe","Mediano",4,200.00); //instanciar  un objeto 
       s1.imprimir();
       
       
       s1.setcolor("cafe");
       s1.imprimir();
       //s1.imprimir();
       
       
   
   }

    public String getColor() {
        return color;
    }

    public String getTamano() {
        return tamano;
    }

    public int getN_patas() {
        return n_patas;
    }

    public double getPrecio() {
        return precio;
    }  
}
