/*
    Programa que diga alguna frase dependiendo de su calificacion:
    Si obtuvo menos de 6 "Te falto mas"
    Si obtuvo de 6 hasta menos de 7 "De panzazo"
    Si obtuvo de 7 hasta menos de 8 "Un poco mas"
    Si obtuvo de 8 hasta menos de 9 "Bien, puedes mejorar"
    Si obtuvo de 9 hasta menos de 10 "Muy bien, ya casi lo consigues"
    Si obtuvo de 10 "Excelente, con toda la actitud"
    Si ingresa otro valor que no este definida "No es posible"
 */
package CURSO;

import java.util.Scanner;

/*   Operadores Logicos   */

public class Ej5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa tu calificacion: ");
        double calificacion = sc.nextDouble();
        
        
        if (calificacion < 6) {   System.out.println("Estuviste cerca, Te falto mas");     }
        if (calificacion >=6 && calificacion <=7) {   System.out.println("De panzazo");     }
        if (calificacion >7 && calificacion <=8) {   System.out.println("Un poco mas");     }
        if (calificacion >8 && calificacion <=9) {   System.out.println("Bien, puedes mejorar");     }
        if (calificacion >9 && calificacion <10) {   System.out.println("Muy bien, ya casi lo consigues");     }
        if (calificacion == 10) {   System.out.println("Excelente, con toda la actitud");     }
        if (calificacion <0 || calificacion >10) {   System.out.println("No es posible obtener esa calificacion");     }
        
    }
    
    
    
    
}