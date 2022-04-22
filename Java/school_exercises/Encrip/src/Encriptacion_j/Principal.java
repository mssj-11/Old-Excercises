/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encriptacion_j;

/**
 *
 * @author HP
 */
public class Principal {

    public static void main(String[] args) throws Exception {
        String palabra = "Michael";
        String enc=Utilidades.Encriptar(palabra);
        System.out.println("El mensaje Encriptado es: " + Utilidades.Encriptar(enc));
        System.out.println("El mensaje Desencriptado es: " + Utilidades.Desencriptar(enc));

//        Texto text = new Texto(Utilidades.Encriptar("Michael"));
//        new JavaEnc().encriptar(text);
//        System.out.println(""+Utilidades.Desencriptar(new JavaEnc().desencriptar().getPalabra()));
        
        
//        System.out.println("Palabra desencriptada: "+new JavaEnc().desencriptar().getPalabra());

        
    }

}
