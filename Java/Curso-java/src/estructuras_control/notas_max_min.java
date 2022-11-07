/*
    Leer notas entre 0 y 10 hasta que haya una nota NO valida.
    Mostrar la n ota mas alta y la mas baja.
 */
package estructuras_control;
//  #2  Notas maxima y minima

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class notas_max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Introduce una nota: ");
        double nota = sc.nextDouble();
        
        
        double notaMayor = -1;
        double notaMenor = 11;
        
        
        while(nota>0 && nota<=10){
            
            if(nota > notaMayor)    {
                notaMayor = nota;   }
            
            if(nota < notaMenor)    {
                notaMenor = nota;   }
              
            
            System.out.print("Introduce una nota: ");
            nota = sc.nextDouble();
        }
        
        
        System.out.println("\nLa nota mayor es: " +notaMayor);
        System.out.println("La nota menor es: " +notaMenor);
        
    }
}