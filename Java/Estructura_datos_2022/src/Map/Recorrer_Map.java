//  Ejemplo 2: Formas de recorrer un Map
package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Recorrer_Map {
    public static void main(String[] args) {
        
        Map<Integer, String> cripto = new HashMap<>();
        
        cripto.put(1, "Bitcoin");
        cripto.put(2, "Ethereum");
        cripto.put(3, "Binance");
        cripto.put(4, "Cardano");
        cripto.put(5, "Solana");
        
        
        
        System.out.println("#1 forEach tradicional");
        //  #1 forEach tradicional
        for(Map.Entry<Integer, String> ejemplo:cripto.entrySet()){
            System.out.println("Clave: "+ejemplo.getKey()+"   Valor: "+ejemplo.getValue());
        }
        
        
        System.out.println("\n\n#2 forEach");
        //  #2 forEach
        cripto.forEach((c, v) -> System.out.println("Clave: "+c+ "   Valor: "+v));
        
        
        System.out.println("\n\n#3 API Stream de Java");
        // #3 API Stream                entry = e
        cripto.entrySet().stream().forEach(e -> System.out.println("Clave: "+e.getKey()+  "   Valor: "+e.getValue()));
        
        
        System.out.println("\n\n#4 Con un Iterador");
        //  #4 Iterador
        Iterator<Map.Entry<Integer, String>> iterador = cripto.entrySet().iterator();
        //  Mientra iterador tenga datos
        while(iterador.hasNext()){
            
        }
        
        
        
    }
}