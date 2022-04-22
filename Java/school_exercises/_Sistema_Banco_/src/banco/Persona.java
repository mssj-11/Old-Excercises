/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author HP
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;

    //Constructor
    public Persona() {
        nombre = "";
        apellidos = "";
        edad = 0;
    }

    //Métodos 
    public void setnombre(String valornombre) {
        nombre = "nombre" + valornombre;
    }

    public void setapellidos(String valorapellidos) {
        apellidos = "apellidos" + valorapellidos;
    }

    public void setedad(int valoredad) {
        edad = valoredad;
    }

    public String getnombre() {
        return nombre;
    }

    public String getapellidos() {
        return apellidos;
    }

    public int getedad() {
        return edad;
    }

}
