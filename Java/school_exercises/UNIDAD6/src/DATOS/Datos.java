/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Datos {

    //atributo
    private char flujo;

    //2esta variable solo obtiene la conversion de bytes a cadenas para obtener el conjunto de caracteres
    //a traves del metodo readline
    private String linea;

    //metodo para obtener un caracter 
    public void ObtenerCaracter() {
        //indicacion para que el usuario pueda insertar culaquier caracter
        System.out.println("Ingresse un caracter:");

        try {
            //variable de tipo char para guardar el dato obtenido en la lectura del system.in.read
            flujo = (char) System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para mostrar datos
    public void mostrarDato() {

        System.out.println("El dato ingresado es:" + flujo);

    }

    //--------------------------------------------------------------------------------------
    //2para obtener todo el flujo de una sola linea del teclado 
    public void obtenerflujo() {
        InputStreamReader flujo_bytes = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(flujo_bytes);

        System.out.println("Ingrese un flujo de datos cualquiera:");

        try {

            //se utilizara el trycatch en caso de un error
            linea = entrada.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    //2 ahora crearemos un metodo para visualisar lo que hay en memoria
    public void mostrardatos(){
        System.out.println("El dato flujo ingresado es:"+linea); 
    }

}
