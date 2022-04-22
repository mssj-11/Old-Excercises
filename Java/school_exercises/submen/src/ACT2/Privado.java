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
public class Privado extends Chofer{
    public int Viajes_semanales;
    public int Semanas_A;

    public Privado() {
        super();
     this.Viajes_semanales = 15;
        this.Semanas_A = 52; 
    }
    @Override
    public void entrada2 (){
        Scanner Z=new Scanner (System.in);
  System.out.println("\n                   Clase Privado atributos                   \n");
    System.out.println("Anota cuantos viajes realiza a la semana ");
    Viajes_semanales = Z.nextInt();
    System.out.println("Anota cuantas semanas trabaja al año ");
    Semanas_A = Z.nextInt();
  
}
public void Herencia_COP (){
super.entrada();
}

public void Herencia_CHP (){
super.entrada2();
}
    
 public Privado(int Viajes_semanales, int Semanas_A) {
        super();
        this.Viajes_semanales = Viajes_semanales;
        this.Semanas_A = Semanas_A;
    }

    public Privado(String Tipo_vehículo, float Salario_hora, float Horas_trabajadas, String nombre, int edad, int NO_licencia, int A_experiencia) {
        super(Tipo_vehículo, Salario_hora, Horas_trabajadas, nombre, edad, NO_licencia, A_experiencia);
    }

   public void imprimir_datos (){
    System.out.println("su nombre es "+this.getNombre());
    System.out.println("su edad es de "+this.getEdad());
    System.out.println("su numero de licencia es "+this.getNO_licencia());
    System.out.println("su esperiencia es de "+this.getA_experiencia()+" años");
 
}
public void imprimir_datos2 (){
    System.out.println("tipo de vehiculo "+this.Tipo_vehículo);
    System.out.println("salario por hora "+this.Salario_hora);
    System.out.println("horas trabadas al dia "+this.Horas_trabajadas); 
}
public void imprimir_datos3 (){
    System.out.println("los viajes que realiza semanalmente son "+this.Viajes_semanales);
    System.out.println("las semanas que trabaja al año son  "+this.Semanas_A);
    }
 public void resultado2 (){
double ingreso2 = ((Horas_trabajadas * Salario_hora) * (5)) * (Semanas_A);
double aginaldo = (ingreso2)+(((Horas_trabajadas * Salario_hora)*5)*6) + (5000);
    System.out.println("El ingreso anual del conductor "+nombre+" es de "+ingreso2);
    System.out.println("Su aginaldo mas su salario anual es igual a "+aginaldo);
    
            }
    
    
}
