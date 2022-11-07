//  Mostrar por pantalla todos los multiplos de 5 entre 1 y 100
package estructuras_control;

//  #8  Multiplo de 5 entre 1 y 100

/**
 *
 * @author HP
 */
public class multiplo_cinco {
    public static void main(String[] args) {
        
        // Mostrara valores de 5 en 5 hasta el 100
        
        /*  FORMA #1
        for(int i=5; i<=100; i=i+5){
            System.out.println(i);
        }*/
        
        
        // FORMA #2
        for(int i=1; i<=100; i++){
            if(i%5 == 0){
                System.out.println(i);
            }
        }
        
        
    }
}