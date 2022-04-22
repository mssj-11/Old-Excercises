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
public class Arbol {
    public String madera;
    public String hojas;
    public String raiz;
    protected float altura;
    
    
    public Arbol (String madera, String raiz){
    this.madera=madera;
    this.raiz=raiz;
    }

    public Arbol(String hojas, float altura) {
        this.hojas = hojas;
        this.altura = altura;
    }
    
       
    public void imprimir(){
        System.out.println("\nla madera es:"+this.getMadera()+"\n hojas "+this.getHojas()+"\nla raiz es"+this.getRaiz()+"\nla altura es"+this.getAltura());
    }
    
    public void setmadera(String mad){
        
        madera=mad;
    }
    
    public String getmadera(){
        return madera;
    }
    
    
    public static void main(String [] args){
        Arbol a1=new Arbol ("madera","raiz");
        Arbol a2=new Arbol ("hojas",5);
        a1.imprimir();
        a2.imprimir();
    }
    
    public String getMadera(){
        return madera;
    }
    
    public String getHojas(){
        return hojas;
    }
    
    public String getRaiz(){
        return raiz;
    }
    
    public float getAltura(){
        return altura;
    }   
}
