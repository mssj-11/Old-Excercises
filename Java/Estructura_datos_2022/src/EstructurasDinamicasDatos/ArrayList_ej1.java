//  Estructuras Dinamicas de Datos -   #1   ArrayList
package EstructurasDinamicasDatos;

import java.util.ArrayList;

/*  ArrayList:  Clase que permite almacenar datos en memoria de forma similar a las Array, pero con la ventaja
    de que los elementos los almacena de forma dinamica (No hay necesidad de declarasles un tamaño con en los Arrays)                                             */
public class ArrayList_ej1 {
    public static void main(String[] args) {
        
        Auto a1 = new Auto("FJKGDF", "Azul");   //  Posicion 0
        Auto a2 = new Auto("TMYTRYN", "Verde");   //  Posicion 1
        Auto a3 = new Auto("MFDHG", "Rojo");   //  Posicion 2
        
        //  ArrayList
        ArrayList<Auto> misAutos = new ArrayList<>();
        
        
        System.out.println("El tamaño es de: " +misAutos.size());
        System.out.println(misAutos);
        System.out.println("\n\n***********************************************");
        
        
        misAutos.add(a1);
        System.out.println("El tamaño es de: " +misAutos.size());
        System.out.println(misAutos);
        System.out.println("\n\n***********************************************");
        
        
        misAutos.add(a2);
        System.out.println("El tamaño es de: " +misAutos.size());
        System.out.println(misAutos);
        System.out.println("\n\n***********************************************");
        
        
        misAutos.add(a3);
        System.out.println("El tamaño es de: " +misAutos.size());
        System.out.println(misAutos);
        System.out.println("\n\n***********************************************");
        
        
        misAutos.add(new Auto("PREY", "Morado"));      //  Posicion 3
        System.out.println("El tamaño es de: " +misAutos.size());
        System.out.println(misAutos);
        
        
        
        System.out.println("\n\nEl Auto #2 es: " +misAutos.get(1));
        
        
        
        System.out.println("");
        //  Recorriendo misAutos
        for(int i=0; i<misAutos.size(); i++){
            System.out.print("El Auto en la posicion " +i+" es: " +misAutos.get(i));
        }
        
        
        
        
        
        //  Removiendo datos
        misAutos.remove(3);
        System.out.println("\n\nEl tamaño es de: " +misAutos.size());
        System.out.println(misAutos);
        
        
        
    }
}