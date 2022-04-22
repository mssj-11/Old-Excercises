/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import java.util.Random;

/**
 *
 * @author HP
 */
public class filosofo implements Runnable {// esta clase es la que ocntiene todos los metodos para el proceso del programa de los filosofos

    int id;// es el id que resivira el id de los filoosofos de la mesa
    Thread t;// se crea una variable de thread
    tenedor derecho; // derecho y izquierdo son los tenedores que ocntiene cada filosofo
    tenedor izquierdo;// para indicar cuando come cada uno
    int espera;
    Random r; // resibe un valor random
    tenedor mesa[]; // se crea un vector mesa de tipo tenedor 

    public filosofo(int id, tenedor derecho, tenedor izquierdo, tenedor mesa[]) { // cronstructor de clase filosofo que resive los datos de los filosofos 
        this.id = id;// y se inicialisan todos los datos correspondientes a cada filosofo y la accion que realizan
        this.derecho = derecho;
        this.izquierdo = izquierdo;
        System.out.println("\nEl filosofo " + (id + 1) + "\n puede usar el tenedor " + (derecho.id + 1) + "\n y el tenedor " + (izquierdo.id + 1)); // se imprime la accion del filosofo
        System.out.println("");
        this.mesa = mesa;
        r = new Random();// resive el valor de un numero random
        t = new Thread(this); // se crea un hilo sobre el filosofo que entro en el metodo en el momento 
        t.start();// se inicia la accion del filosofo y se indica si esta comienod o no en la inpreicon de arriba

    }

    @Override
    public void run() {// metodo que viene cuando  implementas la clase runnable
        for (int i = 0; i < 3; i++) { // este for indica el numero de veces que entrara a comer cada filosofo en este ejemplo entraran 3 veces a comer los cada filosofo
            synchronized (this.derecho) {// si el fisolofo tiene tenedor derecho
                synchronized (this.izquierdo) {// y el tenedor izquierdo entonces
                    comer();// se pondra a comer 
                }
            }// si no los tiene los dos  tenedores
            pensar();// se pondra a pensar 
        }
        System.out.println("**********************");
        System.out.println("Filosofo " + (id + 1) + " termino "); // si cumple el filosofo  con las 3 veces que debe de comer entonces se imprime este mensaje
        System.out.println("**********************");
    }

    public void comer() {// este metodo se llama cuando el filosofo cumple con la condicion de tener dos tenedores en sus manos
        System.out.println(checar_mesa() + "\nFilosofo " + (id + 1) + " comera con los  tenedores " + (this.izquierdo.id + 1) + " y " + (this.derecho.id + 1));// indique que filosofo esta comiendo y que tenedores son los que esta utilizando 
        derecho.tomar(id); // derecho llama el metodo tomar que hace que cambie la bandera a verdadero e indica que el tenedor a sido tomado por el filosofo que le pertenece el id
        izquierdo.tomar(id);//izquierdo llama el metodo tomar que hace que cambie la bandera a verdadero e indica que el tenedor a sido tomado por el filosofo que le pertenece el id
        espera = r.nextInt(5000); // espera recibe el  numero random que se guardo en la variable " r "
        System.out.println(checar_mesa() + "\n >>>>> Filosofo " + (id + 1) + " esta comiendo <<<<<");// ya que se cumple que tiene los dos tenedores se imprime el mensaje que el filosofo esta comiendo
        try {
            Thread.sleep(espera);// se duerme durante unos segundos  que es el tiempo en el que esta comiendo el filosofo
        } catch (InterruptedException e) {
        }
        derecho.soltar();// ya que el hilo despierta suelta el tenedor  que tenia en la derecha
        izquierdo.soltar();// y tambien el de la izquierda
        System.out.println(checar_mesa() + "\nFilosofo " + (id + 1) + " termino de comer y libero los tenedores " + (this.izquierdo.id + 1) + " y " + (this.derecho.id + 1));// y se imprime el mensaje este despues de termminar de comer el filosofo
        System.out.println("");
    }

    public void pensar() {// este metodo indica al filosofo que debe esperar en y se ponga a comer
        espera = (r.nextInt(5000));// resibe un numero random 
        try {
            System.out.println(checar_mesa() + "\n El Filosofo " + (id + 1) + " esta comienzando a pensar !!!!!!!!!!!!!! ");// cuando el filosofo libera los tenedores se manda este mensaje indicando que ese filosofo entra en estado de reposo
            System.out.println("");
            Thread.sleep(espera);// thread que hace que el filosofo espere asta que le llegue otra vez su turno de comer
        } catch (InterruptedException e) {
        }
    }

    public String checar_mesa() { // este metodo es elq ue se encarga de revisar quien tiene los tenedores 
        String a = "";
        for (int i = 0; i < mesa.length; i++) {// con este ciclo serecorre toda la mesa
            a = a + ("\n[ " + mesa[i].ban + " ]\n"); // cindica cuando un filosofo cuenta con los dos tenedores y se puede poner a comer
        }
        return a;// regesa su valor;
    }
}
