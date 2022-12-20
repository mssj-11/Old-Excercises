//    Ejemplo 6:    Comprobar si una cadena es palindorma(si se lee igual por el principio que por el final)
package Manejo_arrays_cadenas;

import java.util.Scanner;

public class cadena_palindroma {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrse una cadena: ");
        String cadena = sc.nextLine();
        String cadena2 = "";
        
        
        //  Recorriendo la cadena1 desde el ultimo caracter(posicion) al primero
        for(int i=cadena.length()-1; i>=0; i--){
            char caracter = cadena.charAt(i);
            cadena2 = cadena2 + caracter;
        }
        
        
        //  Comparando cadenas
        if(cadena.equals(cadena2)){
            System.out.println("La cadena: [" +cadena+ "] es palindroma :)");
        }
        else{
            System.out.println("La cadena no es palindroma");
        }
        
        
        
        
    }
}