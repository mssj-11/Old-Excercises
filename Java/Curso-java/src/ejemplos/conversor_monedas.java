package ejemplos;
//  #1
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class conversor_monedas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Introduzca los pesos MXN: ");
        double pesosMX = sc.nextDouble();
        
        double dolares = pesosMX * 20;
        System.out.print("\nEl valor en dolar es de: " +dolares+ "\n");
    }
}