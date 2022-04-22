/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joss;

/**
 *
 * @author Daniel
 */
public class Circulo extends Bidimencional {
  public double pi = 3.1416;
    public Circulo(double radio, String A) {
        super(radio, A);
    }
     
    public void Area (){   
    double Area ;
    Area = (pi)*(radio*radio);
    System.out.println(" Caracteristicas: \n"+"Nombre: "+ nombre+"\n"+"Numero de lados: "+lados+"\n"+"Tipo de figura: "+tipo+" ");
    System.out.println("EL AREA DE LA FIGURA ES --> "+Area);
    }

   
    
    
    
    
    
    
}
