/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRYyCATCH;

/**
 *
 * @author HP
 */
public class Exc2  {
    
    public static void main(String args[]) {
    int d, a;

    try { // controla un bloque de cÃ³digo.
      d = 0;
      a = 42 / d;
      System.out.println("Estoe imprimirá.");
    }
    catch (ArithmeticException e) {// captura el error de división
      System.out.println("Divisióncero.");
    }
    System.out.println("Despuésa sentencia catch.");
  }

    
}
