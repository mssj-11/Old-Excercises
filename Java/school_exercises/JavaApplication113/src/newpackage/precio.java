package newpackage;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class precio{
   public static void main(){
       int precio,preciot;
       Scanner teclado = new Scanner (System.in);
       System.out.println("Escribe el precio");
       precio = teclado.nextInt();
          if (precio > 100){
           precio = (int) (precio + (precio *0.15));
        }
       System.out.println("El precio total es: "+precio);
         
           
    }
}
