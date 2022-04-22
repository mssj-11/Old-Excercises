/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

/**
 *
 * @author HP
 */
public class Prueba {

    public static void main(String[] args) {
        //en el metodo principal llamado "main" se creara una instancia de
        //la clase datos el cual se nombra del cualquier manera
        Datos objeto = new Datos();

        //para leer solo un caracter
//        objeto.ObtenerCaracter();
//        objeto.mostrarDatos();
//-------------------------------------------------------------------------------------------------------------
//2 ahora se hara uso de los nuevos metodos creados 
//esto para mostrar toda la linea
        objeto.obtenerflujo();
        objeto.mostrardatos();

    }

}
