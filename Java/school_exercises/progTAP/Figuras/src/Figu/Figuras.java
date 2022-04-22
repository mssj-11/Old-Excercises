/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figu;

/**
 *
 * @author HP
 */
public class Figuras {

    public double cuadrado_A(double lado) {
        double area;
        area = lado * lado;
        return area;
    }

    public double cuadrado_P(double lado) {
        double perimetro;
        perimetro = 4 * lado;
        return perimetro;
    }

    public double rectangulo_A(double L1, double L2) {
        double area;
        area = L1 * L2;
        return area;
    }

    public double rectangulo_P(double L1, double L2) {
        double perimetro;
        perimetro = L1 + L1 + L2 + L2;
        return perimetro;
    }

    public double circulo_A(double radio) {
        double area, aux;
        aux = radio * radio;
        area = 3.141592654 * aux;
        return area;
    }

    public double circulo_P(double radio) {
        double perimetro;
        perimetro = 2 * 3.141592654 * radio;
        return perimetro;
    }

    public double T_EQA(double lados) {
        double area, aux, aux2;
        aux = lados * lados;
        aux2 = aux * 1.732050808;
        area = aux2 / 4;
        return area;
    }

    public double T_EQP(double lados) {
        double perimetro;
        perimetro = lados * 3;
        return perimetro;
    }

    public double T_IA(double lados, double base, double altura) {
        double area, aux;
        aux = lados * altura;
        area = aux / 2;
        return area;
    }

    public double T_IP(double lados, double base) {
        double perimetro, aux;
        aux = lados * 2;
        perimetro = aux + base;
        return perimetro;
    }

    public double T_ESA(double lados, double base, double altura) {
        double area, aux;
        aux = lados * altura;
        area = aux / 2;
        return area;
    }

    public double T_ESP(double L1, double L2, double L3) {
        double perimetro;
        perimetro = L1 + L2 + L3;
        return perimetro;
    }

    public double cilindro_A(double altura, double radio) {
        double area, aux;
        aux = 2 * 3.141592654 * radio;
        area = aux * (altura + radio);
        return area;
    }

    public double cilindro_V(double altura, double radio) {
        double volumen, aux;
        aux = radio * radio;
        volumen = 3.141592654 * aux * altura;
        return volumen;
    }

    public double esfera_A(double radio) {
        double area, aux;
        aux = radio * radio;
        area = 4 * 3.141592654 * aux;
        return area;
    }

    public double esfera_V(double radio) {
        double volumen, aux;
        aux = radio * radio * radio;
        volumen = 1.3333333333 * 3.141592654 * aux;
        return volumen;
    }

    public double cubo_A(double lados) {
        double area, aux;
        aux = lados * lados;
        area = 6 * aux;
        return area;
    }

    public double cubo_V(double lados) {
        double volumen;
        volumen = lados * lados * lados;
        return volumen;
    }

    public double prismaR_A(double L1, double L2, double altura) {
        double area, aux, aux2, aux3;
        aux = L1 * L2;
        aux2 = L1 * altura;
        aux3 = L2 * altura;
        area = (2 * aux) + (2 * aux2) + (2 * aux3);

        return area;
    }

    public double prismaR_V(double L1, double L2, double altura) {
        double volumen, aux;
        aux = L1 * L2;
        volumen = aux * altura;
        return volumen;
    }

}
