/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VENTANS;

/**
 *
 * @author HP
 */
public class main {

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
    Ventana1 prueba = new Ventana1();
}  
}

//el JFrame se cierre al abrir otro, entonces simplemente "botalo" con dispose();
/*En el JFrame1 en el evento de tu boton, colocarias algo asi:

Ventana2 frame2 = new Ventana2();
dispose();
Y en el JFrame2... en tu evento de salir....

dispose();
Ventana1 frame1 = new Ventana1();*/