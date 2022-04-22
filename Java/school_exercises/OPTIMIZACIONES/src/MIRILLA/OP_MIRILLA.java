/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MIRILLA;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class OP_MIRILLA {

    public static void main(String[] args) {
        //Creamos el objeto de la Clase Scanner para ingresar texto.
        Scanner input = new Scanner(System.in);
        //Imprimimos un menu al usuario:
        System.out.println("Escoga una opcion:");
        System.out.println("1) SUMAR");
        System.out.println("2) RESTAR");
        System.out.println("3) MULTIPLICAR");
        System.out.println("4) DIVIDIR");
        System.out.print("Respuesta: ");
        //capturamos en una variable la opcion que escogio el usuario
        String op = input.nextLine();
        //creamos el vector para guardar los numeros
        //sera de 2 posiciones.
        float[] nums = new float[2];
        //creamos una variable para guardar el resultado de
        //de las operaciones
        float result = 0;
        /*creamos una variable booleana para comprobar que las
 operaciones a realizar van bien, si llega a ser falsa
 es porque no se puede dividir entre cero y
 le mandaremos una notificacion al usuario.
         */
        boolean error = true;
        //creamos el switch para evaluar la operacion
        //que el usuario escogio
        switch (op) {
            case "1":
                op = "Suma";
                //creamos un for para capturar los 2 numeros a operaR
                System.out.println("");
                for (int i = 0; i < 2; i++) {
                    System.out.print("Numero " + (i + 1) + ": ");
                    nums[i] = input.nextFloat();
                }
                //Realizamos la operacion
                result = nums[0] + nums[1];
                //Y a la variable booleana de error le damos el valor false
                error = false;
                break;
            case "2":
                op = "Resta";
                System.out.println("");
                for (int i = 0; i < 2; i++) {
                    System.out.print("Numero " + (i + 1) + ": ");
                    nums[i] = input.nextFloat();
                }
                result = (nums[0]) - (nums[1]);
                error = false;
                break;
            case "3":
                op = "Multiplicacion";
                System.out.println("");
                for (int i = 0; i < 2; i++) {
                    System.out.print("Numero " + (i + 1) + ": ");
                    nums[i] = input.nextFloat();
                }
                result = (nums[0]) * (nums[1]);
                error = false;
                break;
            case "4":
                op = "Division";
                System.out.println("");
                for (int i = 0; i < 2; i++) {
                    System.out.print("Numero " + (i + 1) + ": ");
                    nums[i] = input.nextFloat();
                }
                //Para poder dividir evaluamos primero que el segundo numero
                //no sea cero, caso contrario la variable error sera true
                if (nums[1] != 0) {
                    result = (nums[0]) / (nums[1]);
                    error = false;
                } else {
                    error = true;
                }
                break;
            //Si el usuario digita una opcion diferente a la del menu
            default:
                error = true;
                break;
        }
        System.out.println("");
        /*
 - Si la variable "error" es false entonces mostramos los resultados
 - Si la variable "error" es true entonces imprimimos un error
         */
        if (error == false) {
            System.out.println("Resultado de la " + op + ": " + result);
        } else if (error == true) {
            System.out.println("ERROR: No se puede realizar la operacion");
        }
    }

}
