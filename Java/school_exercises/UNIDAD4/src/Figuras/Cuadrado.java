/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author HP
 */
public class Cuadrado extends Figuras {
    
    public int longitud;
    
    @Override
    public void Area(){
            System.out.println("El Area del Cuadrado es: 25");
            
}
    
    @Override
    public void Perimetro(){
        System.out.println("El Perimetro del Cuadrado es: 20");
    }
    
}
