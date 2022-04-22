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
public class Privado extends Chofer {
    private int N_de_viajes_semanales;
    private int semanas_trabajadas_al_ano ;
    
    
    public Privado() {
        super();
        this.N_de_viajes_semanales = 11;
        this.semanas_trabajadas_al_ano = 52;
    }
    
    public void entrada2 (){
    Scanner Z=new Scanner (System.in);
    System.out.println("\nClase Privado atributos\n");
    System.out.println("Introduce cuantos viajes realiza a la semana ");
        setN_de_viajes_semanales(Z.nextInt());
    System.out.println("Introduce cuantas semanas trabaja al año ");
        setSemanas_trabajadas_al_ano(Z.nextInt());
  
}
   
    public Privado(int N_de_viajes_semanales, int semanas_trabajadas_al_año, String tipo_vehículo, double salario_por_hora, int horas_trabajadas, String nombre, int edad, int n_licencia, int anos_experiencia) {
       super();
        this.N_de_viajes_semanales = 15;
        this.semanas_trabajadas_al_ano = 52;
   }
    
    
    
public void Datos_imprimir (){
        System.out.println("su nombre es "+this.getNombre());
        System.out.println("su edad es "+this.getEdad());
        System.out.println("su numero de licencia es "+this.getN_licencia());
        System.out.println("los años de experiencia "+this.getAnos_experiencia());
        System.out.println("el tipo de vehiculo "+this.getTipo_vehículo());
        System.out.println("su salario por hora es de "+this.getSalario_por_hora()+" pesos");
        System.out.println("las horas trabajadas al dia "+this.getHoras_trabajadas());
         System.out.println("________________________________________________");
    }

 public void Resultado2 (){
double ingreso2 = ((getHoras_trabajadas() * getSalario_por_hora()) * (5)) * (getSemanas_trabajadas_al_ano());
double aginaldo = (((getHoras_trabajadas() * getSalario_por_hora()) * 5) * 6) + (5000);
    System.out.println("el ingreso anual del conductor "+getNombre()+" es de "+ingreso2);
    System.out.println("su aginaldo es igual a "+aginaldo);
    System.out.println("________________________________________________");
}

    /**
     * @return the N_de_viajes_semanales
     */
    public int getN_de_viajes_semanales() {
        return N_de_viajes_semanales;
    }

    /**
     * @param N_de_viajes_semanales the N_de_viajes_semanales to set
     */
    public void setN_de_viajes_semanales(int N_de_viajes_semanales) {
        this.N_de_viajes_semanales = N_de_viajes_semanales;
    }

    /**
     * @return the semanas_trabajadas_al_ano
     */
    public int getSemanas_trabajadas_al_ano() {
        return semanas_trabajadas_al_ano;
    }

    /**
     * @param semanas_trabajadas_al_ano the semanas_trabajadas_al_ano to set
     */
    public void setSemanas_trabajadas_al_ano(int semanas_trabajadas_al_ano) {
        this.semanas_trabajadas_al_ano = semanas_trabajadas_al_ano;
    }
 
 
 
 
}
