/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_clave;
import java.util.*;
/**
 *
 * @author HP
 */
/*
Modulo CT para RiCrypt
Cifrado por Transposicion usando una matriz y una llave ordenada.

 */

public class CT {

    public static String TxT;
    public static int Sp;
    public static int Seed[];

    public CT(String TxT, int Sp, String Sd) {
        this.TxT = TxT;
        this.Sp = Sp;
        while (this.TxT.length() % Sp != 0) {
            this.TxT += "x";
        }
        Seed = Gen(Sd, Sp);
        if (Seed[0] == -1) {//generamos Seed por defecto..
            Seed = new int[Sp];
            for (int n = 0; n < Sp; n++) {
                Seed[n] = n;
            }
        }
    }

    public static String Cifrar() {
        String Cifrado = "";
        String tmp[][] = new String[TxT.length() / Sp][Sp];
        for (int n = 0; n < TxT.length(); n++) {
            tmp[(int) Math.floor((double) n / (double) Sp)][n % Sp] = String.valueOf(TxT.charAt(n));
        }
        for (int n = 0; n < Seed.length; n++) {
            for (int x = 0; x < (TxT.length() / Sp); x++) {
                Cifrado += tmp[x][Seed[n]];
            }
        }
        return Cifrado;
    }

    public static String DesCifrar() {
        String DesCifrado = "";
        String pp = "";
        for (int n = 0; n < Seed.length; n++) {
            pp += String.valueOf(Seed[n]);
        }
//String DesCifrado="";
        String tmp[][] = new String[TxT.length() / Sp][Sp];
        String ord[][] = new String[TxT.length() / Sp][Sp];
        for (int n = 0, c = 0; (n + (TxT.length() / Sp)) <= TxT.length(); c++, n += (TxT.length() / Sp)) {
            String tt = TxT.substring(n, n + (TxT.length() / Sp));
            for (int x = 0; x < tt.length(); x++) {
                tmp[x][c] = "" + tt.charAt(x);
            }
        }
        for (int n = 0; n < Sp; n++) {
            for (int y = 0; y < (TxT.length() / Sp); y++) {
                ord[y][n] = tmp[y][pp.indexOf(String.valueOf(n))];
            }
        }
        for (int n = 0; n < (TxT.length() / Sp); n++) {
            for (int x = 0; x < Sp; x++) {
                DesCifrado += ord[n][x];
            }
        }
        return DesCifrado;
    }

    public static int[] Gen(String Sd, int Sp) {
        int nula[] = {-1};
        String charset = "0123456789,";
        for (int n = 0; n < Sd.length(); n++) {
            if (charset.indexOf(Sd.charAt(n)) == -1) {
                System.err.println("Seed Mala");
                return nula;
            }
        }
        for (int n = 0; n < Sp; n++) {
            if (Sd.indexOf(String.valueOf(n)) == -1) {
                System.err.println("Seed Mala");
                return nula;
            }
        }
        StringTokenizer tok = new StringTokenizer(Sd, ",");
        if (Sp != tok.countTokens()) {
            System.err.println("Seed Mala");
            return nula;
        }
        int epa[] = new int[Sp];
        for (int n = 0; n < epa.length; n++) {
            epa[n] = Integer.parseInt(tok.nextToken());
            if (epa[n] >= Sp) {
                System.err.println("Seed Mala");
                return nula;
            }
        }
        return epa;
    }
}
