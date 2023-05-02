package CURSO;
import java.util.Scanner;
/*
    Programa con un MENU de opciones para seleccionar que operacion desea calcular: Usando Do-While
    1) Suma
    2) Resta
    3) Multiplicacion
    4) Division
    Y finalmente arrojar el resultado de la operacion
 */
public class Ej15 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        
        do {   
            System.out.println("\nMenu de opciones");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Multiplicacion");
            System.out.println("4) Division");
            System.out.println("5) Salir");

            System.out.print("\nIngrese su opcion: ");
            opcion = sc.nextInt();
            double numero1, numero2;


            switch(opcion){
                case 1:
                    System.out.println("SUMA");
                    System.out.print("\nIngresa el primer numero: ");
                    numero1 = sc.nextDouble();
                    System.out.print("Ingresa el segundo numero: ");
                    numero2 = sc.nextDouble();
                    double suma = numero1 + numero2;
                    System.out.println("El resultado es: "+suma);
                break;
                case 2:
                    System.out.println("RESTA");
                    System.out.print("\nIngresa el primer numero: ");
                    numero1 = sc.nextDouble();
                    System.out.print("Ingresa el segundo numero: ");
                    numero2 = sc.nextDouble();
                    double resta = numero1 - numero2;
                    System.out.println("El resultado es: "+resta);
                break;
                case 3:
                    System.out.println("MULTI´PLICACION");
                    System.out.print("\nIngresa el primer numero: ");
                    numero1 = sc.nextDouble();
                    System.out.print("Ingresa el segundo numero: ");
                    numero2 = sc.nextDouble();
                    double multiplicacion = numero1 * numero2;
                    System.out.println("El resultado es: "+multiplicacion);
                break;
                case 4:
                    System.out.println("DIVISION");
                    System.out.print("\nIngresa el primer numero: ");
                    numero1 = sc.nextDouble();
                    System.out.print("Ingresa el segundo numero: ");
                    numero2 = sc.nextDouble();
                    double division = numero1 / numero2;
                    System.out.println("El resultado es: "+division);
                break;
                case 5:
                    System.out.println("Has salido del programa correctamente");
                break;
                default:
                    System.out.println("Opcion incorrecta");
                break;
            }
        } while (opcion != 5);
        
        
    
    }
    
    
    
    
}