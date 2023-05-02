package CURSO;
import java.util.Scanner;

/*
    Sentencia Do-While:
    Programa que imprima cualquier tabla de multiplicar
 */

public class Ej14 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("***************************");
        System.out.println("Tablas de multiplicar\n");
        System.out.print("Ingresa el numero de la tabla: ");
        int numero = sc.nextInt();
        System.out.println("***************************\n");
        int contador = 1;
        int limite = 10;
        
        
        do{      
            int resultado = numero*contador;
            System.out.println(numero+" x "+contador+" = "+resultado);
            contador++;
        }while (contador <= limite);
        
        
    }
    
    
    
}