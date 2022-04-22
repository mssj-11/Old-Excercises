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
public class Bicicleta {
    public String marca; //v es vans,h haro ,w wethepeople
    public String modelo;
    public int ano;
    public int asientos;
    public String frenos;
    public String volante;
    public String color; //n es  negro , a azul, g gris
    public String tamano; //g es grande , m mediano , c chico
    public double precio=5.500;
    
    
    public Bicicleta (String marca, String modelo, int ano){
    this.marca=marca;
    this.modelo=modelo;
    this.ano=ano;
    }

    public Bicicleta(int asientos, String frenos, String volante) {
        this.asientos = asientos;
        this.frenos = frenos;
        this.volante = volante;
    }

    public Bicicleta(String color, String tamano, double precio) {
        this.color = color;
        this.tamano = tamano;
        this.precio = precio;
    }
       
    
    public void imprimir(){
        System.out.println("\n la marca es"+this.getMarca()+"\n el modelo es"+this.getModelo()+"\nel ano es"+this.getAno()+"\nlos asientos"+this.getAsientos()+"\nlos frenos "+this.getFrenos()+"\nel volante es"+this.getVolante()+"\nel colo es"+this.getColor()+"\nel tamano es"+this.getTamano()+"\nel precio es"+this.getPrecio());
    }
    
    public void setcolor(String col){
        color=col;
    }
    
    public String getcolor(){
        return color;
    }
    
    public static void main(String [] args){
        Bicicleta b1=new Bicicleta ("wethepeople","CRS",2018);
        Bicicleta b2=new Bicicleta (1,"2","1");
        Bicicleta b3=new Bicicleta ("azul","mediana",5.500);
        b1.imprimir();
        b2.imprimir();
        b3.imprimir();
        
        b3.setcolor("azul");
        b3.imprimir();
        //b3.imprimir();
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
    
    public String getFrenos(){
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
