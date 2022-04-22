/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISTADOBLE;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Control id = new Control();
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String edad;
        String direccion;
        String email;
        String telefono;

        int salir = 1;
        do {
            int j;
            Scanner u = new Scanner(System.in);
            System.err.println("\t---------------------");
            System.err.println("\t\033[34m| :: LISTA DOBLE :: |");
            System.err.println("\t---------------------\n");
            System.err.println("*****************************************");
            System.err.println("* 1) Insertar al inicio                 *");
            System.err.println("* 2) Insertar al final                  *");
            System.err.println("* 3) Mostar ascendente                  *");
            System.err.println("* 4) Mostrar descendente                *");
            System.err.println("* 5) Extraer elemento del inicio        *");
            System.err.println("* 6) Extraer elemento del final         *");
            System.err.println("* 7) Buscar elemento dentro de la lista *");
            System.err.println("* 8) \033[31mSalir                              *");
            System.err.println("*****************************************");
            System.err.println("\nIngrese una opcion:  ");
            j = u.nextInt();

            switch (j) {
                case 1:
                    System.err.println("Ingrese el nombre: ");
                    nombre = teclado.nextLine();
                    System.err.println("Ingrese Su edad: ");
                    edad = teclado.nextLine();
                    System.err.println("Ingrese la Direccion: ");
                    direccion = teclado.nextLine();
                    System.err.println("Ingrese su Email: ");
                    email = teclado.nextLine();
                    System.err.println("Ingrese el Telefono: ");
                    telefono = teclado.nextLine();
                    id.insertarInicio(nombre, edad, direccion, email, telefono);
                    break;
                case 2:
                    System.err.println("Ingrese el nombre: ");
                    nombre = teclado.nextLine();
                    System.err.println("Ingrese Su edad: ");
                    edad = teclado.nextLine();
                    System.err.println("Ingrese la Direccion: ");
                    direccion = teclado.nextLine();
                    System.err.println("Ingrese su Email: ");
                    email = teclado.nextLine();
                    System.err.println("Ingrese el Telefono: ");
                    telefono = teclado.nextLine();
                    id.insertarFin(nombre, edad, direccion, email, telefono);

                    break;
                case 3:
                    System.out.println("\033[39m------------------------------------------------------");
                    id.mostrarAscendente();
                    System.out.println("\033[39m------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("\033[39m------------------------------------------------------");
                    id.mostarDescendente();
                    System.out.println("\033[39m------------------------------------------------------");
                    ;
                    break;
                case 5:
                    id.extraerInicio();
                    break;
                case 6:
                    id.extraerFin();
                    break;
                case 7:
                    System.err.println("Elemento a buscar: ");
                    nombre = teclado.nextLine();
                    id.buscar(nombre);
                    if (id.buscar(nombre) == true) {
                        System.out.println("Elemento encontrado");
                    } else {
                        System.out.println("No se encontro el elemento");
                    }

                    break;
                case 8:
                    salir = 2;
                    break;
                default:
                    System.out.println("Opcion incorrecta");

            }

        } while (salir == 1);

    }

}
