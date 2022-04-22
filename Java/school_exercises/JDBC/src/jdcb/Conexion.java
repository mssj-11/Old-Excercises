/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdcb;

import java.sql.Connection;

/**
 *
 * @author HP
 */
public class Conexion {

    public static Connection sql;

    public static String user = "usuario";
    public static String pas = "contraseña ";

    public static Connection conectar() throws Exception {
        try {
            String databaseURL = "ruta donde se encuentra nuestra base de datos";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            sql = java.sql.DriverManager.getConnection(databaseURL, user, pas);
            //System.out.println("Conexion Establecida..");
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }
        return sql;
    }

}
