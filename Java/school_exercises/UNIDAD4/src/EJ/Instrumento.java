/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ;

/**
 *
 * @author HP
 */
public abstract class Instrumento {
    
    public abstract void tocar();
    public String tipo() {
	return "Instrumento";
    }
    public abstract void afinar();
    
}
