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
// Este es otro tipo de Guitarra
public class Ukelele extends Guitarra {
    
    @Override
    public void tocar() {
	System.out.println("Ukelele.tocar()");
    }
    @Override
    public String tipo() { 
        return "Ukelele"; 
    }
    
}
