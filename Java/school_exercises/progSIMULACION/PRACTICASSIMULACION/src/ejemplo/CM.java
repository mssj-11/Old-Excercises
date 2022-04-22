/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class CM {

    Scanner T = new Scanner(System.in);
    int semilla, cen, IT;
    double r;
    String cadena, cenF = "0";
    char aux;

    public void p() {
        do {

            Scanner T = new Scanner(System.in);
            Scanner T1 = new Scanner(System.in);
            System.out.println("Dame una numero con 4 sifras");
            semilla = T.nextInt();
            System.out.println("Dame iteracciones desea realizar");
            IT = T1.nextInt();

        } while (semilla < 999);
        System.out.println(" ---------- valor valido ---------- ");
        System.out.println(semilla);
    }

    public void Centro() {
        int cont = 0;
        do {

            cont++;
            System.out.println("iteraccion = " + cont);
            System.out.println("---------------------------------------");
            cen = semilla * semilla;
            System.out.println("(" + semilla + ")^2 = " + cen);
            cadena = String.valueOf(cen);
            int L = cadena.length();
            System.out.println("cuenta con  " + L + "  digitos");
            if (L % 2 == 0) {
                if (L == 4) {
                    cadena = "00" + cadena;
                } else {

                }
                //System.out.println("°|°"+cadena);
                // System.out.println("---------------------------------------");
            } else {

                if (L == 3) {
                    cadena = "000" + cadena;
                } else if (L == 2) {
                    cadena = "0000" + cadena;
                } else {
                    cadena = "0" + cadena;
                }

                //System.out.println("°|°"+cadena);
                System.out.println("nueva cadena -- " + cadena);
                //System.out.println("---------------------------------------");
            }
            int L1 = cadena.length();

            if (L1 == 8) {
                for (int i = 2; i <= 5; i++) {
                    aux = cadena.charAt(i);
                    cenF = cenF + aux;
                    //System.out.println("cuando tiene 8 valores ---" + cenF);
                }
            } else if (L1 == 6) {
                for (int i = 1; i <= 4; i++) {
                    //charAt("posicion numerica"); empieza de izq a DERECHA
                    aux = cadena.charAt(i);
                    cenF = cenF + aux;
                    //System.out.println("cuando tiene 6 valores ---" + cenF);
                }
            } else if (L1 == 10) {
                for (int i = 3; i <= 6; i++) {
                    aux = cadena.charAt(i);
                    cenF = cenF + aux;
                    //System.out.println("cuando tiene 8 valores ---" + cenF);
                }
            }
            semilla = Integer.parseInt(cenF);

            System.out.println("***  X = " + semilla + "  R = 0." + semilla + "  ***");
            cenF = "0";
            System.out.println("---------------------------------------");
        } while (cont != IT);
    }

    /*  public void Centro2(){
     int L1 = cadena.length();
     
    if (L1 == 8){
    for(int i= 2; i<=5; i++){
    aux = cadena.charAt(i);
    CF = CF + aux;
    System.out.println("cuando tiene 8 valores ---" + CF);
    }
    }else if(L1 == 6){
     for(int i= 1; i<=4; i++){
    //charAt("posicion numerica"); empieza de izq a DERECHA
     aux = cadena.charAt(i);
    CF = CF + aux;
    System.out.println("cuando tiene 6 valores ---" + CF);
    }
    }
    }*/

    public static void main(String[] args) {
        CM a = new CM();
        a.p();
        System.out.println("---------------------------------------");

        a.Centro();

        System.out.println("---------------------------------------");

    }
}
