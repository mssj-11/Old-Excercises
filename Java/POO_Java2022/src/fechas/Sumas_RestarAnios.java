//  Ejemplo 8:  Uso de la Clase LocalDate - Sumar dias, semanas, meses y años
package fechas;

import java.time.LocalDate;

public class Sumas_RestarAnios {
    public static void main(String[] args) {
        
        //  Fecha actual
        /*LocalDate fecha1 = LocalDate.now();
        System.out.println("La fecha actual es: " +fecha1);     */
        
        //  Setear una fecha    -   Establecer una fecha
        LocalDate fecha2 = LocalDate.parse("2022-01-25");
        
        // Realizando comparaciones de fechas
        LocalDate fecha3 = LocalDate.parse("2025-03-25");
        
        // SUMAS
        fecha2 = fecha2.plusDays(5);    // Sumando dias
        fecha2 = fecha2.plusMonths(5);  // Sumando meses
        fecha2 = fecha2.plusYears(5);   // Sumando Años
        
        //  RESTAS
        fecha2 = fecha2.minusDays(5);    // Restando dias
        fecha2 = fecha2.minusMonths(3);  // Restando meses
        fecha2 = fecha2.minusYears(2);   // Restando años
        
        
        
        //  Condicional para comparaciones de FECHAS
        if(fecha3.isAfter(fecha2)){ //  Si la fecha "fecha3" es despues de "fecha2"
            System.out.println("Fecha 3 es mayor a fecha2");
        }
        else if(fecha3.isBefore(fecha2)){ //  Si la fecha "fecha3" es antes de "fecha2"
            System.out.println("Fecha 3 es menor a fecha2");
        }
        else{   //  La fecha es la misma    -    Tambien se puede con(.isEqual)
            System.out.println("Fecha 3 es IGUAL a la fecha2");
        }
        
        System.out.println("\n\nSeteando la fecha2 a (2022-01-25) despues al aplicar sumas y restas la fecha es: " +fecha2);
        System.out.println("El valor de la fecha3 es: " +fecha3);
    }
}