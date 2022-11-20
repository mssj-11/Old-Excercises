//  Ejemplo 3: Colecciones
package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map_Synchronized {
    public static void main(String[] args) {
        
        Map<Integer, String> diccionarioHash = new HashMap<>();
        
        diccionarioHash.put(1, "Marco");
        diccionarioHash.put(2, "Raul");
        diccionarioHash.put(3, "Andres");
        diccionarioHash.put(4, "Julio");
        diccionarioHash.put(5, "Armando");
        
        
        System.out.println("Uso de HashMap");
        for(Entry<Integer, String> entry:diccionarioHash.entrySet()){
            System.out.println("Clave: "+entry.getKey()+"   Valor: "+entry.getValue());
        }
        
        
        
        
        System.out.println("\n\nUso de TreeMap");   //Si se necesita orden para la llave
        Map<Integer, String> diccionarioTree = new TreeMap<>();
        
        diccionarioTree.put(1, "Marco");
        diccionarioTree.put(2, "Raul");
        diccionarioTree.put(3, "Andres");
        diccionarioTree.put(4, "Julio");
        diccionarioTree.put(5, "Armando");
        
        for(Entry<Integer, String> entry:diccionarioTree.entrySet()){
            System.out.println("Clave: "+entry.getKey()+"   Valor: "+entry.getValue());
        }
        
        
        
        System.out.println("\n\nUso de LinkedHashMap");   //Si se necesita orden para la llave
        Map<Integer, String> diccionarioLinked = new LinkedHashMap<>();
        
        diccionarioLinked.put(1, "Marco");
        diccionarioLinked.put(2, "Raul");
        diccionarioLinked.put(3, "Andres");
        diccionarioLinked.put(4, "Julio");
        diccionarioLinked.put(5, "Armando");
        
        for(Entry<Integer, String> entry:diccionarioLinked.entrySet()){
            System.out.println("Clave: "+entry.getKey()+"   Valor: "+entry.getValue());
        }
        
        
        
        
        /*  Hashtable<c, v>   -   Aplicar bloqueo a nivel de objeto
        HashMap hm = new HashMap();
        HashMap hms = (HashMap) Collections.synchronizedMap(hm);    */
        
        
        
        
        
    }
}