//  Ejemplo 7: Dias Transcurridos entre 2 fechas
package fechas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

/**
 * @author HP
 */
public class Dias_transcurridos {
    public static void main(String[] args) {
        
        LocalDate f_inicial = LocalDate.parse("2022-01-01");
        LocalDate f_final = LocalDate.parse("2022-11-11");
        
        Duration duracion = Duration.between(f_inicial.atStartOfDay(), f_final.atStartOfDay());
        System.out.println("Dias transcurridos: " + duracion.toDays() + " dias");
        
        Period periodo = Period.between(f_inicial, f_final);
        System.out.println("Dias transcurridos: " + periodo.getDays());
        System.out.println("Meses transcurridos: " + periodo.getMonths());
        System.out.println("Años transcurridos: " + periodo.getYears());
    }
}