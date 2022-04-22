/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Torq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

/* 
 *
 *
 * @author Daniel
 */
public class Conexion {

    /*    com.mysql.jdbc.Connection conexion;
    String direccion,usuario, password;

    public Conexion() {
        conexion = null;
        direccion ="jdbc:mysql://localhost:3306/Torq";
       usuario ="root";
       password ="dani1234";
    }
    
    public void cominucar(){
        try {
            conexion= (com.mysql.jdbc.Connection) DriverManager.getConnection(direccion, usuario, password);
            if(conexion != null){
                System.out.println("la conexion se ha establecido con exito");}
        } catch (Exception e) {
            System.out.println("no ");
        }
}
    
    
    public static void main(String[] args) {
        Conexion co=new Conexion();
        co.cominucar();
        Statement st;
        ResultSet rs;
        try {
            st=co.conexion.createStatement();
            rs=st.executeQuery("select *from VW;");
            while (rs.next()) {                
                System.out.println(rs.getString("nombre")+" " +rs.getString("modelo")+" " +rs.getString("litros")+" " +rs.getString("cilindros"));
            }
            co.conexion.close();
        } catch (Exception e) {
        }
    }*/
    Connection con;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/torq", "root", "dani1234");
        } catch (Exception e) {
            System.err.println("Error:" + e);
        }
    }

    public static void main(String[] args) {
        Conexion cn = new Conexion();
        Statement st;
        ResultSet rs;
        try {
            st = cn.con.createStatement();
            rs = st.executeQuery("select * from VW;");
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " " + rs.getString("modelo") + " " + rs.getString("litros") + " " + rs.getString("cilindros"));
            }
            cn.con.close();
        } catch (Exception e) {
        }
    }
}
