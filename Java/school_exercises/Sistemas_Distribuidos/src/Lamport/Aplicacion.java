package Lamport;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Aplicacion extends javax.swing.JFrame {

    private int numProcesos;
    private Dimension d;
    private int[][] desfaces;
    private static int numTime = 10;
    private int emisor;
    private int receptor;
    private int time_emisor;
    private int time_receptor;
    private int posXEmisor;
    private int posYEmisor;
    private int posXReceptor;
    private int posYReceptor;

    /**
     * Creates new form Aplicacion
     */
    public Aplicacion() {

        initComponents();
        setTitle("Sistemas Distribuidos");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screenSize.width / 2 - (this.getSize().width / 2), screenSize.height / 2 - (this.getSize().height / 2));
        numProcesos = new Integer(0);
        emisor = new Integer(0);
        receptor = new Integer(0);
        time_emisor = new Integer(0);
        time_receptor = new Integer(0);

        posXEmisor = new Integer(0);
        posYEmisor = new Integer(0);
        posXReceptor = new Integer(0);
        posYReceptor = new Integer(0);

        desfaces = new int[numProcesos][numTime];
        lienzo.setNumTiempos(numTime);
        lienzo.setTimeStamp(desfaces);
        lienzo.setNumVectores(numProcesos);
        //setResizable(false);
        lienzo.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                         
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lienzo = new Lamport.Lienzo();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        botonEnviar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulaci??n de Lamport");
        setBounds(new java.awt.Rectangle(250, 50, 200, 100));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrada"));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("N??mero de Procesos :");
        jPanel2.add(jLabel1);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0");
        jPanel2.add(jTextField1);

        jButton2.setText("Fijar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Par??metros"));
        jPanel3.setLayout(new java.awt.GridLayout(2, 4));

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Proceso Emisor : ");
        jPanel3.add(jLabel2);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");
        jPanel3.add(jTextField2);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Tiempo :");
        jPanel3.add(jLabel4);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("0");
        jPanel3.add(jTextField4);

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Proceso Receptor : ");
        jPanel3.add(jLabel3);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0");
        jPanel3.add(jTextField3);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Tiempo :");
        jPanel3.add(jLabel5);

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("0");
        jPanel3.add(jTextField5);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Salida"));
        jPanel5.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
                lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 404, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
                lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 309, Short.MAX_VALUE)
        );

        jPanel5.add(lienzo, java.awt.BorderLayout.CENTER);

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4);

        botonEnviar.setText("Enviar");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });
        jPanel4.add(botonEnviar);

        jButton1.setText("Sincronizar");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>                       

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {
            numProcesos = Integer.parseInt(jTextField1.getText());
            generarDesfaces();
            lienzo.setProcesos(numProcesos, desfaces);
            lienzo.repaint();
            jPanel5.repaint();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        sincronizarRelojes();
        lienzo.setProcesos(numProcesos, desfaces);
        lienzo.setVector(posXEmisor, posYEmisor, posXReceptor, posYReceptor);
        lienzo.repaint();
        jPanel5.repaint();
        jButton1.setEnabled(false);
    }

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        emisor = Integer.parseInt(jTextField2.getText());
        time_emisor = Integer.parseInt(jTextField4.getText());
        receptor = Integer.parseInt(jTextField3.getText());
        time_receptor = Integer.parseInt(jTextField5.getText());

        posXEmisor = emisor;
        posYEmisor = time_emisor;
        posXReceptor = receptor;
        posYReceptor = time_receptor;

        if (desfaces[emisor][time_emisor] >= desfaces[receptor][time_receptor]) {
            jButton1.setEnabled(true);
            lienzo.setGraficar_flecha(true);
        } else {
            lienzo.setGraficar_flecha(false);
            lienzo.repaint();
            jPanel5.repaint();
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        System.exit(0);
    }

    public void generarDesfaces() {
        int desviacion = 0;
        numProcesos = Integer.parseInt(jTextField1.getText());
        desfaces = new int[numProcesos][numTime];

        //Los relojes parten al mismo tiempo
        for (int j = 0; j < numTime; j++) {
            desfaces[0][j] = 0;
        }

        desviacion = 5;

        // Los cristales oscilan de forma muy precisa pero
        // no a la misma frecuencia
        for (int i = 0; i < numProcesos; i++) {
            for (int j = 1; j < numTime; j++) {
                desfaces[i][j] = desfaces[i][j - 1] + desviacion;
            }
            desviacion = desviacion + 3;
        }
    }

    public void sincronizarRelojes() {
        int desface_aux = 0;
        desface_aux = desfaces[receptor][1] - desfaces[receptor][0];
        desfaces[receptor][time_receptor] = desfaces[emisor][time_emisor] + 1;
        for (int i = time_receptor + 1; i < numTime; i++) {
            desfaces[receptor][i] = desfaces[receptor][i - 1] + desface_aux;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    System.out.println("Substance Raven Graphite failed to initialize");
                }
                new Aplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                    
    private javax.swing.JButton botonEnviar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JToggleButton jToggleButton1;
    private Lamport.Lienzo lienzo;
    // End of variables declaration                  

}
