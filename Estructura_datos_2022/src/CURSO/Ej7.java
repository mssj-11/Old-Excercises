/*
    Programa que pregunte que sexo eres:
    Si es Hombre que diga "Soy hombre"
    Si es Mujer que diga "Soy mujer"
 */
package CURSO;

import java.util.Scanner;

/*   If-Else Anidado   */
public class Ej7 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1) Hombre");
        System.out.println("2) Mujer");
        System.out.print("\nQue sexo eres: ");
        int opcion = sc.nextInt();
        
        
        if(opcion == 1)    System.out.println("Eres un hombre");
        else if(opcion == 2)    System.out.println("Eres una mujer");
        else    System.out.println("Opcion incorrecta");
        
        
    }
    
}