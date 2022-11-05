package ejemplos;
//  #4
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class calculadora {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int numero1, numero2;
        System.out.print("Introduzca el primer numero: ");
        
        try{
            numero1 = sc.nextInt();
        }catch(Exception e){
            System.out.print("\nTipo de dato introducido incorrecto \nSe le asignara el valor 1 por defecto");
            numero1 = 1;
        }
        System.out.print("Introduzca el primer numero: ");
        
        try{    numero2 = sc.nextInt();
        }catch(Exception e){
            System.out.print("\nTipo de dato introducido incorrecto \nSe le asignara el valor 1 por defecto");
            numero2 = 1;
        }
        
        
        // Operaciones
        int suma = numero1 + numero2;
        System.out.print("\n\nSuma: " +suma);
        
        int resta = numero1 - numero2;
        System.out.print("\nResta: " +resta);
        
        int multiplicacion = numero1 * numero2;
        System.out.print("\nMultiplicacion: " +multiplicacion);
        
        int division;
        
        
        try{
            division = numero1 / numero2;
            System.out.print("\nDivision: " +division+ "\n");
        }catch(Exception e){
            System.out.println("\nNo se puede realizar la operacion. Division entre 0");
        }
        
        
    }
}