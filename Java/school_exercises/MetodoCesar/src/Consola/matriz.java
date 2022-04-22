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
public class matriz {
    public static void main(String[] args) {
        String sCadena = "ogidoCeDaeniL";
        String sCadenaInvertida = "";
        
        for (int x=sCadena.length()-1;x>=0;x--)
		sCadenaInvertida = sCadenaInvertida + sCadena.charAt(x);
        System.out.println(sCadenaInvertida);
    }
}
