/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONV;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Conversiones {

    public static void main(String[] args) {

////////////////////Decimal a Binario//////////////////////////
        int numero, exp, digito;
        double binario;

///////////////////////////////////////////////////////////////
////////////////////////Binario a Decimal/////////////////////////////
        //long numero, aux, digito, decimal;
        int aux, decimal;
        int exponente;
        boolean esBinario;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("***************************************************");
            System.out.print("\nDe Decimal a Binario\n");
            System.out.print("Introduce un numero Decimal: ");

//System.out.print("Introduce un numero entero >= 0: ");
            numero = sc.nextInt();
        } while (numero < 0);

        exp = 0;
        binario = 0;
        while (numero != 0) {
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            numero = numero / 2;
        }
        System.out.printf("A Binario: %.0f %n", binario);
        System.out.print("***************************************************\n");

/////////////////////////////////////////////////////////////////////////////////
//Leer un número por teclado y comprobar que es binario
        do {
            System.out.print("\n\n***************************************************");
            System.out.print("\nDe Binario a Decimal\n");
            System.out.print("Introduce un numero binario: ");
            numero = (int) sc.nextLong();
            //comprobamos que sea un número binario es decir
            //que este formado solo por ceros y unos
            esBinario = true;
            aux = numero;
            while (aux != 0) {
                digito = aux % 10; //última cifra del números
                if (digito != 0 && digito != 1) { //si no es 0 ó 1
                    esBinario = false; //no es un número binario
                }
                aux = aux / 10; //quitamos la última cifra para repetir el proceso
            }
        } while (!esBinario); //se vuelve a pedir si no es binario

        //proceso para pasar de binario a decimal
        exponente = 0;
        decimal = 0; //será el equivalente en base decimal
        while (numero != 0) {
            //se toma la última cifra
            digito = numero % 10;
            //se multiplica por la potencia de 2 correspondiente y se suma al número
            decimal = decimal + digito * (int) Math.pow(2, exponente);
            //se aumenta el exponente
            exponente++;
            //se quita la última cifra para repetir el proceso
            numero = numero / 10;
        }
        System.out.println("Decimal: " + decimal);
        System.out.print("***************************************************\n");
    }
}
