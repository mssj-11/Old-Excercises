/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosSql;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class ConexionBD {

    public static String url = "jdbc:mysql://localhost/bddproyecto1";
    public static String usuario = "root";
    public static String contraseña = "";
    public static String clase = "com.mysql.jdbc.Driver";

    public static Connection conectar() {
        Connection conexion = null;

        try {
            Class.forName(clase);
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("CONEXION ESTABLECIDA");
//ClassNotFoundException | SQLException e
        } catch (Exception e) {
            System.out.println("ERROR DE CONEXION" + e);
        }
        return conexion;
    }

}
