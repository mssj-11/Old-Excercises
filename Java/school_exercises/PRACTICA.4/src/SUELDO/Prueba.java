/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SUELDO;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Prueba {

    public static void main(String[] args) {
        boolean v = true;
        while (v) {

            Scanner ent = new Scanner(System.in);
            String Nom = null;
            double Sul = 0;

            Sueldo A = new Sueldo(Nom, Sul);
            Sueldo[] todos = new Sueldo[10];
            int i = 0;

            todos[0] = new Sueldo(Nom, Sul);
            todos[1] = new Sueldo(Nom, Sul);
            todos[2] = new Sueldo(Nom, Sul);
            todos[3] = new Sueldo(Nom, Sul);
            todos[4] = new Sueldo(Nom, Sul);
            todos[5] = new Sueldo(Nom, Sul);
            todos[6] = new Sueldo(Nom, Sul);
            todos[7] = new Sueldo(Nom, Sul);
            todos[8] = new Sueldo(Nom, Sul);
            todos[9] = new Sueldo(Nom, Sul);

            int op = 0, ar = 0;
            System.out.println("\t\033[34m===SUELDO===");
            System.out.println("");
            System.out.println("1.- AGREGAR LOS DATOS");
            System.out.println("2.- IMPRIMIR LOS DATOS AGREGADOS");
            System.out.println("3.- SALIR");
            op = ent.nextInt();

            if (op == 1) {
                System.out.println("INGRESA EL NUMERO DE EMPLEADOS:");
                ar = ent.nextInt();
                for (i = 0; i < ar; i++) {
                    try {
                        System.out.println("INTRODUCE EL NOMBRE DEL EMPLEADO:");
                        Nom = ent.next();
                        System.out.println("INTRODUCE EL SUELDO DEL EMPLEADO:");
                        Sul = ent.nextDouble();

                    } catch (Exception e) {
                        System.out.println("---" + e + "---");
                    }
                }
            } else if (op == 2) {
                try {
                    for (i = 0; i < 14; i++) {
                        System.out.println(i);
                        todos[i].imprimir();
                    }
                } catch (Exception e) {
                    System.out.println(" ------" + e + "------- ");
                }
            } else {
                v = false;
            }

        }

    }
}
