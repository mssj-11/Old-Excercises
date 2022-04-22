/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosSql2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class Metodos_SQL2 {

    public static ConexionBD2 conexion = new ConexionBD2();
    public static PreparedStatement st;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;

    public int guardar(String nombre, String apellido, String correo, String contraseña) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO usuarios (nombre,apellido,correo,contraseña) VALUES (?,?,?,?)");

        try {
            conexion = ConexionBD2.conectar();
            st = conexion.prepareStatement(sentencia_guardar);
            st.setString(1, nombre);
            st.setString(2, apellido);
            st.setString(3, correo);
            st.setString(4, contraseña);

            resultado = st.executeUpdate();
            st.close();

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    ////////////guardarcompras
    public int guardarCompras(String id_movimientoC, String C_precio, String C_cantidad, String C_dia, String C_mes, String C_producto, String N_usuario) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO compras (id_movimientoC,C_precio,C_cantidad ,C_dia ,C_mes ,C_producto,N_usuario ) VALUES (?,?,?,?,?,?,?)");

        try {
            conexion = ConexionBD2.conectar();
            st = conexion.prepareStatement(sentencia_guardar);
            st.setString(1, id_movimientoC);
            st.setString(2, C_precio);
            st.setString(3, C_cantidad);
            st.setString(4, C_dia);
            st.setString(5, C_mes);
            st.setString(6, C_producto);
            st.setString(7, N_usuario);

            resultado = st.executeUpdate();
            st.close();

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
    ////////////////

    public int guardarManu(String id_PP, String CM_inversion, String CM_tiempo_fabricacion_min, String Num_producto) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO c_manufactura (id_PP,CM_inversion ,CM_tiempo_fabricacion_min, Num_producto) VALUES (?,?,?,?)");

        try {
            conexion = ConexionBD2.conectar();
            st = conexion.prepareStatement(sentencia_guardar);
            st.setString(1, id_PP);
            st.setString(2, CM_inversion);
            st.setString(3, CM_tiempo_fabricacion_min);
            st.setString(4, Num_producto);

            resultado = st.executeUpdate();
            st.close();

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int guardarEmp(String id_Emp, String E_nombre, String E_Apellido, String E_Edad, String E_Genero) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO empleados (id_Emp,E_nombre,E_Apellido,E_Edad,E_Genero) VALUES (?,?,?,?,?)");

        try {
            conexion = ConexionBD2.conectar();
            st = conexion.prepareStatement(sentencia_guardar);
            st.setString(1, id_Emp);
            st.setString(2, E_nombre);
            st.setString(3, E_Apellido);
            st.setString(4, E_Edad);
            st.setString(5, E_Genero);

            resultado = st.executeUpdate();
            st.close();

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    ///////////////////////////////////////////
    public int guardarEmpre(String id, String nombre, String ubicacion) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO empresa (id,nombre ,ubicacion) VALUES (?,?,?)");

        try {
            conexion = ConexionBD2.conectar();
            st = conexion.prepareStatement(sentencia_guardar);
            st.setString(1, id);
            st.setString(2, nombre);
            st.setString(3, ubicacion);

            resultado = st.executeUpdate();
            st.close();

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    ///////////////////////////////////////////
    public int guardarPersonal(String PCV_Num_Usuario, String N_empleado, String PCV_puesto) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO personal_c_v (PCV_Num_Usuario,N_empleado ,PCV_puesto ) VALUES (?,?,?)");

        try {
            conexion = ConexionBD2.conectar();
            st = conexion.prepareStatement(sentencia_guardar);
            st.setString(1, PCV_Num_Usuario);
            st.setString(2, N_empleado);
            st.setString(3, PCV_puesto);

            resultado = st.executeUpdate();
            st.close();

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
    ////////////////

    public int guardarProductos(String id_producto, String Num_proveedor, String Pd_lote, String Pd_numALmacen) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO productos (id_producto,Num_proveedor ,Pd_lote , Pd_numALmacen ) VALUES (?,?,?,?)");

        try {
            conexion = ConexionBD2.conectar();
            st = conexion.prepareStatement(sentencia_guardar);
            st.setString(1, id_producto);
            st.setString(2, Num_proveedor);
            st.setString(3, Pd_lote);
            st.setString(4, Pd_numALmacen);

            resultado = st.executeUpdate();
            st.close();

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int guardarProdF(String id_PF, String Num_PP, String PF_dia_caducidad, String PF_mes_caducidad, String PF_año_caducidad) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO producto_f (id_PF,Num_PP,PF_dia_caducidad,PF_mes_caducidad,PF_año_caducidad ) VALUES (?,?,?,?,?)");

        try {
            conexion = ConexionBD2.conectar();
            st = conexion.prepareStatement(sentencia_guardar);
            st.setString(1, id_PF);
            st.setString(2, Num_PP);
            st.setString(3, PF_dia_caducidad);
            st.setString(4, PF_mes_caducidad);
            st.setString(5, PF_año_caducidad);

            resultado = st.executeUpdate();
            st.close();

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int guardarProv(String id_proveedor, String P_nombre, String P_apellido, String P_producto, String P_empresa) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO proveedores (id_proveedor,P_nombre,P_apellido,P_producto,P_empresa ) VALUES (?,?,?,?,?)");

        try {
            conexion = ConexionBD2.conectar();
            st = conexion.prepareStatement(sentencia_guardar);
            st.setString(1, id_proveedor);
            st.setString(2, P_nombre);
            st.setString(3, P_apellido);
            st.setString(4, P_producto);
            st.setString(5, P_empresa);

            resultado = st.executeUpdate();
            st.close();

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
    
            ////////////guardarcompras
    public int guardarRegist(String id_registro, String Num_Emp, String H_entrada, String H_salida, String H_dia, String H_mes) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO registro_h (id_registro,Num_Emp,H_entrada ,H_salida ,H_dia ,H_mes ) VALUES (?,?,?,?,?,?)");

        try {
            conexion = ConexionBD2.conectar();
            st = conexion.prepareStatement(sentencia_guardar);
            st.setString(1, id_registro);
            st.setString(2, Num_Emp);
            st.setString(3, H_entrada);
            st.setString(4, H_salida);
            st.setString(5, H_dia);
            st.setString(6, H_mes);
            

            resultado = st.executeUpdate();
            st.close();

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
////////////guardarcompras
    public int guardarVentas(String id_movimientoV, String V_precio, String V_cantidad, String V_dia, String V_mes, String V_producto, String N_usuario) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO ventas (id_movimientoV,V_precio,V_cantidad ,V_dia ,V_mes ,V_producto,N_usuario ) VALUES (?,?,?,?,?,?,?)");

        try {
            conexion = ConexionBD2.conectar();
            st = conexion.prepareStatement(sentencia_guardar);
            st.setString(1, id_movimientoV);
            st.setString(2, V_precio);
            st.setString(3, V_cantidad);
            st.setString(4, V_dia);
            st.setString(5, V_mes);
            st.setString(6, V_producto);
            st.setString(7, N_usuario);

            resultado = st.executeUpdate();
            st.close();

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int guardarVisit(String id_visit, String V_nombre, String V_apellido, String V_genenero, String V_motivo) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO visitantes (id_visit,V_nombre,V_apellido,V_genenero,V_motivo) VALUES (?,?,?,?,?)");

        try {
            conexion = ConexionBD2.conectar();
            st = conexion.prepareStatement(sentencia_guardar);
            st.setString(1, id_visit);
            st.setString(2, V_nombre);
            st.setString(3, V_apellido);
            st.setString(4, V_genenero);
            st.setString(5, V_motivo);

            resultado = st.executeUpdate();
            st.close();

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

//METODOS DE QUIEN INICIA SESION
    public static String buscarNombre(String correo) {
        String busqueda_nombre = null;
        Connection conexion = null;

        try {
            conexion = ConexionBD2.conectar();
            String sentencia_buscar = ("SELECT nombre,apellido FROM usuarios WHERE correo ='" + correo + "'");
            st = conexion.prepareStatement(sentencia_buscar);
            resultado = st.executeQuery();

            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                busqueda_nombre = (nombre + " " + apellido);
            }

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        return busqueda_nombre;

    }
    
//busqueda usuario registrado

    public static String buscarUsuarioRegistrado(String correo, String contraseña) {

        String busqueda_usuario = null;
        Connection conexion = null;

        try {
            conexion = ConexionBD2.conectar();
            String sentencia_buscar_usuario = ("SELECT nombre,correo, contraseña FROM usuarios WHERE correo ='" + correo + "' && contraseña = " + contraseña + "'");
            st = conexion.prepareStatement(sentencia_buscar_usuario);
            resultado = st.executeQuery();

            if (resultado.next()) {

                busqueda_usuario = "USUARIO ENCONTRADO";
            } else {
                busqueda_usuario = "USUARIO NO ENCONTRADO";
            }

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        return busqueda_usuario;

    }

}
