/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class conexionMysql {

    /* private static String URL = "jdbc:mysql://localhost/fbaseddatos"; //127.0.0.1
    private static String usuario = "root";
    private static String contraseña = "";

    public static Connection conexion() {
        Connection conectar = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(URL, usuario, contraseña);
            System.out.println("CONEXION ESTABLECIDA");
        } catch (Exception e) {
            System.out.println("ERROR DE CONEXION" + e);
        }

        return conectar;
    }*/
    ///////////////////////////////////////////////////////////////////////////////////7
    Connection conectar = null;

    public Connection conexion() {
        try {
            //System.out.println("\033[34mConectando a la base de datos :3");
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/fbaseddatos", "root", "");
            JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
            //System.out.println("\n\033[31mConexion Exitosa!! :)");

        } catch (Exception e) {
            //System.out.println("\nError de Mysql :v ");
            //System.out.print("se ha encontrado el siguiente error !! " + e.getMessage());
            JOptionPane.showMessageDialog(null, "ERRROR DE CONEXION" + e.getMessage());
        }
        return conectar;
    }
}
