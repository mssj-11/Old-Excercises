/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IA;

/**
 *
 * @author HP
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIConsumerExample {
  public static void main(String[] args) throws IOException {
    URL url = new URL("https://api.example.com/data");
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");
    int responseCode = con.getResponseCode();
    if (responseCode == HttpURLConnection.HTTP_OK) {
      BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      String inputLine;
      StringBuffer content = new StringBuffer();
      while ((inputLine = in.readLine()) != null) {
        content.append(inputLine);
      }
      in.close();
      System.out.println(content.toString());
    } else {
      System.out.println("Error " + responseCode);
    }
    con.disconnect();
  }
  
  
}


/*

Este ejemplo muestra cómo hacer una solicitud GET a una API REST y obtener la respuesta en formato JSON. Se usa la clase HttpURLConnection para establecer la conexión con la API y enviar la solicitud, y la clase BufferedReader para leer la respuesta. Si la respuesta es correcta (código HTTP 200), se imprime el contenido de la respuesta; de lo contrario, se imprime un mensaje de error con el código de respuesta HTTP.

*/