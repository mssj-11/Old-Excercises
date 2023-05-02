package CURSO;
import java.util.Scanner;

/*
    Sentencia While:
    Programa que imprima cualquier tabla de multiplicar
 */

public class Ej13 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("***************************");
        System.out.println("Tablas de multiplicar\n");
        System.out.print("Ingresa el numero de la tabla: ");
        int numero = sc.nextInt();
        System.out.println("***************************\n");
        int contador = 1;
        int limite = 10;
        
        
        while (contador <= limite) {      
            int resultado = numero*contador;
            System.out.println(numero+" x "+contador+" = "+resultado);
            contador++;
        }
        
        
    }
    
    
    
}