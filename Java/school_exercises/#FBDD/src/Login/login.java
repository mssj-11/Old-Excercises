/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import conexionSql.conexionMysql;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



/**
 *
 * @author HP
 */
public class login extends javax.swing.JFrame {

    conexionMysql cc = new conexionMysql();
    Connection con = cc.conexion();
    FondoPanel fondo = new FondoPanel();

    public void validarAcceso() {
        int resultado = 0;
        try {

            String usuario = texusuario.getText();
            String pass = String.valueOf(texpass.getPassword());
            String sql = "select * from usuario where usuario ='" + usuario + "' and clave =' " + pass + "' ";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                resultado = 1;

                if (resultado == 1) {
                    Sistema form = new Sistema();
                    form.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR EN EL ACCESO, VUELVA A INTENTARLO");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN EL ACCESO, VUELVA A INTENTARLO" + e.getMessage());
        }
    }

    /**
     * Creates new form inicio
     */
    public login() {
        initComponents();
        this.setContentPane(fondo);
        //aparecer centro de la pantalla
        this.setLocationRelativeTo(null);
        this.setTitle("login");
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texusuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btacceder = new javax.swing.JButton();
        texpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(texusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 106, 120, -1));

        jLabel1.setText("USUARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 109, 59, -1));

        jLabel2.setText("CONTRASEÑA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 147, -1, -1));

        btacceder.setText("ACCEDER");
        btacceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaccederActionPerformed(evt);
            }
        });
        getContentPane().add(btacceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 101, -1));
        getContentPane().add(texpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texusuarioActionPerformed

    private void btaccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaccederActionPerformed
        validarAcceso();

    }//GEN-LAST:event_btaccederActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btacceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField texpass;
    private javax.swing.JTextField texusuario;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;
        
       
        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/ImageneS/imsesionjpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }

}
