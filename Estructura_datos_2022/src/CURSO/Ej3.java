package CURSO;
import java.util.Scanner;
//  Programa que diga si el numero es par o impar y si el numero es mayor a 10, que diga por mensaje que el numero es superior a 10.
/**
 *  //  Numeros par e impar
 * @author HP
 */
public class Ej3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("*****NUMEROS PARES E IMPARES******");
        System.out.print("INGRESA UN NUMERO: ");
        int numero = sc.nextInt();
        
        
        if(numero > 10)    System.out.println("El numero es superior a 10");
        if(numero < 10)    System.out.println("El numero es inferior a 10");
        if(numero % 2 == 0)    System.out.println("El numero es par");
        if(numero % 2 != 0) System.out.println("El numero es impar");
        
    }
    
}