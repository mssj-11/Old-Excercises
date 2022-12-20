//  Ejemplo 1 Manejo de Arrays y Cadenas
package Manejo_arrays_cadenas;

import java.util.Scanner;

public class ejemplo1 {
    public static void main(String[] args) {
        
        //  Definiendo una variable de tipo String"cadena"
        String cadena1 = "Esto es una cadena";
        //  FORMA 2: Notacion de clase-objeto 
        String cadena2 = new String ("Esto es otra cadena");
        
        //  Concatenando cadenas
        String cadena3 = cadena1 +" "+ cadena2;
        System.out.println(cadena3);
        
        //  Obtener longitud de la cadena
        System.out.println("Tamaño de la Cadena 1: " +cadena1.length());
        System.out.println("Tamaño de la Cadena 2: " +cadena2.length());
        
        
        
        //  Comparar cadena
        Scanner sc = new Scanner(System.in);
        
        String c1 = sc.nextLine();
        String c2 = sc.nextLine();
        
        if(c1.equals(c2)){
            System.out.println("Iguales");
        }
        else{
            System.out.println("Diferentes");
        }
        
        
        
    }
}