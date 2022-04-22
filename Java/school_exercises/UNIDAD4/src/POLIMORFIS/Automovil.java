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
public class Automovil {

    public int num_llantas;
    public String marca;
    public String modelo;

    public Automovil(int num_llantas, String marca, String modelo) {
        this.num_llantas = num_llantas;
        this.marca = marca;
        this.modelo = modelo;
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

    public void Datos() {
        System.out.println("La marca del Automovil es >>>>>>>>>>>>>>>>>>>>>>>>" + this.getMarca());
        System.out.println("El modelo es >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + this.getModelo());
        System.out.println("El numero de llantas son >>>>>>>>>>>>>>>>>>>>>>>>>" + this.getNum_llantas());
    }

}
