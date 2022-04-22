/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONDUCTOR;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Resultados extends Conductor {
    
    public static void main (String [] args){
        

    // datos pedidos
    Conductor C=new Conductor ();
    Conductor C1=new Conductor ("",0,0,0); 
    
    Particular P=new Particular();
    Particular P1=new Particular (); 
   
    Chofer Ch=new Chofer();
    Chofer Ch1=new Chofer("",0,0,"",0,0,0);
    Publico Pu=new Publico();
    Publico Pu1=new Publico("",0,0,"",0,0,"",0,0,0);
    Privado Pr=new Privado();
    Privado Pr1=new Privado(0,0,"",0,0,"",0,0,0);
    
    int condu;
    
    for (condu=1; condu<12; condu++){
    Scanner N=new Scanner(System.in);
    
    int c;
    System.out.println("(1) agregar datos de conductor");
    System.out.println("(2) agregar datos de particular");
    System.out.println("(3) agregar datos de chofer");
    System.out.println("(4) agregar datos de publico");
    System.out.println("(5) agregar datos de privado");
    System.out.println("(6) imprimir conductor de datos establecidos y insertados");
    System.out.println("(7) imprimir particular de datos establecidos y insertados");
    System.out.println("(8) imprimir chofer de datos establecidos y insertados");
    System.out.println("(9) imprimir publico de datos establecidos y insertados");
    System.out.println("(10) imprimir privado de datos establecidos y insertados");
    System.out.println("(11) imprimir todos");
    
    c = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1 Conductor\n2 Particular\n3 Chofer\n4 nuevos datos conductor\n5 Privado\n6 datos\n7 Privado\n8 Publico\n9 Privado"));
    switch (c){
        
       case 1:
       C1.Entrada();
       System.out.println("                                                 \n\n");
       break;
       
       case 2:
       P1.Entrada();
       System.out.println("                                                  \\n");
       break;
       
       case 3:
       Ch1.Entrada2();
       System.out.println("                                                 \n\n");
       break;
       
       case 4:
       Pu1.Entrada();
       System.out.println("                                                 \n\n");
       break;
       
       case 5:
       Pr1.Entrada();
       System.out.println("                                                 \n\n");
       break;
       
       case 6:
       Scanner Q=new Scanner (System.in);
       int m;
       System.out.println("(1) si desea imprimir los datos establecidos");
       System.out.println("(2 si desea imprimir los datos insertados");
       m = Q.nextInt();
       
       
       switch (m){
           
       case 1:
       
       System.out.println("                                                    \n\n");
       break;
       
       case 2:
       
       System.out.println("                                                    \n\n");
       break;
}
       break;
       
       case 7:
       Scanner sc=new Scanner (System.in);
       int k2;
       System.out.println("(1) si desea imprimir los datos establecidos");
       System.out.println("(2 si desea imprimir los datos insertados");
       k2 = sc.nextInt();
       switch(k2)
       
{ 
           
       case 1:
       P.Datos2();
       P.Gastos(0,0);
       System.out.println("                                                      \n\n");
       break;
       
       case 2:
       P1.Datos2();
       P1.Gastos(0,0);
       System.out.println("                                                      \n\n");
       break;
}
       break;
       
       case 8:
       Ch.sueldo();
       System.out.println("                                                         ");
       Ch1.sueldo();
       System.out.println("                                                     \n\n");
       break;
       
       case 9:
       Pu.imprimir_datos();
       Pu.Resultados();
       System.out.println("                                                         ");
       Pu1.imprimir_datos();
       Pu1.Resultados();
       System.out.println("                                                     \n\n");
       break;
       
       case 10:
       System.out.println("                                                     \n\n");
       break;
       
       case 11:
       System.out.println("\nDatos establecidos\n");
       System.out.println("\nClase Conductor\n");
       
       C1.Datos();
       System.out.println("\nClase Particular                                                          n");
       
       P1.Datos2();
       P1.Gastos(0,0);
       System.out.println("\nClase Chofer                                                          n");
       
       Ch1.sueldo();
       System.out.println("\nPublico                                                          n");
       
       Pu1.imprimir_datos();
       Pu1.Resultados();
       System.out.println("\nClase Privada                                                          n");
       
       Pr1.Datos_imprimir();
       Pr1.Resultado2();
       System.out.println("\nDatos colocados                                                        n");
       System.out.println("\nClase Conductor                                                        n");
       
       C.Datos();   
       System.out.println("\nClase Particular                                                       n");
       P1.Datos2();
       P.Gastos(0,0);
       System.out.println("\nClase Chofer                                                           n");
       
       Ch.sueldo();
       System.out.println("\nPublico                                                                n");
       
       Pu.imprimir_datos();
       Pu.Resultados();
       System.out.println("\nClase Privada                                                          n");
       
       Pr.Datos_imprimir();
       Pr.Resultado2();
       System.out.println("                                                          \n\n");
       break;
           
}
   
   }
       
}
   
}
