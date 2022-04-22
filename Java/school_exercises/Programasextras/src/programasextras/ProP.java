/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programasextras;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ProP {
    Scanner T = new Scanner ( System.in);
    Scanner T2 = new Scanner ( System.in);
    Scanner T3 = new Scanner ( System.in);
    Scanner T4 = new Scanner ( System.in);
    Scanner T5 = new Scanner ( System.in);
    Scanner Media = new Scanner ( System.in);
    Scanner Varianza = new Scanner ( System.in);
    Scanner Iteraciones = new Scanner ( System.in);
    int semilla,semilla2,semilla3,semilla4,semilla5,  cen, IT;
    double r;
    String cadena,cenF = "0";
    char aux;
double media, varianza;
    

     public void p(){
        
    // System.out.println("Dame la primera semilla");
     semilla = (int) (Math.random()*10000 + 999) ;  //T.nextInt();
     //System.out.println("Dame la segunda semilla");
     semilla2 = (int) (Math.random()*10000 + 999);//T2.nextInt();
     //System.out.println("Dame la tercera semilla");
     semilla3 = (int) (Math.random()*10000 + 999);//T3.nextInt();
     //System.out.println("Dame la cuarta semilla");
     semilla4 = (int) (Math.random()*10000 + 999);//T4.nextInt();
     //System.out.println("Dame la quinta semilla");
     System.out.println("dame la media");
     media = Media.nextDouble();
      System.out.println("dame la varianza");
      varianza = Varianza.nextDouble();
     semilla5 = 6777;//T5.nextInt();
     
     
     
     // LAS ITERACIONES LAS PUSE DEFINIDAS PORQ POR ALGUNA RAZON MARCA ERROR SI LAS INGRESAS
     
     //System.out.println("Dame iteracciones desea realizar");
     IT = 5;//Iteraciones.nextInt();
        
    }
     double [] R1 = new double[5];
     double [] R2 = new double[5] ;
      double [] R3= new double[5];
       double [] R4= new double[5];
        double [] R5= new double[5];
       public void Centro(){
      int cont = 0;
        do{      
             cont ++; 
        cen = semilla * semilla;
        cadena = String.valueOf(cen);
        int L = cadena.length();
        if(L%2 == 0){
        if(L == 4){
        cadena = "00"+ cadena;
        }else {
        }
        }else  { 
        if(L == 3){
        cadena = "000"+ cadena;
        }else if(L== 2){
        cadena = "0000"+ cadena;
        }else{
         cadena = "0"+ cadena;
        } 
        }
        int L1 = cadena.length();
        if (L1 == 8){
        for(int i= 2; i<=5; i++){
        aux = cadena.charAt(i);
        cenF = cenF + aux;
        }
        }else if(L1 == 6){
        for(int i= 1; i<=4; i++){
        aux = cadena.charAt(i);
        cenF = cenF + aux;
        }
        }else if(L1 == 10){
        for(int i= 3; i<=6; i++){
        aux = cadena.charAt(i);
        cenF = cenF + aux;
        }
        }
        semilla = Integer.parseInt(cenF);
        r = semilla;
        r = r / 10000;
       
          
             R1 [cont-1]= r;   
        
   
     
        
        cenF = "0";
        //r= 0;
       
        }while(cont != IT );
        }
     
         public void Centro2(){
      int cont = 0;
        do{
             cont ++; 
   cen = semilla2 * semilla2;
 cadena = String.valueOf(cen);
   int L = cadena.length();
    if(L%2 == 0){
        if(L == 4){
        cadena = "00"+ cadena;
        }else {
        }
    }else  { 
        if(L == 3){
        cadena = "000"+ cadena;
        }else if(L== 2){
        cadena = "0000"+ cadena;
        }else{
         cadena = "0"+ cadena;
        } 
    }
    int L1 = cadena.length();
    if (L1 == 8){
    for(int i= 2; i<=5; i++){
    aux = cadena.charAt(i);
    cenF = cenF + aux;
    }
    }else if(L1 == 6){
     for(int i= 1; i<=4; i++){
    
     aux = cadena.charAt(i);
    cenF = cenF + aux;
    }
    }else if(L1 == 10){
    for(int i= 3; i<=6; i++){
    aux = cadena.charAt(i);
    cenF = cenF + aux;
    }
    }
    semilla2 = Integer.parseInt(cenF);
    r = semilla2;
    r = r / 10000;
       
             R2 [cont-1]= r;   
            
   

    cenF = "0";
        }while(cont != IT );
    }
         
                public void Centro3(){
      int cont = 0;
        do{
             cont ++; 
   cen = semilla3 * semilla3;
 cadena = String.valueOf(cen);
   int L = cadena.length();
    if(L%2 == 0){
        if(L == 4){
        cadena = "00"+ cadena;
        }else {
        }
    }else  { 
        if(L == 3){
        cadena = "000"+ cadena;
        }else if(L== 2){
        cadena = "0000"+ cadena;
        }else{
         cadena = "0"+ cadena;
        } 
    }
    int L1 = cadena.length();
    if (L1 == 8){
    for(int i= 2; i<=5; i++){
    aux = cadena.charAt(i);
    cenF = cenF + aux;
    }
    }else if(L1 == 6){
     for(int i= 1; i<=4; i++){
    
     aux = cadena.charAt(i);
    cenF = cenF + aux;
    }
    }else if(L1 == 10){
    for(int i= 3; i<=6; i++){
    aux = cadena.charAt(i);
    cenF = cenF + aux;
    }
    }
    semilla3 = Integer.parseInt(cenF);
    r = semilla3;
    r = r / 10000;
  
             R3 [cont -1]= r;   
            
   

    cenF = "0";
    
        }while(cont != IT );
    }
                
                       public void Centro4(){
      int cont = 0;
        do{
             cont ++; 
            
   cen = semilla4 * semilla4;
   
 cadena = String.valueOf(cen);
   int L = cadena.length();
    
    if(L%2 == 0){
        if(L == 4){
        cadena = "00"+ cadena;
        }else {
        }
    }else  { 
        if(L == 3){
        cadena = "000"+ cadena;
        }else if(L== 2){
        cadena = "0000"+ cadena;
        }else{
         cadena = "0"+ cadena;
        } 
    }
    int L1 = cadena.length();
    if (L1 == 8){
    for(int i= 2; i<=5; i++){
    aux = cadena.charAt(i);
    cenF = cenF + aux;
    }
    }else if(L1 == 6){
     for(int i= 1; i<=4; i++){
    
     aux = cadena.charAt(i);
    cenF = cenF + aux;
    }
    }else if(L1 == 10){
    for(int i= 3; i<=6; i++){
    aux = cadena.charAt(i);
    cenF = cenF + aux;
    }
    }
    semilla4 = Integer.parseInt(cenF);
    r = semilla4;
    r = r / 10000;
      
             R4 [cont-1]= r;   
            
   

    cenF = "0";
    
        }while(cont != IT );
    }
                       
                              public void Centro5(){
      int cont = 0;
        do{
             cont ++; 
           
   cen = semilla5 * semilla5;
   
 cadena = String.valueOf(cen);
   int L = cadena.length();
 
    if(L%2 == 0){
        if(L == 4){
        cadena = "00"+ cadena;
        }else {
        }
    }else  { 
        if(L == 3){
        cadena = "000"+ cadena;
        }else if(L== 2){
        cadena = "0000"+ cadena;
        }else{
         cadena = "0"+ cadena;
        } 
    }
    int L1 = cadena.length();
    if (L1 == 8){
    for(int i= 2; i<=5; i++){
    aux = cadena.charAt(i);
    cenF = cenF + aux;
    }
    }else if(L1 == 6){
     for(int i= 1; i<=4; i++){
    
     aux = cadena.charAt(i);
    cenF = cenF + aux;
    }
    }else if(L1 == 10){
    for(int i= 3; i<=6; i++){
    aux = cadena.charAt(i);
    cenF = cenF + aux;
    }
    }
    semilla5 = Integer.parseInt(cenF);
    r = semilla5;
    r = r / 10000;
   
             R5 [cont -1]= r;   
            
   
  
    cenF = "0";
  
        }while(cont != IT );
    }
                              double total=0, total2=0, total3=0, total4=0, total5=0;//, todos;
                              public void union(){
                              for(int i = 0 ; i< IT; i ++){
                                 
                                  total = total + R1[i];
                                  total2 = total2 + R2[i];
                                  total3 = total3 + R3[i];
                                  total4 = total4 + R4[i];
                                  total5 = total5 + R5[i];
                              }
                              total = total - 6;
                              total2 = total2 - 6;
                              total3 = total3 - 6;
                              total4 = total4 - 6;
                              total5 = total5 - 6;
                              
                              //todos = total + total2 + total3 + total4 + total5;
                             total = (total * media) + varianza;
                             total2 = (total2 * media) + varianza;
                             total3 = (total3 * media) + varianza;
                             total4 = (total4 * media) + varianza;
                             total5 = (total5 * media) + varianza;
                             
                              }
                              
                              public void imprimir(){
                                   System.out.println("R1      R2      R3      R4      R5");
                              for(int i = 0 ; i< IT; i ++){
                                  
                                  System.out.println(R1[i]+"  "+R2[i]+"  "+R3[i]+"  "+R4[i]+"  "+R5[i]);
                              }
                              
                                  System.out.println("Y1.- "+total);
                                  System.out.println("Y2.- "+total2);
                                  System.out.println("Y3.- "+total3);
                                  System.out.println("Y4.- "+total4);
                                  System.out.println("Y5.- "+total5);
                                  
                                  
                                  
                              
                              }
                             
  
 public static void main (String [] args){
    ProP a = new ProP();
    a.p();
    System.out.println("---------------------------------------");
    a.Centro();
     a.Centro2();
      a.Centro3();
       a.Centro4();
        a.Centro5();
        a.union();
    a.imprimir();
    
    System.out.println("---------------------------------------");
    
    }
}

