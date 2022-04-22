/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distrib;

import java.util.*;

/**
 *
 * @author HP
 */

public class ErlangB_plantilla {	// ErlangB_plantilla: nombre de la clase
    // El fichero donde se guarda este código tiene que tener el mismo nombre que la clase y extensión java (p.e. ErlangB_plantilla.java)

    public static void main(String[] args) {	// Función principal de esta clase, la función que se ejecuta por defecto cuando se lanza el programa compilado
        // DEFINICIÓN DE VARIABLES
        double a, erlangB;	// a: se va a usar para guardar el valor del primer argumento pasado al programa
        // erlangB: se va a usar para guardar el valor de la fórmula B de Erlang
        int k;			// k: se va a usar para guardar el valor del segundo argumento pasado al programa

        // ESTABLECER REGLAS ESCRITURA
        Locale.setDefault(Locale.ENGLISH);	// Esto establece que se use reglas de escritura inglesas, p.e. que los decimales sean con '.'

        // COMPROBAR QUE EL NUMERO DE ARGUMENTOS DE ENTRADA PASADOS AL PROGRAMA SON LOS NECESARIOS
        if (args.length != 2) {			// Sólo se esperan dos argumentos, o sea que si hay menos o más no se ha lanzado correctamente el programa
            // Como se indica en 'main(String[] args)', args es un array de cadenas que guarda cada argumento pasado al programa
            // args.length es el tamaño del array, es decir, el número de argumentos pasados al programa
            // Las posiciones de args van de 0 a args.length-1
            System.out.printf("Necesitas dos argumentos\n");	// Sacar por pantalla el texto "Necesitas dos argumentos"
            // El "\n" indica que después del texto hay que hacer un salto de línea. Por defecto 'System.out.printf' no hace salto de línea después de cada texto
            System.out.printf("java ErlangB <a> <k>\n");		// Sacar por pantalla el texto "java ErlangB <a> <k>"
            return;		// Fin de la función y, como es la función principal, fin del programa
        }

        // COGER ARGUMENTOS DE ENTRADA PASADOS AL PROGRAMA
        a = new Double(args[0]);	// Coger el primer argumento pasado al programa como si fuera un Double y asignarlo a la variable 'a'

        k = new Integer(args[1]);	// Coger el segundo argumento pasado al programa como si fuera un Integer y asignarlo a la variable 'k'

        // COMPROBAR QUE LOS VALORES PASADOS POR LA ENTRADA CUMPLEN LO QUE SE ESPERABA DE ELLOS
        if (a < 0) {	// Si 'a' es menor que 0, entonces valor incorrecto
            System.out.printf("El argumento <a> tiene que ser número real entre 0 e infinito\n");	// Indicar por pantalla el problema
            return;		// Fin de la función y, como es la función principal, fin del programa
        }
        if (k <= 0) {	// Si 'k' es menor o igual que 0, entonces valor incorrecto
            System.out.printf("El argumento <k> tiene que ser número entero mayor que 0\n");	// Indicar por pantalla el problema
            return;		// Fin de la función y, como es la función principal, fin del programa
        }

        //Llamamos a nuestro método para calcular la B de Erlang.
        erlangB = ErlangB(a, k);
        // Sacar por pantalla el valor de la variable 'erlangB' como un número real de 6 decimales '%.6f'
        System.out.printf("%.6f\n", erlangB);
    }

    //Definición de métodos propios.
    private static double ErlangB(double a, int k) {
        //### CALCULO DE LA B DE ERLANG ###//
        double denominador = 0.0, erlangB = 0.0;
        int i;

        // Calcular el denominador, es decir, sumatorio desde i=0 a k de a^i/i!
        // Calcular el valor de la B de Erlang, es decir, a^k/k!/denominador
        // La potencia a^k la podéis calcular con la función Math.pow(a,k)
        // SACAR POR PANTALLA EL RESULTADO
        //System.out.printf("%.6f\n", erlangB);	// Sacar por pantalla el valor de la variable 'erlangB' como un número real de 6 decimales '%.6f'
        return erlangB;
    }

    private static double factorial(int n) {
        double resultado = 0;

        //Caso trivial, factorial de 1.
        //Resto de casos, bucle para calcular el factorial.
        return resultado;	// Salir de la función devolviendo el factorial
    }

}
