/*  Ejemplo 1: Estructura Map: Es una estructura  almacena datos, 
    permitiendo asociar valores de tipos primitivo u objetos con sus respectivas claves.                              */

package Map;

import java.util.HashMap;
import java.util.Map;

public class Ej1 {
    public static void main(String[] args) {
        
        //  Creacion de un Map
        Map<Integer, String> cripto = new HashMap<>(); 
        
        cripto.put(1, "Bitcoin");
        cripto.put(2, "Ethereum");
        cripto.put(3, "Binance");
        cripto.put(4, "Cardano");
        cripto.put(5, "Solana");
        
        
        //  Obteniendo claves y valores
        System.out.println("Clave: " +cripto.keySet()); //  Clave: [1, 2, 3, 4, 5]
        System.out.println("Valores: " +cripto.values());   //  Valores: [Bitcoin, Ethereum, Binance, Cardano, Solana]
        //  Pasandole parametros
        System.out.println("Valor: " +cripto.get(4));   //  Valor: Cardano
        
    }
}