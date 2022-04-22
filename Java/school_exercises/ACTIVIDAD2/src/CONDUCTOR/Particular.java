/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONDUCTOR;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Particular extends Conductor {
    private String tipo_vehículo;
    private int n_cilindros;
    private double kilometraje;
    
    public Particular (String tipo_vehículo,int n_cilindros,double kilometraje) {
    this.tipo_vehículo=tipo_vehículo;
    this.n_cilindros=n_cilindros;
    this.kilometraje=kilometraje;
}
     
    public Particular () {
    super();
    this.tipo_vehículo="Ford";
    this.n_cilindros=6;
    this.kilometraje=150;  
    }
    
    
    @Override
    public void Entrada (){
        Scanner par=new Scanner(System.in);
    System.out.println("\nClase Particular atributos\n");
    
    System.out.println("Introduce el tipo de vehiculo ");
        setTipo_vehículo(par.nextLine());
    System.out.println("Introduce el numero de ciindros del vehiculo ");
        setN_cilindros(par.nextInt());
    System.out.println("Introduce el kilometraje ");
        setKilometraje(par.nextDouble());
}
    
    
    public Particular(String nombre, int edad, int n_licencia, int anos_experiencia, String tipo_vehículo, int n_cilindros, double kilometraje) {
    super(nombre, edad, n_licencia, anos_experiencia);
    this.tipo_vehículo = "Sedan";
    this.n_cilindros = 4;
    this.kilometraje = 200;
    }
    
  
    /**
     * @return the tipo_vehículo
     */
    public String getTipo_vehículo() {
        return tipo_vehículo;
    }

    /**
     * @param tipo_vehículo the tipo_vehículo to set
     */
    public void setTipo_vehículo(String tipo_vehículo) {
        this.tipo_vehículo = tipo_vehículo;
    }

    /**
     * @return the n_cilindros
     */
    public int getN_cilindros() {
        return n_cilindros;
    }

    /**
     * @param n_cilindros the n_cilindros to set
     */
    public void setN_cilindros(int n_cilindros) {
        this.n_cilindros = n_cilindros;
    }

    /**
     * @return the kilometraje
     */
    public double getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    public void Gastos (float gasto_litros, float costo_pesos){
    float i = (float) (18) - ((getN_cilindros() - 4) * 2 );
    gasto_litros = (float) (getKilometraje()) / (i);
    costo_pesos = (float) ((float) (gasto_litros) * (15.70)); 
    System.out.println("el vehículo gasto para un viaje de "+this.getKilometraje()+" Km generando un costo al propietario de "+gasto_litros+" litros y un total de "+costo_pesos+ " pesos" );
    System.out.println("                                                    ");
    
    }
  
    
     public void Datos2 (){
    System.out.println("su nombre es "+this.getNombre());
    System.out.println("su edad es de "+this.getEdad());
    System.out.println("su numero de licencia es "+this.getN_licencia());
    System.out.println("su experiencia es de "+this.getAnos_experiencia()+" años");
    System.out.println("Tipo de vehiculo "+this.getTipo_vehículo());
    System.out.println("numeros de cilindros "+this.getN_cilindros());
    System.out.println("numero de kilometros "+this.getKilometraje());
    System.out.println("________________________________________________");
    }
    
    
}
