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
public class Escuela {
    public String nombre;
    public String aulas;
    public int clave;
    public String nivel_escolar;
    
    public Escuela (String nombre,String aulas,int clave) {
    this.nombre=nombre;
    this.aulas=aulas;
    this.clave=clave;
}

    public Escuela(String nivel_escolar) {
        this.nivel_escolar = nivel_escolar;
    }
    
    
    public void imprimir(){
        System.out.println("\nel nombre es:"+this.getNombre()+"\nel numer de aulas es"+this.getAulas()+"\nla clave es"+this.getClave()+"\nel numero de alumnos es"+this.getNivel_escolar());
        
    }
    
    public void setnombre(String nom){
       
       nombre=nom;
       
   }
   
    public String getnombre(){
       
       return nombre;
       
   }
    
            
    public static void main(String [] args){
        Escuela E1=new Escuela (" tesjo","25 ", 1236 );
        Escuela E2=new Escuela ("vivel_superior");
        E1.imprimir();
        E2.imprimir();
        
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
