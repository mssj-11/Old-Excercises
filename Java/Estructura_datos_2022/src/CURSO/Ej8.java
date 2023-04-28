/*
    Programa con un MENU de opciones para seleccionar que operacion desea calcular:
    1) Suma
    2) Resta
    3) Multiplicacion
    4) Division
    Y finalmente arrojar el resultado de la operacion
 */
package CURSO;

import java.util.Scanner;

/*   If Anidado   */
public class Ej8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Menu de opciones");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicacion");
        System.out.println("4) Division");
        
        System.out.print("\nIngrese su opcion: ");
        int opcion = sc.nextInt();
        
        
        if (opcion <=0 || opcion >4) {
            System.out.println("Opcion incorrecta");
        }else{
            System.out.print("\nIngresa el primer numero: ");
            double numero1 = sc.nextDouble();
            System.out.print("Ingresa el segundo numero: ");
            double numero2 = sc.nextDouble();
            /*  OPERACIONES    */
            double suma = numero1 + numero2;
            double resta = numero1 - numero2;
            double multiplicacion = numero1 * numero2;
            double division = numero1 / numero2;
            
            if(opcion == 1)
                System.out.println("El resultado es: "+suma);
            else if(opcion == 2)
                System.out.println("El resultado es: "+resta);
            else if(opcion == 3)
                System.out.println("El resultado es: "+multiplicacion);
            else if(opcion == 4)
                System.out.println("El resultado es: "+division);
        }
        
        
        
    }
    
    
    
}