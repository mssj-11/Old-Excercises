/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MENU;

import javax.swing.*;
import java.awt.*;
import java.awt.ActiveEvent;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author HP
 */
public class Principal extends javax.swing.JFrame {

    //METODO PARA CIFRAR EL MENSAJE INTRODUCIDO
    public static String Cifrar(String Mensaje) {
        String salida = "";
        String Abcedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String clave = "ISIS";
        char[] claveEquals = new char[Mensaje.length()];
        char[] Msj = Mensaje.toUpperCase().toCharArray();
        int cont = 0;
        for (int c = 0; c < Mensaje.length(); c++) {

            if (Mensaje.charAt(c) == ' ') {
                c++;
            }
            claveEquals[c] = clave.charAt(cont);
            cont++;
            if (cont == clave.length()) {
                cont = 0;
            }
        }//
        // Para cifrar realizamos esta operación
        int x = 0, y = 0, z;
        for (int c = 0; c < Mensaje.length(); c++) {
            if (Mensaje.charAt(c) == ' ') {
                salida += " ";
                c++;
            }
            for (int f = 0; f < Abcedario.length(); f++) {
                if (Msj[c] == Abcedario.charAt(f)) {
                    x = f;

                }
                if (claveEquals[c] == Abcedario.charAt(f)) {
                    y = f;

                }

            }
            // Z es el tamaño del alfabeto
            z = (x + y) % 27;
            salida += Abcedario.charAt(z);

        }

        return salida;
    }

    //METODO PARA DESCIFRAR EL MENSAJE INTRODUCIDO
    public static String Descifrar(String Mensaje) {
        String salida = "";
        String Abcedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String clave = "ISIS";
        char[] claveEquals = new char[Mensaje.length()];
        char[] Msg = Mensaje.toUpperCase().toCharArray();
        int cont = 0;
        for (int c = 0; c < Mensaje.length(); c++) {

            if (Mensaje.charAt(c) == ' ') {
                c++;
            }
            claveEquals[c] = clave.charAt(cont);
            cont++;
            if (cont == clave.length()) {
                cont = 0;
            }
        }
        cont = 0;
        int x = 0, y = 0, z, t;
        for (int c = 0; c < Mensaje.length(); c++) {
            if (Mensaje.charAt(c) == ' ') {
                salida += " ";
                c++;
            }
            for (int f = 0; f < Abcedario.length(); f++) {
                if (Msg[c] == Abcedario.charAt(f)) {
                    x = f;

                }
                if (claveEquals[c] == Abcedario.charAt(f)) {
                    y = f;

                }

            }
            // Para descifrar realizamos la operación inversa
            z = (y - x);

            if (z <= 0) {
                if (z == 0) {
                    salida += "A";
                } else {
                    for (int j = 1; j <= Abcedario.length(); j++) {
                        cont++;
                        if (cont == (z * -1)) {
                            salida += Abcedario.charAt(j);
                            break;
                        }
                    }
                }

            } else {
                for (int i = 26; i >= 0; i--) {
                    cont++;
                    if (cont == z) {
                        salida += Abcedario.charAt(i);
                        break;
                    }
                }
            }

            cont = 0;

        }

        return salida;
    }

    /**
     * Creates new form Principal
     */
    public Principal() {
        //Imagen de fondo
        this.setContentPane(fondo);
//IMAGEN DE ICONO
        setIconImage(new ImageIcon(getClass().getResource("../MENU/ICONO.png")).getImage());
        //titulo
        setTitle(" Michael Salgado Sotero");
        initComponents();
        //pantalla JFRAME centrada
        setLocationRelativeTo(null);

        //en caso de que no haya imagen de icono evitar error
        /*try {
            setIconImage(new ImageIcon(getClass().getResource("../MENU/ICONO.png")).getImage());
        } catch (Exception e) {
            System.out.println("No hay Imagen de icono en la ruta");
        }*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cifrar = new javax.swing.JButton();
        descifrar = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();
        txt_cif_des = new javax.swing.JTextField();
        LIMPIAR = new javax.swing.JButton();
        TITULO_C_Vigenere = new javax.swing.JLabel();
        claveeee = new javax.swing.JLabel();
        R = new javax.swing.JLabel();
        Int_Mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cifrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cifrar.setText("CIFRAR");
        cifrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cifrarMouseClicked(evt);
            }
        });
        cifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cifrarActionPerformed(evt);
            }
        });

        descifrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        descifrar.setText("DECIFRAR");
        descifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descifrarActionPerformed(evt);
            }
        });

        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        txt_cif_des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cif_desActionPerformed(evt);
            }
        });

        LIMPIAR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LIMPIAR.setText("LIMPIAR");
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });

        TITULO_C_Vigenere.setBackground(new java.awt.Color(0, 0, 0));
        TITULO_C_Vigenere.setFont(new java.awt.Font("Goudy Stout", 1, 24)); // NOI18N
        TITULO_C_Vigenere.setForeground(new java.awt.Color(255, 255, 255));
        TITULO_C_Vigenere.setText("CIFRADO VIGENERE");

        claveeee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        claveeee.setForeground(new java.awt.Color(255, 255, 255));
        claveeee.setText("Clave:  ISIS");

        R.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        R.setForeground(new java.awt.Color(255, 255, 255));
        R.setText("RESULTADO");

        Int_Mensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Int_Mensaje.setForeground(new java.awt.Color(255, 255, 255));
        Int_Mensaje.setText("Introduce Mensaje:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(TITULO_C_Vigenere)
                                .addContainerGap(55, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(R)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(resultado))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(Int_Mensaje)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_cif_des))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(claveeee, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cifrar)
                                                .addGap(88, 88, 88)
                                                .addComponent(descifrar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LIMPIAR)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(TITULO_C_Vigenere, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_cif_des, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Int_Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(claveeee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cifrar)
                                        .addComponent(descifrar)
                                        .addComponent(LIMPIAR))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descifrarActionPerformed
        String text = txt_cif_des.getText();//Mensaje ingresado

        resultado.setText(Descifrar(text)); //resultado
    }//GEN-LAST:event_descifrarActionPerformed

    private void cifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cifrarActionPerformed
        String text = txt_cif_des.getText();//Mensaje ingresado

        resultado.setText(Cifrar(text)); //resultado

        // TODO add your handling code here:
    }//GEN-LAST:event_cifrarActionPerformed

    private void cifrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cifrarMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_cifrarMouseClicked

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed

    }//GEN-LAST:event_resultadoActionPerformed

    private void txt_cif_desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cif_desActionPerformed

    }//GEN-LAST:event_txt_cif_desActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed

        //TERMINADO
        txt_cif_des.setText(""); //Limpiar texto introducido
        resultado.setText(""); //Limpiar resultado
    }//GEN-LAST:event_LIMPIARActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Int_Mensaje;
    private javax.swing.JButton LIMPIAR;
    private javax.swing.JLabel R;
    private javax.swing.JLabel TITULO_C_Vigenere;
    private javax.swing.JButton cifrar;
    private javax.swing.JLabel claveeee;
    private javax.swing.JButton descifrar;
    private javax.swing.JTextField resultado;
    private javax.swing.JTextField txt_cif_des;
    // End of variables declaration//GEN-END:variables

//AJUSTAR JFRAME Y FORMATO DE IMAGEN
    FondoPanel fondo = new FondoPanel();

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/MENU/cif.gif")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }
}