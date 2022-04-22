/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERSONA;

/**
 *
 * @author HP
 */
public class Trabajador extends Persona {
    public int n_empleado;
    public String area;
    public double sueldo;
    
    public Trabajador (){
    this.n_empleado=2643;
    this.area="produccion";
    this.sueldo=2500.00;
    }

    public Trabajador(int n_empleado, String area, double sueldo) {
        super("luis", 21, 'm');
        this.n_empleado = n_empleado;
        this.area = area;
        this.sueldo = sueldo;
    }
    public void imprimir1 (){
    System.out.println("el nombre del trabajador es: "+this.nombre);
    System.out.println("la edad del trabajador es: "+this.edad);
    System.out.println("el numero de empleado del trabajador es: "+this.n_empleado);
    System.out.println("el sexo del trabajador es: "+this.sexo);
    System.out.println("el area del trabajador es: "+this.area);
    System.out.println("el sueldo del trabajador es: "+this.sueldo);
    }
    
}
