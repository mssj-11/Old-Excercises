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
public class Mamifero {
    int piel;
    int fisico;
    String pelo; //l es  largo , c corto
    int esqueleto;
    String sangre;
           
    
    public void imprimir(){
        System.out.println("\nla piel es:"+piel+"\nel sisico es"+fisico+"\nel pelo es"+pelo+"\nel esqueleto es"+esqueleto+"\nla sangre es"+sangre);
    }
    
    public void setpelo(String pel){
        pelo=pel;
        
    }
    
    public String getpelo(){
        return pelo;
    }
    
    public static void main(String [] args){
        Mamifero m1=new Mamifero ();
        m1.imprimir();
        
        
        m1.setpelo("largo");
       m1.imprimir();
       //m1.imprimir();
    }
    
    public int getPiel(){
        return piel;
    }
    
    public int getFisico(){
        return fisico;
    }
    
    public String getPelo(){
        return pelo;
    }
    
    public int getEsqueleto(){
        return esqueleto;
    }
    
    public String getSangre(){
        return sangre;
    }
}
