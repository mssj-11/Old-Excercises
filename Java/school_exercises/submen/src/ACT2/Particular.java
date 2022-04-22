/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACT2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Particular extends Conductor {
    public String tipo_de_vehiculo;
    public int No_cilindros;
    public double kilometraje;
    public int agregados;
    public Particular() {
    super();
    this.tipo_de_vehiculo = "Sedan";
    this.No_cilindros = 4;
    this.kilometraje = 200;
    }
    @Override
    public void entrada (){
        Scanner par=new Scanner(System.in);
 System.out.println("\n                   Clase Particular atributos                   \n");
    System.out.println("Escribe el tipo de vehiculo ");
    tipo_de_vehiculo=par.nextLine();
    System.out.println("Introduce el numero de ciindros del vehiculo ");
    No_cilindros = par.nextInt();
    System.out.println("Introduce el kilometraje ");
    kilometraje = par.nextDouble();
 
}
    public void Herencia_editados (){
    super.entrada();
    }

    public Particular(String tipo_de_vehiculo, int No_cilindros, double kilometraje) {
        super();
        this.tipo_de_vehiculo = tipo_de_vehiculo;
        this.No_cilindros = No_cilindros;
        this.kilometraje = kilometraje;
    }

    public Particular(String tipo_de_vehiculo, int No_cilindros, double kilometraje, String nombre, int edad, int NO_licencia, int A_experiencia) {
        super(nombre, edad, NO_licencia, A_experiencia);

    }
    public String getTipo_de_vehiculo() {
        return tipo_de_vehiculo;
    }

    public void setTipo_de_vehiculo(String tipo_de_vehiculo) {
        this.tipo_de_vehiculo = tipo_de_vehiculo;
    }

    public int getNo_cilindros() {
        return No_cilindros;
    }

    public void setNo_cilindros(int No_cilindros) {
        this.No_cilindros = No_cilindros;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
    public void Gastos (float gasto_litros, float costo_pesos){
       float rendim = (float) (18) - ((No_cilindros - 4) * 2 );
        gasto_litros = (float) (kilometraje) / (rendim);
        costo_pesos = (float) ((float) (gasto_litros) * (15.70)); 
    System.out.println("El vehículo gasto para un viaje de "+this.kilometraje+" Km generando un costo al propietario de "+gasto_litros+" litros y un total de "+costo_pesos+ " pesos" );
   
    }
  
    
    
     public void datos2 (){
    System.out.println("su nombre es "+this.getNombre());
    System.out.println("su edad es de "+this.getEdad());
    System.out.println("su numero de licencia es "+this.getNO_licencia());
    System.out.println("su experiencia es de "+this.getA_experiencia()+" años");
    
    }
    public void Datos_C (){
    System.out.println("Tipo de vehiculo "+this.getTipo_de_vehiculo());
    System.out.println("numeros de cilindros "+this.getNo_cilindros());
    System.out.println("numero de kilometros "+this.getKilometraje());
    }

}
