/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Prueba {
    
    public static void main ( String [] args ){

    Rectangulo R = new Rectangulo (0,0);
    Rectangulo R2 = new Rectangulo ();
    Triangulo T = new Triangulo (0,0,0);
    Triangulo T2 = new Triangulo ();
    Hexagono H = new Hexagono (0);
    Hexagono H2 = new Hexagono ();
    
    
    int salir = 1;
    
    do{
        
  int op;
  System.out.println("\tMENU PRINCIPAL\n");
  System.out.println("(1) == RECTANGULO \n");
  System.out.println("(2) == TRIANGULO\n");
  System.out.println("(3) == HEXAGONO\n");
  System.out.println("(4) == SALIR\n");
  Scanner Z = new Scanner (System.in);
  op = Z.nextInt();
  
  switch (op){
                    case 1:
                    int Salida1 = 1;
                   do{   
                  int op2;
                  System.out.println("\tSUBMENU\n");
                  System.out.println("(1) == AGREGAR DATOS NUEVOS \n");
                  System.out.println("(2) == IMPRIMIR AREA Y PERIMETRO CON DATOS POR DEFAULT\n");
                  System.out.println("(3) == IMPRIMIR AREA Y PERIMETRO CON DATOS ESTABLESIDOS\n");
                  System.out.println("(4) == SALIR\n");
                  Scanner ZZ = new Scanner (System.in);
                  op2 = ZZ.nextInt();
                  switch(op2){
                      case 1:
                      R.EntradaR();
                      break;
                      case 2:
                    R2.Area();
                    R2.Perimetro();
                    System.out.println("\n");
                      break;
                      case 3:
                    R.Area();
                    R.Perimetro();    
                    System.out.println("\n");
                      break;
                      case 4:
                      Salida1 = 5;  
                      break;
                  }
                  }while(Salida1==1);
                  break;
          
          
    case 2:
       int Salida2 = 1;
       do{
      int op3;
  System.out.println("\tSUBMENU\n");
  System.out.println("(1) == AGREGAR DATOS NUEVOS \n");
  System.out.println("(2) == IMPRIMIR AREA Y PERIMETRO CON DATOS POR DEFAULT\n");
  System.out.println("(3) == IMPRIMIR AREA Y PERIMETRO CON DATOS ESTABLESIDOS\n");
  System.out.println("(4) == SALIR\n");
  Scanner ZZZ = new Scanner (System.in);
  op3 = ZZZ.nextInt();
  switch(op3){
      case 1:
      T.EntradaT();
      break;
      case 2:
    T2.Area();
    T2.Perimetro();
    System.out.println("\n");
      break;
      case 3:
    T.Area();
    T.Perimetro();    
    System.out.println("\n");
      break;
      case 4:
       Salida2 = 2;   
      break;
  }   
       }while(Salida2 == 1);  
          break;
          
          
          
    case 3:
      int Salida3 = 1;  
     do{
   int op3;
  System.out.println("\tSUBMENU\n");
  System.out.println("(1) == AGREGAR DATOS NUEVOS \n");
  System.out.println("(2) == IMPRIMIR AREA Y PERIMETRO CON DATOS POR DEFAULT\n");
  System.out.println("(3) == IMPRIMIR AREA Y PERIMETRO CON DATOS ESTABLESIDOS\n");
  System.out.println("(4) == SALIR\n");   
  Scanner HR = new Scanner (System.in);
  op3 = HR.nextInt();
  switch (op3){
      case 1:
      H.EntradaH();
      break;
      case 2:
    H2.Area();
    H2.Perimetro();   
      break;
      case 3:
    H.Area();
    H.Perimetro();    
      break;
      case 4:
       Salida3 = 2;  
      break;
  }
     }while(Salida3 == 1);
     break;
    case 4:
        salir = 2;
        break;
          
  
  }
    
    }while(salir == 1);
    
    /*
    R.Area();
    R.Perimetro();
    R2.Area();
    R2.Perimetro();
    System.out.println("\n");
    T.Area();
    T.Perimetro();
    T2.Area();
    T2.Perimetro();
    System.out.println("\n");
    H.Area();
    H.Perimetro();
    H2.Area();
    H2.Perimetro(); */
    }

 


    
}
