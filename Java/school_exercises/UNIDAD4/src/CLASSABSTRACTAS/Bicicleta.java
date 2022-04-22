/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSABSTRACTAS;

/**
 *
 * @author HP
 */
public class Bicicleta extends Motocicleta {

    public int pedales;
    public boolean frenos;

    public Bicicleta(int pedales, boolean frenos,int num_llantas, String marca, String modelo) {
        super();
        this.pedales = pedales;
        this.frenos = frenos;
    }

 public Bicicleta() {
        super();
        this.pedales = 2;
        this.frenos = true;
    }

    Bicicleta(int i, boolean b, String color, String tipo,int num_llantas, String marca, String modelo) {
        super();
        this.pedales = 2;
        this.frenos = true;
    }

    Bicicleta(String color, String tipo, int num_llantas, int i, String marca, String modelo) {
        super("Azul","BMX",21,"diamondback","bluePrint");
        this.pedales = 2;
        this.frenos = true; 
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
 public double Velocidad_Maxima(){
            System.out.println("La Velocidad Maxima de la Bicicleta es: 11 km/hr");
        return 0;
            
}
    

@Override
    public void Datos() {
        super.Datos();
        System.out.println("El numero de pedales de la Bicicleta son >>>>>>>>>" + this.getPedales());
        System.out.println("Tiene frenos ?? >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + this.isFrenos());
    }
    
}
