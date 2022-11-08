/*  #1  PILAS: Espacio de mnemoria en donde se almacenaran datos
METODOS NATIVOS:
    push:   Introducir un dato en la pila
    pop:    Quitar el ULTIMO DATO introducido en la pila
    peek:   Visualizar el ULTIMO DATO de la pila
    empty:  Saber si la pila tiene o no tiene datos en la pila
 */
package Pilas;

import java.util.Stack;

/**
 *
 * @author HP
 */
public class Ejemplo1 {
    
    public static void main(String[] args) {
        /* Objeto
            Logica de la pila: El primero que entra es el ultimo que sale.
            FILO: First-In  Last-Out                                                */
        
        // Creacion de una pila
        Stack pila = new Stack();
        
        // Metodo Push
        pila.push(50);      // Indice 0
        pila.push("Este es un dato en una pila");   // Indice 1
        pila.push(20);  // Indice 2
        pila.push(7);   // Indice 3
        pila.push("Ejemplo pila");  // Indice 4
        
        
        //  Ejemplo usando los metodos
        System.out.println("El ultimo elemento en la pila es: " +pila.peek());  // Mostrara el ultimo valor de la pila
    //  System.out.println("Eliminar el ultimo elemento de la pila el cual es: " +pila.pop());  // ELIMINARA (Ejemplo pila) que es el ultimo de la pila
    //  System.out.println("El ultimo elemento en la pila es: " +pila.empty());  //  el resultado sera FALSE por que la pila no esta vacia, tiene datos 
        
        
/*          Solo para visualizar los demas datos de la pila
            Obtener todos los valores de la PILA y VACIARLA                     */
        // Mientras que la pila no este vacia
        while(pila.empty() == false){
            // Se realizara lo sig.
            System.out.println(pila.pop()); // Obtener el ultimo valor y a la vez lo ELIMINARA(vaciando la pila)
        }
        
        
    }
}