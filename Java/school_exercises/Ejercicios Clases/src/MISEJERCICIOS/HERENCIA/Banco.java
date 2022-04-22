/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MISEJERCICIOS.HERENCIA;

/**
 *
 * @author HP
 */
public class Banco extends Cuenta{
    private String nombre;
    private int n_empleados;
    private int n_sucursales;
    private String direccion;

    public Banco(String nombre, int n_empleados, int n_sucursales, String direccion) {
        super (1200,5556,"cheque",25000.50);
        this.nombre = nombre;
        this.n_empleados = n_empleados;
        this.n_sucursales = n_sucursales;
        this.direccion = direccion;
    }
    @Override
    public void imprimir (){
        System.out.println("El numero de cuenta es: "+this.getN_cuenta());
        System.out.println("El numero de cliente es: "+this.getN_cliente());
        System.out.println("El tipo de  cuenta es: "+this.getTipo());
        System.out.println("El saldo disponible es: "+this.getSaldo());
        System.out.println("El banco  al que pertenece es: "+this.getNombre());
        System.out.println("El numero de empleados  del banco  es: "+this.getN_empleados());
        System.out.println("El numero de  sucursales  es: "+this.getN_sucursales());
        System.out.println("La direccion del banco es:  "+this.getDireccion());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the n_empleados
     */
    public int getN_empleados() {
        return n_empleados;
    }

    /**
     * @param n_empleados the n_empleados to set
     */
    public void setN_empleados(int n_empleados) {
        this.n_empleados = n_empleados;
    }

    /**
     * @return the n_sucursales
     */
    public int getN_sucursales() {
        return n_sucursales;
    }

    /**
     * @param n_sucursales the n_sucursales to set
     */
    public void setN_sucursales(int n_sucursales) {
        this.n_sucursales = n_sucursales;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
