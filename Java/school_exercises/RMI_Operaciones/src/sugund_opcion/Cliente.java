package sugund_opcion;

public class Cliente {

    public static void main(String args[]) {
        try {
            Interfaz cliente = (Interfaz) java.rmi.Naming.lookup("192.168.5.105");

            for (int i = 0; i < cliente.repeticionMensaje(); i++) {
                cliente.mensaje();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
