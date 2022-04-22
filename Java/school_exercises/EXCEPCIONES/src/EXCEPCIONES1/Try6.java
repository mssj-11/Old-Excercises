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
public class Try6 {

    public static void main(String arg[]) {
        try {
            MiPropioError e = new MiPropioError("Este es mi propio error.");
            throw e;
        } catch (Exception excepcion) {
            excepcion.printStackTrace();
        }
    }
}

class MiPropioError extends Exception {

    public MiPropioError(String mensaje) {
        super(mensaje);
    }

}
