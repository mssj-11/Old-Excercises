/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodo;

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
    int cant;
    int altura;

    public Arboles() {
        raiz = null;
    }

    public void insertar(int info) {
        if (!existe(info)) {
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
    }

    public boolean existe(int info) {
        Nodo reco = raiz;
        while (reco != null) {
            if (info == reco.info) {
                return true;
            } else if (info > reco.info) {
                reco = reco.der;
            } else {
                reco = reco.izq;
            }
        }
        return false;
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

    private void cantidad(Nodo reco) {
        if (reco != null) {
            cant++;
            cantidad(reco.izq);
            cantidad(reco.der);
        }
    }

    public int cantidad() {
        cant = 0;
        cantidad(raiz);
        return cant;
    }

    private void cantidadNodosHoja(Nodo reco) {
        if (reco != null) {
            if (reco.izq == null && reco.der == null) {
                cant++;
            }
            cantidadNodosHoja(reco.izq);
            cantidadNodosHoja(reco.der);
        }
    }

    public int cantidadNodosHoja() {
        cant = 0;
        cantidadNodosHoja(raiz);
        return cant;
    }

    private void imprimirEntreConNivel(Nodo reco, int nivel) {
        if (reco != null) {
            imprimirEntreConNivel(reco.izq, nivel + 1);
            System.out.print(reco.info + " (" + nivel + ") - ");
            imprimirEntreConNivel(reco.der, nivel + 1);
        }
    }

    public void imprimirEntreConNivel() {
        imprimirEntreConNivel(raiz, 1);
        System.out.println();
    }

    private void retornarAltura(Nodo reco, int nivel) {
        if (reco != null) {
            retornarAltura(reco.izq, nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(reco.der, nivel + 1);
        }
    }

    public int retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        return altura;
    }

    public void mayorValorl() {
        if (raiz != null) {
            Nodo reco = raiz;
            while (reco.der != null) {
                reco = reco.der;
            }
            System.out.println("Mayor valor del árbol:" + reco.info);
        }
    }

    public void borrarMenor() {
        if (raiz != null) {
            if (raiz.izq == null) {
                raiz = raiz.der;
            } else {
                Nodo atras = raiz;
                Nodo reco = raiz.izq;
                while (reco.izq != null) {
                    atras = reco;
                    reco = reco.izq;
                }
                atras.izq = reco.der;
            }
        }
    }

    public static void main(String[] ar) {
        Arboles abo = new Arboles();
        abo.insertar(100);
        abo.insertar(50);
        abo.insertar(25);
        abo.insertar(75);
        abo.insertar(150);
        System.out.println("Impresion entreorden: ");
        abo.imprimirIn();
        System.out.println("Cantidad de nodos del arbol:" + abo.cantidad());
        System.out.println("Cantidad de nodos hoja:" + abo.cantidadNodosHoja());
        System.out.println("Impresion en entre orden junto al nivel del nodo.");
        abo.imprimirEntreConNivel();
        System.out.print("Altura del arbol:");
        System.out.println(abo.retornarAltura());
        abo.mayorValorl();
        abo.borrarMenor();
        System.out.println("Luego de borrar el menor:");
        abo.imprimirIn();
    }
}
/*Confeccionar una clase que permita insertar un entero en un árbol binario ordenado verificando que no se 
encuentre previamente dicho número.
Desarrollar los siguientes métodos:
1 - Retornar la cantidad de nodos del árbol.
2 - Retornar la cantidad de nodos hoja del árbol.
3 - Imprimir en entre orden.
4 - Imprimir en entre orden junto al nivel donde se encuentra dicho nodo.
5 - Retornar la altura del árbol.
6 - Imprimir el mayor valor del árbol.
7 - Borrar el nodo menor del árbol.*/