/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRACTICA3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Rectángulo extends Poligono {

    public double Base;
    public double Altura;
    public double Area;
    public double Perimetro;

    public Rectángulo(double Base, double Altura) {
        super(4);
        this.Base = Base;
        this.Altura = Altura;
    }

    public Rectángulo() {
        super(4);
        this.Base = 7.2;
        this.Altura = 14;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    @Override
    public double Area() {
        Area = Base * Altura;
        System.out.println("La BASE es >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> " + Base);
        System.out.println("La ALTURA es de >>>>>>>>>>>>>>>>>>>>>>>>>>> " + Altura);
        System.out.println("El AREA del RECTANGULO es >>>>>>>>>>>>>>>>> " + Area);
        return 0;
    }

    @Override
    public double Perimetro() {
        Perimetro = ((Base * 2) + (Altura * 2));
        System.out.println("El PERIMETRO del RECTANGULO es de >>>>>>>>> " + Perimetro);
        System.out.println("\n");
        return 0;
    }

    public void EntradaR() {
        Scanner AA = new Scanner(System.in);
        System.out.println("Introduce el valor de lo ANCHO >>>>>>>>>>>> ");
        Base = AA.nextInt();
        System.out.println("Introduce el valor de la ALTURA >>>>>>>>>>> ");
        Altura = AA.nextInt();
    }

}
