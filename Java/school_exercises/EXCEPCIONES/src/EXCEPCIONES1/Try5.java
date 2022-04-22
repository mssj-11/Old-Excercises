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
public class Try5 {

    public static void main(String arg[]) {
        try {
            Exception e = new Exception("Este es mi propio error.");
            throw e;
        } catch (Exception excepcion) {
            excepcion.printStackTrace();
        }
    }

}
