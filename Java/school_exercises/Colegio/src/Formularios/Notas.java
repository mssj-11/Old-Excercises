/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * Notas.java
 *
 * Created on 19-oct-2013, 21:08:14
 */
package Formularios;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class Notas extends javax.swing.JFrame {

    DefaultTableModel modelo;

    /**
     * Creates new form Notas
     */
    public Notas() {
        initComponents();
        txtid.setEnabled(false);
        txtnom.setEnabled(false);
        txtnombres.setVisible(false);
        jLabel7.setVisible(false);
        txtnota1.setEnabled(false);
        txtnota2.setEnabled(false);
        txtnota3.setEnabled(false);
        MostrarDatos();
    }

    void MostrarDatos() {
        String titulos[] = {"ID", "NOMBRES", "NOTA1", "NOTA2", "NOTA3"};
        modelo = new DefaultTableModel(null, titulos);

        String Registro[] = new String[100];

        String mostrar = "SELECT * FROM registro,notas WHERE registro.idregistro=notas.idregistro";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(mostrar);
            while (rs.next()) {
                Registro[0] = rs.getString("idregistro");
                Registro[1] = rs.getString("nombre");
                Registro[2] = rs.getString("nota1");
                Registro[3] = rs.getString("nota2");
                Registro[4] = rs.getString("nota3");

                modelo.addRow(Registro);
            }

            tbregistro.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(Notas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void VisualizarId() {
        int a = 0;
        String obtenerId = "SELECT MAX(idregistro) FROM registro";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(obtenerId);
            while (rs.next()) {
                a = rs.getInt(1);
            }
            if (a == 0) {
                txtid.setText("1");
            } else {
                txtid.setText("" + (a + 1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Notas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        btnregistros = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtbuscador = new javax.swing.JTextField();
        btnbuscador = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txtnota2 = new javax.swing.JTextField();
        txtnota1 = new javax.swing.JTextField();
        txtnota3 = new javax.swing.JTextField();
        btnnotas = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbregistro = new javax.swing.JTable();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro"));

        jLabel1.setText("ID:");

        jLabel2.setText("Nombres:");

        btnregistros.setText("Guardar");
        btnregistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrosActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addComponent(btnnuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnregistros))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo)
                    .addComponent(btnregistros))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Buscar:");

        btnbuscador.setText("Buscar");
        btnbuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscadorActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Notas"));

        jLabel4.setText("Nota1:");

        jLabel5.setText("Nota2");

        jLabel6.setText("Nota4:");

        jTextField1.setText("jTextField1");

        btnnotas.setText("Guardar");
        btnnotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnotasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnotas)
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtnota1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnota2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtnota3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnotas))
        );

        jLabel7.setText("Alumno:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtbuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscador))
                            .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtbuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbregistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbregistro);

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnmodificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnbuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscadorActionPerformed
// TODO add your handling code here:
    String valorId = txtbuscador.getText();
    String valornombre = "";
    String SentenciaBuscaID = "SELECT * FROM registro WHERE idregistro='" + valorId + "'";
    try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(SentenciaBuscaID);
        while (rs.next()) {
            valornombre = rs.getString("nombre");
        }
        if (valornombre.equals("")) {
            JOptionPane.showMessageDialog(this, "No se encontro el Registro..\n Si desea  agregarlo dirigase al Panel de Registro");
            txtbuscador.setText(null);
            txtnombres.setText(null);
            txtnombres.setVisible(false);
            jLabel7.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Se encontro el Registro..\n Ahora puede Ingresar sus Notas");
            txtnombres.setVisible(true);
            jLabel7.setVisible(true);
            txtnombres.setText(valornombre);
            txtnota1.setEnabled(true);
            txtnota2.setEnabled(true);
            txtnota3.setEnabled(true);
            txtnota1.requestFocus();
        }

    } catch (SQLException ex) {
        Logger.getLogger(Notas.class.getName()).log(Level.SEVERE, null, ex);
    }

}//GEN-LAST:event_btnbuscadorActionPerformed

private void btnnotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnotasActionPerformed
// TODO add your handling code here:
    if (accionbtnguardar.equals("")) {
        String InsertarNotas = "INSERT  INTO notas (idregistro,nota1,nota2,nota3) VALUES(?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(InsertarNotas);
            pst.setInt(1, Integer.parseInt(txtbuscador.getText()));
            pst.setString(2, txtnota1.getText());
            pst.setString(3, txtnota2.getText());
            pst.setString(4, txtnota3.getText());
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(this, "Se guardaron los datos exitosamente");
                MostrarDatos();

            } else {
                JOptionPane.showMessageDialog(this, "Error: al intenter guardar los datos");
            }

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error: Ya ingreso notas para este Registro");

        }

    } else {
        String actualizarnotas = "UPDATE notas SET nota1='" + txtnota1.getText() + "', nota2='" + txtnota2.getText() + "', nota3='" + txtnota3.getText() + "' WHERE idregistro='" + idseleccionado + "'";
        PreparedStatement pst;
        try {
            pst = cn.prepareStatement(actualizarnotas);
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(this, "Los datos se actualizaron correctamente");
                MostrarDatos();
                accionbtnguardar = "";
                btnbuscador.setEnabled(true);
                txtbuscador.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Error al intentar actualizar");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Notas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    txtbuscador.setText(null);
    txtnombres.setText(null);
    txtnombres.setVisible(false);
    jLabel7.setVisible(false);
    txtnota1.setText(null);
    txtnota1.setEnabled(false);
    txtnota2.setText(null);
    txtnota2.setEnabled(false);
    txtnota3.setText(null);
    txtnota3.setEnabled(false);


}//GEN-LAST:event_btnnotasActionPerformed

private void btnregistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrosActionPerformed
// TODO add your handling code here:
    String sql = "INSERT INTO registro(nombre) VALUES (?)";
    try {
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, txtnom.getText());
        int n = pst.executeUpdate();
        if (n > 0) {
            JOptionPane.showMessageDialog(this, "Se guardo los datos Exitosamente");
            txtnom.setText(null);
            txtid.setText(null);
            txtid.setEnabled(false);
            txtnom.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Error: no se pudo guardar los datos");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Notas.class.getName()).log(Level.SEVERE, null, ex);
    }

}//GEN-LAST:event_btnregistrosActionPerformed

private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
// TODO add your handling code here:
    VisualizarId();
    txtnom.requestFocus();
    txtid.setEnabled(true);
    txtnom.setEnabled(true);
}//GEN-LAST:event_btnnuevoActionPerformed

private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
// TODO add your handling code here:
    int filaseleccionada = tbregistro.getSelectedRow();

    if (filaseleccionada >= 0) {
        jLabel7.setVisible(true);
        txtnombres.setVisible(true);
        idseleccionado = tbregistro.getValueAt(filaseleccionada, 0).toString();
        txtnombres.setText(tbregistro.getValueAt(filaseleccionada, 1).toString());
        txtnota1.setText(tbregistro.getValueAt(filaseleccionada, 2).toString());
        txtnota2.setText(tbregistro.getValueAt(filaseleccionada, 3).toString());
        txtnota3.setText(tbregistro.getValueAt(filaseleccionada, 4).toString());
        txtbuscador.setEnabled(false);
        btnbuscador.setEnabled(false);
        txtnota1.setEnabled(true);
        txtnota2.setEnabled(true);
        txtnota3.setEnabled(true);
        accionbtnguardar = "actualizar";

    } else {
        JOptionPane.showMessageDialog(this, "Tabla vacia o Seleccione alguna fila");
    }

}//GEN-LAST:event_btnmodificarActionPerformed

private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
// TODO add your handling code here:
    int filaeliminar = tbregistro.getSelectedRow();
    String ideliminar = tbregistro.getValueAt(filaeliminar, 0).toString();
    String sqleliminar = "DELETE FROM notas WHERE idregistro='" + ideliminar + "'";
    try {
        PreparedStatement pst = cn.prepareStatement(sqleliminar);
        int n = pst.executeUpdate();
        if (n > 0) {
            JOptionPane.showMessageDialog(this, "Se elimino el registro seleccionado");
            MostrarDatos();
        } else {
            JOptionPane.showMessageDialog(this, "No se puedo eliminar");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Notas.class.getName()).log(Level.SEVERE, null, ex);
    }


}//GEN-LAST:event_btneliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Notas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscador;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnotas;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnregistros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbregistro;
    private javax.swing.JTextField txtbuscador;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtnota1;
    private javax.swing.JTextField txtnota2;
    private javax.swing.JTextField txtnota3;
    // End of variables declaration//GEN-END:variables
conectar cc = new conectar();
    Connection cn = cc.conexion();
    String accionbtnguardar = "";
    String idseleccionado;
}
