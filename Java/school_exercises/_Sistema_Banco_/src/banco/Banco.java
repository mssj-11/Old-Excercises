package banco;

public class Banco {

    private String nombrePais;
    private Cliente[] clientes;

    Banco(String nombrePais, int tam_clientes) {
        this.nombrePais = nombrePais;
        this.clientes = new Cliente[tam_clientes];
        this.construirClientes();
    }

    private void construirClientes() {
        for (int i = 0; i < this.getTotalClientes(); i++) {
            this.clientes[i] = new Cliente();
        }
    }

    public int getTotalClientes() {
        return this.clientes.length;
    }

    public boolean isTodoOcupado() {
        boolean todo_ocupado = false;
        int contador = 0;
        for (int i = 0; i < this.getTotalClientes(); i++) {
            if (this.getIsOcupadoCliente(i)) {
                contador++;
            }
        }
        if (contador == this.getTotalClientes()) {
            todo_ocupado = true;
        }
        return todo_ocupado;
    }

    public boolean isTodoVacio() {
        boolean todo_vacio = false;
        int contador = 0;
        for (int i = 0; i < this.getTotalClientes(); i++) {
            if (!this.getIsOcupadoCliente(i)) {
                contador++;
            }
        }
        if (contador == this.getTotalClientes()) {
            todo_vacio = true;
        }
        return todo_vacio;
    }

    public boolean existeEspacioVacio() {
        boolean existeVacio = false;
        for (int i = 0; i < this.getTotalClientes(); i++) {
            if (!this.getIsOcupadoCliente(i)) {
                existeVacio = true;
                break;
            }
        }
        return existeVacio;
    }

    public boolean existeEspacioOcupado() {
        boolean existeOcupado = false;
        for (int i = 0; i < this.getTotalClientes(); i++) {
            if (this.getIsOcupadoCliente(i)) {
                existeOcupado = true;
                break;
            }
        }
        return existeOcupado;
    }

    public int indiceVacio() {
        int index_vacio = -1;
        for (int i = 0; i < this.getTotalClientes(); i++) {
            if (!this.getIsOcupadoCliente(i)) {
                index_vacio = i;
                break;
            }
        }
        return index_vacio;
    }

    public boolean printSoloOcupados(int pais) {
        boolean imprimio = false;
        if (this.existeEspacioOcupado()) {
            imprimio = true;
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("\tDel pais [" + pais + "] " + this.nombrePais + " los clientes disponibles son: ");
            for (int i = 0; i < this.getTotalClientes(); i++) {
                if (this.getIsOcupadoCliente(i)) {
                    System.out.println("El cliente " + i + " es: ");
                    this.printCliente(i);
                }
            }
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
        return imprimio;
    }

    public void printTodosClientes(int pais) {
        System.out.println("\tDel pais [" + pais + "] " + this.nombrePais + ": ");
        for (int i = 0; i < this.getTotalClientes(); i++) {
            System.out.println("El cliente " + i + " es: ");
            this.printCliente(i);
        }
    }

    public void imprimirEspecifico(int cliente) {
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("\tDel pais " + this.nombrePais + ": ");
        this.printCliente(cliente);
        System.out.println("----------------------------------------------------------------------------------------------------------------");
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Cliente getEspecificoCliente(int index) {
        return this.clientes[index];
    }

    public void setEspecificoCliente(int index, Cliente cliente) {
        //this.clientes[index] = cliente;
        this.clientes[index].setTodosDatos(cliente);
    }

    public String getNombreCliente(int index) {
        return this.clientes[index].getNombre();
    }

    public char getSexoCliente(int index) {
        return this.clientes[index].getSexo();
    }

    public double getSaldoCliente(int index) {
        return this.clientes[index].getSaldo();
    }

    public boolean getIsOcupadoCliente(int index) {
        return this.clientes[index].isOcupado();
    }

    public void eliminarCliente(int index) {
        this.clientes[index].eliminar();
    }

    public void cambiarNombreCliente(int index, String nuevoNombre) {
        this.clientes[index].cambiarNombre(nuevoNombre);
    }

    public void cambiarSexoCliente(int index, char nuevoSexo) {
        this.clientes[index].cambiarSexo(nuevoSexo);
    }

    public void abonarSaldoCliente(int index, double cuanto) {
        this.clientes[index].abonarSaldo(cuanto);
    }

    public void retirarSaldoCliente(int index, double cuanto) {
        this.clientes[index].retirarSaldo(cuanto);
    }

    public void printCliente(int index) {
        this.clientes[index].imprimirCliente();
    }
}
