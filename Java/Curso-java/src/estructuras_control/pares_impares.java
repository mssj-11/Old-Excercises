/*
    Leer numeros constantemente mientras no se introduzca un 0.
    Se debera de mostrar cuantos numeros son pares y cuantos impares.
 */
package estructuras_control;
//  #11 Cuenta pares e impares

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class pares_impares {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        
        int contadorPares = 0;
        int contadorImpares = 0;
        
        
        // Si es distinto de 0, continuara el ciclo
        while(numero != 0){
            // Comprobar si es par o impar
            if(numero%2 == 0){  contadorPares++;    }
            else{   contadorImpares++;  }
            
            
            System.out.print("Introduce un numero: ");
            numero = sc.nextInt();
        }
        
        
        System.out.println("\nNumeros Pares introducidos: " +contadorPares);
        System.out.println("Numeros Impares introducidos: " +contadorImpares);
    }
}