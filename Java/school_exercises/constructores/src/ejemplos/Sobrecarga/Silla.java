/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.Sobrecarga;

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
   
   
   public Silla (String material,  String tamano){
    this.material=material;
    this.tamano=tamano;
    }

    public Silla(String color, int n_patas, double precio) {
        this.color = color;
        this.n_patas = n_patas;
        this.precio = precio;
    }
   
   

   public void imprimir(){
       System.out.println("\nel material es:"+this.getMaterial()+"\nel color es"+this.getColor()+"\nel tamano es"+this.getTamano()+"\nel numero de patas"+this.getN_patas()+"\nel precio es "+this.getPrecio());
       
   } 
   public void setcolor(String col){
       
       color=col;
       
   }
   
    public String getcolor(){
       
       return color;
       
   }
   
            
   public static void main(String [] args){
       
       Silla s1=new Silla ("Madera","Mediano"); //instanciar  un objeto 
       Silla s2=new Silla ("Cafe",4,200.00);
       s1.imprimir();
       s2.imprimir();
       
       
       s2.setcolor("cafe");
       s2.imprimir();
       //s2.imprimir();
       
       
   
   }

   public String getMaterial() {
        return material;
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
