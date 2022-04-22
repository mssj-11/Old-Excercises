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
public class Empleado extends Trabajador {

    public int dias_trabajo;
    public int experiencia;

    public Empleado(int dias_trabajo, int experiencia, int n_empleado, String area, double sueldo, String nombre, int edad, char sexo) {
        super(n_empleado, area, sueldo, nombre, edad, sexo);
        this.dias_trabajo = dias_trabajo;
        this.experiencia = experiencia;
    }

    @Override
    public void Datos() {
        super.Datos();
        System.out.println("Numero de dias de trabajo son " + this.getDias_trabajo());
        System.out.println("Su experiencia es " + this.getExperiencia());
    }

    public int getDias_trabajo() {
        return dias_trabajo;
    }

    public void setDias_trabajo(int dias_trabajo) {
        this.dias_trabajo = dias_trabajo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

}
