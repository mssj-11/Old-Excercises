/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOTESeconomicos;

import java.util.Scanner;

public class Operaciones {

    public static float Q(float D, float Cp, float Cmi) {
        float resultado, a;
        double b;

        b = 2 * (D * Cp) / Cmi;
        resultado = (float) Math.sqrt(b);

        return resultado;
    }

    public static float TdPedidos(float Q, float D) {
        float T = Q / D;
        return T;
    }

    public static float NdPedidos(float Q, float D) {
        float N = D / Q;
        return N;
    }

    public static float CTAnual(float Q, float D, float Cu, float Cmi, float Cp) {

        float CTA = (Cu * D) + (Cp * D / Q) + (Cmi * Q / 2);
        return CTA;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("\033[34m****************************************\n");
        System.out.print("\033[31m* ::Modelo de inventario sin deficit:: *");
        System.out.print("\n\033[34m****************************************\n\n");
        System.out.print(" Ingresa el valor de la demanda: ");
        float D = teclado.nextFloat();

        System.out.print(" Ingresa el costo unitario del producto: ");
        float Cu = teclado.nextFloat();

        System.out.print(" Ingresa el costo del pedido o de ordenar una compra: ");
        float Cp = teclado.nextFloat();

        System.out.print(" Ingresa el costo de mantenerlo en almacen o en inventario: ");
        float Cmi = teclado.nextFloat();

        double resultado1, resultado2, resultado3, resultado4;

        resultado1 = Q(D, Cp, Cmi);
        resultado2 = NdPedidos((float) resultado1, D);
        resultado3 = TdPedidos((float) resultado1, D);
        resultado4 = CTAnual((float) resultado1, D, Cu, Cmi, Cp);

        System.out.print("\n La cantidad optima es de: " + resultado1);
        System.out.print("\n EL #N de pedidos es de:  " + resultado2);
        System.out.print("\n EL tiempo de pedidos es de:  " + resultado3);
        System.out.print("\n EL costo total anual es de:  " + resultado4);
        System.out.print("\n");

    }
}
