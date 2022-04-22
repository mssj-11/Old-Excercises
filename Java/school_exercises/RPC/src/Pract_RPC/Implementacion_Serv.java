package Pract_RPC;

import javax.jws.WebService;

@WebService(endpointInterface = "Pract_RPC.Servidor") //Implementacion el metodo del servidor 

// Implementacion del metodo del servidor
public class Implementacion_Serv implements Servidor {

    @Override
    public String obtenerMensaje(String msj) {
        return msj;
    }

}
