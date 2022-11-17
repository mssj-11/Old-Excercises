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
        //  Comprobando si el Map esta vacio
        System.out.println("Esta vacio? " +cripto.isEmpty());   //  Esta vacio? false
        //  Tamaño del Map
        System.out.println("El tamaño del Map es de: " +cripto.size()); //  El tamaño del Map es de: 5
        //  El Map cointiene una clave en especifico
        System.out.println("Se encuentra esta clave? " +cripto.containsKey(3)); //  Se encuentra esta clave? true
        //  Si existe un valor
        System.out.println("Este valor existe? " +cripto.containsValue("Bitcoin")); //  Este valor existe? true
        //  Si no existe un valor - Remplazar con otro(por defecto)
        System.out.println("Esta este valor? " +cripto.getOrDefault(1, "Bit")); //  Esta este valor? Bitcoin
        System.out.println("Esta este valor? " +cripto.getOrDefault(8, "Bit")); //  Esta este valor? Bit    Ya que no existe
        
        
        //  Igualdades con otro Map
        Map<Integer, String> cripto2 = new HashMap<>(); 
        cripto2.put(1, "Bitcoin");
        cripto2.put(2, "Ethereum");
        cripto2.put(3, "Binance");
        cripto2.put(4, "Cardano");
        cripto2.put(5, "Solana");
        //  Tienen la misma cantidad de datos y los mismos datos
        System.out.println("\n\nSon iguales? " +cripto.equals(cripto2));    //  Son iguales? true
        
        
        
        
        System.out.println("\n\nCiclo forEach");
        //  Ejemplo con un ciclo forEach    (Clave y Valores)
        cripto.forEach((c, v) -> System.out.println("Clave: "+c+ "Valor: "+v)); // Funcion Lambda
        
    }
}