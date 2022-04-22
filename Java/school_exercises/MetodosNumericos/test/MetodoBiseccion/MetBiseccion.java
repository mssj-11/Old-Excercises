/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoBiseccion;

/**
 *
 * @author HP
 */
public class MetBiseccion {

    public static void main(String args[]) {

        int i, it;
        i = 0;
        it = 30;
        float a = 0, b = 3, fa, fb, r, fr;
        System.out.println("Demostración de la bisección");
        biseccion raiz = new biseccion(a, b);
        r = raiz.prom(a, b);
        while (i < it) {
            fa = raiz.f(a);
            fb = raiz.f(b);
            fr = raiz.f(r);
            if ((fa * fr) < 0) {
                raiz.b = r;
            } else if ((fb * fr) < 0) {
                raiz.a = r;
            }
            r = raiz.prom(raiz.a, raiz.b);

            System.out.println("Nueva raiz Xm= " + r + "\tf(x)= " + raiz.f(r));
            i++;

        }
        System.out.println("Solucion r=" + r);

    }

}
