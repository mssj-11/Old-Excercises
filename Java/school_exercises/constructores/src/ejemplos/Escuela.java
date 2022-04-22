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
public class Escuela {
   public String nombre;
   public String aulas;
   public int clave;
   public String nivel_escolar;
    
    public Escuela (String nombre,String aulas,int clave,String nivel_escolar) {
    this.nombre=nombre;
    this.aulas=aulas;
    this.clave=clave;
    this.nivel_escolar=nivel_escolar;
}

    
    public void imprimir(){
        System.out.println("\nel nombre es:"+nombre+"\nel numer de aulas es"+aulas+"\nla clave es"+clave+"\nel numero de alumnos es"+nivel_escolar);
        
    }
    
    public void setnombre(String nom){
       
       nombre=nom;
       
   }
   
    public String getnombre(){
       
       return nombre;
       
   }
    
            
    public static void main(String [] args){
        Escuela E1=new Escuela (" tesjo","25 ", 1236 ,"vivel_superior");
        E1.imprimir();
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getAulas() {
        return aulas;
    }

    public int getClave() {
        return clave;
    }

    public String getNivel_escolar() {
        return nivel_escolar;
    }
}
