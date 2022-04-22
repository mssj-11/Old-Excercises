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
public class Nuclear  extends Arma{
    String nombre;

    public Nuclear() {
        this.nombre = "proyectil";
    }

    public Nuclear(String nombre, int potencia, double costo) {
        super();
        this.nombre = nombre;
    }
    
    public void disparada(){
    super.activada();
        System.out.println("El nombre del arma nuclear es :" + nombre);
        System.out.println("El Arma  nuclear si dispara !!!!!");}
    
    
}
