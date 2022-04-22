/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSABSTRACTAS;

/**
 *
 * @author HP
 */
public class Prueba {

    public static void main(String[] args) {
    
        Automovil A = new Automovil(4, "Volkswagen", "2018") {};
        Motocicleta M = new Motocicleta("Roja", "Montana", 2, "Italika", "2009");
        Bicicleta B = new Bicicleta("Azul", "BMX", 65, 2, "Diamondback", "BluePrint");
        
        Transportes transporte = new Automovil() {};

        transporte.Velocidad_Maxima();
        
        Automovil[] todos = new Automovil[4];
        todos[0] = A;
        todos[1] = M;
        todos[2] = B;
        
        
        todos[0].Datos();
        System.out.println("\n");
        transporte=new Motocicleta();
        transporte.Velocidad_Maxima();
         
        todos[1].Datos();
        System.out.println("\n");
        transporte=new Bicicleta();
        transporte.Velocidad_Maxima();
        todos[2].Datos();
        

    }

}
