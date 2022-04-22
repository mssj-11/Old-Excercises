/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MISEJERCICIOS;

/**
 *
 * @author HP
 */
public class FCB {
   public String portero="Ter Stegen";
   public String defensa_lateral_izquierdo="Yerry Mina";
   public String defensa_central="Umtiti";
   public String defensa_lateral_derecho="Pique";
   public String centro_campista_lateral_izquierdo="Philippe Countinho";
   public String centro_campista_central="Andres Iniesta";   
   public String centro_campista_lateral_derecho="Ivan Rakitic";      
   public String delantero_izquierdo="Luis Suarez";      
   public String delantero_centro="Messi";       
   public String delantero_derecho="Dembele";
   public String entrenador="Ernesto Valverde";
   
   
   
   public void imprimir(){
        System.out.println("\nel portero es:"+portero+"\nel defensa_lateral_izquierdo"+defensa_lateral_izquierdo+"\nel defensa_central"+defensa_central+"\nel defensa_lateral_derecho"+defensa_lateral_derecho+"\nel centro_campista_lateral_izquierdo"+centro_campista_lateral_izquierdo+"\nel centro_campista_central"+centro_campista_central+"\nel centro_campista_lateral_derecho"+centro_campista_lateral_derecho+"\nel delantero_izquierdo"+delantero_izquierdo+"\nel delantero_centro"+delantero_centro+"\nel delantero_derecho"+delantero_derecho+"\nel entrenador"+entrenador);
     
    }
   
   public void setentrenador(String ent){
        
        entrenador=ent;
    }
    
    public String getentrenador(){
        return entrenador;
    }
    
    public static void main(String [] args){
        FCB FCB1=new FCB ();
        FCB1.imprimir();
        
        FCB1.setentrenador("Ernesto Valverde");
        FCB1.imprimir();
        //FCB1.imprimir();
    }
    
    public String getPortero(){
        return portero;
    }
    
    public String getDefensa_lateral_izquierdo(){
        return defensa_lateral_izquierdo;
    }
    
    public String getDefensa_central(){
        return defensa_central;
    }
    
    public String getDefensa_lateral_derecho(){
        return defensa_lateral_derecho;
    }
    
    public String getCentro_campista_lateral_izquierdo(){
        return centro_campista_lateral_izquierdo;
    }
    
    public String getCentro_campista_central(){
        return centro_campista_central;
    }
    
    public String getCentro_campista_lateral_derecho(){
        return centro_campista_lateral_derecho;
    }
    
    public String getDelantero_izquierdo(){
        return delantero_izquierdo;
    }
    
     public String getDelantero_centro(){
        return delantero_centro;
    }
     
     public String getDelantero_derecho(){
        return delantero_derecho;
    }
     
      public String getEntrenador(){
        return entrenador;
    }
    
}
