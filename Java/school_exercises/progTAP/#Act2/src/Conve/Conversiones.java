/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class Conversiones {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    void menu() throws IOException {
        while (true) {
            System.out.println("\n\033[31m****************************************");
            System.out.println("\t\033[31m ::: Conversiones :::");
            System.out.println("\033[31m****************************************");
            System.out.println("\t::DECIMAL::");
            System.out.println("1) Binario");
            System.out.println("2) Hexadecimal");
            System.out.println("3) Octal");
            System.out.println("****************************************");
            System.out.println("\t::BINARIO::");
            System.out.println("4) Decimal");
            System.out.println("5) Hexadecimal");
            System.out.println("6) Octal");
            System.out.println("****************************************");
            System.out.println("\t::HEXADECIMAL::");
            System.out.println("7) Decimal");
            System.out.println("8) Binario");
            System.out.println("9) Octal");
            System.out.println("****************************************");
            System.out.println("\t::OCTAL::");
            System.out.println("10) Decimal");
            System.out.println("11) Binario");
            System.out.println("12) Hexadecimal");
            System.out.println("****************************************");
            System.out.print("13) Salir");
            System.out.println("\n\033[31m****************************************");
            System.out.print("\nDigite la Opcion a Realizar: ");

            int op = Integer.parseInt(in.readLine());
            String valor;
            System.out.print("\n");

            switch (op) {
                case 1:
                    System.out.println("\nDe Decimal a Binario");
                    System.out.print("Decimal: ");
                    valor = in.readLine();
                    dec_bin(valor);
                    break;
                case 2:
                    System.out.println("\n\nDe Decimal a Hexadecimal");
                    System.out.print("Decimal: ");
                    valor = in.readLine();
                    dec_hex(valor);
                    break;
                case 3:
                    System.out.println("\n\nDe Decimal a Octal");
                    System.out.print("Decimal: ");
                    valor = in.readLine();
                    dec_oct(valor);
                    break;
                case 4:
                    System.out.println("\n\nDe Binario a Decimal");
                    System.out.print("\nBinario: ");
                    valor = in.readLine();
                    bin_dec(valor);
                    break;
                case 5:
                    System.out.println("\n\nDe Binario a Hexadecimal");
                    System.out.print("\nBinario: ");
                    valor = in.readLine();
                    bin_hex(valor);
                    break;
                case 6:
                    System.out.println("\n\nDe Binario a Octal");
                    System.out.print("\nBinario: ");
                    valor = in.readLine();
                    bin_oct(valor);
                    break;
                case 7:
                    System.out.println("\n\nDe Hexadecimal a Decimal");
                    System.out.print("\nHexadecimal: ");
                    valor = in.readLine();
                    hex_dec(valor);
                    break;
                case 8:
                    System.out.println("\n\nDe Hexadecimal a Binario");
                    System.out.print("\nHexadecimal: ");
                    valor = in.readLine();
                    hex_bin(valor);
                    break;
                case 9:
                    System.out.println("\n\nDe Hexadecimal a Octal");
                    System.out.print("\nHexadecimal: ");
                    valor = in.readLine();
                    hex_oct(valor);
                    break;
                case 10:
                    System.out.println("\n\nDe Octal a Decimal");
                    System.out.print("\nOctal: ");
                    valor = in.readLine();
                    oct_dec(valor);
                    break;
                case 11:
                    System.out.println("\n\nDe Octal a Binario");
                    System.out.print("\nOctal: ");
                    valor = in.readLine();
                    oct_bin(valor);
                    break;
                case 12:
                    System.out.println("\n\nDe Octal a Hexadecimal");
                    System.out.print("\nOctal: ");
                    valor = in.readLine();
                    oct_hex(valor);
                    break;
                case 13:
                    System.exit(0);
                    break;
            }
        }
    }

    void dec_bin(String valor) {
        int dec = Integer.parseInt(valor);
        valor = Integer.toBinaryString(dec);
        System.out.print("En Binario: " + valor);
    }

    void dec_hex(String valor) {
        int dec = Integer.parseInt(valor);
        valor = Integer.toHexString(dec);
        System.out.print("En Hexadecimal: " + valor);
    }

    void dec_oct(String valor) {
        int dec = Integer.parseInt(valor);
        valor = Integer.toOctalString(dec);
        System.out.print("En Octal: " + valor);
    }

    void bin_dec(String valor) {
        int dec = Integer.parseInt(valor, 2);
        System.out.print("En Decimal: " + dec);
    }

    void bin_hex(String valor) {
        int dec = Integer.parseInt(valor, 2);
        valor = Integer.toHexString(dec);
        System.out.print("En Hexadecimal: " + valor);
    }

    void bin_oct(String valor) {
        int dec = Integer.parseInt(valor, 2);
        valor = Integer.toOctalString(dec);
        System.out.print("En Octal: " + valor);
    }

    void hex_dec(String valor) {
        int dec = Integer.parseInt(valor, 16);
        System.out.print("En Decimal: " + dec);
    }

    void hex_bin(String valor) {
        int dec = Integer.parseInt(valor, 16);
        valor = Integer.toBinaryString(dec);
        System.out.print("En Binario: " + valor);
    }

    void hex_oct(String valor) {
        int dec = Integer.parseInt(valor, 16);
        valor = Integer.toOctalString(dec);
        System.out.print("En Octal: " + valor);
    }

    void oct_dec(String valor) {
        int dec = Integer.parseInt(valor, 8);
        System.out.print("En Decimal: " + dec);
    }

    void oct_bin(String valor) {
        int dec = Integer.parseInt(valor, 8);
        valor = Integer.toBinaryString(dec);
        System.out.print("En Binario: " + valor);
    }

    void oct_hex(String valor) {
        int dec = Integer.parseInt(valor, 8);
        valor = Integer.toHexString(dec);
        System.out.print("En Hexadecimal: " + valor);
    }

    public static void main(String[] args) throws IOException {
        Conversiones conversion = new Conversiones();
        conversion.menu();
    }

}