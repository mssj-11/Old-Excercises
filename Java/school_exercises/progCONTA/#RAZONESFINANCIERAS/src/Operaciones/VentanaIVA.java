/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author HP
 */
import Operaciones.rliquidez;
import Operaciones.pasivocirculante;
import Operaciones.operacioness;

public class VentanaIVA extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    rliquidez d = new rliquidez();
    pasivocirculante pc = new pasivocirculante();
    operacioness m = new operacioness();

    public VentanaIVA() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        texto1 = new javax.swing.JTextField();
        textoprecio = new javax.swing.JTextField();
        CalcularISR = new javax.swing.JButton();
        calcularIVA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        res = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JFRAME1");
        setLocation(new java.awt.Point(500, 250));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        jLabel2.setText("SUELDO");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 255, 255)));

        jLabel3.setFont(new java.awt.Font("Jokerman", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 51, 153));
        jLabel3.setText("IVA");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 255, 255)));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        jLabel5.setText("PRECIO");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 255, 255)));

        texto1.setBackground(new java.awt.Color(102, 255, 255));
        texto1.setForeground(new java.awt.Color(0, 51, 153));
        texto1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 153)));
        texto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto1ActionPerformed(evt);
            }
        });

        textoprecio.setBackground(new java.awt.Color(102, 255, 255));
        textoprecio.setForeground(new java.awt.Color(0, 51, 153));
        textoprecio.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 153)));
        textoprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoprecioActionPerformed(evt);
            }
        });

        CalcularISR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CalcularISR.setText("ISR");
        CalcularISR.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        CalcularISR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularISRActionPerformed(evt);
            }
        });

        calcularIVA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        calcularIVA.setText("CALCULAR");
        calcularIVA.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        calcularIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularIVAActionPerformed(evt);
            }
        });

        res.setColumns(20);
        res.setRows(5);
        res.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(res);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(60, 60, 60)
                        .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textoprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calcularIVA)
                    .addComponent(CalcularISR, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalcularISR)
                    .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcularIVA)
                    .addComponent(textoprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularISRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularISRActionPerformed
//     
        double rl;

        rl = Double.parseDouble(texto1.getText()) / pc.Ier(Double.parseDouble(texto1.getText()));
        res.setText("\n\tLa Razon de liquidez es:  " + texto1.getText() + "\n\tEL isr es de:  " + pc.Ier(Double.parseDouble(texto1.getText())) + "\n\tLa Razon circulante final es de:  " + rl);
        // TODO add your handling code here:
    }//GEN-LAST:event_CalcularISRActionPerformed

    private void calcularIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularIVAActionPerformed

        double v;
        v = Double.parseDouble(textoprecio.getText()) + d.Ivamex(Double.parseDouble(textoprecio.getText()));
        res.setText("\n\tEl precio es de:  " + textoprecio.getText() + "\n\tEl IVA es de:  " + d.Ivamex(Double.parseDouble(textoprecio.getText())) + "\n\tEl precio final es de:  " + v);
        // TODO add your handling code here:
    }//GEN-LAST:event_calcularIVAActionPerformed

    private void texto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto1ActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_texto1ActionPerformed

    private void textoprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoprecioActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaIVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaIVA().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcularISR;
    private javax.swing.JButton calcularIVA;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea res;
    private javax.swing.JTextField texto1;
    private javax.swing.JTextField textoprecio;
    // End of variables declaration//GEN-END:variables
}