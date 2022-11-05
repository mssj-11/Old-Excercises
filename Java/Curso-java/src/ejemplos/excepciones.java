package ejemplos;
//  #3
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class excepciones {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Introduzca un numero entero: ");
        //int numero = sc.nextInt();
        
        //Ejemplo TRY CATCH
        int num;
        try{
            num = sc.nextInt();
        }catch(Exception ex){
            num = 0;
        }
            System.out.println("\nEl numero es: " +num);
        
        
    }
    
}
