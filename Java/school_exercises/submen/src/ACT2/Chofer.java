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
public class Chofer extends Conductor {
    public String Tipo_vehículo;
    public float Salario_hora; 
    public float Horas_trabajadas; 
   
    
public Chofer (){
    super();
  this.Tipo_vehículo = "Sedan";
    this.Salario_hora = 50;
    this.Horas_trabajadas = 8;

}
    
    public void entrada2 (){
        Scanner ZZ=new Scanner (System.in);
System.out.println("\n                   Clase Chofer atributos                   \n");
    System.out.println("Escribe el tipo de vehiculo ");
    Tipo_vehículo =ZZ.nextLine();
    System.out.println("Anota su salario por hora ");
    Salario_hora = ZZ.nextFloat();
    System.out.println("Anota sus horas que trabaja al dia ");
    Horas_trabajadas = ZZ.nextFloat();
    } 
    public void herencia_C (){
     super.entrada();
    }
    
    public Chofer(String Tipo_vehículo, float Salario_hora, float Horas_trabajadas) {
        super();
        this.Tipo_vehículo = Tipo_vehículo;
        this.Salario_hora = Salario_hora;
        this.Horas_trabajadas = Horas_trabajadas;
    }

    public Chofer(String Tipo_vehículo, float Salario_hora, float Horas_trabajadas, String nombre, int edad, int NO_licencia, int A_experiencia) {
        super(nombre, edad, NO_licencia, A_experiencia);
       
    }

    public String getTipo_vehículo() {
        return Tipo_vehículo;
    }

    public void setTipo_vehículo(String Tipo_vehículo) {
        this.Tipo_vehículo = Tipo_vehículo;
    }

    public float getSalario_hora() {
        return Salario_hora;
    }

    public void setSalario_hora(float Salario_hora) {
        this.Salario_hora = Salario_hora;
    }

    public float getHoras_trabajadas() {
        return Horas_trabajadas;
    }

    public void setHoras_trabajadas(float Horas_trabajadas) {
        this.Horas_trabajadas = Horas_trabajadas;
    }
    
    
    
    
    
    public void Da (){
       System.out.println("su nombre es "+this.getNombre());
    System.out.println("su edad es de "+this.getEdad());
    System.out.println("su numero de licencia es "+this.getNO_licencia());
    System.out.println("su esperiencia es de "+this.getA_experiencia()+" años");
    }
      public void Da2 (){
    System.out.println("tipo de vehiculo "+this.getTipo_vehículo());
    System.out.println("salario por hora "+this.getSalario_hora());
    System.out.println("horas trabadas al dia "+this.getHoras_trabajadas());
    }
public void sueldo (){
        double sueldo = (Horas_trabajadas * Salario_hora) * (5);
System.out.println("El sueldo semanal del chofer "+this.getNombre()+" es de "+sueldo+" pesos");

}

}
