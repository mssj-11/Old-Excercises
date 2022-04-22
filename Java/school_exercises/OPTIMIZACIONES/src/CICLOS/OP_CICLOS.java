/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CICLOS;

/**
 *
 * @author HP
 */
public class OP_CICLOS {

    public static void main(String[] args) {

        //EJEMPLO OBTENER FACTORIAL DE UN NUMERO        
        /*
        //sin usar optimizacion de ciclos
        int numero = 4;
        int resultado = 4 * (1) * (2) * (3);
        System.out.println("El factorial es: " + resultado);
         */
        //usando optimizacion de ciclos
        int numero = 4;
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        System.out.println("El factorial es " + resultado);

    }

}
