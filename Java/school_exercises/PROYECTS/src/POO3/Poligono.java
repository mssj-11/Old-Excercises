/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO3;

/**
 *
 * @author HP
 */
public abstract class Poligono extends Calculos{
   
    public int numerodelados;

    public Poligono(int numerodelados) {
        this.numerodelados = numerodelados;
    }

    public int getNumerodelados() {
        return numerodelados;
    }

    public void setNumerodelados(int numerodelados) {
        this.numerodelados = numerodelados;
    }
    
    @Override
 public abstract double Area ();   
    
    @Override
 public abstract double Perimetro ();  
    
    
    
    
}
