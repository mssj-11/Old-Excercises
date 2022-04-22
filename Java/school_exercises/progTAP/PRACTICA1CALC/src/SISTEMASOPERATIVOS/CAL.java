/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SISTEMASOPERATIVOS;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CAL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double CPUocupada, CPUocupadaejechilos, CPUocupadaejecSO;

        double tiempototal;

        System.out.print("\033[31m|||||||||||||||||||||");
        System.out.print("\n\033[34m CALCULACION DE PARAMETROS ");
        System.out.print("\n\033[31m|||||||||||||||||||||\n");
        System.out.print("\n\033[34m///////////////////////////////");
        System.out.print("\n\033[34m//\tOCUPACION DE LA CPU  //");
        System.out.print("\n\033[34m///////////////////////////////");
/////////////////////////////////////////////////////////////////////////////////////////7
        System.out.print("\n\n\033[31m***********************");
        System.out.print("\n\033[34m\tUSO DEL CPU");
        System.out.print("\n\033[31m***********************");
        System.out.print("\n CPU Ocupada: ");
        CPUocupada = scanner.nextDouble();

        System.out.print("\nTiempo Total: ");
        tiempototal = scanner.nextDouble();

        double MB = (CPUocupada / tiempototal);

        System.out.println("\n\033[31mEl uso de la CPU es = " + MB);

        int R1 = (int) (tiempototal * 100 / CPUocupada);

        System.out.println("\n\033[31mEl Porcentaje es: " + R1 + "%");
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\n\033[31m******************************");
        System.out.print("\n\033[34mOcupacion Efectiva de la CPU");
        System.out.print("\n\033[31m******************************");
        System.out.print("\n\033[31m****Uso Efectivo CPU****");
        System.out.print("\nCPU Ocupada Ejecutando Hilos: ");
        CPUocupadaejechilos = scanner.nextDouble();

        System.out.print("\nEl Tiempo total ingresado es = " + tiempototal);

        double MO = (CPUocupadaejechilos / tiempototal);

        System.out.println("\n\n\033[31mEl Uso Efectivo de la CPU es: " + MO);

        int R2 = (int) (MO * 100);

        System.out.println("\n\033[31mEl Porcentaje es: " + R2 + "%");

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\n\033[31m************************************************");
        System.out.print("\n\033[34mSobrecarga impuesta por el sistema operativo");
        System.out.print("\n\033[31m************************************************");
        System.out.print("\n\033[34m ***Sobrecargas S.0***");
        System.out.print("\nCPU ocupada ejecutando hilos: ");
        CPUocupadaejecSO = scanner.nextDouble();

        System.out.print("\nEl Tiempo total ingresado es = " + tiempototal);

        double MUAFIDA = (CPUocupadaejecSO / tiempototal);

        System.out.println("\n\n\033[31mLa Sobrecarga es de: " + MUAFIDA);

        int R3 = (int) (MUAFIDA * 100);

        System.out.println("\n\033[31mEl Porcentaje es: " + R3 + "%");

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

}