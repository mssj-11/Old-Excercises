//  Ejemplo 2:  Recorrido de datos en listas
package EstructurasDinamicasLineales;
import java.util.ArrayList;
import java.util.List;

public class Lista_ej2 {
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();
        
        //  Añadiendo datos a la lista
        lista.add("Jose");        //  Posicion 0
        lista.add("Mario");       //  Posicion 1
        lista.add("Luis");        //  Posicion 2
        lista.add("Alejandro");   //  Posicion 3
        
        
        //  Recorrido Datos de la lista
        for(String n : lista){
            System.out.println("Nombre: " +n);
        }
        
        
    }
}