package estructuras_control;
//  #2  Numero negativo y multiplo de 3

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class multiplo_tres {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        
        // Si el numero es < 0 y si es multiplo de 3
        if(numero<0 && numero%3 == 0){
            System.out.println("El numero "+numero+ " es negativo y multiplo de 3");
        }// Si NO
        else{
            System.out.println("El numero "+numero+ " no es negativo ni multiplo de 3");
        }
        
        
    }
}
