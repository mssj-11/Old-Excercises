//  Recorriendo cadenas
package Manejo_arrays_cadenas;

public class ejemplo3 {
    public static void main(String[] args) {
        
        //  Definiendo una CADENA: Notacion de clase-objeto 
        String cadena = new String ("Java");
        //  Recorriendo la cadena
        for(int i=0; i<cadena.length(); i++){
            System.out.println("" +cadena.charAt(i));
        }
        
    }
}