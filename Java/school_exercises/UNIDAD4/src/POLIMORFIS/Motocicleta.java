/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POLIMORFIS;

/**
 *
 * @author HP
 */
public class Motocicleta extends Automovil {

    public String color;
    public String tipo;
    public int Velocidad_M;

    public Motocicleta(String color, String tipo, int Velocidad_M, int llantas, String marca, String modelo) {
        super(llantas, marca, modelo);
        this.color = color;
        this.tipo = tipo;
        this.Velocidad_M = Velocidad_M;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidad_M() {
        return Velocidad_M;
    }

    public void setVelocidad_M(int Velocidad_M) {
        this.Velocidad_M = Velocidad_M;
    }

    @Override
    public void Datos() {
        super.Datos();
        System.out.println("El color de la Motocicleta es >>>>>>>>>>>>>>>>>>>>" + this.getColor());
        System.out.println("Es de tipo >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + this.getTipo());
        System.out.println("Su velocidad maxima es de >>>>>>>>>>>>>>>>>>>>>>>>" + this.getVelocidad_M());
    }

}
