/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJEMPLO;

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
        arbol.insertar(100);
        arbol.insertar(50);
        arbol.insertar(25);
        arbol.insertar(75);
        arbol.insertar(150);
        System.out.println("Impresion Pre-Orden: ");
        arbol.imprimirPre();
        System.out.println("Impresion In-Orden: ");
        arbol.imprimirIn();
        System.out.println("Impresion Pos-Orden: ");
        arbol.imprimirPost();
    }
}
  