/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class Conectar {
    private static Connection conn;
    private static final String driver="conn.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String password="dani1234";
    private static final String url="jdbc:mysql://localhost:3306/torq";

    public Conectar() {
        conn=null;
        try {
            Class.forName(driver);
            conn=DriverManager.getConnection(url, user, password);
            if(conn != null){
            System.out.println("correcta conexion");
            }
        }catch(ClassNotFoundException |  SQLException e){
            System.out.println("ERROR" + e);
        }
    }
    
    public Connection getConnection(){
    return conn;
    }
    
    public void desconectar(){
    conn=null;
    if(conn==null){
        System.out.println(" conexion descoentada");
    
    }
    }
}
