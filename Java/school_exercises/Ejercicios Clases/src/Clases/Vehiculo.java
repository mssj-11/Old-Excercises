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
public class Vehiculo {
    String marca="Volkswagen";
    public String modelo="Gol 2018";
    static String color; //r es  rojo , a azul, v verde
    protected  int n_llantas=4;
    int n_puertas=4;
    double precio=179.990;
    
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
        Vehiculo v1=new Vehiculo ();
        v1.imprimir();
        
        v1.setcolor("azul");
       v1.imprimir();
       //v1.imprimir();
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
