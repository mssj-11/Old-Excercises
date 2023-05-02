package CURSO;
import java.util.Arrays;
import java.util.List;

/*
    Estructura de Datos: Array(Coleccion de elementos)
*/

public class Ej16 {
    
    public static void main(String[] args) {
        
        int array1[] = new int[5];
        int array2[] = {1,2,3,4,5,6};
        
        array1[1] = 100;
        array1[2] = 500;
        array1[3] = 10;
        array1[4] = 200;
        array1[0] = 1;
        
        
        System.out.println("****************************************");
        System.out.println("Array 1 en la posicion 4: "+array1[4]);
        System.out.println("Array 1 en la posicion 3: "+array1[3]);
        System.out.println("Array 1 en la posicion 2: "+array1[2]);
        System.out.println("Array 1 en la posicion 1: "+array1[1]);
        System.out.println("Array 1 en la posicion 0: "+array1[0]);
        System.out.println("****************************************");
        System.out.println("Array 2 en la posicion 5: "+array2[5]);
        System.out.println("Array 2 en la posicion 4: "+array2[4]);
        System.out.println("Array 2 en la posicion 3: "+array2[3]);
        System.out.println("Array 2 en la posicion 2: "+array2[2]);
        System.out.println("Array 2 en la posicion 1: "+array2[1]);
        System.out.println("Array 2 en la posicion 0: "+array2[0]);
        System.out.println("****************************************");
        System.out.println("Por ciclo for");
        for (int i = 0; i <array1.length; i++) {
            System.out.println("Array 1 en la posicion "+i+" : "+array1[i]);
        }
        System.out.println("****************************************");
        for (int i = 0; i <array2.length; i++) {
            System.out.println("Array 2 en la posicion "+i+" : "+array2[i]);
        }
        System.out.println("****************************************");
        System.out.println("Por ciclo for-each");
        for (int i : array1) System.out.println(i);
        System.out.println("****************************************");
        for (int i : array2) System.out.println(i);
        System.out.println("****************************************");
        System.out.println("Por Expresion Lambda");
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        nums.forEach(n -> System.out.println(n));
        System.out.println("****************************************");
    }
    
    
    
    
}