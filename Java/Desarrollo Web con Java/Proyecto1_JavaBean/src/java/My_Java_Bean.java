import java.io.Serializable;
/**
 *  UN JAVA BEAN
 * @author HP   -   MSS
 */
public class My_Java_Bean implements Serializable{  //  1.- Debe de ser Serializable
    //  2.- Atributos privados
    private String id;
    private String name;
    
    
    //  4.- Constructor vacio
    public My_Java_Bean(){
    }
    
    
    //  3.- Sets and Gets
    public String getId(){  return id;  }
    public void setId(String id){   this.id = id;   }
    
    public String getName(){    return name;    }
    public void setName(String name){   this.name = name;   }
    
    
}