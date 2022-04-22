/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ;

/**
 *
 * @author HP
 */
// Este es un tipo de Guitarra
public class Gibson extends Guitarra {
    
    @Override
    public void tocar() {
         System.out.println("Gibson.tocar()");
       }
    @Override
       public void afinar() {
         System.out.println("Gibson.afinar()");
       }
    
}
