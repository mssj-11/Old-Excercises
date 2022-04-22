/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

/**
 *
 * @author hp
 */
public class Control {
    private Elemento primero;
    private Elemento ultimo;
    
    
public Control(){
    primero=null;
    ultimo=null;
}
    
public void insertarInicio(String nombre,String edad,String direccion,String email,String telefono){
   if(primero==null){
       
       primero=new Elemento(null,nombre,edad,direccion,email,telefono,null);
       ultimo=primero;
   }
   
   else{
       Elemento nuevo=new Elemento(null,nombre,edad,direccion,email,telefono,primero);
       primero.setAdelante(nuevo);
       primero=nuevo;
   }
}

public void insertarFin(String nombre,String edad,String direccion,String email,String telefono){
    if (primero==null){
        ultimo=new Elemento(null,nombre,edad,direccion,email,telefono,null);
        primero=ultimo;
    }
    else {
        Elemento nuevo=new Elemento (ultimo,nombre,edad,direccion,email,telefono,null);
        ultimo.setAtras(nuevo);
        ultimo=nuevo;
    }
}
public String extraerInicio(){
    String nombre=primero.getNombre();
    primero=primero.getAtras();
    if (primero!=null){
        primero.setAdelante(null);
        }
    else
        ultimo=null;
    return nombre;
}

public String extraerFin(){
    String nombre=ultimo.getNombre();
    ultimo=ultimo.getAtras();
    if (ultimo!=null){
        ultimo.setAdelante(null);
    }
    else{
        primero=null;
    }
    return nombre;
}

public void mostrarAscendente (){
    Elemento auxiliar=primero;
    while(auxiliar!=null){
        System.out.println("["+auxiliar.getNombre()+"] ["+auxiliar.getEdad()+"] ["+auxiliar.getDireccion()+"] ["+auxiliar.getEmail()+"] ["+auxiliar.getTelefono()+"]");
        
        auxiliar=auxiliar.getAtras();
        
    }
    
}

public void mostarDescendente(){
    Elemento auxiliar = ultimo;
    while(auxiliar!=null){
         System.out.println("["+auxiliar.getNombre()+"] ["+auxiliar.getEdad()+"] ["+auxiliar.getDireccion()+"] ["+auxiliar.getEmail()+"] ["+auxiliar.getTelefono()+"]");
        auxiliar=auxiliar.getAdelante();
    }
}
public boolean buscar(String nombre){
    Elemento auxiliar=primero;
    while(auxiliar!=null && !auxiliar.getNombre().equals(nombre)){
        
        auxiliar=auxiliar.getAtras();
}
return auxiliar!=null;


}

    
}
