/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesor;

/**
 *
 * @author HP
 */
public class Interno extends Profesor{
    
    double Sueldo;
    int dias_trabajo;
    
    
    public Interno() {
        this.Sueldo = 100000;
        this.dias_trabajo=5;
    }

    public Interno(double Sueldo,int dias_trabajo, int potencia, double costo) {
        super();
        this.Sueldo = Sueldo;
        this.dias_trabajo=dias_trabajo;
    }
    
    public void Da_mas_clases(){
     super.Evalua();
        System.out.println("El sueldo del profesor Interno es de:" + Sueldo);
        System.out.println("Los dias que trabaja el Profesor Interno son:" + dias_trabajo);
        System.out.println("El Profesor Evalua !!!!!");
        System.out.println("El Profesor Observa !!!!!");
        
      }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public int getDias_trabajo() {
        return dias_trabajo;
    }

    public void setDias_trabajo(int dias_trabajo) {
        this.dias_trabajo = dias_trabajo;
    }
    
    
}
