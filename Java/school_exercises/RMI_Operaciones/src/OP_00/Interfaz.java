package OP_00;

import java.rmi.Remote;
import java.rmi.RemoteException;

//Interfaz remota
public interface Interfaz extends Remote {

    float sumar(float numero1, float numero2) throws RemoteException;

    float restar(float numero1, float numero2) throws RemoteException;

    float multiplicar(float numero1, float numero2) throws RemoteException;

    float dividir(float numero1, float numero2) throws RemoteException;

}
