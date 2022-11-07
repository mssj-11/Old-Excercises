package estructuras_control;
//  #1  Estructuras de control: if

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class alternativas_if {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer valor: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        int numero2 = sc.nextInt();
        
        // Si las 2 variables son mayor que 0
        if(numero1>0 && numero2>0){
            System.out.println("\nEl valor de las variables SI es mayor que 0");
        }
        // Si NO se cumple la anterior, pero esta si que: n1 es mayor que 0 o que n2 es mayor que 0
        else if(numero1>0 || numero2>0){
            System.out.println("\nEl valor de una de las variables es mayor a 0");
        }
        // Si no
        else{
            System.out.println("\nEl valor de las variables NO es mayor que 0");
        }

        
    }
}