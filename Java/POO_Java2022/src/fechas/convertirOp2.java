//  Ejemplo 1:  Convertir String a Date en Java - Formatear Fechas  - Opcion #2
package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author HP
 */
public class convertirOp2 {
    public static void main(String[] args) {
        
        try{
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            // Instanceando la clase - Creando un formateador: Año, Mes, Dia - Hora, Minuto, Segundo
            SimpleDateFormat formato2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            
            // Creando una variable de tipo Dtae
            Date fecha = formato.parse("2022-11-10T14:12:05");
            System.out.println("Fecha: " +formato2.format(fecha));
            
        }catch(ParseException ex){
            Logger.getLogger(convertirOp2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}