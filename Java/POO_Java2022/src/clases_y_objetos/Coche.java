//  Creacion de Clases y Objetos
package clases_y_objetos;
//  Ejemplo #1
/**
 *
 * @author HP
 */
// public: Modificadort de Acceso       Coche: Nombre de la clase
public class Coche {    // Clase Coche
    
    // Atributos (Caracteristicas   de la clase Coche)
    String color;
    String marca;
    int km;
    
    
    // Metodo Main
    public static void main(String[] args) {
     
/*  SINTAXIS     Creacion de un Objeto
      N.Clase  N.Objeto    Constructor       */
        Coche coche1 = new Coche();
        
        // Agregando los Atributos de la clase Coche
        coche1.color = "blanco";
        coche1.marca = "Audi";
        coche1.km = 0;
        
        //  Imprimimos la info del Nuevo Objeto
        System.out.println("\nInformacion del Objeto #1"+"\nEl color del coche es: " +coche1.color);
        System.out.println("La marca del coche es: " +coche1.marca);
        System.out.println("El kilometraje del coche es: " +coche1.km);
        
        // Creacion de un seg. Objeto
        Coche coche2 = new Coche();
        
        coche2.color = "Azul";
        coche2.marca = "Ferrari";
        coche2.km = 150;
        
        System.out.println("\nInformacion del Objeto #2"+"\nEl color del coche es: " +coche2.color);
        System.out.println("La marca del coche es: " +coche2.marca);
        System.out.println("El kilometraje del coche es: " +coche2.km);
    }
}