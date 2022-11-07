//  #10 Estructuras de control repetitivas: BUCLE while
package estructuras_control;

/**
 *
 * @author HP
 */
public class bucle_while {
    public static void main(String[] args) {
        
        int numero = 0;
        boolean existe = true;
        
        while(numero<10 && existe==true){
            System.out.println(numero);
            numero = numero+1;  // 0-9
        }
        
    }
}