/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrados;

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Sustitucion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    String clave = "zyxwvutsrqponmlkjihgfedcba";
    System.out.println("Cifrado/Decifrado por Sustitución");
    System.out.println("1. Cifrar");
    System.out.println("2. Decifrar");
    System.out.print("Opción: ");
    int opcion = input.nextInt();
    input.nextLine();
    if (opcion == 1) {
      System.out.print("Introduce el mensaje: ");
      String mensaje = input.nextLine();
      String cifrado = "";
      for (int i = 0; i < mensaje.length(); i++) {
        char caracter = mensaje.charAt(i);
        int index = alfabeto.indexOf(Character.toLowerCase(caracter));
        if (index != -1) {
          if (Character.isUpperCase(caracter)) {
            cifrado += Character.toUpperCase(clave.charAt(index));
          } else {
            cifrado += clave.charAt(index);
          }
        } else {
          cifrado += caracter;
        }
      }
      System.out.println("Mensaje cifrado: " + cifrado);
    } else if (opcion == 2) {
      System.out.print("Introduce el mensaje cifrado: ");
      String mensajeCifrado = input.nextLine();
      String decifrado = "";
      for (int i = 0; i < mensajeCifrado.length(); i++) {
        char caracter = mensajeCifrado.charAt(i);
        int index = clave.indexOf(Character.toLowerCase(caracter));
        if (index != -1) {
          if (Character.isUpperCase(caracter)) {
            decifrado += Character.toUpperCase(alfabeto.charAt(index));
          } else {
            decifrado += alfabeto.charAt(index);
          }
        } else {
          decifrado += caracter;
        }
      }
      System.out.println("Mensaje decifrado: " + decifrado);
    } else {
      System.out.println("Opción inválida");
    }
  }
}
