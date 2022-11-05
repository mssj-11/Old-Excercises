package ejemplos;
//  #2
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class area_triangulo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Introduzca la base del triangulo: ");
        double base = sc.nextDouble();
        
        System.out.print("Introduzca la altura del triangulo: ");
        double altura = sc.nextDouble();
        
        
        double area = (base * altura) / 2;
        System.out.println("\nEl area del triangulo es: " +area);
        
    }
    
}