/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menarb;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Arboles {

    class Nodo {

        int info;
        Nodo izq, der;
    }
    Nodo raiz;

    public Arboles() {
        raiz = null;
    }

    public void insertar(int info) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = info;
        nuevo.izq = null;
        nuevo.der = null;
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo anterior = null, reco;
            reco = raiz;
            while (reco != null) {
                anterior = reco;
                if (info < reco.info) {
                    reco = reco.izq;
                } else {
                    reco = reco.der;
                }
            }
            if (info < anterior.info) {
                anterior.izq = nuevo;
            } else {
                anterior.der = nuevo;
            }
        }
    }

    private void imprimirPre(Nodo reco) {
        if (reco != null) {
            System.out.print(reco.info + " ");
            imprimirPre(reco.izq);
            imprimirPre(reco.der);
        }
    }

    public void imprimirPre() {
        imprimirPre(raiz);
        System.out.println();
    }

    private void imprimirIn(Nodo reco) {
        if (reco != null) {
            imprimirIn(reco.izq);
            System.out.print(reco.info + " ");
            imprimirIn(reco.der);
        }
    }

    public void imprimirIn() {
        imprimirIn(raiz);
        System.out.println();
    }

    private void imprimirPost(Nodo reco) {
        if (reco != null) {
            imprimirPost(reco.izq);
            imprimirPost(reco.der);
            System.out.print(reco.info + " ");
        }
    }

    public void imprimirPost() {
        imprimirPost(raiz);
        System.out.println();
    }

    public static void main(String[] ar) {
        Arboles arbol = new Arboles();
        Scanner entrada = new Scanner(System.in);
        int dato = 0;
        switch (dato) {

            case 1:
                int x_salir = 1;
                do {
                    Scanner Q = new Scanner(System.in);
                    int k;
                    System.out.println(" (1) Agregar datos de arbol");
                    System.out.println(" (2) Impresion Pre-Orden ");
                    System.out.println(" (3) Impresion In-Orden");
                    System.out.println(" (4) Impresion Pos-Orden");
                    System.out.println(" (5) Salir");
                    k = Q.nextInt();
                    switch (k) {
                        case 1:
                            arbol.dato();
                            System.out.println("                                                   \n\n");
                            break;
                        case 2:
                            arbol.imprimirPre();
                            System.out.println("                                                   \n\n");
                            break;
                        case 3:
                            arbol.imprimirIn();
                            System.out.println("                                                   \n\n");
                            break;
                        case 4:
                            arbol.imprimirPost();
                            System.out.println("                                                   \n");

                            break;
                        case 5:
                            x_salir = 2;
                            break;
                    }

                } while (x_salir == 1);
                break;

        }
    }
}
