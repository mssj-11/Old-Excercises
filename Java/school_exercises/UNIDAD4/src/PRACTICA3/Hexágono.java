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
public class Hexágono extends Poligono {

    public double Lados;
    public double Area;
    public double Perimetro;

    public Hexágono(double Lados) {
        super(6);
        this.Lados = Lados;
    }

    public Hexágono() {
        super(6);
        this.Lados = 21;
    }

    public double getLados() {
        return Lados;
    }

    public void setLados(double Lados) {
        this.Lados = Lados;
    }

    @Override
    public double Area() {

        double X, Y, Z;
        X = Math.pow(Lados, 2);
        Y = Math.pow((Lados / 2), 2);
        Z = Math.sqrt(X - Y);
        Area = ((Lados * 6) * (Z)) / 2;
        System.out.println("Los LADOS son >>>>>>>>>>>>>>>>>>>>>>>>>>>>> " + Lados);
        System.out.println("La APOTEMA es de >>>>>>>>>>>>>>>>>>>>>>>>>> " + Z);
        System.out.println("El AREA del HEXAGONO es de >>>>>>>>>>>>>>>> " + Area);
        return 0;
    }

    @Override
    public double Perimetro() {

        Perimetro = (Lados * 6);
        System.out.println("El PERIMETRO del HEXAGONO es >>>>>>>>>>>>>> " + Perimetro);
        return 0;
    }

    public void EntradaL() {

        Scanner L = new Scanner(System.in);
        System.out.println("Introduce el valor de los LADOS >>>>>>>>>>>> ");
        Lados = L.nextDouble();
    }

}
