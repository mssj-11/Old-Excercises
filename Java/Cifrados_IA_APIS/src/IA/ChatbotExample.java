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
import java.util.Scanner;

public class ChatbotExample {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Hello, I am a chatbot. How can I help you today?");
    while (true) {
      String userInput = in.nextLine();
      if (userInput.toLowerCase().contains("goodbye")) {
        System.out.println("Goodbye, have a great day!");
        break;
      } else if (userInput.toLowerCase().contains("hello")) {
        System.out.println("Hello there!");
      } else if (userInput.toLowerCase().contains("how are you")) {
        System.out.println("I am an AI, I don't have feelings. But I am functioning well, thank you for asking.");
      } else {
        System.out.println("I'm sorry, I didn't understand what you said. Can you please rephrase your question?");
      }
    }
    in.close();
  }
}


/*

Este ejemplo muestra cómo un chatbot puede responder a diferentes entradas del usuario, utilizando un bucle infinito y la entrada de teclado. El chatbot puede responder a saludos, preguntar cómo está el usuario y despedirse cuando el usuario dice "goodbye". Este es un ejemplo básico de cómo se puede implementar un chatbot en Java.

*/