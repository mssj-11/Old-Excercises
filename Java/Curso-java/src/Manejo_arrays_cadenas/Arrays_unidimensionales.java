//    Ejemplo 7:    Arrays Unidimensionales
package Manejo_arrays_cadenas;
public class Arrays_unidimensionales {
    public static void main(String[] args) {
        
        int a = 5;
        int[] array = new int[10];  //  10 numeros enteros
        String[] array_cadenas = new String[5]; //  5 cadenas
        double[] decimales = {5.5, 11.11, 56.1, -7.32};
        
        
        decimales[0] = 55.11;
        System.out.println("Tipo decimal en la posicion 0 es: " +decimales[0]);
        
        System.out.println("\nEl tamaño del Array de cadenas es: " +array_cadenas.length);
        
        
        System.out.println("\nRecorrido de un array");
        //  Recorrido de un array
        for(int i=0; i<decimales.length; i++){
            System.out.println(decimales[i]);
        }
        
    }
}