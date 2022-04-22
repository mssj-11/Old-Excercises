/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author HP
 */
public class Cuadrado implements FiguraGeometrica {

    private double lado;
    private double areaCuadrado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getareaCuadrado() {
        return areaCuadrado;
    }

    @Override
    public void area() {
        areaCuadrado = lado * lado;
    }

}
