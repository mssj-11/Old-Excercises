/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRACTICA4;

/**
 *
 * @author HP
 */
public class Sueldo extends Operaciones {

    public String nombre_empleado;
    public double sueldo;

    public Sueldo(String nombre_empleado, double sueldo) {
        this.nombre_empleado = nombre_empleado;
        this.sueldo = sueldo;
    }

    
    public Sueldo() {
        super ();
        this.nombre_empleado = "Juan";
        this.sueldo = 524;
    }
    
    
    @Override
    public void Suma() {
        System.out.println("La suma es:");
    }

    @Override
    public void Resta() {
        System.out.println("La resta es:");
    }

    @Override
    public void Multiplicacion() {
        System.out.println("La multiplicacion es:");
    }

    @Override
    public void Division() {
        System.out.println("La division es:");
    }
}
