package sugund_opcion;

import java.rmi.RemoteException;

public class Servidor extends java.rmi.server.UnicastRemoteObject implements Interfaz {

    public Servidor() throws java.rmi.RemoteException {

    }

    @Override
    public void mensaje() throws RemoteException {
        System.out.println("Prueba de Mensaje RMI");
    }

    @Override
    public int repeticionMensaje() throws RemoteException {
        return 6;
    }

    public static void main(String args[]) {
        try {
            Interfaz servidor = new Servidor();
            java.rmi.Naming.rebind("192.168.5.105", servidor);//IP en la que se almacenara nuestro valores
            /*OTRAS OPCIONES
            java.rmi.Naming.rebind("172.0.0.1", servidor);
            java.rmi.Naming.rebind("rmi://192.168.5.105/Prueba", servidor);
             */
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
