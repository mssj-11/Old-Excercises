/*
    *Calculadora de divisas*
    Menu para hacer la conversion de dolares a pesos y de pesos a dolares.
    El usuario debera de elegir la opcion a realizar.
*/
package CURSO;
import java.util.Scanner;

/*   Switch - Case   */
public class Ej9 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("*************************");
        System.out.println("Calculadora de divisas");
        System.out.println("*************************");
        System.out.println("1) Dolares a pesos MXN");
        System.out.println("2) Pesos MXN a Dolares");
        System.out.print("\nIngresa tu opcion: ");
        int opcion = sc.nextInt();
        
        double cantidad;
        double dolar = 1;
        double pesos_mxn = 18;
        
        
        switch(opcion){
            case 1:
                System.out.print("Cantidad de Dolares a convertir: ");
                cantidad = sc.nextDouble();
                cantidad =(cantidad * pesos_mxn)/dolar;
                System.out.printf("El valor en pesos MXN es: %.2f", cantidad);
            break;
            case 2:
                System.out.print("Cantidad de Pesos MXN a convertir: ");
                cantidad = sc.nextDouble();
                cantidad =(cantidad * dolar)/pesos_mxn;
                System.out.printf("El valor en Dolares es: %.2f", cantidad);
            break;
            default:
                System.out.println("La opcion no es valida");
        }
        
        
        
    }
    
}