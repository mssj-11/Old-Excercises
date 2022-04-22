/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenunidad3;

/**
 *
 * @author acer
 */
public class Arma {
    int potencia;
    double costo;
    
    public Arma(){
    this.potencia= 50;
    this.costo=300000.00;
    }

    public Arma(int potencia, double costo) {
        this.potencia = potencia;
        this.costo = costo;
    }
    
    
    public void activada(){
        System.out.println("La potencia del Arma es de:" + potencia);
        System.out.println("El costo del Arma es de:"+ costo);
            System.out.println("El Arma esta activada !!!!!");}


  
    
    
}
