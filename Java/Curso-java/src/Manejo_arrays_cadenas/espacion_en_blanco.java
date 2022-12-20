//  Ejemplo 4: Ejercicio 1 - Contar espacios en blanco
package Manejo_arrays_cadenas;

import java.util.Scanner;

public class espacion_en_blanco {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();
        
        
        int contador_espacios = 0;
        
        
        //  Recorrido
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i) == ' '){
                contador_espacios++;
            }
        }
        System.out.println("El # de espacios en blanco es de: " +contador_espacios);
        
        
        
    }
}