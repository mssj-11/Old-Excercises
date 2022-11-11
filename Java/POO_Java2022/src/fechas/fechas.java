//  Ejemplo 2:  Manejo de fechas (Dtae y Calendar)
package fechas;

import java.util.Date;

/**
 * @author HP
 */
public class fechas {
    public static void main(String[] args) {
        
    // Clase Date   - Creacion de una Nueva instancia de la clase Dtae
        Date fecha = new Date();
        
        int anio = fecha.getYear();
        int month = fecha.getMonth();
        int day = fecha.getDate();
        
        System.out.println(anio + 1900);
        System.out.println(month);
        System.out.println(day);
        
        
    }
}