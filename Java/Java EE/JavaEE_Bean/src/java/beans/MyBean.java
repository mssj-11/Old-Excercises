package beans;

import java.io.Serializable;
//  1.- Interfaz Serializable
public class MyBean implements Serializable{
    
    //  2.- Atributosa privados
    private int id;
    private String name;
    private int number;
    
    
    //  3.- Constructor vacio
   public MyBean(){
       
   }
    
    
    //  4.- Metodos:    Getter-Setter
    public int getId(){  return id;  }
    public void setId(int id){  this.id = id;   }
    
    
    public String getName(){  return name;  }
    public void setName(String name){  this.name = name;   }
    
    
    public int getNumber(){  return number;  }
    public void setNumber(int number){  this.number = number;   }
    
    
}