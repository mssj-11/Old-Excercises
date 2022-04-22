package banco;

public class SystemBanc {

    private static final EntradaDatos entrada = new EntradaDatos();

    private static void mostrarLongitudes(Banco banco[]) {
        for (Banco item : banco) {
            int tam_buf = item.getTotalClientes();
            System.out.println("\t--> Del País " + item.getNombrePais() + ", existen " + tam_buf + " clientes.");
        }
    }

    private static void imprimirTodo(Banco banco[]) {
        for (int i = 0; i < banco.length; i++) {
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            banco[i].printTodosClientes(i);
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------");
    }

    private static void imprimirSoloOcupados(Banco banco[]) {
        int contador = 0;
        for (int i = 0; i < banco.length; i++) {
            if (banco[i].printSoloOcupados(i)) {
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("\t\t ---> No existen clientes que mostrar...");
        }
    }

    private static void introducirPaises(Banco banco[]) {
        for (int i = 0; i < banco.length; i++) {
            String mensaje = "Introduce el nombre del País " + i + ": ";
            String pais = SystemBanc.pedirNombrePais(i, mensaje, banco);
            mensaje = "\tIntroduce el total de clientes del pais " + pais + ": ";
            banco[i] = new Banco(pais, SystemBanc.validarRango(1, 10, mensaje));
        }
    }

    public static int validarRango(int inicio, int fin, String mensaje) {
        int numero = entrada.entero(mensaje);
        while (numero < inicio || numero > fin) {
            if (numero < inicio || numero > fin) {
                System.out.println("\t\tNo esta dentro del Rango...");
                System.out.println("\t\t\t--> El rango va de " + inicio + " a " + fin);
            }
            numero = entrada.entero(mensaje);
        }
        return numero;
    }

    private static boolean hayVacioTodaEstructura(Banco[] banco) {
        boolean hayLugar = false;
        for (Banco item : banco) {
            //if(banco[i].existeEspacioVacio()) { // funciona también.
            if (!item.isTodoOcupado()) {
                hayLugar = true;
                break;
            }
        }
        return hayLugar;
    }

    private static Indices indiceVacioTodaEstructura(Banco[] banco) {
        Indices temp = new Indices();
        for (int i = 0; i < banco.length; i++) {
            int indice = banco[i].indiceVacio();
            if (indice != -1) {
                temp.pais = i;
                temp.cliente = indice;
                break;
            }
        }
        return temp;
    }

    private static boolean estaTodoLlenoEstructura(Banco[] banco) {
        boolean all_lleno = true;
        for (Banco item : banco) {
            if (item.existeEspacioVacio()) {
                all_lleno = false;
                break;
            }
        }
        return all_lleno;
    }

    private static boolean estaTodoVacioEstructura(Banco[] banco) {
        boolean all_vacio = true;
        for (Banco item : banco) {
            if (item.existeEspacioOcupado()) {
                all_vacio = false;
                break;
            }
        }
        return all_vacio;
    }

    private static int indiceVacioPaisEspecifico(int pais, Banco[] banco) {
        return banco[pais].indiceVacio();
    }

    private static String pedirNombrePais(int inicio, String mensaje, Banco[] banco) {
        String nombrePais = SystemBanc.entrada.cadena(mensaje);
        while (SystemBanc.estaNombreRepetido(inicio, nombrePais, banco)) {
            if (SystemBanc.estaNombreRepetido(inicio, nombrePais, banco)) {
                System.out.println("\t\tEl nombre " + nombrePais + " ya se encuentra registrado...");
                System.out.println("\t\t\t--> Intenta de nuevo.");
            }
            nombrePais = SystemBanc.entrada.cadena(mensaje);
        }
        return nombrePais;
    }

    private static boolean estaNombreRepetido(int inicio, String nombrePais, Banco[] banco) {
        boolean se_encuentra = false;
        for (int i = inicio; i > 0; i--) {
            if (banco[i - 1].getNombrePais().equalsIgnoreCase(nombrePais)) {
                se_encuentra = true;
                break;
            }
        }
        return se_encuentra;
    }

    private static int getIndicePais(String nombrePais, Banco[] banco) {
        int indexPais = -1;
        for (int i = 0; i < banco.length; i++) {
            if (banco[i].getNombrePais().equalsIgnoreCase(nombrePais)) {
                indexPais = i;
                break;
            }
        }
        return indexPais;
    }

    private static boolean seEncuentraNombre(String nombrePais, Banco[] banco) {
        boolean se_encuntra = false;
        for (Banco item : banco) {
            if (item.getNombrePais().equalsIgnoreCase(nombrePais)) {
                se_encuntra = true;
                break;
            }
        }
        return se_encuntra;
    }

    private static String pedirNombrePais(String mensaje, Banco[] banco) {
        String nombrePais = SystemBanc.entrada.cadena(mensaje);
        while (!SystemBanc.seEncuentraNombre(nombrePais, banco)) {
            if (!SystemBanc.seEncuentraNombre(nombrePais, banco)) {
                System.out.println("\t\tEl nombre " + nombrePais + " no se encuentra registrado...");
                System.out.println("\t\t\t--> Intenta de nuevo.");
            }
            nombrePais = SystemBanc.entrada.cadena(mensaje);
        }
        return nombrePais;
    }

    private static void instrucciones() {
        System.out.println("\n-------------------------------");
        System.out.print("---- Menú ----\n");
        System.out.print(" 0 Mostrar menú.\n");
        System.out.print(" 1 Dar de alta Cliente.\n");
        System.out.print(" 2 Dar de baja Cliente.\n");
        System.out.print(" 3 Mostrar todos los clientes.\n");
        System.out.print(" 4 Mostrar cliente en especifico.\n");
        System.out.print(" 5 Mostrar solo clientes dados de alta.\n");
        System.out.print(" 6 Abonar saldo a cliente.\n");
        System.out.print(" 7 Retirar saldo de cliente.\n");
        System.out.print(" 8 Buscar indice vacio en toda la estructura.\n");
        System.out.print(" 9 Mostrar si esta toda llena la estructura.\n");
        System.out.print(" 10 Mostrar si esta toda vacia la estructura.\n");
        System.out.print(" 11 Mostrar nombre de paises.\n");
        System.out.print(" 12 Mostrar longitudes.\n");
        System.out.print(" 13 Actualizar datos de cliente especifico.\n");
        System.out.print(" 14 Salir.\n");
        System.out.println("-------------------------------");
    }

    private static void instrucciones_actualizar() {
        System.out.println("\n-------------------------------");
        System.out.print("---- Menú Actualizar ----\n");
        System.out.print(" 0 Mostrar menú.\n");
        System.out.print(" 1 Actualizar Nombre.\n");
        System.out.print(" 2 Actualizar Sexo.\n");
        System.out.print(" 3 Regresar a ménu principal.\n");
        System.out.println("-------------------------------");
    }

    private static void imprimirPaises(Banco[] banco) {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\tLos paises son: ");
        for (int i = 0; i < banco.length; i++) {
            System.out.println("País [" + i + "] " + banco[i].getNombrePais());
        }
        System.out.println("---------------------------------------------------------------------");
    }

    private static void saltoLinea() {
        System.out.println();
    }

    static private class Indices {

        private int pais;
        private int cliente;

        Indices() {
            this.pais = -1;
            this.cliente = -1;
        }
    }

    public static void main(String[] args) {
        int eleccion;
        Banco banco[];
        banco = new Banco[SystemBanc.validarRango(1, 5, "Introduce el número de paises: ")];
        SystemBanc.introducirPaises(banco);
        SystemBanc.saltoLinea();
        SystemBanc.mostrarLongitudes(banco);
        SystemBanc.saltoLinea();
        SystemBanc.instrucciones();
        eleccion = SystemBanc.entrada.entero(" Elija una opción: ");
        while (eleccion != 14) {
            switch (eleccion) {
                case 1:
                    System.out.println(" --- Opción alta ---");
                    if (SystemBanc.hayVacioTodaEstructura(banco)) {
                        String nombre_pais = SystemBanc.pedirNombrePais("\tIntroduce el nombre del pais: ", banco);
                        int id_pais = SystemBanc.getIndicePais(nombre_pais, banco);
                        int cliente = SystemBanc.indiceVacioPaisEspecifico(id_pais, banco);
                        if (cliente != -1) {
                            Cliente temp = new Cliente(SystemBanc.entrada.cadena("Introduce nombre del cliente: "),
                                    SystemBanc.entrada.cadena("Introduce el Sexo: ").charAt(0),
                                    SystemBanc.entrada.doble("Introduce el Sueldo: "));
                            banco[id_pais].setEspecificoCliente(cliente, temp);
                        } else {
                            System.out.println("No existe indice vacio en el pais " + banco[id_pais].getNombrePais() + ".");
                        }
                    } else {
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("\t\t La estructura esta completamente llena.");
                        System.out.println("---------------------------------------------------------------------");
                    }
                    break;
                case 2:
                    System.out.println(" --- Opción baja ---");
                    if (!SystemBanc.estaTodoVacioEstructura(banco)) {
                        String nombre_pais = SystemBanc.pedirNombrePais("\tIntroduce el nombre del pais: ", banco);
                        int pais = SystemBanc.getIndicePais(nombre_pais, banco);
                        int cliente = SystemBanc.validarRango(0, banco[pais].getTotalClientes() - 1, "\tIntroduce el indice del cliente: ");
                        if (banco[pais].getIsOcupadoCliente(cliente)) {
                            System.out.println("\t--> Cliente " + banco[pais].getNombreCliente(cliente) + " dado de baja.");
                            banco[pais].eliminarCliente(cliente);
                        } else {
                            System.out.println("\tEl cliente " + cliente + " del pais " + banco[pais].getNombrePais() + " no tiene datos.");
                        }
                    } else {
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("\t\t La estructura esta toda vacia.");
                        System.out.println("---------------------------------------------------------------------");
                    }
                    break;
                case 3:
                    System.out.println(" --- Opción mostrar todo ---");
                    SystemBanc.imprimirTodo(banco);
                    break;
                case 4:
                    System.out.println(" --- Opción mostrar especifico ---");
                    if (!SystemBanc.estaTodoVacioEstructura(banco)) {
                        String nombre_pais = SystemBanc.pedirNombrePais("\tIntroduce el nombre del pais: ", banco);
                        int pais = SystemBanc.getIndicePais(nombre_pais, banco);
                        int cliente = SystemBanc.validarRango(0, banco[pais].getTotalClientes() - 1, "\tIntroduce el indice del cliente: ");
                        if (banco[pais].getIsOcupadoCliente(cliente)) {
                            banco[pais].imprimirEspecifico(cliente);
                        } else {
                            System.out.println("\tEl cliente " + cliente + " del pais " + banco[pais].getNombrePais() + " no tiene datos.");
                        }
                    } else {
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("\t\t La estructura esta toda vacia.");
                        System.out.println("---------------------------------------------------------------------");
                    }
                    break;
                case 5:
                    System.out.println(" --- Opción mostrar solo ocupados ---");
                    SystemBanc.imprimirSoloOcupados(banco);
                    break;
                case 6:
                    System.out.println(" --- Opción abonar ---");
                    if (!SystemBanc.estaTodoVacioEstructura(banco)) {
                        String nombre_pais = SystemBanc.pedirNombrePais("\tIntroduce el nombre del pais: ", banco);
                        int pais = SystemBanc.getIndicePais(nombre_pais, banco);
                        int cliente = SystemBanc.validarRango(0, banco[pais].getTotalClientes() - 1, "\tIntroduce el indice del cliente: ");
                        if (banco[pais].getIsOcupadoCliente(cliente)) {
                            double cuanto = SystemBanc.entrada.doble("\tIntroduce cuanto ingresarás a tú cuenta: ");
                            banco[pais].abonarSaldoCliente(cliente, cuanto);
                        } else {
                            System.out.println("\tEl cliente " + cliente + " del pais " + banco[pais].getNombrePais() + " no tiene datos.");
                        }
                    } else {
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("\t\t La estructura esta toda vacia.");
                        System.out.println("---------------------------------------------------------------------");
                    }
                    break;
                case 7:
                    System.out.println(" --- Opción retirar ---");
                    if (!SystemBanc.estaTodoVacioEstructura(banco)) {
                        String nombre_pais = SystemBanc.pedirNombrePais("\tIntroduce el nombre del pais: ", banco);
                        int pais = SystemBanc.getIndicePais(nombre_pais, banco);
                        int cliente = SystemBanc.validarRango(0, banco[pais].getTotalClientes() - 1, "\tIntroduce el indice del cliente: ");
                        if (banco[pais].getIsOcupadoCliente(cliente)) {
                            double cuanto = SystemBanc.entrada.doble("\tIntroduce cuanto retirarás de tú cuenta: ");
                            banco[pais].retirarSaldoCliente(cliente, cuanto);
                        } else {
                            System.out.println("\tEl cliente " + cliente + " del pais " + banco[pais].getNombrePais() + " no tiene datos.");
                        }
                    } else {
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("\t\t La estructura esta toda vacia.");
                        System.out.println("---------------------------------------------------------------------");
                    }
                    break;
                case 8:
                    System.out.println(" --- Opción buscar id vacio en toda estructura ---");
                    if (hayVacioTodaEstructura(banco)) {
                        Indices temp = SystemBanc.indiceVacioTodaEstructura(banco);
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("\tEl pais [" + temp.pais + "] " + banco[temp.pais].getNombrePais()
                                + " tiene el cliente [" + temp.cliente + "] vacio.");
                        System.out.println("---------------------------------------------------------------------");
                    } else {
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("\t\t La estructura esta completamente llena.");
                        System.out.println("---------------------------------------------------------------------");
                    }
                    break;
                case 9:
                    System.out.println(" --- Opción esta llena toda la estructura ---");
                    if (SystemBanc.estaTodoLlenoEstructura(banco)) {
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("\ttrue, la estructura esta toda llena.");
                        System.out.println("---------------------------------------------------------------------");
                    } else {
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("\tfalse, la estructura no esta toda llena.");
                        System.out.println("---------------------------------------------------------------------");
                    }
                    break;
                case 10:
                    System.out.println(" --- Opción esta vacia toda la estructura ---");
                    if (SystemBanc.estaTodoVacioEstructura(banco)) {
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("\ttrue, la estructura esta toda vacia.");
                        System.out.println("---------------------------------------------------------------------");
                    } else {
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("\tfalse, la estructura no esta toda vacia.");
                        System.out.println("---------------------------------------------------------------------");
                    }
                    break;
                case 11:
                    System.out.println(" --- Opción imprimir nombre de paises ---");
                    SystemBanc.imprimirPaises(banco);
                    break;
                case 13:
                    System.out.println(" --- Opción actualizar ---");
                    if (!SystemBanc.estaTodoVacioEstructura(banco)) {
                        String nombre_pais = SystemBanc.pedirNombrePais("\tIntroduce el nombre del pais: ", banco);
                        int pais = SystemBanc.getIndicePais(nombre_pais, banco);
                        int cliente = SystemBanc.validarRango(0, banco[pais].getTotalClientes() - 1, "\tIntroduce el indice del cliente: ");
                        if (banco[pais].getIsOcupadoCliente(cliente)) {
                            SystemBanc.instrucciones_actualizar();
                            eleccion = SystemBanc.entrada.entero(" Elija una opción: ");
                            while (eleccion != 3) {
                                switch (eleccion) {
                                    case 1:
                                        System.out.println(" --- Opción actualizar nombre ---");
                                        banco[pais].cambiarNombreCliente(cliente,
                                                SystemBanc.entrada.cadena("Introduce nuevo nombre del cliente: "));
                                        System.out.println("-----------------------------------------------------------------");
                                        banco[pais].printCliente(cliente);
                                        System.out.println("-----------------------------------------------------------------");
                                        break;
                                    case 2:
                                        System.out.println(" --- Opción actualizar sexo ---");
                                        banco[pais].cambiarSexoCliente(cliente,
                                                SystemBanc.entrada.cadena("Introduce el nuevo Sexo: ").charAt(0));
                                        System.out.println("-----------------------------------------------------------------");
                                        banco[pais].printCliente(cliente);
                                        System.out.println("-----------------------------------------------------------------");
                                        break;
                                    case 0:
                                        SystemBanc.instrucciones_actualizar();
                                        break;
                                    default:
                                        System.out.println("******************************************");
                                        System.out.println(" --- Opción Desconocida ---");
                                        System.out.println("******************************************");
                                        try {
                                            Thread.sleep(500);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        SystemBanc.instrucciones_actualizar();
                                }
                                eleccion = SystemBanc.entrada.entero(" Elija una opción: ");
                            }
                            SystemBanc.instrucciones();
                        } else {
                            System.out.println("\tEl cliente " + cliente + " del pais " + banco[pais].getNombrePais() + " no tiene datos.");
                        }
                    } else {
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("\t\t La estructura esta toda vacia.");
                        System.out.println("---------------------------------------------------------------------");
                    }
                    break;
                case 12:
                    System.out.println(" --- Opción mostrar longitudes ---");
                    System.out.println("---------------------------------------------------------------------");
                    SystemBanc.mostrarLongitudes(banco);
                    System.out.println("---------------------------------------------------------------------");
                    break;
                case 0:
                    SystemBanc.instrucciones();
                    break;
                default:
                    System.out.println("******************************************");
                    System.out.println(" --- Opción Desconocida ---");
                    System.out.println("******************************************");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    SystemBanc.instrucciones();
            }
            eleccion = SystemBanc.entrada.entero(" Elija una opción: ");
        }
        System.out.println("--- Fin de la Ejecución del Sistema ---");
    }
}
