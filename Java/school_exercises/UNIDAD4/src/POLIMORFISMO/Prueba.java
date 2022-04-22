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
public class Prueba {

    public static void main(String[] args) {
        Persona P = new Persona("Juan", 31, 'M');
        Trabajador T = new Trabajador(5354, "Produccion", 1500, "Diego", 20, 'M');
        Empleado E = new Empleado(15, 6, 76543, "Recursos Humanos", 2222, "Pepe", 19, 'M');

        Persona[] todos = new Persona[3];
        todos[0] = P;
        todos[1] = T;
        todos[2] = E;

        todos[0].Datos();
        System.out.println("\n");
        todos[1].Datos();
        System.out.println("\n");
        todos[2].Datos();

    }

}
