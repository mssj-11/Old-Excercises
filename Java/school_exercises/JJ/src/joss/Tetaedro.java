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
public class Tetaedro extends Tridimencional{

    public Tetaedro(double Vlados, boolean a) {
        super(Vlados, a);
    }
    
        public void Area (){   
    double Area ;
    Area = (Vlados*Vlados)*(1.73205); // formula es a^2 * raiz de tres
    System.out.println(" Caracteristicas: \n"+"Nombre: "+ nombre+"\n"+"Numero de lados: "+lados+"\n"+"Tipo de figura: "+tipo+" ");
    System.out.println("EL AREA DE LA FIGURA ES --> "+Area);
    }
      public void Volumen () {   
    double volumen ;
    volumen = (1.414213/12)*(Vlados*Vlados*Vlados);
    System.out.println("EL VOLUMEN DE LA FIGURA ES --> "+volumen);
    }
    
    
}
