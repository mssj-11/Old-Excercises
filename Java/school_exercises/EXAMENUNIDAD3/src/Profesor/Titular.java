/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesor;

/**
 *
 * @author HP
 */
public class Titular extends Profesor {
    
    int anos_experiencia;
    String Especialiad;

    public Titular() {
        this.anos_experiencia = 20;
        this.Especialiad="POO";
    }

    public Titular(int anos_experiencia,String Especialiad, String nombre, int edad) {
        super();
        this.nombre = nombre;
        this.edad= edad;
        
    }
    
    public void Da_mas_clases(){
    super.Evalua();
        System.out.println("Los anos de experiencia del Profesor Titular son:" + anos_experiencia);
        System.out.println("La Especialidad del Profesor Titular es:" + Especialiad);
        System.out.println("El Pofesor Evalua !!!!!");
        System.out.println("El Pofesor Da mas Clases !!!!!");
    }

    public int getAnos_experiencia() {
        return anos_experiencia;
    }

    public void setAnos_experiencia(int anos_experiencia) {
        this.anos_experiencia = anos_experiencia;
    }

    public String getEspecialiad() {
        return Especialiad;
    }

    public void setEspecialiad(String Especialiad) {
        this.Especialiad = Especialiad;
    }
    
    
}
