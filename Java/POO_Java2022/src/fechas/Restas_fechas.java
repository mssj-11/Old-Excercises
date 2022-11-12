//  Ejemplo 6: Restar Fechas - Calcular dias entre dos fechas
package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author HP
 */
public class Restas_fechas {
    public static void main(String[] args) {
        
        try {
            SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
            
            Date fecha_inicio = fecha.parse("11/11/2022");
            Date fecha_final = fecha.parse("31/12/2022");
            // Tiempo Transcurrido 
            long tt = fecha_final.getTime() - fecha_inicio.getTime();
            
            TimeUnit unidad = TimeUnit.DAYS;    // Unidad en dias
            
            long dias = unidad.convert(tt, TimeUnit.MILLISECONDS);   // Conversion a milisegundos
            System.out.println("Los dias faltantes son: " +dias+ " dias");
            
        } catch (ParseException ex) {
            Logger.getLogger(Restas_fechas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}