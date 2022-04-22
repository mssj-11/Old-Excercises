/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExcepcionesNoCapturadas;

/**
 *
 * @author HP
 */
public class EjemploExcepcion {
    
    static void subroutine() {
    int d = 0;
    int a = 10 / d;
  }
  public static void main(String args[]) {
    System.out.println("Antesxc1.subroutine");
    EjemploExcepcion.subroutine();
    System.out.println("Despuesxc1.subroutine");
  }


//  Descripción de una excepción 
// 
////La clase Throwable sobreescribe el método toString() de la clase Object, 
//  devolviendo una cadena con la descripción de la excepción.


//catch (ArithmeticException e) {
//  System.out.println("Excepcion e);
//  a = 0; // hacer a=0 y continuar
//}

  
  
}
