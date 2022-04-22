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
public class vehiculo {
   public String marca;
   public String modelo;
   public String color;
   public int n_llantas;
   public int n_puertas;
   public double precio;
    
    public vehiculo (String marca,String modelo,String color,int n_llantas,int n_puertas,double precio) {
    this.marca=marca;
    this.modelo=modelo;
    this.color=color;
    this.n_llantas=n_llantas;
    this.n_puertas=n_puertas;
    this.precio=precio;
}

    
    public void imprimir(){
        System.out.println("\nla marca es: "+marca+"\nel modelo"+modelo+"\nel color"+color+"\nel numero de_llantas"+n_llantas+"\nel numero de puertas "+n_puertas+"\nel precio es"+precio);
        
    }
    
    public void setcolor(String col){
        
        color=col;
    }
    
    public String getcolor(){
        return color;
    }
    
            
    public static void main(String [] args){
        vehiculo v1=new vehiculo ("Volkswagen","Gol","rojo",4,4,179.000);
        v1.imprimir();
        
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String getColor(){
        return color;
    }
    
    public int getN_llantas(){
        return n_llantas;
    }
    
    public int getN_puertas(){
        return n_puertas;
    }
    
    public double getPrecio(){
        return precio;
    }
}