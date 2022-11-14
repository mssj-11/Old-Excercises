//  Ejemplo 9: Clase LocalDate (.now(), .isBefore(), .isAfter())
package fechas;

import java.time.LocalDate;
import java.time.Month;

public class Clase_LocalDate {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaAnterior = LocalDate.of(2022, 11, 12);
        
        System.out.println("Fecha Actual: " +fechaActual);
        System.out.println("Fecha Anterior: " +fechaAnterior);
        
        
        //  Comparando fechas
        if(fechaAnterior.isBefore(fechaActual)){
            System.out.println("La fecha ya paso");
        }else{
            System.out.println("Aun faltan dias");
        }
        
        
    }
}