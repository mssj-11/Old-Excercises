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
public abstract class Automovil extends Transportes {

    public int num_llantas;
    public String marca;
    public String modelo;

    public Automovil(int num_llantas, String marca, String modelo) {
        super();
        this.num_llantas = num_llantas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Automovil() {
        super();
        this.num_llantas = 4;
        this.marca = "Volkswaguen";
        this.modelo = "Golf";
    }
    
    

    public int getNum_llantas() {
        return num_llantas;
    }

    public void setNum_llantas(int num_llantas) {
        this.num_llantas = num_llantas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

@Override
 public double Velocidad_Maxima(){
            System.out.println("La Velocidad Maxima del Automovil es: 55 km/hr");
        return 0;
            
}
    public void Datos() {
        System.out.println("La marca del Vehiculo es >>>>>>>>>>>>>>>>>>>>>>>>>" + this.getMarca());
        System.out.println("El modelo es >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + this.getModelo());
        System.out.println("El numero de llantas son >>>>>>>>>>>>>>>>>>>>>>>>>" + this.getNum_llantas());
    }
    
    
}
