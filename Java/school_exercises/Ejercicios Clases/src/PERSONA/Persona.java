/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERSONA;

/**
 *
 * @author HP
 */
public class Persona {
    public String nombre;
    public int edad;
    public char sexo;

    public Persona() {
        this.nombre ="paco";
        this.edad =27;
        this.sexo='m';
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
     public void caminar (int mts){
     System.out.println(nombre+" esta caminado "+ mts +"metros");
     }           
}
