/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NEW;

/**
 *
 * @author HP
 */
public class Futbolista extends Persona{

    double peso;
    double altura;

    public Futbolista() {
        super("David",22);
        this.peso = 72.400;
        this.altura = 1.70;
    }

    public Futbolista(double peso, double altura, String nombre, int edad) {
        super(nombre, edad);
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double masa_muscular() {
        return 0;
        
    }

    @Override
    public void entrada() {
        
    }

    @Override
    public void datos() {
        
    }
    
    
    
    
    
    
    
    
    
    
   
    
    
}
