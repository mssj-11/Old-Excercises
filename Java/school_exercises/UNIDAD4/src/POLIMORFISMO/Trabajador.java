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
public class Trabajador extends Persona {
    
    public int n_empleado;
    public String area;
    public double sueldo;

    public Trabajador(int n_empleado, String area, double sueldo, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.n_empleado = n_empleado;
        this.area = area;
        this.sueldo = sueldo;
    }
    

    @Override
    public void Datos (){
    super.Datos();
    System.out.println("El numero de empleado es " + this.getN_empleado());
    System.out.println("Su area es "+this.getArea());
    System.out.println("Su sueldo es de "+this.getSueldo());
    }

    
    public int getN_empleado() {
        return n_empleado;
    }

   
    public void setN_empleado(int n_empleado) {
        this.n_empleado = n_empleado;
    }

   
    public String getArea() {
        return area;
    }

    
    public void setArea(String area) {
        this.area = area;
    }

    
    public double getSueldo() {
        return sueldo;
    }

   
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
        
}
