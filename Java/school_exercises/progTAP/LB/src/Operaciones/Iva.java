/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author HP
 */
public class Iva {

    public double Ivamex(double precio) {
        precio = precio * .16;
        return precio;
    }

    public double Ier(double sueldo) {
        double imp = sueldo * .09;
        sueldo = sueldo - imp;
        return sueldo;
    }

}
