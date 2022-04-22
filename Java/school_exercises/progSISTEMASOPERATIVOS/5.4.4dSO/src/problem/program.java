/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class program {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double CPUocupada, CPUocupadaejechilos, CPUocupadaejecSO;

        double tiempototal;

        System.out.print("\033[31m|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.print("\n\033[34m ¿Cual es la capacidad de un disco que tiene 10 pistas ");
        System.out.print("\n\033[34m Y 5 sectores por pista ? ");
        System.out.print("\n\033[31m|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
        System.out.print("\n\033[34m/////////////////////////////////////////////");
        System.out.print("\n\033[34m La capacidad de cada sector es de 512 bytes");
        System.out.print("\n\033[34m/////////////////////////////////////////////");
/////////////////////////////////////////////////////////////////////////////////////////7
        System.out.print("\n\n\033[31m**************************************************************************");
        System.out.print("\n 512 bytes / sector x 5 sectores /pista x 10 pistas/ disco = 25.600 bytes");
        System.out.print("\n\033[31m**************************************************************************");
        System.out.print("\n 25 k ");
        CPUocupada = scanner.nextDouble();

        /*System.out.print("\nTiempo Total: ");
        tiempototal = scanner.nextDouble();

        double MB = (CPUocupada / tiempototal);

        System.out.println("\n\033[31mEl uso de la CPU es = " + MB);

        int R1 = (int) (tiempototal * 100 / CPUocupada);

        System.out.println("\n\033[31mEl Porcentaje es: " + R1 + "%");*/
        
        
    }
    
}
