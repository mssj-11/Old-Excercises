package arboles;

import java.util.Scanner;

public class Arboles {

    class Nodo {

        int informacion;
        String nombre;
        Nodo izquierda, derecha;
    }

    Nodo raiz;

    public Arboles() {
        raiz = null;
    }

    public void Insertar(int informacion, String nombre) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.informacion = informacion;
        nuevo.nombre = nombre;
        nuevo.derecha = null;
        nuevo.izquierda = null;

        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo anterior = null, recorrido;
            recorrido = raiz;
            while (recorrido != null) {
                anterior = recorrido;
                if (informacion < recorrido.informacion) {
                    recorrido = recorrido.izquierda;
                } else {
                    recorrido = recorrido.derecha;
                }
            }
            if (informacion < anterior.informacion) {
                anterior.izquierda = nuevo;
            } else {
                anterior.derecha = nuevo;
            }

        }
    }

    private void Preorden(Nodo recorrido) {
        if (recorrido != null) {
            System.out.print("[ " + recorrido.informacion + " - " + recorrido.nombre + " ] --> ");
            Preorden(recorrido.izquierda);
            Preorden(recorrido.derecha);

        }

    }

    public void Preorden() {
        Preorden(raiz);
        System.out.println();
    }

    private void Inorden(Nodo recorrido) {
        if (recorrido != null) {
            Inorden(recorrido.izquierda);
            System.out.print("[ " + recorrido.informacion + " - " + recorrido.nombre + " ] --> ");
            Inorden(recorrido.derecha);

        }
    }

    public void Inorden() {
        Inorden(raiz);
        System.out.println();

    }

    private void Posorden(Nodo recorrido) {
        if (recorrido != null) {
            Posorden(recorrido.izquierda);
            Posorden(recorrido.derecha);
            System.out.print("[ " + recorrido.informacion + " - " + recorrido.nombre + " ] --> ");
        }
    }

    public void Posorden() {
        Posorden(raiz);
        System.out.println();
    }

    // metodo para buscar nodo en el arbol
    public String buscar(int num) {
        if (buscar(this.raiz, num) == true) {
            return "Se ecnontro el número " + num + " en el arbol";
        } else {
            return "No se encontro el número " + num + "en el arbol";//aqui retorna falso
        }
    }

    private boolean buscar(Nodo n, int num) { 
        if (n != null) {
            if (n.informacion == num) {
                return true;
            }
            boolean bus1 = buscar(n.izquierda, num);
            boolean bus2 = buscar(n.derecha, num);
            if ((bus1 == true) || (bus2 == true)) {
                return true;
            }
        }
        return false;
    }
    //*/

    public static void main(String[] args) {
        Arboles arbol = new Arboles();
        Scanner op = new Scanner(System.in);
        String nom;
        int dato;
        boolean j = true;

        do {
            Scanner info = new Scanner(System.in);
            Scanner info2 = new Scanner(System.in);

            int opcion;

            System.out.println("\033[34m__________________________\n");
            System.out.println("\t\033[31m Arboles ");
            System.out.println("\033[34m__________________________\n");
            System.out.println("\033[31m (1) Insertar Dato");
            System.out.println("\033[31m (2) Mostrar en Pre-Orden");
            System.out.println("\033[31m (3) Mostrar en In-Orden");
            System.out.println("\033[31m (4) Mostrar en Pos-Orden");
            System.out.println("\033[31m (5) Buscar");
            System.out.println("\033[31m (6) Salir");
            System.out.println("\033[34m__________________________");
            System.out.println("\n\033[34m Ingrese opcion: ");
            opcion = op.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\033[34m Ingrese el Nombre: ");
                    nom = info.nextLine();
                    System.out.print("\033[34m Ingrsese el numero: ");
                    dato = info.nextInt();

                    arbol.Insertar(dato, nom);

                    break;
                case 2:

                    System.out.println("\033[34m Mostrando datos en Pre-orden\n");
                    arbol.Preorden();
                    break;
                case 3:

                    System.out.println("\033[34m Mostrando datos en In-orden \n");
                    arbol.Inorden();
                    break;
                case 4:

                    System.out.println("\033[34m Mostrando datos en Pos-orden\n");
                    arbol.Posorden();
                    break;

                case 5:
                    int bus;
                    String n;
                    System.out.println("Ingresar el número a buscar: ");
                    bus = info.nextInt();
                    n = info2.nextLine();
                    arbol.buscar(bus);

                    System.out.println("" + arbol.buscar(bus));
                    break;
                //*/
                case 6:
                    j = false;
                    break;

                default:
                       System.err.println("\033[34m Opcion desconcida");
                    break;
                    
            }

        } while (j == true);

    }

}
