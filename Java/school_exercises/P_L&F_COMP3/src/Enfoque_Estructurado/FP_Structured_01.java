package Enfoque_Estructurado;

import java.util.List;
/* Structured Approach [Enfoque Estructurado] */
public class FP_Structured_01 {

    public static void main(String[] args) {
        //lista de arreglo para almacenar datos del mismo tipo
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        /*//OTRA MANERA DE REALIZAR EL PASO ANTERIOS
        List<Integer> numbers = new ArrayList<Integer>(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));*/
        //invocando los metodos
        FP_Structured_01.printAllNumbersInListStructured(numbers);
        System.out.println("");
        FP_Structured_01.printEvenNumbersInListStructured(numbers);
        System.out.println("");
        //Invocando los metodos con la lista de numeros en el arreglo
        printAllNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println("");
        printEvenNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println("");//salto
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        //¿Cómo hacer un bucle con los números?
        for (int number : numbers) {
            System.out.println(number + ", ");
        }
        System.out.println("");//salto
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {//Metodo printEvenNumbersInListStructured
        //¿Cómo hacer un bucle con los números?
        for (int number : numbers){  //metdodo for loop
            if (number % 2 == 0) {//devuelve verdadero si el número es divisible por 2 y devuelve falso si no es divisible por 2
                System.out.println(number + ", "); //imprime el numero
            }
        }
        System.out.println("");//salto
    }
}
