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
public class Triangulo extends Poligono {

    public double Base;
    public double lado1;
    public double lado2;
    public double Area;
    public double Perimetro;

    public Triangulo(double Base, double lado1, double lado2) {
        super(3);
        this.Base = Base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Triangulo() {
        super(3);
        this.Base = 14;
        this.lado1 = 21;
        this.lado2 = 21;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLadoD(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double Area() {
        double S, SS;
        S = (double) ((Base + lado1 + lado2) / 2);
        SS = ((S - Base) * (S - lado1) * (S - lado2) * S);
        Area = Math.sqrt(SS);
        System.out.println("La BASE es >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> " + Base);
        System.out.println("El valor del lado IZQUIERDO >>>>>>>>>>>>>>> " + lado1);
        System.out.println("El valor del lado DERECHO >>>>>>>>>>>>>>>>> " + lado2);
        System.out.println("El AREA del TRIANGULO es >>>>>>>>>>>>>>>>>> " + Area);
        return 0;
    }

    @Override
    public double Perimetro() {
        Perimetro = (Base + lado1 + lado2);
        System.out.println("El PERIMETRO del TRIANGULO es >>>>>>>>>>>>> " + Perimetro);
        return 0;
    }

    public void EntradaT() {
        Scanner TRI = new Scanner(System.in);
        System.out.println("Introduce el valor de la BASE >>>>>>>>>>>>> ");
        Base = TRI.nextInt();
        System.out.println("Introduce el valor del lado IZQUIERDO >>>>> ");
        lado1 = TRI.nextInt();
        System.out.println("Introduce el valor del lado DERECHA >>>>>>> ");
        lado2 = TRI.nextInt();
    }

}
