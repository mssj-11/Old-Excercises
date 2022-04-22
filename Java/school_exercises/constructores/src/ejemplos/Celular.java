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
public class Celular {
    public String marca;
    public String modelo;
    public float ano;
    public String sistema;
    public String color;
    
    
    public Celular (String marca, String modelo, float ano, String sistema, String color){
    this.marca=marca;
    this.modelo=modelo;
    this.ano=ano;
    this.sistema=sistema;
    this.color=color;
    }
    
    public void imprimir(){
        System.out.println("\nla marca es:"+marca+"\nel modelo"+modelo+"\nel ano"+ano+"\nel sistema"+sistema+"\nel colo"+color);
    }
    
    public void setcolor(String col){
        color=col;
    }
    
    public String getcolor(){
        return color;
    }
    
    public static void main(String [] args){
        Celular c1=new Celular ("samsung","galaxy j5",2016,"android","negro");
        c1.imprimir();
        
        
        c1.setcolor("negro");
       c1.imprimir();
       //c1.imprimir();
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
