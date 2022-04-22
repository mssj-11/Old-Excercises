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
public class Guitarra {
    public String marca;
    public String modelo;
    public String madera;
    public float cuerdas;
    public String color;
    public double precio;
    
    
    public Guitarra (String marca, String madera, float cuerdas){
    this.marca=marca;
    this.madera=madera;
    this.cuerdas=cuerdas;
    }

    public Guitarra(String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
    }

    public Guitarra(double precio) {
        this.precio = precio;
    }
    
    
    public void imprimir(){
        System.out.println("\n la marca es;"+this.getMarca()+"\nel modelo es"+this.getModelo()+"\nla madera es"+this.getMadera()+"\nlas cuerdas"+this.getCuerdas()+"\nel color es"+this.getColor()+"\nel precio es"+this.getPrecio());
    }
    
    public void setcolor(String col){
        color=col;
    }
    
    public String getcolor(){
        return color;
    }
    
    public static void main(String [] args){
        Guitarra g1=new Guitarra ("Gibson","Alder",5);
        Guitarra g2=new Guitarra ("Custom shop","Azul");
        Guitarra g3=new Guitarra (60900.00);      
        g1.imprimir();
        g2.imprimir();
        g3.imprimir();
        
        g2.setcolor("Azul");
        g2.imprimir();
        //g2.imprimir();
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
