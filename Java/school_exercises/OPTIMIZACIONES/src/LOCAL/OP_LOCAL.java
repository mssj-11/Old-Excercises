/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOCAL;

/**
 *
 * @author HP
 */
public class OP_LOCAL {

    //EJUEMPLO: Precalcular expresiones constantes
    public static void main(String[] args) {
        /*
        //antes de la optimizacion local
        int i = 2 + 3;
        int j = 4;
        double f = j + 2.5;
        System.out.println("Valor de I (2+3) = " + i);
        System.out.println("Valor de J = " + 4);
        System.out.println("Valor de F (j + 2.5)= " + f);
        */
        
        //despues de la optimizacion local
        int i = 5;
        int j = 4;
        double f = 6.5;
        
        System.out.println("Valor de I = " + i);
        System.out.println("Valor de J = " + 4);
        System.out.println("Valor de F = " + f);
        
    }

}
