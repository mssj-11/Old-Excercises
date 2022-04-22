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
public class Triangulo extends Poligono{
    public double base;
    public double ladoI;
    public double ladoD;
    public double Area;
    public double Perimetro;

    public Triangulo(double base, double ladoI, double ladoD) {
        super(3);
        this.base = base;
        this.ladoI = ladoI;
        this.ladoD = ladoD;
    }
     public Triangulo() {
        super(3);
        this.base = 7;
        this.ladoI = 7;
        this.ladoD = 7;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLadoI() {
        return ladoI;
    }

    public void setLadoI(double ladoI) {
        this.ladoI = ladoI;
    }

    public double getLadoD() {
        return ladoD;
    }

    public void setLadoD(double ladoD) {
        this.ladoD = ladoD;
    }
    
    @Override
    public double Area(){
     double S, SS;
     S = (double) ((base+ladoI+ladoD)/2);
     SS= ((S-base)*(S-ladoI)*(S-ladoD)*S);
     Area = Math.sqrt(SS);
     System.out.println("BASE -->"+base);
     System.out.println("LADO IZQUIERDO -->"+ladoI);
     System.out.println("LADO DERECHO -->"+ladoD);
     System.out.println("EL AREA DEL TRIANGULO ES --> "+Area);
     return 0;
    }
    @Override
    public double Perimetro(){
     Perimetro = (base + ladoI + ladoD);
    System.out.println("EL PERIMETRO DEL TRIANGULO ES --> "+Perimetro);
    return 0;
    }

    

    
    
    
    
    
    
    
    
    
    
    
    public void EntradaT (){
  Scanner DR = new Scanner (System.in);
  System.out.println("DA EL VALOR DE EL BASE -->");
   base = DR.nextInt();
  System.out.println("DA EL VALOR DE EL LADO IZQUIERDO -->");
   ladoI = DR.nextInt();
  System.out.println("DA EL VALOR DE EL LADO DERECHA -->");
   ladoD = DR.nextInt();
    }
   

   
    
    
}
