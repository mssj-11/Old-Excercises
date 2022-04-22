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
public class Bicicleta {
    protected String marca; //v es vans,h haro ,w wethepeople
    public String modelo;
    private int ano;
    int asientos;
    boolean frenos;
    String volante;
    public String color; //n es  negro , a azul, g gris
    String tamano; //g es grande , m mediano , c chico
    double precio=5.500;
    
    
    public void imprimir(){
        System.out.println("\n la marca es"+marca+"\n el modelo es"+modelo+"\nel ano es"+ano+"\nlos asientos"+asientos+"\nlos frenos "+frenos+"\nel volante es"+volante+"\nel colo es"+color+"\nel tamano es"+tamano+"\nel precio es"+precio);
    }
    
    public void setcolor(String col){
        color=col;
    }
    
    public String getcolor(){
        return color;
    }
    
    public static void main(String [] args){
        Bicicleta b1=new Bicicleta ();
        b1.imprimir();
        
        b1.setcolor("gris");
       b1.imprimir();
       //b1.imprimir();
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getAno(){
        return ano;
    }
    public int getAsientos(){
        return asientos;
    }
    
    public boolean getFrenos(){
        return frenos;
    }
    
    public String getVolante(){
        return volante;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getTamano(){
        return tamano;
    }
    
    public double getPrecio(){
        return precio;
    }
}
