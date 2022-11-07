package estructuras_control;
//  #5  Estructura de control alternativa: BLOQUE switch

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class estructura_switch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un numero: ");
        int numero = sc.nextInt();
        
        // Evaluando el valor de la variable NUMERO
        switch(numero){
            case 1:{
                System.out.println("El numero es 1");
                break;  }
            
            case 2:{
                System.out.println("El numero es 2");
                break;  }
            
            case 3:{
                System.out.println("El numero es 3");
                break;  }
            
            default:{
                System.out.println("El numero no es 1, ni 2, ni 3");
                break;  }
        }
        
        
        
    }
}