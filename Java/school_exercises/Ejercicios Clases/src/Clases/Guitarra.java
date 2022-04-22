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
public class Guitarra {
    String marca="gibson";
    String modelo="Custom shop";
    int madera;
    float cuerdas;
    String color; //n es  negro , g gris, a azul
    double  precio=60.900;
    
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
        Guitarra g1=new Guitarra ();
        g1.imprimir();
        
        g1.setcolor("azul");
       g1.imprimir();
       //g1.imprimir();
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getMadera(){
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
