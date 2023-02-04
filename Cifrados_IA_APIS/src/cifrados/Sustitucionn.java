/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrados;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Sustitucionn {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    String clave = "zyxwvutsrqponmlkjihgfedcba";
    String mensaje;
    int opcion;
    
    System.out.println("1. Cifrar mensaje");
    System.out.println("2. Descifrar mensaje");
    System.out.print("Seleccione una opción: ");
    opcion = sc.nextInt();
    
    if (opcion == 1) {
      System.out.print("Ingrese el mensaje a cifrar: ");
      mensaje = sc.next();
      mensaje = mensaje.toLowerCase();
      System.out.println("Mensaje cifrado: " + cifrar(alfabeto, clave, mensaje));
    } else if (opcion == 2) {
      System.out.print("Ingrese el mensaje a descifrar: ");
      mensaje = sc.next();
      mensaje = mensaje.toLowerCase();
      System.out.println("Mensaje descifrado: " + descifrar(alfabeto, clave, mensaje));
    } else {
      System.out.println("Opción inválida");
    }
  }
  
  public static String cifrar(String alfabeto, String clave, String mensaje) {
    String cifrado = "";
    
    for (int i = 0; i < mensaje.length(); i++) {
      int index = alfabeto.indexOf(mensaje.charAt(i));
      cifrado += clave.charAt(index);
    }
    
    return cifrado;
  }
  
  public static String descifrar(String alfabeto, String clave, String mensaje) {
    String descifrado = "";
    
    for (int i = 0; i < mensaje.length(); i++) {
      int index = clave.indexOf(mensaje.charAt(i));
      descifrado += alfabeto.charAt(index);
    }
    
    return descifrado;
  }
}
