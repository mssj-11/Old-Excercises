/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenunidad3;

/**
 *
 * @author acer
 */
public class Rifle extends Arma {
    int alcance;

    public Rifle() {
        this.alcance = 10;
    }

    public Rifle(int alcance, int potencia, double costo) {
        super();
        this.alcance = alcance;
    }
    
    public void disparada (){
     super.activada();
        System.out.println("El alcance del rifle es de:" + alcance);
        System.out.println("El rifle si dispara !!!!!");
        
      }

   
    
}
