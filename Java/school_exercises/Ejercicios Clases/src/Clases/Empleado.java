/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author HP
 */
public class Empleado {
    String nombre;
    char estatura;
    String sexo; //m es  masculino , f femenino
    int edad=19;
    
    
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
        Empleado e1=new Empleado ();
        e1.imprimir();
        
        
        e1.setsexo("masculino");
       e1.imprimir();
       //e1.imprimir();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public char getEstatura(){
        return estatura;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public int getEdad(){
        return edad;
    }
}
