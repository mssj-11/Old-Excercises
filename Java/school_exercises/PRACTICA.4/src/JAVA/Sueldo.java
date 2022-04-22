package JAVA;

import java.io.*;

public class Sueldo {

    public void SUELDO() throws IOException {
        BufferedReader objeto = new BufferedReader(new InputStreamReader(System.in));
        double numper = 0, sueldo = 0, dia = 0;
        String nombre;
        int contador = 0;
        System.out.println("INGRESA EL NUMERO DE EMPLEADOS");
        numper = Double.parseDouble(objeto.readLine());
        while (contador < numper) {
            System.out.println("INTRODUCE EL NOMBRE DEL EMPLEADO:");
            nombre = objeto.readLine();
            System.out.println("INTRODUCE EL SUELDO DEL EMPLEADO:");
            sueldo = Double.parseDouble(objeto.readLine());
            dia = sueldo;
            System.out.println("EL NOMBRE DEL EMPLEADO ES: " + nombre);
            System.out.println("EL SUELDO DEL EMPLEADO ES " + dia);
            dia = dia;
           
            contador++;
        }
    }
}
