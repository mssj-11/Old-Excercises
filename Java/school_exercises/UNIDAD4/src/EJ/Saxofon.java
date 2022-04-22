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
public class Saxofon extends Instrumento {
    
    @Override
    public void tocar() {
	System.out.println("Saxofon.tocar()");
    }
    @Override
    public String tipo() { return "Saxofon"; }
    @Override
    public void afinar() {
    }
    
}
