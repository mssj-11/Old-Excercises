/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRYyCATCH;


// Ejemplo2 *Gestiona una excepción y continua*.
import java.util.Random;

/**
 *
 * @author HP
 */
public class ManejadorExcepcion {
    
    
  public static void main(String args[]) {
    int a=0, b=0, c=0;
    Random r = new Random();
    for(int i=0; i<32000; i++) {
      try {
        b = r.nextInt();
        c = r.nextInt();
        a = 12345 / (b/c);
      } catch (ArithmeticException e) {
        System.out.println("Divisioncero.");
        a = 0; // asigna a la variable el valor 0 y continua
      }
      System.out.println("a a");
    }
  }

    
    
}
