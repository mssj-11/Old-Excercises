//  Ejemplo 1:  Convertir String a Date en Java - Formatear Fechas
package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author HP
 */
public class Convertir {
    public static void main(String[] args) {
        
        try{
            // Instanceando la clase - Creando un formateador: Año, Mes, Dia - Hora, Minuto, Segundo
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

            // Creando una variable de tipo Dtae
            Date fecha = formato.parse("2022/11/10 14:12:05");
            System.out.println("Fecha: " +fecha);
            
        }catch(ParseException ex){
            Logger.getLogger(Convertir.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}