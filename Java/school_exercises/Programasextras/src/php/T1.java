/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package php;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class T1 extends javax.swing.JPanel {
  public void L(){
    no.setText("");
    gru.setText("");
    
    id.setText("");
    }
Connection conexion = null;
    /**
     * Creates new form xx
     */
    public T1() {
         
        initComponents();
        getconec();
    }
     public Connection getconec(){
         Connection conexion = null;
   try {
            conexion= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mibase", "root", "daniel01");
            if(conexion != null){
                System.out.println("la conexion se ha establecido con exito"); return conexion;}
        } catch (Exception e) {
            System.out.println("error en la conexion"); 
        }
        return null;
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        INSERTAR = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        act = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        gru = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        INSERTAR.setText("insertar");
        INSERTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERTARActionPerformed(evt);
            }
        });

        eliminar.setText("eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        act.setText("Actualizar/ Modificar");
        act.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actActionPerformed(evt);
            }
        });

        jLabel1.setText("BASE DE DATOS");

        jLabel2.setText("Nombre:");

        jLabel4.setText("Apellido");

        gru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gruActionPerformed(evt);
            }
        });

        jLabel3.setText("Idebtificador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(no))
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eliminar)
                                    .addComponent(INSERTAR)
                                    .addComponent(act))))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(195, 195, 195)
                    .addComponent(gru, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(245, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(INSERTAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(eliminar)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(act))
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(252, 252, 252)
                    .addComponent(gru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(215, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void INSERTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERTARActionPerformed
        // TODO add your handling code here:
        try {
            Connection co = getconec();

            PreparedStatement ps = co.prepareStatement("INSERT INTO alum(ID, Nombre, Apellido)VALUES(?,?,?);");
            ps.setString(1, id.getText());
            ps.setString(2, no.getText());
            ps.setString(3, gru.getText());
           

            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "datos insertados");
                L();

            } else {
                JOptionPane.showMessageDialog(null, "datos no insertados");
                L();
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_INSERTARActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        try {
            Connection co = getconec();

            PreparedStatement ps = co.prepareStatement("DELETE FROM alum WHERE ID = ?;");
            ps.setString(1, id.getText());

            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "datos eliminados");
                L();

            } else {
                JOptionPane.showMessageDialog(null, "los datos no se pudieron eliminar");
                L();
            }

        } catch (Exception ex) {
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void actActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actActionPerformed
        // TODO add your handling code here:
        try {
            Connection co = getconec();

            PreparedStatement ps = co.prepareStatement("UPDATE alum SET ID = ? , Nombre = ? , Apellido = ? WHERE ID = ? ;");
            ps.setString(1, id.getText());
            ps.setString(2, no.getText());
            ps.setString(3, gru.getText());
          
            ps.setString(4, id.getText());

            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "datos Actualizados");
                L();

            } else {
                JOptionPane.showMessageDialog(null, "datos no ");
                L();
            }

        } catch (Exception ex) {
        }
    }//GEN-LAST:event_actActionPerformed

    private void gruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gruActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton INSERTAR;
    private javax.swing.JButton act;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField gru;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField no;
    // End of variables declaration//GEN-END:variables
}
