//  Ejemplo 9: Clase LocalDate (.now(), .isBefore(), .isAfter())
package fechas;

import java.time.LocalDate;

public class Clase_LocalDate {
    public static void main(String[] args) {
        
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaAnterior = LocalDate.of(2022, 11, 12);
        LocalDate fechaPago = LocalDate.of(2022, 11, 22);
        
        System.out.println("Fecha Actual: " +fechaActual);
        System.out.println("Fecha Anterior: " +fechaAnterior);
        
        
        
        //  Comparando fechas
        if(fechaPago.isBefore(fechaActual)){    // Si es anterior
            System.out.println("La fecha ya paso");
        }else{
            System.out.println("Aun faltan dias");
        }
        
        
        // Si es posterior
        if(fechaPago.isAfter(fechaActual)){
            System.out.println("Aun faltan dias");
        }else{
            System.out.println("La fecha ya paso");
        }
        
        
    }
}