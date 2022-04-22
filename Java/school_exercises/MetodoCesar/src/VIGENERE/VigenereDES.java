/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package VIGENERE;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import metodocesar.Encriptar;

/**
 *
 * @author Nuvia
 */
public class VigenereDES extends javax.swing.JFrame {

    /**
     * Creates new form Vigenere
     */
    public VigenereDES() {
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
        txtTexto = new javax.swing.JTextField();
        txtEncriptado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtClave = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("METODO VIGENERE DESENCRIPTAR");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Texto a desencriptar:");

        txtTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTexto.setPreferredSize(new java.awt.Dimension(100, 20));
        txtTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTextoKeyTyped(evt);
            }
        });

        txtEncriptado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEncriptado.setPreferredSize(new java.awt.Dimension(100, 20));
        txtEncriptado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEncriptadoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Texto desencriptado:");

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/desencriptar.png"))); // NOI18N
        jButton1.setText("Desencriptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtClave.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtClave.setPreferredSize(new java.awt.Dimension(100, 20));
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Clave:");

        jButton4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton4.setText("Menú");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEncriptado, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(txtTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txtClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(163, 163, 163))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(117, 117, 117))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEncriptado, txtTexto});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEncriptado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEncriptado, txtTexto});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String ValidarDatos() {//Metodo para comprobar que los datos esten completos
        String msj = "";
        if (txtTexto.getText().equals("")) {//Si txtID esta vacio
            msj += "Por favor digite en Texto a encriptar. \n";
            txtTexto.requestFocusInWindow();
        }
        if (txtClave.getText().equals("")) {//Si txtID esta vacio
            msj += "Por favor digite en clave. \n";
            txtClave.requestFocusInWindow();
        }
       
        return msj;//devuelve msj
        
        //validar que el usuario no existe
    }
    
    private void txtTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTextoKeyTyped
        int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada

        if (k > 47 && k < 58) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "Validando Datos",
                JOptionPane.ERROR_MESSAGE);

        }

        if (k == 10) {//si se presiona enter
            //transfiere el foco
            txtTexto.transferFocus();
        }

        //Limitar el numero de caracteres. Solo se pueden ingresar 20 caracteres
        if (txtTexto.getText().length() >= 50) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de caracteres!!! (50)", "Validando Datos",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtTextoKeyTyped

    
    private void txtEncriptadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEncriptadoKeyTyped
        char car = evt.getKeyChar();
        if(txtEncriptado.getText().length()>=20) evt.consume();
        if ((car < 'a' || car  > 'z') && (car < 'A' || car  > 'Z')) evt.consume();
    }//GEN-LAST:event_txtEncriptadoKeyTyped

   public static String deCript(String T, String pal){
        String Dc = "";
        String Alfa = "abcdefghijklmnñopqrstuvwxyz=% @";
        //System.out.println("Digite palabra clave");
        //String pal = Leer.dato();
        int []t = new int[T.length()];// se almacenan los datos numericos de la palabra  encriptada
        int [] pa = new int [T.length()]; // Se almacenan los datos numericos de la palabra clave 
        int [] cri = new int [T.length()]; // se almacenan los datos numericos de la palabra desencriptada
        int n;
        for (int i = 0 ; i < t.length; i ++){
            t[i] = Alfa.indexOf(T.substring(i, i+1));
            pa[i] = Alfa.indexOf(pal.substring(i%pal.length(),(i%pal.length())+1));
            n = (t[i]- pa[i]);
            if (n< 0 ){n = Alfa.length()+n;}
            cri[i] = n% Alfa.length();
            Dc = Dc + Alfa.substring(cri[i], cri[i]+1);
        }
        return Dc;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (ValidarDatos().equals("")) {
        try{
        String Tex = this.txtTexto.getText();
        //Tex= Leer.dato();
        String clave = this.txtClave.getText();
        String TexC = deCript(Tex, clave);
        txtEncriptado.setText(TexC);
        
        
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                VigenereDES em = new VigenereDES();
        }
        JOptionPane.showMessageDialog(rootPane, "Desencriptado correctamente :-)", "Validando Datos",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed
    else {//de lo contrario emite el mensaje
            JOptionPane.showMessageDialog(rootPane, "ERROR!! \n" + ValidarDatos(), "Validando Datos",
                JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
    private void txtClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyTyped
        // TODO add your handling code here:
        int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada

        if (k > 47 && k < 58) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "Validando Datos",
                JOptionPane.ERROR_MESSAGE);

        }

        if (k == 10) {//si se presiona enter
            //transfiere el foco
            txtClave.transferFocus();
        }

        //Limitar el numero de caracteres. Solo se pueden ingresar 20 caracteres
        if (txtClave.getText().length() >= 50) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de caracteres!!! (50)", "Validando Datos",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtClaveKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MenuVigenere men = new MenuVigenere();
        men.setVisible(true);
        men.setMaximumSize(null);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(VigenereDES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VigenereDES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VigenereDES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VigenereDES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VigenereDES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtEncriptado;
    private javax.swing.JTextField txtTexto;
    // End of variables declaration//GEN-END:variables
}