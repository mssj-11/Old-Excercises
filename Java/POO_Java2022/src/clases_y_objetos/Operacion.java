/*  #2 Creacion de Metodos
    Un metodo es una accion o comportamiento de los objetos
*/
package clases_y_objetos;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Operacion {
    
    // Atributos
    int numero1;
    int numero2;
    int suma, resta, multiplicacion, division;
    
    // Metodo leerNumeros()      -     Para pedirle al usuario que ingrese 2 numero
// public: Modificador de Acceso   void: valor de retorno   leerNumeros: Nombre del metodo   (   ): Argumentos(parametros) del metodo
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
    }
    
    // Metodo sumar() 
    public void sumar(){    suma = numero1 + numero2;   }
    
    // Metodo restar() 
    public void restar(){   resta = numero1 - numero2;   }
    
    // Metodo multiplicar() 
    public void multiplicar(){  multiplicacion = numero1 * numero2; }
    
    // Metodo dividir() 
    public void dividir(){  division = numero1 / numero2;   }
    
    
    // Metodo Mostrar Resultados
    public void mostrarResultados(){
        System.out.println("La suma es: " +suma);
        System.out.println("La resta es: " +resta);
        System.out.println("La multiplicacion es: " +multiplicacion);
        System.out.println("La division es: " +division);
    }
    
// Seguir con la clase Main  y Crear-Instanciar   la clase Operacion
    
    
}