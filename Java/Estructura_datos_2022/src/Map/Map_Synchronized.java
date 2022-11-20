//  Ejemplo 3: Colecciones
package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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
        
        System.out.println("\n\nUso de Tree");
        
        
        
        /*  Hashtable<c, v>   -   Aplicar bloqueo a nivel de objeto
        HashMap hm = new HashMap();
        HashMap hms = (HashMap) Collections.synchronizedMap(hm);    */
        
        
        
        
        
    }
}