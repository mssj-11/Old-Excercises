/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author HP
 */
public class Empleado {
    public String nombre;
    public int estatura;
    public String sexo;
    public int edad;
    
    
    public Empleado (String nombre,int estatura,String sexo,int edad) {
    this.nombre=nombre;
    this.estatura=estatura;
    this.sexo=sexo;
    this.edad=edad; 
        
    }
    
    public void imprimir(){
        System.out.println("\nel nombres"+nombre+"\nla estatura es"+estatura+"\nel sexo es"+sexo+"\nla edad es"+edad);
    }
    
    public void setsexo(String sex){
        sexo=sex;
    }
    
    public String getsexo(){
        return sexo;
    }
    
    public static void main(String [] args){
        Empleado e1=new Empleado ("pepe",170,"masculino",22);
        e1.imprimir();
        
        
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
