/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJEM2;

/**
 *
 * @author HP
 */
public class Arbol {
 
    /* Atributos */
    private Nodo raiz;
 
    /* Contructories */    
    public Arbol( int valor ) {
        this.raiz = new Nodo( valor );
    }
 
    public Arbol( Nodo raiz ) {
        this.raiz = raiz;
    }
 
    /* Setters y Getters */
    public Nodo getRaiz() {
        return raiz;
    }
 
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
}

