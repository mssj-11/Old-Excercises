/*
    Programa que solicite al usuario que introduzca el numero de alumnos de una clase.
    Usar un bucl y pedir la altura de cada uno de los alumnos. Debe mostrar:
        - Numeros de alumnos con altura mayor a 1,80.
        - Numeros de alumnos con altura menor a 1,80.
        El promedio de alturas de la clase.
 */
package estructuras_control;
//  #9  Altura de Alumnos

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class altura_alumnos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Introduce el numero de alumnos: ");
        int numeroAlumnos = sc.nextInt();
        
        int contadorMayores = 0;
        int contadorMenores = 0;
        
        double suma = 0;
        
        
        //  Pedir la altura de los alumnos
        for(int i=1; i<=numeroAlumnos; i++){
            System.out.print("\nIntroduce la altura del alumno " +i+ ": ");
            double altura = sc.nextDouble();
            
            suma = suma + altura;
            
            if(altura>=1.8){    contadorMayores++;  }
            else{   contadorMenores++;  }
        }
        
        
        // Promedio
        double promedio = suma / numeroAlumnos;
        System.out.println("\nNumero de alumnos con altura mayor a 1.8: "+ contadorMayores);
        System.out.println("Numero de alumnos con altura menor a 1.8: "+ contadorMenores);
        System.out.println("\nPromedio de alturas: " +promedio);
        
    }
}