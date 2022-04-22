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
public class Bicicleta extends Motocicleta {

    public int pedales;
    public boolean frenos;

    public Bicicleta(int pedales, boolean frenos, String color, String tipo, int Velocidad_M, int llantas, String marca, String modelo) {
        super(color, tipo, Velocidad_M, llantas, marca, modelo);
        this.pedales = pedales;
        this.frenos = frenos;
    }

    public int getPedales() {
        return pedales;
    }

    public void setPedales(int pedales) {
        this.pedales = pedales;
    }

    public boolean isFrenos() {
        return frenos;
    }

    public void setFrenos(boolean frenos) {
        this.frenos = frenos;
    }

    @Override
    public void Datos() {
        super.Datos();
        System.out.println("El numero de pedales de la Bicicleta son >>>>>>>>>" + this.getPedales());
        System.out.println("Tiene frenos ?? >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + this.isFrenos());
    }

}
