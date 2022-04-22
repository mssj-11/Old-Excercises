/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joss;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Prueba {
    
    public static void main (String [] args){
        for (int i = 0; i < 20; i++) {
            
        
         Scanner o =new Scanner (System.in);
        
        System.out.println("        Menu    ");
          System.out.println("Figuras Bidimencionales: ");
            System.out.println("1) Circulo");
             System.out.println("2) Cuadrado");
         System.out.println("3) Triangulo");
          System.out.println("Figuras Tridimencionales: ");
            System.out.println("4) Esfera");
             System.out.println("5) Cubo");
         System.out.println("6) Tetraedro");
         System.out.println("7) Salir");
          System.out.println("Opcion :");
          int op = o.nextInt();
    switch(op){
        case 1:
           Scanner C =new Scanner (System.in);
           System.out.println("Introduce el valor que desea que tenga el RADIO:");
           double AA = C.nextDouble();
           Circulo Ci = new Circulo(AA,"");
           Ci.Area();
            break;
        case 2:
            Scanner C2 =new Scanner (System.in);
            System.out.println("Introduce el valor que desea que tengan los LADOS:");
           double BB = C2.nextDouble();
           Cuadrado Cu = new Cuadrado (BB);
           Cu.Area();
            break;
        case 3:
               Scanner C3 =new Scanner (System.in);
                Scanner C4 =new Scanner (System.in);
            System.out.println("Introduce el valor que desea que tenga la ALTURA:");
           double CC = C3.nextDouble();
           System.out.println("Introduce el valor que desea que tenga la BASE:");
            double DD = C4.nextDouble();
           Triangulo Ti = new Triangulo (CC,DD);
           Ti.Area();
            break;
        case 4:
             Scanner C5 =new Scanner (System.in);
            System.out.println("Introduce el valor que desea que tenga el RADIO:");
           double EE = C5.nextDouble();
           Esfera Es = new Esfera (EE,"");
           Es.Area();
           Es.Volumen();
           
            break;
        case 5:
             Scanner C6 =new Scanner (System.in);
            System.out.println("Introduce el valor que desea que tengan sus LADOS:");
           double FF = C6.nextDouble();
           Cubo Cb = new Cubo (FF);
           Cb.Area();
           Cb.Volumen();
           
            break;
        case 6:
            Scanner C7 =new Scanner (System.in);
            System.out.println("Introduce el valor que desea que tengan sus LADOS:");
           double GG = C7.nextDouble();
           Tetaedro Te = new Tetaedro (GG,true);
           Te.Area();
           Te.Volumen();
            break;
        case 7:
            i = 100;
            break;
    }
    
    }}
}
