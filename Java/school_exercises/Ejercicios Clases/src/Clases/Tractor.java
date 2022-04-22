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
public class Tractor {
    String marca;
    String modelo;
    String ano;
    String color; //r es  rojo , a azul, v verde
    double  precio;
    
    public void imprimir(){
        System.out.println("\nla marca es:"+marca+"\nel modelo es"+modelo+"\nel ano es"+ano+"\nel color es"+color+"\nel precio es"+precio);
        
    }
    
    public void setcolor(String col){
        color=col;
    }
    
    public String getcolor(){
        return color;
    }
    
    public static void main(String [] args){
        Tractor t1=new Tractor ();
        t1.imprimir();
        
        
        t1.setcolor("azul");
        t1.imprimir();
        //t1.imprimir();
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String getAno(){
        return ano;
    }
   
    public String getColor(){
        return color;
    }
    
    public double  getPrecio(){
        return precio;
    }
}
