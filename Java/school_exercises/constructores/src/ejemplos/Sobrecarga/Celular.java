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
public class Celular {
    public String marca;
    public String modelo;
    public float ano;
    public String sistema;
    public String color;
    
    
    public Celular (String marca, float ano){
    this.marca=marca;
    this.ano=ano;
    }

    public Celular(String modelo, String sistema) {
        this.modelo = modelo;
        this.sistema = sistema;
    }

    public Celular(String color) {
        this.color = color;
    }
    
    
    public void imprimir(){
        System.out.println("\nla marca es:"+this.getMarca()+"\nel modelo"+this.getModelo()+"\nel ano"+this.getAno()+"\nel sistema"+this.getSistema()+"\nel colo"+this.getColor());
    }
    
    public void setcolor(String col){
        color=col;
    }
    
    public String getcolor(){
        return color;
    }
    
    public static void main(String [] args){
        Celular c1=new Celular ("samsung",2016);
        Celular c2=new Celular ("galaxy j5","android");
        Celular c3=new Celular ("negro");
        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
        
        
        c3.setcolor("negro");
        c3.imprimir();
        //c3.imprimir();
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public float getAno(){
        return ano;
    }
    
    public String getSistema(){
        return sistema;
    }
    
    public String getColor(){
        return color;
    }    
}
