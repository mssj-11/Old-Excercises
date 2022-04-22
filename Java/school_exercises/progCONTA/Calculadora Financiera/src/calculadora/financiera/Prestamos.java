/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.financiera;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Prestamos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double importe, tipo, limite;
        int periodo;

        System.out.print("Introduce el importe del préstamo: ");
        importe = scanner.nextDouble();

        System.out.print("Introduce el tipo de interés: ");
        tipo = scanner.nextDouble();

        System.out.print("Introduce el tiempo de amortización (años): ");
        periodo = scanner.nextInt();

        System.out.print("Introduce el límite que puedes pagar: ");
        limite = scanner.nextDouble();

        periodo *= 12; // Convertir el tiempo a meses
        tipo = tipo / 1200; // Calcular el tipo mensual

        double numerador = tipo * Math.pow(1 + tipo, periodo);
        double denominador = Math.pow(1 + tipo, periodo) - 1;
        double cuota = importe * (numerador / denominador);

        System.out.println("\nLa cuota mensual será de: " + cuota + "\n¿La cuota supera tu límite? -> " + (cuota > limite));
    }

}
