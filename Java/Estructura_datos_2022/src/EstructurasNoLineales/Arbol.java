package EstructurasNoLineales;

/**
 *
 * @author HP
 */
public class Arbol {
    Arbol_binario inicial;
    
    // Constructor
    public Arbol(){
        this.inicial = null;
    }
    
    // Nuevo nodo
    public void insertar(int valor){
        if(this.inicial == null){
            // Nodo Inicial, en este caso es el 43
            this.inicial = new Arbol_binario(valor);
        }
        // Si no esta vacio
        else{ // Aplicando recursividad (si el nodo esta vacio, si es menor o mayor)
            this.inicial.insertar(valor);
        }
    }
    
    
    
    // Recorridos
    public void dispararPreorden(){
        this.preOrden(this.inicial);
    }
    
    // Recorrido PREORDEN: (Raiz - Nodo Izq.  -  Nodo Der.)
    public void preOrden(Arbol_binario nodo){
        // Si el nodo esta vacio
        if(nodo == null){
            return; // Se detendra la recursividad
        }else{
            System.out.print(nodo.getValor()+ ", ");
            preOrden(nodo.getNodoIzquierdo());
            preOrden(nodo.getNodoDerecho());
        }
    }
    
    
    // Recorrido INORDEN: (Nodo Izq.  -  Raiz - Nodo Der.)
    public void dispararInorden(){
        this.inOrden(this.inicial);
    }
    public void inOrden(Arbol_binario nodo){
        // Si el nodo esta vacio
        if(nodo == null){
            return; // Se detendra la recursividad
        }else{
            inOrden(nodo.getNodoIzquierdo());
            System.out.print(nodo.getValor()+ ", ");
            inOrden(nodo.getNodoDerecho());
        }
    }
    
    
    // Recorrido POSTORDEN: (Nodo Izq. - Nodo Der.  -  Raiz)
    public void dispararPostorden(){
        this.postOrden(this.inicial);
    }
    public void postOrden(Arbol_binario nodo){
        // Si el nodo esta vacio
        if(nodo == null){
            return; // Se detendra la recursividad
        }else{
            postOrden(nodo.getNodoIzquierdo());
            postOrden(nodo.getNodoDerecho());
            System.out.print(nodo.getValor()+ ", ");
        }
    }
    
    
    
}