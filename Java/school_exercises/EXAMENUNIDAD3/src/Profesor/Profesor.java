/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesor;

/**
 *
 * @author HP
 */
public class Profesor {

    String nombre;
    int edad;

    public Profesor() {
        this.nombre = "Diego";
        this.edad = 27;
    }

    public Profesor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void Evalua() {
        System.out.println("El nombre del profesor es:" + nombre);
        System.out.println("Su edad es de:" + edad);
        System.out.println("El Profesor Evalua !!!!!");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
