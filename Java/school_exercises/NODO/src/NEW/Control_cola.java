package NEW;

public class Control_cola {

    private Nodo primero;
    private Nodo ultimo;

    public Control_cola() {
        primero = null;
        ultimo = null;
    }

    public void insertarInicio(String nombre) {
        if (primero == null) {
            primero = new Nodo(null, nombre, null);
            ultimo = primero;
        } else {
            Nodo nuevo = new Nodo(null, nombre, primero);
            primero.setAtras(nuevo);
            primero = nuevo;
        }
    }

    public void insertarFin(String nombre) {
        if (primero == null) {
            ultimo = new Nodo(null, nombre, null);
            primero = ultimo;
        } else {
            Nodo nuevo = new Nodo(ultimo, nombre, null);
            ultimo.setAtras(nuevo);
            ultimo = nuevo;
        }
    }

    public String extraerInicio() {
        String nombre = primero.getNombre();
        primero = primero.getAdelante();
        if (primero != null) {
            primero.setAdelante(null);
        } else {
            ultimo = null;
        }

        return nombre;
    }

    public String extraerFin() {
        String nombre = ultimo.getNombre();
        ultimo = ultimo.getAtras();
        if (ultimo != null) {
            ultimo.setAdelante(null);
        } else {
            primero = null;
        }
        return nombre;
    }

    public void mostrarAscendente() {
        Nodo auxiliar = primero;
        while (auxiliar != null) {
            System.out.println(auxiliar.getNombre());
            auxiliar = auxiliar.getAtras();

        }

    }

    public void mostarDescendente() {
        Nodo auxiliar = ultimo;
        while (auxiliar != null) {
            System.out.println(auxiliar.getNombre());
            auxiliar = auxiliar.getAtras();
        }
    }

    public boolean buscar(String nombre) {
        Nodo auxiliar = primero;
        while (auxiliar != null) {
            if (auxiliar.getNombre().equals(nombre)) {
                return true;
            }
            auxiliar = auxiliar.getAtras();
        }
        return false;

    }
}
