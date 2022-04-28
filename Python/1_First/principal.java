public class Arbol {
public Arbol izquierda;
public Arbol derecha;
public T carga;

public Arbol(Arbol izquierda, Arbol derecha, T cargar) {
this.izquierda = izquierda;
this.derecha = derecha;
this.carga = cargar;
}
public Arbol( T cargar) {
this.izquierda = null;
this.derecha = null;
this.carga = cargar;
}

public String toString(){
return carga.toString();
}

}

public class Memoria {
private Arbol raiz ;
private Scanner leer = new Scanner(System.in);

public boolean si(String preg){
System.out.print(preg);
String res = leer.nextLine();
return «si».equals(res.toLowerCase());
}

public void iniciar(String firstAnimal){
boolean bucle = true;
raiz= new Arbol(firstAnimal);
while(bucle){
if(!si(«Estas pensando en un animal?»)){
break;
}
Arbol arbol =raiz;
while (arbol.izquierda != null) {
if( si(arbol.carga+» ? «)){
arbol= arbol.izquierda;
}else{
arbol = arbol.derecha;
}
}
//adivinar
String animal = arbol.carga;
if( si(«Es un «+animal+» ?»)){
System.out.println(«Adivine!!»);
continue; //regresa al inicio del ciclo
}
//obtener informacion
System.out.println(«Qué animal era?»);
String nuevo= leer.nextLine();
System.out.print(«Qué diferencia a un » + animal + » de un » + nuevo + «? «);
String info = leer.nextLine();
String indicador = «Si el animal fuera un » + animal + » cual seria la respuesta? «;
arbol.carga = info;
if( si(indicador)){
arbol.izquierda= new Arbol(animal);
arbol.derecha= new Arbol(nuevo);
}else{
arbol.derecha= new Arbol(animal);
arbol.izquierda= new Arbol(nuevo);
}
}

}
}

//tu main
public static void main(String[] args) {

Memoria m = new Memoria();
m.iniciar(«pajaro»);
}