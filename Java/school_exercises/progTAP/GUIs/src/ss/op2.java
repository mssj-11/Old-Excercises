/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss;

/**
 *
 * @author Daniel
 */
public class op2 {

    public void D(int n, int base) {
        int cifra, valor;
        int i = 0;
        int resultado = 0;
        do {
            cifra = n % 10;

            if (cifra == 0) {
                valor = 0;
            } else {
                valor = cifra * base ^ i;
                i++;
            }

            resultado = resultado + valor;
            n = n / 10;

        } while (n > 0);

        System.out.println("resul   -->" + resultado);

    }

    public static void main(String[] args) {
        op2 A = new op2();
        A.D(1, 2);

    }
}
