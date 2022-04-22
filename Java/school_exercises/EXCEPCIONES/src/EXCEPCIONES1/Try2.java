/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXCEPCIONES1;

/**
 *
 * @author HP
 */
public class Try2 {

    public static void main(String arg[]) {
        int[] array = new int[20];
        try {
            array[-3] = 24;
        } catch (ArrayIndexOutOfBoundsException excepcion) {
            System.out.println(" Error de índice en un array");
        }
    }

}
