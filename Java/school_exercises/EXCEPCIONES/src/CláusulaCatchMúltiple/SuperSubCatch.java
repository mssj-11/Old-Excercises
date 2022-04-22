/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CláusulaCatchMúltiple;

//    Al ordenar los bloques catch, las subclases de excepción deben ir antes que la superclase 
//    (en caso contrario no se ejecutarán nunca y dará error de compilación por código no alcanzable).
public class SuperSubCatch {
    
    public static void main(String args[]) {
    try {
      int a = 0;
      int b = 42 / a;
    }catch(Exception e) {
      System.out.println("catch cualquier tipo de excepción.");
    }
// ERROR - no alcanzable
        /* Este catch nunca se ejecutará */
  }

    
}
