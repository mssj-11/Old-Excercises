/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POLIMORFISMO;

/**
 *
 * @author HP
 */
public class Persona {
    
    public String nombre;
    public int edad;
    public char sexo;
    
 

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

   
    
    public void Datos (){
    System.out.println("Su nombre es "+this.getNombre());
    System.out.println("Su edad es "+this.getEdad());
    System.out.println("Su sexo es "+this.getSexo());
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

    
    public char getSexo() {
        return sexo;
    }

   
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    
}