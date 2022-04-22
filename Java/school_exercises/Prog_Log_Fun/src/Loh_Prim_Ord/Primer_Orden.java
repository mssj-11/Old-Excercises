package Loh_Prim_Ord;
//AYUDA: https://www.programmersought.com/article/9690978170/

import javax.swing.SwingUtilities;

public class Primer_Orden {

    //Va de la mano con LAMBDA
    private static void ejemplo1() {
        //Primer ejemplo con N.Enteros
        int a = 5;
        System.out.println(5);
        int b = Math.abs(-5);
        int[] enteros = {5, 1, 2, 5};
    }

    private static void ejemplo2() {
        //con satring
        String a1 = "x";
        System.out.println("a");
        String a2 = "ab".substring(0, 1);
        String[] datos = {"5", "a", "ejemplo2", "a"};
    }

    //Ejemplo 3
    private static Runnable DevuelveEjemplo3() {
        return () -> System.out.println("ejemplo3");
    }

    private static void ejemplo3() {
        //Interfaz Runnable
        Runnable r1 = () -> System.out.println("ejemplo3");//variable r asignada con un dato funcional(LAMBDA)
        SwingUtilities.invokeLater(() -> System.out.println("ejemplo3"));//pasando a metodo invokeLater: recibe runnable
        //devolviendo
        Runnable r2 = DevuelveEjemplo3();//devolviendo la funcion LAMBDA
        //Datos agregados
        Runnable[] datos = {Primer_Orden::DevuelveEjemplo3,
            () -> System.out.println("a")};//dato de primer orden (funcion LAMBDA)
    }
    
}
