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
public class Publico extends Chofer {
public String Ruta;
public int Viajes_diarios;
public int Semanas_trabajadas;  

    public Publico() {
        super();
   this.Ruta = "Atlacomulco-Jocotitlán";
        this.Viajes_diarios = 10;
        this.Semanas_trabajadas = 52;
    } 
@Override
public void entrada2 (){
    Scanner W=new Scanner (System.in);
System.out.println("\n                   Clase Publico atributos                   \n");
    System.out.println("Escribe la ruta que realiza ");
    Ruta =W.nextLine();
    System.out.println("Anota los viajes que hace al dia ");
    Viajes_diarios = W.nextInt();
    System.out.println("Anota las semanas que trabaja al año ");
    Semanas_trabajadas = W.nextInt();
}
public void Herencia_COP (){
super.entrada();
}

public void Herencia_CHP (){
super.entrada2();
}
    public Publico(String Ruta, int Viajes_diarios, int Semanas_trabajadas) {
        super();
        this.Ruta = Ruta;
        this.Viajes_diarios = Viajes_diarios;
        this.Semanas_trabajadas = Semanas_trabajadas;
    }


    public Publico(String Tipo_vehículo, float Salario_hora, float Horas_trabajadas, String nombre, int edad, int NO_licencia, int A_experiencia) {
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
    System.out.println("su ruta es "+this.Ruta);
    System.out.println("viajes diarios "+this.Viajes_diarios);
    System.out.println("semanas trabajadas al año "+this.Semanas_trabajadas);
 
}
public void resultado (){
double ingreso = ((Horas_trabajadas * Salario_hora) * (5)) * (Semanas_trabajadas);
    System.out.println("El ingreso anual del conductor "+nombre+" es de "+ingreso+" pesos");

}
}
