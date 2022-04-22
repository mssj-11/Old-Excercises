/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO;

/**
 *
 * @author HP
 */
public class Menu_ListaDoble {

    public static void main(String[] args) {
        Control_Cola ld = new Control_Cola();

        System.out.println("----------");
        ld.insertarInicio("Michael");
        ld.insertarFin("Salgado");
        ld.insertarFin("Sotero");

        //ld.extraerInicio();
        //ld.extraerUltimo();
        ld.muestraAscendente();
        //ld.muestraDescendente();
        System.out.println("----------");

        System.out.println(ld.buscarElemento("Michael"));
    }

}
