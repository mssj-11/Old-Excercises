/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERSONA;

/**
 *
 * @author HP
 */
public class Admi extends Trabajador {
    public String lugar_trabajo;
    
    
    public Admi (){
       this.lugar_trabajo=lugar_trabajo="DF"; 
    }
    
    
    public Admi (String lugar_trabajo){
       super (2643,"almacen",3000.00);
       this.lugar_trabajo=lugar_trabajo; 
    }
    
   
    public void imprimir (){
    System.out.println("el nombre del trabajador es: "+this.nombre);
    System.out.println("la edad del trabajador es: "+this.edad);
    System.out.println("el numero de empleado del trabajador es: "+this.n_empleado);
    System.out.println("el sexo del trabajador es: "+this.sexo);
    System.out.println("el area del trabajador es: "+this.area);
    System.out.println("el sueldo del trabajador es: "+this.sueldo);
    System.out.println("su lugar de trabajo es: "+this.lugar_trabajo);
    }
}
