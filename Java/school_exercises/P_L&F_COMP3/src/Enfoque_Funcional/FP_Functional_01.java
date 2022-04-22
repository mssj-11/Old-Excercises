package Enfoque_Funcional;

import java.util.List;

/* Functional Approach [Enfoque Funcional] */
public class FP_Functional_01 {

    public static void main(String[] args) {
        //lista de arreglo para almacenar datos del mismo tipo
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);// METODO of: sirve para especificar varios elementos a la hora de declarar una colección
        /*//OTRA MANERA DE REALIZAR EL PASO ANTERIOS
        List<Integer> numbers = new ArrayList<Integer>(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));*/
        //invocando los metodos
        System.out.println("Usando para --> [System.out::print] por default");
        printAllNumbersInListFunctional_Two(numbers);
        System.out.println("\nprintAllNumbersInListFunctional: ");
        printAllNumbersInListFunctional(numbers);
        System.out.println("\nprintEvenNumbersInListFunctional: ");
        printEvenNumbersInListFunctional(numbers);
        System.out.println("\nprintSquaresOfEvenNumberInListFunctional: ");
        printSquaresOfEvenNumberInListFunctional(numbers);
        System.out.println("");
    }

    private static void print(int number) { //metodo en el que se imprimiran los datos 
        System.out.println(number + ", ");//impresion de los numeros
    }

    private static boolean isEven(int number) {//Metodo isEven
        return (number % 2 == 0);//devuelve verdadero si el número es divisible por 2 y devuelve falso si no es divisible por 2
    }

    private static void printAllNumbersInListFunctional_Two(List<Integer> numbers) {//sobrescribiendo el metodo -> printAllNumbersInListFunctional
        //¿qué hacer?
        numbers.stream().forEach(System.out::print); //convertir a flujo --> referencia de método
        System.out.println("");
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        //¿qué hacer?
        numbers.stream().forEach(FP_Functional_01::print); //convertir a flujo --> referencia de método
        System.out.println("");
    }

    //number --> number % 2 == 0 
    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        //¿qué hacer?    Filter = solo permite números pares
        numbers.stream().filter(FP_Functional_01::isEven).forEach(FP_Functional_01::print); //convertir a flujo --> referencia de método
        System.out.println("");
    }

    private static void printSquaresOfEvenNumberInListFunctional(List<Integer> numbers) {
        numbers.stream() //convertir a flujo de datos (Stream : etapas de un proceso, nos permite utilizar las funciones Map y reduce sus procesos)
                .filter(number -> number % 2 == 0) //Expresion Lambda (Filter: crea un nuevo array con todos los elementos que cumplan la condición implementada por la función dada)
                .map(number -> number * number) //Lambda --> mapping  = x -> x*x (Map: crea un nuevo array con los resultados de la llamada a la función indicada aplicados a cada uno de sus elementos)
                .forEach(FP_Functional_01::print); //convertir a flujo --> referencia de método (forEach: ejecuta la función indicada una vez por cada elemento del array)
        System.out.println("");
    }
}
