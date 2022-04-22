/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encriptacion_j;

import java.io.Serializable;

/**
 *
 * @author HP
 */
class Texto implements Serializable {

    private String palabra;

    public Texto() {

    }

    public Texto(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

}
