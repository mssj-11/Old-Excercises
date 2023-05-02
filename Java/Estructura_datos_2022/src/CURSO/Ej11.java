package CURSO;
import java.util.Scanner;

/*
Estructuras de control: Estructura FOR
Programa que muestre la tabla del #7 multiplicado hasta el valor 10.
*/

public class Ej11 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("***************************");
        System.out.println("Tablas de multiplicar\n");
        System.out.print("Ingresa el numero de la tabla: ");
        int numero = sc.nextInt();
        System.out.println("***************************\n");
        int resultado;
        
        
        for (int i = 1; i <= 10; i++) {
            resultado = numero*i;
            System.out.println(numero+" x "+i+" = "+resultado);
        }
        
    }
    
}