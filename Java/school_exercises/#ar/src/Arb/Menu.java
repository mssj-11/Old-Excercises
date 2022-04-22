/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arb;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Menu {

    public static void main(String args[]) {
        Arbol arbol = new Arbol();
        int valor;
        String Dato;

        System.out.println("Insertando los siguientes valores: ");

        Dato = JOptionPane.showInputDialog("Inserta el numero de nodos que desea ingresar");
        int n = Integer.parseInt(Dato);

        for (int i = 1; i <= n; i++) {
            Dato = JOptionPane.showInputDialog("Dame el " + i + " valor para colocar en el Arbol");
            valor = Integer.parseInt(Dato);
            System.out.print(valor + " ");
            arbol.insertarNodo(valor);
        }

        System.out.println("\n\nRecorrido Preorden");
        arbol.recorridoPreorden();

        System.out.println("\n\nRecorrido Inorden");
        arbol.recorridoInorden();

        System.out.println("\n\nRecorrido Postorden");
        arbol.recorridoPosorden();
    }
}
