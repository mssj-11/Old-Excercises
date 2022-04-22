/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.Sobrecarga;

/**
 *
 * @author HP
 */
public class Empleado {
    public String nombre;
    public int estatura;
    public String sexo;
    public int edad;
    
    
    public Empleado (String nombre,String sexo) {
    this.nombre=nombre;
    this.sexo=sexo;    
    }

    public Empleado(int estatura, int edad) {
        this.estatura = estatura;
        this.edad = edad;
    }
    
    
    public void imprimir(){
        System.out.println("\nel nombres"+this.getNombre()+"\nla estatura es"+this.getEstatura()+"\nel sexo es"+this.getSexo()+"\nla edad es"+this.getEdad());
    }
    
    public void setsexo(String sex){
        sexo=sex;
    }
    
    public String getsexo(){
        return sexo;
    }
    
    public static void main(String [] args){
        Empleado e1=new Empleado ("pepe","masculino");
        Empleado e2=new Empleado (170,22);
        e1.imprimir();
        e2.imprimir();
        
        e1.setsexo("masculino");
        e1.imprimir();
        //e1.imprimir();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEstatura(){
        return estatura;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public int getEdad(){
        return edad;
    }    
}
