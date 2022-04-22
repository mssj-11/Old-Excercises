/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package php;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Daniel
 */
public class conectar {
    Connection conexion;
    String direccion,usuario, password;

    public conectar() {
        conexion = null;
        direccion ="jdbc:mysql://localhost:3306/mibase";
       usuario ="root";
       password ="daniel01";
    }
    
    public void cominucar(){
        try {
            conexion= (Connection) DriverManager.getConnection(direccion, usuario, password);
            if(conexion != null){
                System.out.println("la conexion se ha establecido con exito");}
        } catch (Exception e) {
            System.out.println("error en la conexion");
        }
}
    public static void main(String[] args) {
        conectar co=new conectar();
        co.cominucar();
    }
}
