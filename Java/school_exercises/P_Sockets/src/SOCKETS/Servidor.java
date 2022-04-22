package SOCKETS;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String args[]) {
        //creacion del los socket 
        ServerSocket servidor; //socket servidor
        Socket cliente; //socket cliente

        //Intercambio de la informacion
        DataInputStream entrada; //entrada de datos
        DataOutputStream salida; //salida de datos

        //puntos de conexion entre cliente & servidor
        try {
            //Creacion del socket del servidor + puerto
            servidor = new ServerSocket(4567);
            System.out.println("\u001B[31mConexion establecida con el SERVIDOR !!!");
            //espera del servidor hacia las solicitudes de los clientes
            while (true) {
                //espera a la conexion de algun cliente
                cliente = servidor.accept(); //intercambio de datos con el servidor
                System.out.println("\u001B[34mEl cliente se a conectado !!!");

                //intercambio de mensajes
                entrada = new DataInputStream(cliente.getInputStream());
                salida = new DataOutputStream(cliente.getOutputStream());
                //lectura de mensajes del cliente
                String mensajes = entrada.readUTF(); //almacenar el mensaje del cliente
                System.out.println("CLINTE: " + mensajes);

                //respuesta del servidor --> cliente
                salida.writeUTF("\u001B[31mBIENVENIDO AL SERVIDOR :)");
                //cerrando el socket
                cliente.close();
                System.out.println("\u001B[34mCLIENTE DESCONECTADO !!!");

            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }
}
