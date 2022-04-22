/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARBOLCONMENU;

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

    public static void Menu() {
        //creo mi menu
        System.out.println("");
        System.out.println("         MENU      \n");
        System.out.println("---------------------");
        System.out.println(" (1)  Crea Arbol: se ingresan los nodos.");
        System.out.println(" (2]  Recorrido preorden");
        System.out.println(" (3]  Recorrido inorden");
        System.out.println(" (4]  Recorrido postorden ");
        System.out.println(" (5)  Realizar los tres recorridos");
        System.out.println(" (6)  Realizar la busqueda de un número");
        System.out.println(" (7) Eliminar nodo");

        System.out.println(" (0) Salir \n");
        System.out.println("Ingresar Opción \n");
    }

    public static void main(String args[]) {
        Arboles arbol = new Arboles();

        int opc;
        Menu();
        System.out.println("Elegir opción: ");
        opc = Leer.datoInt();
        System.out.println("");
        //en cada opcion se llama a cada metodo segun corresponda
        while (opc != 0) {
            switch (opc) {
                case 0: {
                    System.out.println("Salir");
                    break;
                }

                case 1: {
                    arbol.insertarteclado();
                    break;
                }

                case 2: {
                    System.out.println("PRE_ORDEN: ");
                    arbol.imprimirPre();
                    break;
                }

                case 3: {
                    System.out.println("IN-ORDEN: ");
                    arbol.imprimirIn();
                    break;
                }

                case 4: {
                    System.out.println("POST-ORDEN: ");
                    arbol.imprimirPost();
                    break;
                }

                case 5: {
                    System.out.println("PRE-ORDEN: ");
                    arbol.imprimirPre();
                    System.out.println("IN-ORDEN: ");
                    arbol.imprimirIn();
                    System.out.println("POST-ORDEN: ");
                    arbol.imprimirPost();
                    break;
                }

                case 6: {
                    int bus;
                    System.out.println("Ingresar el número a buscar: ");
                    bus = Leer.datoInt();
                    System.out.println("" + arbol.buscar(bus));
                    break;
                }


                case 7: {
                    arbol.borrarnodo();
                    break;
                }
            }
            Menu();
            opc = Leer.datoInt();
        }
    }

}
