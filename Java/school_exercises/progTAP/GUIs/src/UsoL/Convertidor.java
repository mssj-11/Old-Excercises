/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsoL;

/**
 *
 * @author HP
 */
public class Convertidor {

    public String BO(int n, int base) {
        int aux, cadena;
        String cadenaF = "";
        do {
            aux = n;

            cadena = n / base;
            int mod = (aux % base);

            cadenaF = cadenaF + mod;
            n = cadena;
        } while (n != 0);

        return cadenaF;
    }

    public String HE(int n, int base) {
        int aux, cadena;
        String cadenaF = "";
        do {
            aux = n;

            cadena = n / base;
            int mod = (aux % base);
            if (mod == 10) {
                cadenaF = cadenaF + "A";
            } else if (mod == 11) {
                cadenaF = cadenaF + "B";
            } else if (mod == 12) {
                cadenaF = cadenaF + "C";
            } else if (mod == 13) {
                cadenaF = cadenaF + "D";
            } else if (mod == 14) {
                cadenaF = cadenaF + "E";
            } else if (mod == 15) {
                cadenaF = cadenaF + "F";
            } else {
                cadenaF = cadenaF + mod;
            }

            n = cadena;
        } while (n != 0);

        return cadenaF;

    }

    public int IBO(int n, int base) {
        int cifra, valor, i = 0, potencia = base, resultado = 0;
        do {
            if (i == 0) {
                potencia = 1;

            } else if (i == 1) {
                potencia = base;

            } else {
                potencia = potencia * base;
            }

            cifra = n % 10;

            if (cifra == 0) {
                valor = 0;
                i = i + 1;
            } else {

                valor = cifra * potencia;
                i = i + 1;

            }

            resultado = resultado + valor;
            n = n / 10;

        } while (n != 0);

        return resultado;

    }
}
