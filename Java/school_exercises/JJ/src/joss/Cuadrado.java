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
public class Cuadrado extends Bidimencional {

    public Cuadrado(double lado) {
        super(lado);
    }

    public void Area (){   
    double Area ;
    Area =(lado*lado);
    System.out.println(" Caracteristicas: \n"+"Nombre: "+ nombre+"\n"+"Numero de lados: "+lados+"\n"+"Tipo de figura: "+tipo+" ");
    System.out.println("EL AREA DE LA FIGURA ES --> "+Area);
    }
    
    
}
