package OP_00;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

//Servidor
public class Servidor {

    private static final int PUERTO = 12345; //Puerto de conexion para el cliente

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        Remote remote = UnicastRemoteObject.exportObject(new Interfaz() {
            //sobrescribiendo los métodos (en la interfaz) -->para evitar errores en tiempo de ejecución

            @Override
            public float sumar(float numero1, float numero2) throws RemoteException {
                return numero1 + numero2;
            }

            @Override
            public float restar(float numero1, float numero2) throws RemoteException {
                return numero1 - numero2;
            }

            @Override
            public float multiplicar(float numero1, float numero2) throws RemoteException {
                return numero1 * numero2;
            }

            @Override
            public float dividir(float numero1, float numero2) throws RemoteException {
                return numero1 / numero2;
            }
        }, 0);
        Registry registry = LocateRegistry.createRegistry(PUERTO);
        System.out.println("Servidor escuchando en el puerto " + String.valueOf(PUERTO));
        registry.bind("Calculadora", remote); // Registrar calculadora
    }

}
