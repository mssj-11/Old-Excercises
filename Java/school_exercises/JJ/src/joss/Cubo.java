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
public class Cubo extends Tridimencional {

    public Cubo(double aristas) {
        super(aristas);
    }
    
       public void Area (){   
    double Area ;
    Area = (6)*(aristas*aristas);
    System.out.println(" Caracteristicas: \n"+"Nombre: "+ nombre+"\n"+"Numero de lados: "+lados+"\n"+"Tipo de figura: "+tipo+" ");
    System.out.println("EL AREA DE LA FIGURA ES --> "+Area);
    }
      public void Volumen (){   
    double volumen ;
    volumen = (aristas*aristas*aristas);
    System.out.println("EL VOLUMEN DE LA FIGURA ES --> "+volumen);
    }
    
}
