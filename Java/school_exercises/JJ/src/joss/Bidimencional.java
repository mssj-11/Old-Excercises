/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joss;

/**
 *
 * @author Daniel
 */
public class Bidimencional extends Figura{
    
    public double radio, altura, base, lado;

    public Bidimencional(double radio, double altura, double base, double lado, int lados, String nombre, String tipo) {
        super(lados, nombre, tipo);
        this.radio = radio;
        this.altura = altura;
        this.base = base;
        this.lado = lado;
    }
     public Bidimencional(double radio, String A) {
        super(1, "Circulo", "Bidimencional");
        this.radio = radio;
        
    }
    
      public Bidimencional(double lado) {
        super(4, "Cuadrado", "Bidimencional");
        this.lado = lado;
        
    }
      
      
      public Bidimencional(double altura, double base) {
        super(3, "Cuadrado", "Bidimencional");
        this.altura = altura;
        this.base = base;
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    


       
    
}
