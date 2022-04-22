package Pract_RPC;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Cliente {

    public static void main(String args[]) {

        try {
            //servicio web a partir de su interfaz WSDL
            URL urlmetodo = new URL("http://localhost:2211/prueba?wsdl"); //a gregamos --> ?wsdl
            QName namemetodo = new QName("http://Pract_RPC/", "Implementacion_ServService");

            Service servicemetodo = Service.create(urlmetodo, namemetodo);
            Servidor serv = servicemetodo.getPort(Servidor.class);

            System.out.println(serv.obtenerMensaje("Esta es la Practica Llamada a Procedimiento Remoto"));

        } catch (MalformedURLException e) {    
            System.out.println("ERROR: " + e);
        }
    }

}
