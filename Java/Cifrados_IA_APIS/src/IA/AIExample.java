/*
    Ejemplo basico de un chatbot en JAVA
 */
package IA;
/**
 * @author HP - MSS
 */
import java.util.Scanner;

public class AIExample {
    
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = in.nextLine();
    System.out.println("Hello " + name + ", nice to meet you!");
    in.close();
  }
  
}