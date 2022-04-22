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
public class Arbol {
    public String madera;
    public String hojas;
    public String raiz;
    protected float altura;
    
    
    public Arbol (String madera, String hojas, String raiz, float altura){
    this.madera=madera;
    this.hojas=hojas;
    this.raiz=raiz;
    this.altura=altura;
    }
    
    
    public void imprimir(){
        System.out.println("\nla madera es:"+madera+"\n hojas "+hojas+"\nla raiz es"+raiz+"\nla altura es"+altura);
    }
    
    public static void main(String [] args){
        Arbol a1=new Arbol ("madera","hojas","raiz",5);
        a1.imprimir();
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
