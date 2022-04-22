package Pract_RPC;
//usando libreria JAXB 2.2.5

//import Pract_RPC.Implementacion_Serv;
import javax.xml.ws.Endpoint;

public class Publicador {

    public static void main(String args[]) {
        Object implementador = new Implementacion_Serv();
        String direccion = "http://localhost:2211/prueba";

        Endpoint.publish(direccion, implementador);
    }
}
