/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrip;

/**
 *
 * @author HP
 */
public class Principal {

    public static void main(String[] args) {
        //crear variable tipo String 
        String mensaje = "hola mundo";

        //transformar la variable a un arreglo 
        char array[] = mensaje.toCharArray(); //toCharArray transforma de string a caracteres

        //para poder checando, posicion por posicion con ciclo for
        for (int i = 0; i < array.length; i++) {
            //modificar el arreglo
            array[i] = (char) (array[i] + (char) 5); //valor de la letra sera 5 posiciones adelante de cada letra

        }
        //creacion de la variable encriptado
        String encriptado = String.valueOf(array);
        System.out.print("Mensaje Encriptado: ");
        System.out.println(encriptado);

        //////////////////////////////////VICEVERSA////////////////////////////////////////////////7
        //transformar EL arreglo a variable
        char arrayD[] = encriptado.toCharArray(); //toCharArray transforma de string a caracteres

        //para poder checando, posicion por posicion con ciclo for
        for (int i = 0; i < arrayD.length; i++) {

            //modificar el arreglo pero decrementando las 5 posiciones
            arrayD[i] = (char) (arrayD[i] - (char) 5); //valor de la letra sera 5 posiciones adelante de cada letra
        }
        //creacion del metodo d desencriptacion
        String desencriptado = String.valueOf(arrayD);
        System.out.print("Mensaje Desencriptado: ");
        System.out.println(desencriptado);
    }

}
