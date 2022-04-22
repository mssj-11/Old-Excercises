package banco;

public class Cliente {

    private String nombre;
    private char sexo;
    private double saldo;
    private boolean ocupado;

    Cliente() {
        this.setTodosDatos();
    }

    Cliente(String nombre, char sexo, double saldo) {
        this.setTodosDatos(nombre, sexo, saldo);
    }

    Cliente(Cliente cliente) {
        this.setTodosDatos(cliente);
    }

    private void setTodosDatos() {
        this.nombre = null;
        this.sexo = ' ';
        this.saldo = 0.0;
        this.ocupado = false;
    }

    public void setTodosDatos(String nombre, char sexo, double saldo) {
        this.nombre = nombre;
        this.validarSexo(sexo);
        this.validarSaldo(saldo);
        this.setOcupado();
    }

    public void setTodosDatos(Cliente cliente) {
        this.nombre = cliente.getNombre();
        this.validarSexo(cliente.getSexo());
        this.validarSaldo(cliente.getSaldo());
        this.setOcupado();
    }

    public Cliente getTodosDatos() {
        Cliente temporal = new Cliente();
        temporal.nombre = this.getNombre();
        temporal.sexo = this.getSexo();
        temporal.saldo = this.getSaldo();
        temporal.ocupado = this.isOcupado();
        return temporal;
    }

    private void validarSexo(char sexo) {
        if (sexo != 'M' && sexo != 'F') {
            sexo = ' ';
        }
        this.sexo = sexo;
    }

    private void validarSaldo(double saldo) {
        if (saldo <= 0.0) {
            saldo = 0.0;
        }
        this.saldo = saldo;
    }

    private boolean tieneSaldo() {
        return this.saldo > 0.0;
    }

    private boolean tieneDatos() {
        return !(this.nombre == null || this.nombre.equalsIgnoreCase(" ") || this.sexo == ' ');
        /*if(this.nombre == null || this.nombre.equalsIgnoreCase(" ") || this.sexo == ' ')
            return false;
        else
            return true;*/
    }

    private void setOcupado() {
        if (!this.tieneDatos()) {
            this.setTodosDatos();
        } else {
            this.ocupado = true;
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void eliminar() {
        this.setTodosDatos();
    }

    public void cambiarNombre(String nuevoNombre) {
        if (nuevoNombre != null && !nuevoNombre.equalsIgnoreCase(" ")) {
            this.nombre = nuevoNombre;
        }
        this.setOcupado();
    }

    public void cambiarSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
        }
        this.setOcupado();
    }

    public void abonarSaldo(double cuanto) {
        if (this.tieneDatos()) {
            if (cuanto > 0.0) {
                this.saldo += cuanto;
            } else {
                System.out.println("\tImposible, no puedes abonar saldos negativos o nada.");
            }
        }
    }

    public void retirarSaldo(double cuanto) {
        if (this.tieneDatos()) {
            if (cuanto > 0.0) {
                if (this.tieneSaldo()) {
                    if (this.saldo >= cuanto) {
                        this.saldo -= cuanto;
                    } else {
                        System.out.println("\tImposible, tú saldo es insuficiente para retirar " + cuanto + ".");
                    }
                } else {
                    System.out.println("\tImposible, no hay saldo.");
                }
            } else {
                System.out.println("\tImposible, no puedes retirar saldos negativos o nada.");
            }
        }
    }

    @Override
    public String toString() {
        return "-> Nombre: |" + this.nombre
                + "| -> Sexo: |" + this.sexo
                + "| -> Saldo: |" + this.saldo
                + "| -> Ocupado: |" + this.ocupado + "|";
    }

    public void imprimirCliente() {
        System.out.println("\t\t" + this.toString());
    }
}
