package CURSO;
import java.util.Scanner;
/*
    Aplicando Estructura FOR: MEDIA
    Programa que solicite al usuario la cantidad de numeros queva a ingresar de un conjunto
    pidiendo uno a uno y al final dar el resultado de la media.
 */

public class Ej12 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculo de la MEDIA");
        System.out.print("Cantidad de valores: ");
        int total = sc.nextInt();
        System.out.println();
        double suma = 0;
        
        
        for (int i = 0; i < total; i++) {
            System.out.print("Valor para el #" +(i+1)+ ": ");
            int aux = sc.nextInt();
            suma = aux+suma;
        }
        
        double media = suma/total;
        System.out.printf("\nLa MEDIA es: %.2f",media);
        System.out.println();
    }
    
    
    
}