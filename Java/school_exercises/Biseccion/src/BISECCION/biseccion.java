/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BISECCION;

/**
 *
 * @author HP
 */
public class biseccion {

    public float a, xm, b;

    public biseccion(float va, float vb) {
        a = va;
        b = vb;
    }

    public float f(float x) {
        float y;
        y = (x * x) - 5;
        return (y);
    }

    public float prom(float a, float b) {
        xm = (a + b) / 2;
        return (xm);
    }

}
