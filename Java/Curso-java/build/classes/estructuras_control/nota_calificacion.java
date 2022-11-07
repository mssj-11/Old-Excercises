/*
 * Programa que lea una nota numerica y devuelva la calificacion a la que corresponde, sabiendo que:
    * 0 <= nota <3: Muy deficiente
    * 3 <= nota <5: Insuficiente
    * 5 <= nota <6: Suficiente
    * 6 <= nota <7: Bien
    * 7 <= nota <9: Notable
    * 9 <= nota <=10: Sobresaliente
 * 
 */
package estructuras_control;
//  #3  Nota de calificacion FINAL
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class nota_calificacion {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Indroduce tu nota: ");
        double nota = sc.nextDouble();
        
        if(nota>=0 && nota<3){  System.out.println("\nMuy deficiente");  }
        else if(nota>=3 && nota<5){ System.out.println("\nInsuficiente"); }
        else if(nota>=5 && nota<6){ System.out.println("\nSuficiente"); }
        else if(nota>=6 && nota<7){ System.out.println("\nBien"); }
        else if(nota>=7 && nota<9){ System.out.println("\nNotable"); }
        else if(nota>=9 && nota<=10){ System.out.println("\nSobresaliente"); }
        else{   System.out.println("NOTA NO VALIDA");   }
        
    }
    
}