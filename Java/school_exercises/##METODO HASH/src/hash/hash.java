package hash;

import java.util.Arrays;
import java.util.Scanner;
import static javafx.application.Platform.exit;

public class hash {

    String arreglo[];
    int tamano, cont;

    public hash(int T) {
        tamano = T;
        arreglo = new String[T];
        Arrays.fill(arreglo, "-1");
    }

    public void funcionH(String[] cadenaArreglo, String[] arreglo) {
        int i;
        for (i = 0; i < cadenaArreglo.length; i++) {
            System.out.println();
            String elemento = cadenaArreglo[i];
            int indiceArreglo = Integer.parseInt(elemento) % 7;
            System.out.println("EL INDICE ES " + indiceArreglo + " PARA EL VALOR " + elemento);
            while (arreglo[indiceArreglo] != "-1") {
                System.out.println();
                indiceArreglo++;
                System.out.println("Colision en " + (indiceArreglo - 1) + " Cambiando a " + indiceArreglo);
                indiceArreglo %= tamano;
            }
            arreglo[indiceArreglo] = elemento;
        }

    }

    public void mostrarT() {
        System.out.println();
        System.out.println("   MOSTRAR  TABLA HASH      ");
        int incremento = 0, i, j;
        for (i = 0; i < 1; i++) {
            incremento += 8;
            for (j = 0; j < 71; j++) {
                System.out.print("__");
            }
            System.out.println();
            for (j = incremento - 8; j < incremento; j++) {
                System.out.format("  | %3s " + "  ", j);
            }
            System.out.println("  |  ");
            for (int n = 0; n < 71; n++) {
                System.out.print("__");

            }
            System.out.println();
            for (j = incremento - 8; j < incremento; j++) {
                if (arreglo[j].equals("-1")) {
                    System.out.print("||       ");
                } else {
                    System.out.format("  | %3s " + "  ", arreglo[j]);
                }
            }
            System.out.println(" | ");
            for (j = 0; j < 71; j++) {
                System.out.print("__");
            }
            System.out.println();
        }
    }

    public String buscar(String elemento) {
        int indiceArreglo = Integer.parseInt(elemento) % 7;
        cont = 0;
        while (arreglo[indiceArreglo] != "-1") {
            if (arreglo[indiceArreglo] == elemento) {
                System.out.println("encontrado el indice y valor " + indiceArreglo + "   " + elemento);
                return arreglo[indiceArreglo];
            }
            indiceArreglo++;
            indiceArreglo %= tamano;
            cont++;
            if (cont > 7) {
                break;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int op;

        hash hash = new hash(8);
        for (int i = 0; i < 6; i++) {
            System.out.println("______________________________________________________________");
            System.out.println("Método de búsqueda Mediante Transformación de Claves (Hashing)");
            System.out.println("______________________________________________________________\n");
            System.out.println("1) Funcion de la tabla hashing");
            System.out.println("2) Mostrar tabla hash");
            System.out.println("3) Buscar en la tabla hashing");
            System.out.println("4) Salir");
            System.out.println("______________________________________________________________");
            op = teclado.nextInt();
            if (op == 1) {
                String elementos[] = {"11", "38", "111", "23", "45", "88", "9", "77"};
                hash.funcionH(elementos, hash.arreglo);
            } else if (op == 2) {

                hash.mostrarT();
            } else if (op == 3) {
                //String G = teclado.next();
                String buscado = hash.buscar("11");

                if (buscado == null) {
                    System.out.println("Elemento no encontrado en la tabla hash");
                }
            } else if (op == 4) {

                exit();

            }
        }

    }

}