/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;

/**
 *
 * @author HP
 */
public class operaciones { //comienzo clase operaciones

    public int suma(int n1, int n2) {//metodo para sumar, recibe dos numeros
        int op; //variable que almacena la respuesta
        op = n1 + n2; //operacion
        return op; //devuelve el valor de la operacion
    } //fin metodo suma

    public int resta(int n1, int n2) { //metodo para restar, recibe dos numeros
        int op; //variable que almacena la respuesta
        op = n1 - n2; //operacion
        return op; //devuelve el valor de la operacion
    }// fin metodo resta

    public int multiplicacion(int n1, int n2) { //metodo para multiplicar, recibe dos numeros
        int op; //variable que almacena la respuesta
        op = n1 * n2; //operacion
        return op; //devuelve el valor de la operacion
    } //fin metodo multiplicacion 

    public int division(int n1, int n2) { //metodo para division, recibe dos numeros
        int op; //variable que almacena la respuesta
        op = n1 / n2; //operacion
        return op; //devuelve el valor de la operación
    }//fin metodo division

    public boolean isNum(String n) {//metodo para validar si se ha ingresado un numero, recibe una cadena de texto
        int a;//variable que almacena la cadena a convertir
        try {
            a = Integer.parseInt(n); //se convierte la cadena      
            return true; //si se ha convertido a entero devuelve verdadero
        } catch (NumberFormatException e) {
            return false; //si no se ha convertido a entero devuelve falso
        }
    }//fin metodo validar

}//fin clase operaciones
