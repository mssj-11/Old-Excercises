package SOCKETS; //comentar en caso de ejecutar desde ubuntu

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Cliente {

    public static void main(String args[]) {
        //creacion del socket del cliente
        Socket cliente;
        //intercambio de mensajes hacia el servidor
        DataInputStream entrada; //entrada de datos
        DataOutputStream salida; //salida de datos

        try {
            //Creacion del socket del cliente + puerto del servidor
            cliente = new Socket("127.0.0.1", 4567);
            //System.out.println("\u001B[31mConexion establecida con el SERVIDOR !!!");
            //intercambio de mensajes
            entrada = new DataInputStream(cliente.getInputStream());
            salida = new DataOutputStream(cliente.getOutputStream());

            //envio de mensaje al SERVIDOR
            salida.writeUTF("\u001B[34mSoy el Nuevo Cliente");

            //RECIBIR mensaje enviado por parte del SERVIDOR
            String mensaje = entrada.readUTF();
            System.out.println("\u001B[34mSERVIDOR: " + mensaje);

            //cerrando el socket
            cliente.close();
            //System.out.println("\u001B[34mCLIENTE DESCONECTADO !!!");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }

}
