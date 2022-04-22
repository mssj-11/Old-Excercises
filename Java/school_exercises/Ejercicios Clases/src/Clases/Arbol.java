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
public class Arbol {
    public String madera;
    public String hojas;
    private String raiz;
    protected float altura;
    
    public void imprimir(){
        System.out.println("\nla madera es:"+madera+"\n hojas "+hojas+"\nla raiz es"+raiz+"\nla altura es"+altura);
    }
    
    public static void main(String [] args){
        Arbol a1=new Arbol ();
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
