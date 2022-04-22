/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POLIMORFIS;

/**
 *
 * @author HP
 */
public class Prueba {

    public static void main(String[] args) {
        Automovil A = new Automovil(4, "Volkswagen", "2018");
        Motocicleta M = new Motocicleta("Roja", "Montana", 230, 2, "Italika", "2009");
        Bicicleta B = new Bicicleta(2, true, "Azul", "BMX", 65, 2, "Diamondback", "BluePrint");

        Automovil[] todos = new Automovil[3];
        todos[0] = A;
        todos[1] = M;
        todos[2] = B;

        todos[0].Datos();
        System.out.println("\n");
        todos[1].Datos();
        System.out.println("\n");
        todos[2].Datos();

    }

    
}
