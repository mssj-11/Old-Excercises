/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author HP
 */
public abstract class Poligono extends Figuras {

    public int num_lados;

    public Poligono(int num_lados) {
        this.num_lados = num_lados;
    }

    public int getNum_lados() {
        return num_lados;
    }

    public void setNum_lados(int num_lados) {
        this.num_lados = num_lados;
    }

    
}
