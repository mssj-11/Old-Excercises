/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NEW;

/**
 *
 * @author hp
 */
public class Menu_lista {

    public static void main(String[] args) {
        Control_cola id = new Control_cola();
        id.insertarInicio("Daniel");
        id.insertarFin("Martinez");
        id.insertarFin("Martinez");
        //id.extraerInicio();

        id.mostrarAscendente();
        //id.mostarDescendente();
        System.out.println(id.buscar("Daniel"));

    }

}
