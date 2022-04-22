/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Consola;

/**
 *
 * @author Nuvia
 */
import java.io.*;
public class Cript {


    public static void main(String[] args) {
        boolean s= true;
        while (s){
            System.out.println("Que desea hacer: ");
            System.out.println("0. terminar  ");
            System.out.println("1. Encriptar ");
            System.out.println("2. Desencriptar ");
            int op = Leer.datoInt();
            switch (op){
                case 0:
                    s = false;
                    break;
                case 1:
                    System.out.println("Digite el texto a encriptar");
                    String Tex = Leer.dato();
                    String TexC = Cript(Tex);
                    System.out.println("Texto encriptado:  ");
                    System.out.println(TexC);
                    break;
                case 2:
                    System.out.println("Digite el texto a desencriptar");
                    Tex = Leer.dato();
                    TexC = deCript(Tex);
                    System.out.println("Texto desencriptado:  ");
                    System.out.println(TexC);
                    break;
            }
        }
    }
    public static String  Cript(String T){
        String TC ="";
        String Alfa = "abcdefghijklmnñopqrstuvwxyz=% @";
        System.out.println("Digite palabra clave");
        String pal = Leer.dato();
        int []t = new int[T.length()];// se almacenan los datos numericos de la palabra a encriptar
        int [] pa = new int [T.length()]; // Se almacenan los datos numericos de la palabra clave 
        int [] cri = new int [T.length()]; // se almacenan los datos numericos de la palabra encriptada
        for (int i = 0 ; i < t.length; i ++){
            t[i] = Alfa.indexOf(T.substring(i, i+1));
            pa[i] = Alfa.indexOf(pal.substring(i%pal.length(),(i%pal.length())+1));
            cri[i] = (t[i]+ pa[i]) % Alfa.length();
            TC = TC + Alfa.substring(cri[i], cri[i]+1);
        }
        return TC;
    }
    public static String deCript(String T){
        String Dc = "";
        String Alfa = "abcdefghijklmnñopqrstuvwxyz=% @";
        System.out.println("Digite palabra clave");
        String pal = Leer.dato();
        int []t = new int[T.length()];// se almacenan los datos numericos de la palabra  encriptada
        int [] pa = new int [T.length()]; // Se almacenan los datos numericos de la palabra clave 
        int [] cri = new int [T.length()]; // se almacenan los datos numericos de la palabra desencriptada
        int n;
        for (int i = 0 ; i < t.length; i ++){
            t[i] = Alfa.indexOf(T.substring(i, i+1));
            pa[i] = Alfa.indexOf(pal.substring(i%pal.length(),(i%pal.length())+1));
            n = (t[i]- pa[i]);
            if (n< 0 ){n = Alfa.length()+n;}
            cri[i] = n% Alfa.length();
            Dc = Dc + Alfa.substring(cri[i], cri[i]+1);
        }
        return Dc;
    }
    
}