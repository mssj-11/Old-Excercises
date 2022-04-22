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
public class Tridimencional extends Figura{
    public double radio, aristas, Vlados;

    public Tridimencional(double radio, double aristas, double Vlados, int lados, String nombre, String tipo) {
        super(lados, nombre, tipo);
        this.radio = radio;
        this.aristas = aristas;
        this.Vlados = Vlados;
    }

    
    public Tridimencional(double radio, String A) {
        super(1, "Esfera", "tridimencional");
        this.radio = radio;
        
    }
    public Tridimencional(double aristas) {
        super(12, "Cubo", "Tridimencional");
        this.aristas = aristas;
        
    }
    
    public Tridimencional(double Vlados, boolean a) {
        super(6, "Tetraedro", "Tridimencional");
        this.Vlados = Vlados;
        
        
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAristas() {
        return aristas;
    }

    public void setAristas(double aristas) {
        this.aristas = aristas;
    }

    public double getVlados() {
        return Vlados;
    }

    public void setVlados(double Vlados) {
        this.Vlados = Vlados;
    }
    
    
    
}
