/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transposicion;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CIF_COLUM_CLAVE extends javax.swing.JFrame {

    public static Scanner in;

    private static String Metcifrado(String Mensaje) { //Craecion del metodo de cifrado
        //mensaje ingresado
        String text = in.nextLine().toUpperCase().replace(" ", "");
        StringBuilder msg = new StringBuilder(text);

        //ingrsasr la clave
        String clave = in.nextLine().toUpperCase();

        System.out.println("\n\033[31m--------------------------------------");
        // asignar números a palabras clave
        int[] clavNlist = Asignar_num_a_clave(clave);

        // impresión de palabra clave
        for (int i = 0, j = 1; i < clave.length(); i++, j++) {
            System.out.print(clave.substring(i, j) + " ");
        }
        System.out.println();

        for (int i : clavNlist) {
            System.out.print(i + "\033[31m ");

        }

        System.out.println("\n\033[31m--------------------------------------");

        // en caso de que los caracteres no encajen perfectamente en toda la tabla
        int letras_adicionales = msg.length() % clave.length();
        int Caracteres = clave.length() - letras_adicionales;

//Si la entrada de las letras es difrente = a 0 , ingresara el carater seleciionado
        if (letras_adicionales != 0) {
            for (int i = 0; i < Caracteres; i++) {
                msg.append("#");// los espacios vacios se llenaran con --> #
            }
        }

        //se posicionaran mediante el numero de filas y por medio de la clave
        int N_filas = msg.length() / clave.length();

        // Convertir mensaje en forma de tabla
        char[][] arr = new char[N_filas][clave.length()];

        int z = 0;
        for (int i = 0; i < N_filas; i++) {
            for (int j = 0; j < clave.length(); j++) {
                arr[i][j] = msg.charAt(z);
                z++;
            }

        }

        for (int i = 0; i < N_filas; i++) {// for loop int
            for (int j = 0; j < clave.length(); j++) {// for loop
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // generación de texto cifrado
        StringBuilder cifrartexto = new StringBuilder(); // crea un constructor vacío, capacidad 16 

        System.out.print("\033[31m--------------------------------------\n");
        System.out.print("\n\033[31m**************************************");
        System.out.print("\n\033[31mNOTA: \n\033[34mEn caso de letras faltantes en la\n\033[34mTabla seran rellenadas con --> #");
        System.out.println("\n\033[31m**************************************");

        // obteniendo ubicaciones de números
        String numLoc = getNum_Ubicacion(clave, clavNlist);

        System.out.println();

        for (int i = 0, k = 0; i < N_filas; i++, k++) {// método de cifrado para los datos de las filas
            int d;
            if (k == clave.length()) {
                break;
            } else {
                d = Character.getNumericValue(numLoc.charAt(k));
            }
            for (int j = 0; j < N_filas; j++) {
                cifrartexto.append(arr[j][d]);
            }
        }

        //se imprime los datos capturados mediante las filas y columnas
        System.out.println("\033[34mEl Texto Cifrado es: " + cifrartexto);

        //
        return text;
    }

    //*************************************************************************************************************
    //*************************************************************************************************************
    private static void decryption() {

        System.out.print("\033[34mDescifrar el mensaje: ");
        String msg = in.nextLine().toUpperCase().replace(" ", "");

        System.out.print("\033[34mInserte la clave: ");
        String clav = in.nextLine().toUpperCase();

        int numOfRows = msg.length() / clav.length();

        // array with dummy values
        char[][] arr = new char[numOfRows][clav.length()];

        // assigning numbers to keywords
        int[] kywrdNumList = Asignar_num_a_clave(clav);

        String numLoc = getNum_Ubicacion(clav, kywrdNumList);

        for (int i = 0, k = 0; i < msg.length(); i++, k++) {
            int d = 0;
            if (k == clav.length()) {
                k = 0;
            } else {
                d = Character.getNumericValue(numLoc.charAt(k));
            }

            for (int j = 0; j < numOfRows; j++, i++) {
                arr[j][d] = msg.charAt(i);
            } // for loop
            --i;
        }

        StringBuilder msjDescif = new StringBuilder();

        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < clav.length(); j++) {
                msjDescif.append(arr[i][j]);
            } // inner for loop
        } // for loop

        //se imprime los datos capturados mediante las filas y columnas
        System.out.print("\n\033[31m###########################");
        System.out.println("\n\033[31m#   EN HORA BUENA!!!!!!!  #");
        System.out.println("\033[31m###########################\n");
        System.out.println("\033[34mEl Texto Descifrado es: " + msjDescif);

    } // decryption function

    //*************************************************************************************************************
    //metodo para la obtener las posiciones de las letras - carateres por numeros
    private static String getNum_Ubicacion(String clave, int[] clavNlist2) {// obteniendo ubicación de la función del número
        String numLoc = "";
        for (int i = 1; i < clave.length() + 1; i++) {
            for (int j = 0; j < clave.length(); j++) {
                if (clavNlist2[j] == i) {
                    numLoc += j;
                }
            }
        }
        return numLoc;
    }

    //metodo para asignar los numeros de las filas mediante el orden alfabetico
    private static int[] Asignar_num_a_clave(String clave) {// Asignación de número con la clave
        String Abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&/()=?¿¡+*{}[]-_.,@<>|°¬~`^;"; //todos los posibles datos ingresados ya validados
        int[] clavNlist3 = new int[clave.length()];

        int init = 0;//  for int
        for (int i = 0; i < Abecedario.length(); i++) {
            for (int j = 0; j < clave.length(); j++) {
                if (Abecedario.charAt(i) == clave.charAt(j)) {
                    init++;
                    clavNlist3[j] = init;
                }
            }
        } // for
        return clavNlist3;
    }

    /**
     * Creates new form CIF_COLUM_CLAVE
     */
    public CIF_COLUM_CLAVE() {
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

        B_Cifrar = new javax.swing.JButton();
        txtmsg = new javax.swing.JTextField();
        B_Descifrar = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();
        txtclave = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        B_Cifrar.setText("CIFRAR");
        B_Cifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CifrarActionPerformed(evt);
            }
        });

        B_Descifrar.setText("DESCIFRAR");
        B_Descifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_DescifrarActionPerformed(evt);
            }
        });

        txtclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclaveActionPerformed(evt);
            }
        });

        jLabel1.setText("MENSAJE");

        jLabel2.setText("CLAVE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(B_Cifrar)
                            .addGap(103, 103, 103)
                            .addComponent(B_Descifrar))
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtclave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txtmsg, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtmsg, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Cifrar)
                    .addComponent(B_Descifrar))
                .addGap(30, 30, 30)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_CifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CifrarActionPerformed
        // TODO add your handling code here:

        String text = txtmsg.getText();//mensaje ingresado
        String clave = txtclave.getText();//clave ingrsada
        
        

        //mostrar mensaje 
        resultado.setText(text);


    }//GEN-LAST:event_B_CifrarActionPerformed

    private void B_DescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_DescifrarActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_B_DescifrarActionPerformed

    private void txtclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclaveActionPerformed

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
            java.util.logging.Logger.getLogger(CIF_COLUM_CLAVE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CIF_COLUM_CLAVE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CIF_COLUM_CLAVE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CIF_COLUM_CLAVE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CIF_COLUM_CLAVE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Cifrar;
    private javax.swing.JButton B_Descifrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField resultado;
    private javax.swing.JTextField txtclave;
    private javax.swing.JTextField txtmsg;
    // End of variables declaration//GEN-END:variables
}
