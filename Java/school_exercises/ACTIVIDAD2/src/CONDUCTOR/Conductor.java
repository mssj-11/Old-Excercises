/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONDUCTOR;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Conductor {
   private String nombre;
   private int edad;
   private int n_licencia;
   private int anos_experiencia;
   
    /**
     *
     */
   public void Entrada (){
     Scanner con=new Scanner (System.in);  
     
    System.out.println("\nClase Conductor atributos\n");
    System.out.println("Escribe el nombre del conductor ");
    setNombre(con.nextLine());
    System.out.println("Introduce la edad del conductor ");
    setEdad(con.nextInt());
    System.out.println("Introduce el numero de licencia del conductor ");
    setN_licencia(con.nextInt());
    System.out.println("Introduce cuantos años de experiecia tiene ");
    setAnos_experiencia(con.nextInt());
    
   }
    
   
    public Conductor (String nombre,int edad,int n_licencia,int anos_experiencia) {
    this.nombre=nombre;
    this.edad=edad;
    this.n_licencia=n_licencia;
    this.anos_experiencia=anos_experiencia;
}
    public Conductor () {
     this.nombre="Pedro Paramo";
    this.edad=31;
    this.n_licencia=00001234;
    this.anos_experiencia=4;  
    }

    public void Datos (){
        System.out.println("\nel nombre es: "+getNombre()+"\nla edad"+getEdad()+"\nel numero de licencia "+getN_licencia()+"\nlos anos de experiencia"+getAnos_experiencia());
        System.out.println("___________________________________________________");
    }  

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the n_licencia
     */
    public int getN_licencia() {
        return n_licencia;
    }

    /**
     * @param n_licencia the n_licencia to set
     */
    public void setN_licencia(int n_licencia) {
        this.n_licencia = n_licencia;
    }

    /**
     * @return the anos_experiencia
     */
    public int getAnos_experiencia() {
        return anos_experiencia;
    }

    /**
     * @param anos_experiencia the anos_experiencia to set
     */
    public void setAnos_experiencia(int anos_experiencia) {
        this.anos_experiencia = anos_experiencia;
    }
        
    
    
    public void datos (){
    System.out.println("su nombre es "+this.getNombre());
    System.out.println("su edad es de "+this.getEdad());
    System.out.println("su numero de licencia es "+this.getN_licencia());
    System.out.println("su esperiencia es de "+this.getAnos_experiencia()+" años");
    
    }   
    
}
