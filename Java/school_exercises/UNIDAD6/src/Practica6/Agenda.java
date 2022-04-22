
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class Agenda {

    int opcion;
    String option;

    public void Muestra() {

        do {
            Scanner Scan = new Scanner(System.in);
            Scanner Scan2 = new Scanner(System.in);

            System.out.println("\t\033[34m===== Agenda =====");
            System.out.println("");
            System.out.println("\033[31m>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("1.-) Agregar Contacto ");
            System.out.println("");
            System.out.println("2.-) Contactos Dentro De La Agenda ");
            System.out.println("\033[31m<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

            System.out.println("");
            System.out.println("");
            this.opcion = Scan.nextInt();

            if (opcion == 1) {

                Contacto n1 = new Contacto();
                n1.Escritura2();

            } else if (opcion == 2) {

                Contacto n1 = new Contacto();
                n1.Lectura2();
            } else {

                System.out.println("Esta opcion no existe");
            }
            System.out.println("");
            System.out.println("\t\033[34mAhora........");
            System.out.println("\033[34m¿Que Es Lo Que Deseas?");
            System.out.println("");
            System.out.println("1.-) Continuar y Volver al Menu");
            System.out.println("2.-) Salir");
            this.option = Scan2.nextLine();

        } while ("1".equals(this.option));

    }

    public static void main(String[] args) {

        Contacto nuevo = new Contacto();
        Agenda ag = new Agenda();

        nuevo.Escritura();
        ag.Muestra();

    }
}
