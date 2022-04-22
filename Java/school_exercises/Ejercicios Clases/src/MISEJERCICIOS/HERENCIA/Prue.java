/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MISEJERCICIOS.HERENCIA;

/**
 *
 * @author HP
 */
public class Prue {
        public  static void  main(String [] args){
        Cuenta C1=new Cuenta();
        C1.imprimir();
        Banco B1= new Banco("Bancomer", 12, 500, "Ixtlahuaca");
        B1.imprimir();
    
    }
}
