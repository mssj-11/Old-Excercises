package CURSO;

//  Realizar un programa que nos indique si el alumno aprobo o reprobo la materia.
import java.util.Scanner;

/**
 *  //  Sentencia IF
 * @author HP
 */
public class Ej2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("******CALIFICACIONES******");
        System.out.print("Ingresa tu calificacion: ");
        double calificacion = sc.nextDouble();
        
        if(calificacion >= 6)   System.out.println("Has aprobado");
        if(calificacion < 6)    System.out.println("No aprobado");
        
    }
    
}