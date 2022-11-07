/*
    Pedir un numero y mostrar el dia de la semana que equivale.
    Si se ingresa un numero fuera del rango valido (1-7), se debe de mostrar un mensaje de ERROR.
 */
package estructuras_control;
//  #6  Dias de la semana

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class dias_semana {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero correspondiente a 1 dia de la semana: ");
        int dia = sc.nextInt();
        
        // Evaluando el valor del numero(DIA)
        switch(dia){
            case 1:{
                System.out.println("Es el dia LUNES");
                break;  }
            
            case 2:{
                System.out.println("Es el dia MARTES");
                break;  }
            
            case 3:{
                System.out.println("Es el dia MIERCOLES");
                break;  }
            
            case 4:{
                System.out.println("Es el dia JUEVES");
                break;  }
            
            case 5:{
                System.out.println("Es el dia VIERNES");
                break;  }
            
            case 6:{
                System.out.println("Es el dia SABADO");
                break;  }
            
            case 7:{
                System.out.println("Es el dia DOMINGO");
                break;  }
            
            default:{
                System.out.println("DIA INCORRECTO");
                break;  }
        }
        
        
        
    }
}