/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACT2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Conductor extends Resultados {
    
    public String nombre;
    public int edad;
    public int NO_licencia;
    public int A_experiencia;
    
    public void entrada (){
    Scanner con=new Scanner (System.in);
    
    System.out.println("\nClase Conductor atributos\n");
    
    System.out.println("Escribe el nombre del conductor ");
    nombre = con.nextLine();
    System.out.println("Introduce su edad ");
    edad = con.nextInt();
    System.out.println("Introduce su numero de licencia ");
    NO_licencia = con.nextInt();
    System.out.println("Introduce cuantos años de experiecia tiene ");
    A_experiencia = con.nextInt();
    
    }
    
 public Conductor (){
   this.nombre = "Pedro Paramo";
        this.edad = 31;
        this.NO_licencia = 1234;
        this.A_experiencia = 4;
    }
    public Conductor(String nombre, int edad, int NO_licencia, int A_experiencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.NO_licencia = NO_licencia;
        this.A_experiencia = A_experiencia;   
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

    public int getNO_licencia() {
        return NO_licencia;
    }

    public void setNO_licencia(int NO_licencia) {
        this.NO_licencia = NO_licencia;
    }

    public int getA_experiencia() {
        return A_experiencia;
    }

    public void setA_experiencia(int A_experiencia) {
        this.A_experiencia = A_experiencia;
    }
   
    
    
    public void Datos (){
    System.out.println("su nombre es "+this.getNombre());
    System.out.println("su edad es de "+this.getEdad());
    System.out.println("su numero de licencia es "+this.getNO_licencia());
    System.out.println("su esperiencia es de "+this.getA_experiencia()+" años");
    
    }
    
    
}
