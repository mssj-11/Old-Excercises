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
public class Mamifero {
    public String la_piel;
    public String tipo_pelo;
    public String tipo_esqueleto;
    public String la_sangre;
    
public Mamifero (String la_piel, String tipo_pelo, String tipo_esqueleto, String la_sangre){
    this.la_piel=la_piel;
    this.tipo_pelo=tipo_pelo;
    this.tipo_esqueleto=tipo_esqueleto;
    this.la_sangre=la_sangre; 
}
           
    
    public void imprimir(){
        System.out.println("\nla piel es:"+la_piel+"\nel tipo de pelo es"+tipo_pelo+"\nel tipo de esqueleto es"+tipo_esqueleto+"\nla sangre es"+la_sangre);
    }
    
    public void setpelo(String pel){
        tipo_pelo=pel;
        
    }
    
    public String getpelo(){
        return tipo_pelo;
    }
    
    public static void main(String [] args){
        Mamifero M1=new Mamifero ("colorida","piloso","esqueleto","tipo A");
        M1.imprimir();
        
        M1.setpelo("largo");
       M1.imprimir();
       //M1.imprimir();
        
    }
    
    public String getPiel(){
        return la_piel;
    }
    
    
    public String getPelo(){
        return tipo_pelo;
    }
    
    public String getEsqueleto(){
        return tipo_esqueleto;
    }
    
    public String getSangre(){
        return la_sangre;
    }
}
