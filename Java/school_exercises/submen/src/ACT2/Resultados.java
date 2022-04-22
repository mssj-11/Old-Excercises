/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACT2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Resultados {

    public static void main(String[] args) {

        Conductor A = new Conductor();// datos pedidos
        Conductor AA = new Conductor("", 0, 0, 0);
        Particular B = new Particular();// datos pedidos
        Particular BB = new Particular("", 0, 0);
        Particular BBB = new Particular("", 0, 0, "", 0, 0, 0);
        Chofer D = new Chofer();// datos pedidos
        Chofer DD = new Chofer("", 0, 0);
        Chofer DDD = new Chofer("", 0, 0, "", 0, 0, 0);
        Publico E = new Publico();// datos pedidos
        Publico EE = new Publico("", 0, 0);
        Publico EEE = new Publico("", 0, 0, "", 0, 0, 0);
        Privado F = new Privado();// datos pedidos
        Privado FF = new Privado(0, 0);
        Privado FFF = new Privado("", 0, 0, "", 0, 0, 0);

        int j;
        for (j = 1; j < 20; j++) {
            Scanner Y = new Scanner(System.in);
            int i;
            System.out.println("\t\033[31m(MENU)");
            System.out.println("1.-)  \033[32mConductor");
            System.out.println("2.-)  \033[33mParticular");
            System.out.println("3.-)  \033[34mChofer");
            System.out.println("4.-)  \033[35mPublico");
            System.out.println("5.-)  \033[36mPrivado");
            System.out.println("6.-)  \033[31mSalir");
            i = Y.nextInt();
            switch (i) {
                case 1:
                    int x_salir = 1;
                    do {
                        Scanner Q = new Scanner(System.in);
                        int k;
                        System.out.println(" (1) Agregar datos de conductor");
                        System.out.println(" (2) Si desea imprimir los datos por default");
                        System.out.println(" (3) Si desea imprimir los datos nuevos");
                        System.out.println(" (4) Imprimir ambos");
                        System.out.println(" (5) Regresar al menu princial");
                        k = Q.nextInt();
                        switch (k) {
                            case 1:
                                AA.entrada();
                                System.out.println("                                                   \n\n");
                                break;
                            case 2:
                                A.Datos();
                                System.out.println("                                                   \n\n");
                                break;
                            case 3:
                                AA.Datos();
                                System.out.println("                                                   \n\n");
                                break;
                            case 4:
                                A.Datos();
                                System.out.println("                                                   ");
                                AA.Datos();
                                System.out.println("                                                   \n\n");
                                break;
                            case 5:
                                x_salir = 2;
                                break;
                        }
                    } while (x_salir == 1);
                    break;

                case 2:
                    int x_salida2 = 1;
                    do {
                        Scanner QQ = new Scanner(System.in);
                        int k2;
                        System.out.println(" (1) Agregar datos de paricular");
                        System.out.println(" (2) Si desea imprimir los datos por default");
                        System.out.println(" (3) Si desea imprimir los datos nuevos utilizando los de default");
                        System.out.println(" (4) Si desea imprimir con todos los datos nuevos ");
                        System.out.println(" (5) Imprimir ambos");
                        System.out.println(" (6) Regresar al menu principal");
                        k2 = QQ.nextInt();
                        switch (k2) {
                            case 1:
                                BB.entrada();
                                BBB.Herencia_editados();
                                System.out.println("\n                                                   \n");
                                break;
                            case 2:
                                B.datos2();
                                B.Datos_C();
                                B.Gastos(0, 0);
                                System.out.println("                                                   \n\n");
                                break;
                            case 3:
                                BB.datos2();
                                BB.Datos_C();
                                BB.Gastos(0, 0);
                                System.out.println("                                                   \n\n");
                                break;
                            case 4:
                                BBB.datos2();
                                BB.Datos_C();
                                BB.Gastos(0, 0);
                                break;
                            case 5:
                                B.datos2();
                                B.Datos_C();
                                B.Gastos(0, 0);
                                System.out.println("                                                   ");
                                BB.datos2();
                                BB.Datos_C();
                                BB.Gastos(0, 0);
                                System.out.println("                                                   ");
                                BBB.datos2();
                                BB.Datos_C();
                                BB.Gastos(0, 0);
                                System.out.println("                                                   \n\n");
                                break;
                            case 6:
                                x_salida2 = 2;
                                break;
                        }
                    } while (x_salida2 == 1);
                    break;

                case 3:
                    int x_s = 1;
                    do {
                        Scanner T = new Scanner(System.in);
                        int t;
                        System.out.println(" (1) Agregar datos de chofer");
                        System.out.println(" (2) Si desea imprimir los datos por default");
                        System.out.println(" (3) Si desea imprimir los datos nuevos utilizando los de default");
                        System.out.println(" (4) Si desea imprimir con todos los datos nuevos ");
                        System.out.println(" (5) Imprimir ambos");
                        System.out.println(" (6) Regresar al menu principal");
                        t = T.nextInt();
                        switch (t) {
                            case 1:
                                DD.entrada2();
                                DDD.herencia_C();
                                System.out.println("                                                   \n\n");

                                break;
                            case 2:
                                D.Da();
                                D.Da2();
                                D.sueldo();
                                System.out.println("                                                   \n\n");
                                break;
                            case 3:
                                DD.Da();
                                DD.Da2();
                                DD.sueldo();
                                System.out.println("                                                   \n\n");
                                break;
                            case 4:
                                DDD.Da();
                                DD.Da2();
                                DD.sueldo();
                                System.out.println("                                                   \n\n");
                                break;
                            case 5:
                                D.Da();
                                D.Da2();
                                D.sueldo();
                                System.out.println("                                                   ");
                                DD.Da();
                                DD.Da2();
                                DD.sueldo();
                                System.out.println("                                                   ");
                                DDD.Da();
                                DD.Da2();
                                DD.sueldo();
                                System.out.println("                                                   \n\n");
                                break;
                            case 6:
                                x_s = 22;
                                break;
                        }
                    } while (x_s == 1);
                    break;

                case 4:
                    int op2 = 1;
                    do {
                        Scanner T2 = new Scanner(System.in);
                        int x;
                        System.out.println(" (1) Agregar datos de publico");
                        System.out.println(" (2) Si desea imprimir los datos por default");
                        System.out.println(" (3) Si desea imprimir los datos nuevos utilizando los de default");
                        System.out.println(" (4) Si desea imprimir con todos los datos nuevos ");
                        System.out.println(" (5) Imprimir ambos");
                        System.out.println(" (6) Regresar al menu principal");
                        x = T2.nextInt();
                        switch (x) {
                            case 1:
                                EE.entrada2();
                                EE.Herencia_CHP();
                                EEE.Herencia_COP();
                                System.out.println("                                                   \n\n");
                                break;
                            case 2:
                                E.imprimir_datos();
                                E.imprimir_datos2();
                                E.imprimir_datos3();
                                E.resultado();
                                System.out.println("                                                   \n\n");
                                break;
                            case 3:
                                EE.imprimir_datos();
                                EE.imprimir_datos2();
                                EE.imprimir_datos3();
                                EE.resultado();
                                System.out.println("                                                   \n\n");
                                break;
                            case 4:
                                EEE.imprimir_datos();
                                EE.imprimir_datos2();
                                EE.imprimir_datos3();
                                EE.resultado();
                                System.out.println("                                                   \n\n");
                                break;
                            case 5:
                                E.imprimir_datos();
                                E.imprimir_datos2();
                                E.imprimir_datos3();
                                E.resultado();
                                System.out.println("                                                   ");
                                EE.imprimir_datos();
                                EE.imprimir_datos2();
                                EE.imprimir_datos3();
                                EE.resultado();
                                System.out.println("                                                   ");
                                EEE.imprimir_datos();
                                EE.imprimir_datos2();
                                EE.imprimir_datos3();
                                EE.resultado();
                                System.out.println("                                                   \n\n");
                                break;
                            case 6:
                                op2 = 2;
                                break;
                        }
                    } while (op2 == 1);
                    break;

                case 5:
                    int xyz = 1;
                    do {
                        Scanner T3 = new Scanner(System.in);
                        int h;
                        System.out.println(" (1) Agregar datos de privado");
                        System.out.println(" (2) Si desea imprimir los datos por default");
                        System.out.println(" (3) Si desea imprimir los datos nuevos utilizando los de default");
                        System.out.println(" (4) Si desea imprimir con todos los datos nuevos ");
                        System.out.println(" (5) Imprimir ambos");
                        System.out.println(" (6) Regresar al menu principal");
                        h = T3.nextInt();
                        switch (h) {
                            case 1:
                                FF.entrada2();
                                FF.Herencia_CHP();
                                FFF.Herencia_COP();
                                System.out.println("                                                   \n\n");
                                break;
                            case 2:
                                F.imprimir_datos();
                                F.imprimir_datos2();
                                F.imprimir_datos3();
                                F.resultado2();
                                System.out.println("                                                   \n\n");
                                break;
                            case 3:
                                FF.imprimir_datos();
                                FF.imprimir_datos2();
                                FF.imprimir_datos3();
                                FF.resultado2();
                                System.out.println("                                                   \n\n");
                                break;
                            case 4:
                                FFF.imprimir_datos();
                                FF.imprimir_datos2();
                                FF.imprimir_datos3();
                                FF.resultado2();
                                break;
                            case 5:
                                F.imprimir_datos();
                                F.imprimir_datos2();
                                F.imprimir_datos3();
                                F.resultado2();
                                System.out.println("                                                   ");
                                FF.imprimir_datos();
                                FF.imprimir_datos2();
                                FF.imprimir_datos3();
                                FF.resultado2();
                                System.out.println("                                                   ");
                                FFF.imprimir_datos();
                                FF.imprimir_datos2();
                                FF.imprimir_datos3();
                                FF.resultado2();
                                System.out.println("                                                   \n\n");
                                break;
                            case 6:
                                xyz = 2;
                                break;
                        }
                    } while (xyz == 1);
                    break;

                case 6:
                    j = 20;
                    break;
            }
        }
    }
}
