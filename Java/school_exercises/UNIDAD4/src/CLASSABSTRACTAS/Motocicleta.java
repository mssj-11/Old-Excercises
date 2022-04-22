/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSABSTRACTAS;

/**
 *
 * @author HP
 */
public class Motocicleta extends Automovil {

    public String color;
    public String tipo;

    public Motocicleta(String color, String tipo,int num_llantas, String marca, String modelo) {
        super(4, "Benoto", "ACE");
        this.color = color;
        this.tipo = tipo;
    }

    public Motocicleta() {
        super(4, "Benoto", "ACE");
        this.color = "rojo";
        this.tipo = "Montana";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    
    
    
    
@Override
    public void Datos() {
        super.Datos();
        System.out.println("El color es >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + this.getColor());
        System.out.println("Es de tipo >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + this.getTipo());
    }
    
 

    @Override
 public double Velocidad_Maxima(){
            System.out.println("La Velocidad Maxima de la Motocicleta es: 25 km/hr");
        return 0;
            
}
   

}
