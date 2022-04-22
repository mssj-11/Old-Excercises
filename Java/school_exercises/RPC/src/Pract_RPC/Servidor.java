package Pract_RPC;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService //Implementacion del servcico web
@SOAPBinding(style = Style.RPC) // llamada a procediemientos remotos

public interface Servidor {

    //creamos el metodo web
    @WebMethod
    String obtenerMensaje(String msj); //Captura del mensaje
    
}
