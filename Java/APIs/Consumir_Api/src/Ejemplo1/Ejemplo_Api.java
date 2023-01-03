//  Ejemplo 1: Consumiendo una API REST de Rick and Morty (https://rickandmortyapi.com/)
package Ejemplo1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Ejemplo_Api {
    public static void main(String[] args) {
        
        try{
            //  1.-Solicitando una peticion GET
            URL url = new URL("https://rickandmortyapi.com/api/character/2");   //  Objeto URL
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();    //  Objeto Conexion
            conexion.setRequestMethod("GET");   //  Metodo GET
            conexion.connect();     //  Conectar
            
            
            //  2.-Comprobar si la peticion es correcta
            int respuesta = conexion.getResponseCode(); //  Lectura del codigo y obteniendo la respuesta
            
            if(respuesta != 200){
                throw new RuntimeException("Ha ocurrido un error: " +respuesta);
            }
            else{
                
                //  3.-Lectura de la informacion de la API
                StringBuilder informacion = new StringBuilder();    //  Objeto String para obtener la informacion
                Scanner sc = new Scanner(url.openStream());    //  Leyendo el flujo de datos de la API y guardando la informacion
                //  Mientras el Scaner tenga una siguiente linea que leer se añadira la informacion
                while(sc.hasNext()){
                    informacion.append(sc.nextLine());  //  Se agregara la siguiente linea
                }
                sc.close(); //  Terminando el scanner de lectura de informacion
                
                
                //  4.-Mostrar la informacion obtenida por consola
                System.out.println("Salida de informacion: \n" +informacion);
                
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
    }
}