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
public class Chofer extends Conductor {
    private String tipo_vehículo;
    private double salario_por_hora;
    private int horas_trabajadas;
    
    public Chofer() {
        super ();
        this.tipo_vehículo ="Sedan";
        this.salario_por_hora =50;
        this.horas_trabajadas='8';
    }
    
    public void Entrada2 (){
    Scanner ZZ=new Scanner (System.in);
    System.out.println("\n----------Clase Chofer atributos-------------\n");
    System.out.println("Escribe el tipo de vehiculo ");
        setTipo_vehículo(ZZ.nextLine());
    System.out.println("Anota su salario por hora ");
        setSalario_por_hora(ZZ.nextFloat());
    System.out.println("Anota sus horas que trabaja al dia ");
        setHoras_trabajadas((int) ZZ.nextFloat());
}
    
    
    public Chofer(String tipo_vehículo, double salario_por_hora, int horas_trabajadas,String nombre,int edad,int n_licencia,int anos_experiencia) {
        super();
        this.tipo_vehículo = tipo_vehículo;
        this.salario_por_hora = salario_por_hora;
        this.horas_trabajadas = horas_trabajadas;
    }
     
     public void sueldo (){
        double sueldo = (getHoras_trabajadas() * getSalario_por_hora()) * (5);
System.out.println("El sueldo semanal del chofer "+this.getNombre()+" es de "+sueldo+" pesos");
System.out.println("________________________________________________");
}

    /**
     * @return the tipo_vehículo
     */
    public String getTipo_vehículo() {
        return tipo_vehículo;
    }

    /**
     * @param tipo_vehículo the tipo_vehículo to set
     */
    public void setTipo_vehículo(String tipo_vehículo) {
        this.tipo_vehículo = tipo_vehículo;
    }

    /**
     * @return the salario_por_hora
     */
    public double getSalario_por_hora() {
        return salario_por_hora;
    }

    /**
     * @param salario_por_hora the salario_por_hora to set
     */
    public void setSalario_por_hora(double salario_por_hora) {
        this.salario_por_hora = salario_por_hora;
    }

    /**
     * @return the horas_trabajadas
     */
    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    /**
     * @param horas_trabajadas the horas_trabajadas to set
     */
    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

     
     
     
    }
    
