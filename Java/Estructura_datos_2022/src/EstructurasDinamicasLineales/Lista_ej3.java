//  Ejemplo 3:  Listando todos los datos en una lista
package EstructurasDinamicasLineales;

import java.util.ArrayList;
import java.util.List;

public class Lista_ej3 {
    public static void main(String[] args) {
        
        //  Lista de la clase Persona
        List<Persona> lista = new ArrayList<>();
        
        
        Persona persona = new Persona();
        
        persona.setCodigo(1);
        persona.setNombre("Mike");
        persona.setApellidos("Shinoda");
        persona.setEdad(24);
        
        
        lista.add(persona);
        System.out.println("Informacion de persona: "+ 
                            "\nCodigo: "+lista.get(0).getCodigo() + 
                            "\nNombre: "+lista.get(0).getNombre() + 
                            "\nApellidos: "+lista.get(0).getApellidos() + 
                            "\nEdad: "+lista.get(0).getEdad());
        
    }
}