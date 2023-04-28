package CURSO;
import java.util.Scanner;

/*
Programa que solicite ingresar una edad a el usuario y le muestre un mensaje en funcion a ello, los rangos de edad son:
    - Si tiene de 1-10: "Eres un niño"
    - Si tiene de 11-17: "Eres un adolescente"
    - Si tiene de 18-30: "Eres un adulto"
    - Si tiene de 31-80: "Eres mi abuelito?"
Fuera de estos valores mandar un mensaje "No es posible que tengas esta edad"
*/
/**
 *  //  Operadores logicos
 * @author HP
 */
public class Ej4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("*****EDADES*****");
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        
        
        if(edad >= 1 && edad <= 10)    System.out.println("Eres un niño");
        if(edad >= 11 && edad <= 17)    System.out.println("Eres un adolescente");
        if(edad >= 18 && edad <= 30)    System.out.println("Eres un adulto");
        if(edad >= 31 && edad <= 80)    System.out.println("Eres mi abuelito?");
        
        if(edad < 0 || edad > 80)    System.out.println("No es posible que tengas esta edad");
        
        
    }
}