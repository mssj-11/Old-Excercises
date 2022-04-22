/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Cronos extends javax.swing.JPanel implements Runnable {

    int segundos = 00;
    int minutos = 00;
    int horas = 00;
    Thread h;
    int nv = 1;

    @Override
    public void run() {

        while (true) {

            try {

                if (segundos < 60) {
                    crono.setText(horas + " : " + minutos + " : " + segundos);
                    Thread.sleep(100);
                    segundos++;
                } else {
                    segundos = 0;

                    if (minutos < 60) {
                        crono.setText(horas + " : " + minutos + " : " + segundos);

                        minutos++;

                    } else {
                        minutos = 0;
                        horas++;
                    }
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(Cronos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    /**
     * Creates new form NewJPanel
     */
    public Cronos() {
        initComponents();
        pausar.setEnabled(false);
        continuar.setEnabled(false);
        terminar.setEnabled(false);
        vuelta.setEnabled(false);

        nuevo.setBackground(Color.yellow);
        listo.setEnabled(false);
        ejecutando.setEnabled(false);
        bloqueado.setEnabled(false);
        terminado.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        iniciar = new javax.swing.JButton();
        pausar = new javax.swing.JButton();
        continuar = new javax.swing.JButton();
        terminar = new javax.swing.JButton();
        crono = new javax.swing.JLabel();
        vueltas = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        vuelta = new javax.swing.JTextArea();
        est = new javax.swing.JLabel();
        ejecutando = new javax.swing.JButton();
        listo = new javax.swing.JButton();
        terminado = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        bloqueado = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        iniciar.setText("Iniciar");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        pausar.setText("Pausar");
        pausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausarActionPerformed(evt);
            }
        });

        continuar.setText("Continuar");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });

        terminar.setText("Terminar");
        terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarActionPerformed(evt);
            }
        });

        crono.setFont(new java.awt.Font("HP Simplified", 0, 36)); // NOI18N
        crono.setForeground(new java.awt.Color(0, 0, 204));
        crono.setText("00 : 00 : 00");

        vueltas.setText("Vueltas");
        vueltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vueltasActionPerformed(evt);
            }
        });

        vuelta.setColumns(20);
        vuelta.setRows(5);
        jScrollPane3.setViewportView(vuelta);

        est.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        est.setText("     Estados");

        ejecutando.setText("Ejecutando");
        ejecutando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutandoActionPerformed(evt);
            }
        });

        listo.setText("Listo");

        terminado.setText("Terminado");
        terminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminadoActionPerformed(evt);
            }
        });

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        bloqueado.setText("Bloqueando");
        bloqueado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloqueadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ejecutando)
                                .addComponent(bloqueado)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(vueltas)
                                    .addGap(129, 129, 129)
                                    .addComponent(terminado)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(continuar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(terminar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nuevo)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(iniciar)
                                    .addGap(32, 32, 32)
                                    .addComponent(pausar)
                                    .addGap(123, 123, 123)
                                    .addComponent(listo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(crono, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(est, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iniciar)
                            .addComponent(pausar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(est)
                            .addComponent(crono))
                        .addGap(18, 18, 18)
                        .addComponent(nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listo)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(continuar)
                            .addComponent(terminar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ejecutando)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bloqueado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vueltas)
                    .addComponent(terminado))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void terminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarActionPerformed

        h.stop();
        segundos = 0;
        minutos = 0;
        horas = 0;
        iniciar.setEnabled(true);
        pausar.setEnabled(false);
        continuar.setEnabled(false);
        terminar.setEnabled(false);
        crono.setText("00 : 00 : 00");
        
        
        nuevo.setEnabled(false);
        listo.setEnabled(false);
        ejecutando.setEnabled(false);
        bloqueado.setEnabled(false);
        terminado.setEnabled(true);
        terminado.setBackground(Color.black);

        // TODO add your handling code here:
    }//GEN-LAST:event_terminarActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed

        h = new Thread(this);
        iniciar.setEnabled(false);
        pausar.setEnabled(true);
        continuar.setEnabled(true);
        terminar.setEnabled(true);
        vuelta.setEnabled(true);
        h.start();

        nuevo.setEnabled(false);
        listo.setEnabled(true);
        listo.setBackground(Color.green);
        ejecutando.setEnabled(false);
        bloqueado.setEnabled(false);
        terminado.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarActionPerformed

    private void pausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausarActionPerformed

        h.suspend();
        pausar.setEnabled(false);
        continuar.setEnabled(true);
        
        nuevo.setEnabled(false);
        listo.setEnabled(false);
        ejecutando.setEnabled(false);
        bloqueado.setEnabled(true);
        bloqueado.setBackground(Color.red);
        terminado.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_pausarActionPerformed

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed

        h.resume();
        continuar.setEnabled(false);
        pausar.setEnabled(true);
        
        
        nuevo.setEnabled(false);
        listo.setEnabled(false);
        ejecutando.setEnabled(true);
        ejecutando.setBackground(Color.blue);
        bloqueado.setEnabled(false);
        terminado.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_continuarActionPerformed

    private void vueltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vueltasActionPerformed

        vuelta.append("\t  Vuelta" + nv + " : " + horas + " : " + minutos + " : " + segundos + "\n");
        nv++;
        // TODO add your handling code here:
    }//GEN-LAST:event_vueltasActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_nuevoActionPerformed

    private void ejecutandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutandoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_ejecutandoActionPerformed

    private void bloqueadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloqueadoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_bloqueadoActionPerformed

    private void terminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminadoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_terminadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bloqueado;
    private javax.swing.JButton continuar;
    private javax.swing.JLabel crono;
    private javax.swing.JButton ejecutando;
    private javax.swing.JLabel est;
    private javax.swing.JButton iniciar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton listo;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton pausar;
    private javax.swing.JButton terminado;
    private javax.swing.JButton terminar;
    private javax.swing.JTextArea vuelta;
    private javax.swing.JButton vueltas;
    // End of variables declaration//GEN-END:variables
}