//  Estructuras Dinamicas de Datos -   #1   ArrayList
package EstructurasDinamicasDatos;

public class Auto {
    
    //  Atributos
    private String patente;
    private String color;
    
    
    
    //  Constructor
    public Auto(String patente, String color){
        this.patente = patente;
        this.color = color;
    }
    
    
    //  Devuelve en formato Cadena con toString
    public String toString(){
        return "Auto - " + "Patente: " +patente+ ", Color: "+color+ "\n";
    }
    
    
}