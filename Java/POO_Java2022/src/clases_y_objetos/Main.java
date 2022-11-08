// Clase Main
package clases_y_objetos;


public class Main {
    
    public static void main(String[] args) {
        // Creacion del Objeto(op) de la clase Operacion
        Operacion op = new Operacion();
        
        
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();
        
    }
}