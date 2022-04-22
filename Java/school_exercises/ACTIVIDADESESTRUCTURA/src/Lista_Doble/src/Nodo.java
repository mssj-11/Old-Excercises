public class Nodo {
   private Nodo adelante;
   private String nombre;
   private Nodo atras;
   
   
public Nodo(Nodo ade, String nom, Nodo atr){
adelante=ade;
nombre= nom;
atras=atr;
}

public Nodo getAdelante() {
        return adelante;
    }
    public void setAdelante(Nodo adelante) {
        this.adelante = adelante;
    }

   public  String getNombre() {
        return nombre;
    }
   public  void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  Nodo getAtras() {
        return atras;
    }
    public void setAtras(Nodo atras) {
        this.atras = atras;
    }
    
    

}
