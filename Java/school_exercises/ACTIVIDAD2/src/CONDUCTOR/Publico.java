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
public class Publico extends Chofer {
    
    private String Ruta;
    private int N_viajes_diarios;
    private int semanas_trabajadas_al_año ;
    
    
    public Publico() {
        super();
        this.Ruta ="Atlacomulco-Jocotitlán";
        this.semanas_trabajadas_al_año =10;
        this.N_viajes_diarios=52;
    }

    /**
     *
     */
    @Override
public void Entrada2 (){
    Scanner W=new Scanner (System.in);
    System.out.println("\n----------Clase Publico atributos-------------\n");
    System.out.println("Escribe la ruta que realiza ");
        setRuta(W.nextLine());
    System.out.println("Anota los viajes que hace al dia ");
        setN_viajes_diarios(W.nextInt());
    System.out.println("Anota las semanas que trabaja al año ");
        setSemanas_trabajadas_al_año(W.nextInt());
    
}
       
    
    public Publico(String Ruta, int N_viajes_diarios, int semanas_trabajadas_al_año,String tipo_vehículo, double salario_por_hora, int horas_trabajadas, String nombre ,int edad ,int n_licencia,int anos_experiencia) {
        super(tipo_vehículo, salario_por_hora, horas_trabajadas, nombre, edad , n_licencia, anos_experiencia);
        this.Ruta = Ruta;
        this.N_viajes_diarios = N_viajes_diarios; 
        this.semanas_trabajadas_al_año = semanas_trabajadas_al_año;
        
    }
    public void imprimir_datos (){
    System.out.println("su nombre es "+this.getNombre());
    System.out.println("su edad es de "+this.getEdad());
    System.out.println("el numero de licencia es "+this.getN_licencia());
    System.out.println("su esperiencia es de "+this.getAnos_experiencia()+" años");
    System.out.println("tipo de vehiculo "+this.getTipo_vehículo());
    System.out.println("salario por hora "+this.getSalario_por_hora());
    System.out.println("horas trabadas al dia "+this.getHoras_trabajadas());
    System.out.println("su ruta es "+this.getRuta());
    System.out.println("numero de sus viajes diarios "+this.getN_viajes_diarios());
    System.out.println("las semanas trabajadas al año "+this.getSemanas_trabajadas_al_año());
    System.out.println("________________________________________________");
}
public void Resultados (){
double ingreso = (( getHoras_trabajadas() * getSalario_por_hora()) * (5)) * (getSemanas_trabajadas_al_año());
    System.out.println("El ingreso anual del conductor "+getNombre()+" es de "+ingreso+" pesos");
    System.out.println("________________________________________________");
} 

    /**
     * @return the Ruta
     */
    public String getRuta() {
        return Ruta;
    }

    /**
     * @param Ruta the Ruta to set
     */
    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    /**
     * @return the N_viajes_diarios
     */
    public int getN_viajes_diarios() {
        return N_viajes_diarios;
    }

    /**
     * @param N_viajes_diarios the N_viajes_diarios to set
     */
    public void setN_viajes_diarios(int N_viajes_diarios) {
        this.N_viajes_diarios = N_viajes_diarios;
    }

    /**
     * @return the semanas_trabajadas_al_año
     */
    public int getSemanas_trabajadas_al_año() {
        return semanas_trabajadas_al_año;
    }

    /**
     * @param semanas_trabajadas_al_año the semanas_trabajadas_al_año to set
     */
    public void setSemanas_trabajadas_al_año(int semanas_trabajadas_al_año) {
        this.semanas_trabajadas_al_año = semanas_trabajadas_al_año;
    }




}
