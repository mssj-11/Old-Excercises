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
public class Vehiculo {
   public String marca;
   public String modelo;
   public String color;
   public int n_llantas;
   public int n_puertas;
   public double precio;
    
    public Vehiculo (String marca,String modelo,String color, int n_llantas, int n_puertas) {
    this.marca=marca;
    this.modelo=modelo;
    this.color=color;
    this.n_llantas = n_llantas;
    this.n_puertas = n_puertas;
}

    public Vehiculo( double precio) {
        
        this.precio = precio;
    }

    
    public void imprimir(){
        System.out.println("\nla marca es: "+this.getMarca()+"\nel modelo"+this.getModelo()+"\nel color"+this.getcolor()+"\nel numero de_llantas"+this.getN_llantas()+"\nel numero de puertas "+this.getN_puertas()+"\nel precio es"+this.getPrecio());
        
    }
    
    public void setcolor(String col){
        
        color=col;
    }
    
    public String getcolor(){
        return color;
    }
    
            
    public static void main(String [] args){
        
        Vehiculo v1=new Vehiculo ("Volkswagen","Gol","rojo",4,4);
        Vehiculo v2=new Vehiculo (179.000);
        v1.imprimir();
        v2.imprimir();
          
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
