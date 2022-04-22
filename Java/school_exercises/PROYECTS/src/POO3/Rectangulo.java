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
public class Rectangulo extends Poligono {
    public double base;
    public double altura;
    public double Area;
    public double Perimetro;

    public Rectangulo(double base, double altura) {
        super(4);
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo() {
        super(4);
        this.base = 10;
        this.altura = 5;
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double Area(){
     Area = base * altura;
    System.out.println("BASE -->"+base);
    System.out.println("ALTURA -->"+altura);
    System.out.println("EL AREA DEL RECTANGULO ES --> "+Area);
     return 0;
    }
    @Override
    public double Perimetro(){
     Perimetro = ((base * 2) + (altura * 2) );
    System.out.println("EL PERIMETRO DEL RECTANGULO ES --> "+Perimetro);
    System.out.println("\n");
    return 0;
    }

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void EntradaR (){
    Scanner DR = new Scanner (System.in);
    System.out.println("DA EL VALOR DE EL ANCHO -->");
    base = DR.nextInt();
    System.out.println("DA EL VALOR DE EL ALTURA -->");
    altura = DR.nextInt();
    }
    
    
    
    
    
    
}
