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
public class Prueba {

    public static void main(String[] args) {

        Rectángulo R = new Rectángulo(0, 0);
        Rectángulo R2 = new Rectángulo();
        Triangulo T = new Triangulo(0, 0, 0);
        Triangulo T2 = new Triangulo();
        Hexágono H = new Hexágono(0);
        Hexágono H2 = new Hexágono();

        int salir = 1;

        do {

            int opciones;

            System.out.println("\033[34m***MENU PRINCIPAL***\n");
            System.out.println("1.- RECTANGULO\n");
            System.out.println("2.- TRIANGULO\n");
            System.out.println("3.- HEXAGONO\n");
            System.out.println("4.- \033[34mSALIR\n");
            Scanner S = new Scanner(System.in);
            opciones = S.nextInt();

            switch (opciones) {

                case 1:

                    int Salida1 = 1;

                    do {

                        int op2;

                        System.out.println("\t\033[31m***SUBMENU*** \n");
                        System.out.println("1.- Agregar nuevos datos\n");
                        System.out.println("2.- Imprimir los datos por default del AREA & PERIMETRO\n");
                        System.out.println("3.- Imprimir los datos agregados del AREA & PERIMETRO\n");
                        System.out.println("4.- \033[31mSALIR\n");
                        Scanner S2 = new Scanner(System.in);
                        op2 = S2.nextInt();

                        switch (op2) {

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
                    } while (Salida1 == 1);
                    break;

                case 2:

                    int Salida2 = 1;

                    do {
                        int op3;

                        System.out.println("\t\033[31m***SUBMENU*** \n");
                        System.out.println("1.- Agregar nuevos datos\n");
                        System.out.println("2.- Imprimir los datos por default del AREA & PERIMETRO\n");
                        System.out.println("3.- Imprimir los datos agregados del AREA & PERIMETRO\n");
                        System.out.println("4.- \033[31mSALIR\n");
                        Scanner S3 = new Scanner(System.in);
                        op3 = S3.nextInt();

                        switch (op3) {

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
                    } while (Salida2 == 1);
                    break;

                case 3:

                    int Salida3 = 1;

                    do {
                        int op3;

                        System.out.println("\t\033[31m***SUBMENU*** \n");
                        System.out.println("1.- Agregar nuevos datos\n");
                        System.out.println("2.- Imprimir los datos por default del AREA & PERIMETRO\n");
                        System.out.println("3.- Imprimir los datos agregados del AREA & PERIMETRO\n");
                        System.out.println("4.- \033[31mSALIR\n");
                        Scanner S4 = new Scanner(System.in);
                        op3 = S4.nextInt();

                        switch (op3) {

                            case 1:
                                H.EntradaL();
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
                    } while (Salida3 == 1);
                    break;

                case 4:
                    salir = 2;
                    break;

            }
        } while (salir == 1);

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
        H2.Perimetro();
    }

}
