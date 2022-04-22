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
public class Guitarra {
    public String marca;
    public String modelo;
    public String madera;
    public float cuerdas;
    public String color;
    public double precio;
    
    
    public Guitarra (String marca, String modelo, String madera, float cuerdas, String color, double precio){
    this.marca=marca;
    this.modelo=modelo;
    this.madera=madera;
    this.cuerdas=cuerdas;
    this.color=color;
    this.precio=precio;
    }
    
    public void imprimir(){
        System.out.println("\n la marca es;"+marca+"\nel modelo es"+modelo+"\nla madera es"+madera+"\nlas cuerdas"+cuerdas+"\nel color es"+color+"\nel precio es"+precio);
    }
    
    public void setcolor(String col){
        color=col;
    }
    
    public String getcolor(){
        return color;
    }
    
    public static void main(String [] args){
        Guitarra g1=new Guitarra ("Gibson","Custom shop","Alder",5,"Azul",60900.00);
        g1.imprimir();
        
        g1.setcolor("Azul");
       g1.imprimir();
       //g1.imprimir();
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String getMadera(){
        return madera;
    }
    
    public float getCuerdas(){
        return cuerdas;
    }
    
    
    public String getColor(){
        return color;
    }
    
    public double  getPrecio(){
        return precio;    
    }  
}
