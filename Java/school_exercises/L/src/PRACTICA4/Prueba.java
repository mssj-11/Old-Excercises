/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRACTICA4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Prueba {

    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        String operacion;
        String snum1 = "", snum2 = "";
        int num1 = 0, num2;
        char op = '*';
        int salir = 0;
        System.out.print("Escribe una operacon: ");
        operacion = dt.nextLine();

        for (int i = 0; i < operacion.length(); i++) {
            if (operacion.charAt(i) != '-' && operacion.charAt(i) != '+' && operacion.charAt(i) != 'x' && operacion.charAt(i) != '/') {

                if (salir == 0) {
                    snum1 = snum1 + operacion.charAt(i);
                } else {
                    snum2 = snum2 + operacion.charAt(i);
                }
            } else {
                op = operacion.charAt(i);
                salir = 1;
            }
        }

        num1 = Integer.parseInt(snum1);
        num2 = Integer.parseInt(snum2);

        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case 'x':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;

        }

    }

}
