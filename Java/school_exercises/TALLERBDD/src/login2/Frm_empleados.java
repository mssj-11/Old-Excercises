/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login2;

import MetodosSql2.ConexionBD2;
import MetodosSql2.Metodos_SQL2;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

/**
 *
 * @author HP
 */
public class Frm_empleados extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();

    Metodos_SQL2 metodos = new Metodos_SQL2();
    public PreparedStatement st;
    public ResultSet resultado;

    public static String url = "jdbc:mysql://localhost/fbaseddatos";
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
///////////////

    public void limpiarcajas() {
        txtid_cliente.setText(null);
        txtnombre_cliente.setText(null);
        txtcalle_cliente.setText(null);
        txtcuidad_cliente.setText(null);
        txtNum_prestamo.setText(null);
        txtbuscar.setText(null);

    }

    ////////////
    public Frm_empleados() {
        this.setContentPane(fondo);
        initComponents();

        setLocationRelativeTo(null);

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtcalle_cliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnombre_cliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtid_cliente = new javax.swing.JTextField();
        btnlimpiar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcuidad_cliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnborrar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtcliente = new javax.swing.JTable();
        btncargartabla = new javax.swing.JButton();
        REGRESAR = new javax.swing.JButton();
        txtNum_prestamo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtcalle_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcalle_clienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        txtnombre_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre_clienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        txtid_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid_clienteActionPerformed(evt);
            }
        });

        btnlimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnguardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnmodificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Calle");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cliente");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));

        txtcuidad_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcuidad_clienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ciudad");

        btnborrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnborrar.setText("Borrar");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btnbuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jtcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id_cliente", "nombre_cliente", "calle_cliente", "cuidad_cliente", "Num_prestamo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtcliente);

        btncargartabla.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btncargartabla.setText("Cargar Tabla");
        btncargartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargartablaActionPerformed(evt);
            }
        });

        REGRESAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        REGRESAR.setText("REGRESAR");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("N_prestamo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(76, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcuidad_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(txtcalle_cliente)
                            .addComponent(txtid_cliente)
                            .addComponent(txtnombre_cliente)
                            .addComponent(txtNum_prestamo))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(60, 60, 60)))
                .addComponent(REGRESAR)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(btncargartabla))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnguardar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnmodificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnborrar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnlimpiar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(REGRESAR))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtid_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtnombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcalle_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcuidad_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncargartabla)
                            .addComponent(txtNum_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnmodificar)
                    .addComponent(btnlimpiar)
                    .addComponent(btnborrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcalle_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcalle_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcalle_clienteActionPerformed

    private void txtnombre_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre_clienteActionPerformed

    private void txtid_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid_clienteActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed

        limpiarcajas();

    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        int a = metodos.guardarEmp(txtid_cliente.getText(), txtnombre_cliente.getText(), txtcalle_cliente.getText(), txtcuidad_cliente.getText(), txtNum_prestamo.getText());
        if (a > 0) {
            JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE");
        } else {
            JOptionPane.showMessageDialog(this, "NO SE GUARDARON LOS DATOS");
        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed

        Connection conexion = null;
        try {
            conexion = conectar();
            st = conexion.prepareStatement("UPDATE empleados SET id_Emp = ?,E_nombre = ? ,E_Apellido  = ?, E_Edad = ?, E_Genero = ? WHERE id_Emp = ?");

            st.setString(1, txtid_cliente.getText());
            st.setString(2, txtnombre_cliente.getText());
            st.setString(3, txtcalle_cliente.getText());
            st.setString(4, txtcuidad_cliente.getText());
            st.setString(5, txtNum_prestamo.getText());

            st.setString(6, txtbuscar.getText());
            //resultado = st.executeQuery();

            int resultado = st.executeUpdate();

            if (resultado > 0) {

                JOptionPane.showMessageDialog(this, "DATO MODIFICADO ");

            } else {
                JOptionPane.showMessageDialog(this, "NO MODIFICADO");
            }

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_btnmodificarActionPerformed

    private void txtcuidad_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcuidad_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcuidad_clienteActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed

        Connection conexion = null;
        try {
            conexion = conectar();
            st = conexion.prepareStatement("DELETE FROM empleados WHERE id_Emp=?");
            st.setString(1, txtbuscar.getText());
            //en caso de id a string
            /* st.setInt(1, Integer.parseInt(txtbuscar.getText()));*/

            int resultado = st.executeUpdate();

            if (resultado > 0) {

                JOptionPane.showMessageDialog(this, "DATO ELIMINADO ");

            } else {
                JOptionPane.showMessageDialog(this, "NO ELIMINADO");
            }

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        Connection conexion = null;
        try {
            conexion = conectar();
            st = conexion.prepareStatement("SELECT * FROM empleados WHERE id_Emp = ?");
            st.setString(1, txtbuscar.getText());
            resultado = st.executeQuery();

            if (resultado.next()) {
                txtid_cliente.setText(resultado.getString("id_Emp"));
                txtnombre_cliente.setText(resultado.getString("E_nombre"));
                txtcalle_cliente.setText(resultado.getString("E_Apellido"));
                txtcuidad_cliente.setText(resultado.getString("E_Edad"));
                txtNum_prestamo.setText(resultado.getString("E_Genero"));

                JOptionPane.showMessageDialog(this, "DATO ENCONTRADO ");
            } else {
                JOptionPane.showMessageDialog(this, "NO EXISTE EL DATO O \n EL CAMPO SELECCIONADO NO TIENE ACCESO");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btncargartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargartablaActionPerformed

        ////codigo de la tabla
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jtcliente.setModel(modelo);

            PreparedStatement st = null;
            ResultSet resultado = null;
            ConexionBD2 conn = new ConexionBD2();
            Connection conexion = ConexionBD2.conectar();

            String sql = "SELECT  id_Emp ,E_nombre,E_Apellido,E_Edad,E_Genero FROM empleados";
            st = conexion.prepareStatement(sql);
            resultado = st.executeQuery();

            ResultSetMetaData rsMd = resultado.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("id_Emp");
            modelo.addColumn("E_nombre");
            modelo.addColumn("E_Apellido");
            modelo.addColumn("E_Edad ");
            modelo.addColumn("E_Genero");
            

            while (resultado.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = resultado.getObject(i + 1);

                }

                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        ///////////////////

    }//GEN-LAST:event_btncargartablaActionPerformed

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
        TABLAS_SQL ventana = new TABLAS_SQL();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_REGRESARActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton REGRESAR;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncargartabla;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtcliente;
    private javax.swing.JTextField txtNum_prestamo;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcalle_cliente;
    private javax.swing.JTextField txtcuidad_cliente;
    private javax.swing.JTextField txtid_cliente;
    private javax.swing.JTextField txtnombre_cliente;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/ImageneS/Frm_empleados.gif")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }

}
