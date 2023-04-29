/*
    *Calculadora basica*
    MENU con opciones para realizar operaciones matematicas basicas.
    1) Suma
    2) Resta
    3) Multiplicacion
    4) Division
    - Y arrojar el resultado de la operacion
    - Si la opcion ingresada no existe, mostrar un mensaje de que no es valida.
*/
package CURSO;
import java.util.Scanner;


/*   Switch-Case   */
public class Ej10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Menu de opciones");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicacion");
        System.out.println("4) Division");
        
        System.out.print("\nIngrese su opcion: ");
        int opcion = sc.nextInt();
        double numero1, numero2, resultado;
        
        
        switch(opcion){
            case 1:
                System.out.print("Ingrese el primer valor: ");
                numero1 = sc.nextDouble();
                System.out.print("Ingrese el segundo valor: ");
                numero2 = sc.nextDouble();
                
                resultado = numero1 + numero2;
                System.out.println("La suma de los numeros es: "+resultado);
            break;
            case 2:
                System.out.print("Ingrese el primer valor: ");
                numero1 = sc.nextDouble();
                System.out.print("Ingrese el segundo valor: ");
                numero2 = sc.nextDouble();
                
                resultado = numero1 - numero2;
                System.out.println("La resta de los numeros es: "+resultado);
            break;
            case 3:
                System.out.print("Ingrese el primer valor: ");
                numero1 = sc.nextDouble();
                System.out.print("Ingrese el segundo valor: ");
                numero2 = sc.nextDouble();
                
                resultado = numero1 * numero2;
                System.out.println("La multiplicacion de los numeros es: "+resultado);
            break;
            case 4:
                System.out.print("Ingrese el primer valor: ");
                numero1 = sc.nextDouble();
                System.out.print("Ingrese el segundo valor: ");
                numero2 = sc.nextDouble();
                
                resultado = numero1 / numero2;
                System.out.println("La division de los numeros es: "+resultado);
            break;
            default:
                System.out.println("Operacion invalida");
        }
        
        
        
        
    }
    
}