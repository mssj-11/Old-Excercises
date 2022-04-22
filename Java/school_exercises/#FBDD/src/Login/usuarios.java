/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import conexionSql.conexionMysql;
import conexionSql.pruebaConexion;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class usuarios extends javax.swing.JFrame {
    
    conexionMysql cc = new conexionMysql();
    Connection con = cc.conexion();
    FondoPanel fondo = new FondoPanel();
    
    public usuarios() {
        this.setContentPane(fondo);
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("usuarios");
    }
    
    public void agregarUsuarios() {
        String pass = String.valueOf(texpass.getPassword());
        String sql = "insert into usuario(usuario,clave) values (?,?)";
        
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, texusuario.getText());
            pst.setString(2, pass);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO" + e.getMessage());
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texusuario = new javax.swing.JTextField();
        texpass = new javax.swing.JPasswordField();
        btnagregarusuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        VentanaLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(texusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 169, 29));

        texpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texpassActionPerformed(evt);
            }
        });
        getContentPane().add(texpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 169, 31));

        btnagregarusuario.setText("  INSERTAR USUARIO  ");
        btnagregarusuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 3));
        btnagregarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregarusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 206, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 250));

        jButton1.setText("USUARIO");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 30));

        jButton2.setText("CONTRASEÑA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 30));

        VentanaLogin.setText("Siguiente");
        VentanaLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentanaLoginMouseClicked(evt);
            }
        });
        getContentPane().add(VentanaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texusuarioActionPerformed

    private void btnagregarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarusuarioActionPerformed
        agregarUsuarios();

    }//GEN-LAST:event_btnagregarusuarioActionPerformed

    private void texpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texpassActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void VentanaLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentanaLoginMouseClicked
        
        login abrir = new login();
        abrir.setVisible(true);
        //para cerrar la ventana actual y la sig abierta
        //this.setVisible(false);
        
    }//GEN-LAST:event_VentanaLoginMouseClicked

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
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VentanaLogin;
    private javax.swing.JButton btnagregarusuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField texpass;
    private javax.swing.JTextField texusuario;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {
        
        private Image imagen;
        
        @Override
        public void paint(Graphics g) {
            
            imagen = new ImageIcon(getClass().getResource("/ImageneS/imconectar.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
        
    }
    
}
