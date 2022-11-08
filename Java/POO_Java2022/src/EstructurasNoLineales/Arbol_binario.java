//    [43, 10, 8, 54, 15, 50, 53]
package EstructurasNoLineales;

/**
 *
 * @author HP
 */
public class Arbol_binario {
    private int valor;
    // Estructura de datos
    private Arbol_binario nodoIzquierdo;
    private Arbol_binario nodoDerecho;
    
    // Constructor
    public Arbol_binario(int valor){
        this.valor = valor;
        this.nodoIzquierdo = null;
        this.nodoDerecho = null;
    }
    
    
    
    // SETTERS          (ALT + INSERT)
    public void setValor(int valor) {
        this.valor = valor;      }
   
    // GETTERS
    public int getValor() {
        return valor;   }

    public Arbol_binario getNodoIzquierdo() {
        return nodoIzquierdo;   }

    public Arbol_binario getNodoDerecho() {
        return nodoDerecho;     }
    
    
    
    // Funcion (Valor menor=Izquierda   &   Valor mayor=Derecha)
    public void insertar(int valorNodo){
        // Recursividad
        if(valorNodo < this.valor){
            //  Insertando el Nodo al lado Izquierdo, si esque tiene el valor menor
            if(this.nodoIzquierdo == null){
                this.nodoIzquierdo = new Arbol_binario(valorNodo);
            }else{
                this.nodoIzquierdo.insertar(valorNodo);
            }
        }
        // Si no, entonces el Nodo sera insertado del lado Derecho
        else{
            if(this.nodoDerecho == null){
                this.nodoDerecho = new Arbol_binario(valorNodo);
            }else{
                this.nodoDerecho.insertar(valorNodo);
            }
        }
    }
    
    
}