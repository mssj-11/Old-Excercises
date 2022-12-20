//  Ejemplo 2
package Manejo_arrays_cadenas;

import java.util.Scanner;

public class ejemplo2 {
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
        
        
        
        //  Extraer Caracteres
        char c = cadena1.charAt(2);
        System.out.println("\n" +c);
        
        
        
        //  Comparar cadenas
        if(cadena1.compareTo(cadena2) < 0){
            System.out.println("Cadena 1 menor");
        }
        else if(cadena1.compareTo(cadena2) > 0){
            System.out.println("Cadena 1 mayor");
        }
        else{
            System.out.println("Son iguales");
        }
        
        
        
        //  Buscar caracter en una cadena
        System.out.println(cadena1.indexOf("E"));
        //  Ultima posicion del caracter
        System.out.println(cadena1.lastIndexOf("E"));
        
        
        //  Conversion minusculas y mayusculas
        System.out.println("Min: " +cadena1.toLowerCase());
        System.out.println("May: " +cadena1.toUpperCase());
        
        //  Ejemplo - Comparar minusculas y mayusculas
        String cad1 = "hOla";
        String cad2 = new String("HOLA");
        
        //  Comparando
        if(cad1.toUpperCase().equals("HOLA")){
            System.out.println("Cadena igual a 'hola' sin importar minusculas/mayusculas");
        }
        else{
            System.out.println("No son iguales");
        }
        
        
        
    }
}