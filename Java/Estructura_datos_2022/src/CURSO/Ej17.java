package CURSO;
import java.util.Scanner;
/*
    Media y Desviacion estandar de un conjunto de datos
*/
public class Ej17 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Media y Desviacion Estandar");
        System.out.print("Cantidad de valores: ");
        int total_datos = sc.nextInt();
        System.out.println();
        double suma = 0;
        
        
        double[] valores = new double[total_datos];
        
        for (int i = 0; i < total_datos; i++) {
            System.out.print("Dar el valor de "+(i+1)+" : ");
            double aux = sc.nextDouble();
            
            valores[i] = aux;
            suma += aux;
        }
        
        
        
        //  MEDIA
        double media = suma/total_datos;
        //  Suma en la Desviacion
        double sumaDesviacion = 0;
        
        for (int i = 0; i < valores.length; i++) {
            sumaDesviacion += Math.pow(valores[i] - media, 2); //Al cuadrado
        }
        
        //  Desviacion
        double desviacion = Math.sqrt(sumaDesviacion/total_datos); //Raiz Cuadrada
        System.out.println("\nLa media es: "+media);
        System.out.printf("La Desviacion Estandar es: %.2f ",desviacion);
        System.out.println();
    }
    
    
    
}