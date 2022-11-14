//  Estrusturas de datos Dinamicas Lineales
package EstructurasDinamicasLineales;

//  Ejemplo 1:  Uso basico de Listas
import java.util.ArrayList;
import java.util.List;

public class Lista_ej1 {
    public static void main(String[] args) {
        
        List<String> lista_1 = new ArrayList<>();
        
        //  Añadiendo datos a la lista
        lista_1.add("Jose");        //  Posicion 0
        lista_1.add("Mario");       //  Posicion 1
        lista_1.add("Luis");        //  Posicion 2
        lista_1.add("Alejandro");   //  Posicion 3
        

        System.out.println("El contenido de la lista es: " +lista_1);
        System.out.println("El tamaño de la lista es de: " +lista_1.size());
        
        //  Obteniendo un dato de la lista
        System.out.println("\nObteniendo el dato en la posicion [2]: " +lista_1.get(2));
        
        
        //  Eliminacion de un dato de la lista
        lista_1.remove(3);
        System.out.println("\nActualizando el tamaño de la lista despues de haber Eliminado el dato en la posicion [3]: " +lista_1.size());
        System.out.println("El contenido actual de la lista es: " +lista_1);
        
        
    }
}