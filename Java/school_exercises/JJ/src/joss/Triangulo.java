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
public class Triangulo extends Bidimencional {

    public Triangulo(double altura, double base) {
        super(altura, base);
    }
    
     public void Area (){   
    double Area ;
    Area = (base*altura)/2;
    System.out.println(" Caracteristicas: \n"+"Nombre: "+ nombre+"\n"+"Numero de lados: "+lados+"\n"+"Tipo de figura: "+tipo+" ");
    System.out.println("EL AREA DE LA FIGURA ES --> "+Area);
    }
    
}
