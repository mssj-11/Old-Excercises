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
public class Tractor {
    String marca;
    String modelo;
    String ano;
    String color;
    double precio;
    
    
    public Tractor (String marca,String modelo,String ano,String color,double precio) {
    this.marca=marca;
    this.modelo=modelo;
    this.ano=ano;
    this.color=color; 
    this.precio=precio;
        
    }
    
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
        Tractor t1=new Tractor ("John Deere","5075M","2011","verde",45.000);
        t1.imprimir();
        
        
        t1.setcolor("verde");
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
