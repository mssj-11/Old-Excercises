/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import static Practica.PC1.totalf;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class PC3 extends javax.swing.JPanel implements Runnable{
    
    int segundos = 0, minutos = 0, horas = 0;
    public static double totalf3;
    double b;

    Thread h;

    @Override
    public void run() {

        while (true) {

            try {
                segundos++;
                cronometro3.setText(" " + horas + " : " + minutos + " : " + segundos);

                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(PC3.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (segundos == 59) {
                segundos = 0;
                minutos++;
            }

            if (minutos == 59) {
                minutos = 0;
                horas++;
            }

        }

    }

    /**
     * Creates new form PC3
     */
    public PC3() {
        initComponents();
        initComponents();
        pausar3.setEnabled(false);
        continuar3.setEnabled(false);
        total3.setEnabled(false);
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
        iniciar3 = new javax.swing.JButton();
        pausar3 = new javax.swing.JButton();
        continuar3 = new javax.swing.JButton();
        cobrar3 = new javax.swing.JButton();
        total3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        registro3 = new javax.swing.JTextArea();
        cronometro3 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();

        jLabel1.setText("PC3");

        iniciar3.setText("Iniciar");
        iniciar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciar3ActionPerformed(evt);
            }
        });

        pausar3.setText("Pausar");
        pausar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausar3ActionPerformed(evt);
            }
        });

        continuar3.setText("Continuar");
        continuar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuar3ActionPerformed(evt);
            }
        });

        cobrar3.setText("Cobrar");
        cobrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobrar3ActionPerformed(evt);
            }
        });

        total3.setText("Total");
        total3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total3ActionPerformed(evt);
            }
        });

        registro3.setColumns(20);
        registro3.setRows(5);
        jScrollPane1.setViewportView(registro3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(total3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(continuar3)
                    .addComponent(iniciar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cobrar3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pausar3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf3)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(cronometro3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(cronometro3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciar3)
                    .addComponent(pausar3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continuar3)
                    .addComponent(cobrar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void iniciar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciar3ActionPerformed

        h = new Thread(this);
        iniciar3.setEnabled(false);
        pausar3.setEnabled(true);
        total3.setEnabled(true);
        continuar3.setEnabled(true);
        h.start();

        // TODO add your handling code here:
    }//GEN-LAST:event_iniciar3ActionPerformed

    private void pausar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausar3ActionPerformed

        continuar3.setEnabled(true);
        pausar3.setEnabled(false);

        h.suspend();

        // TODO add your handling code here:
    }//GEN-LAST:event_pausar3ActionPerformed

    private void continuar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuar3ActionPerformed

        continuar3.setEnabled(false);
        pausar3.setEnabled(true);
        h.resume();
        // TODO add your handling code here:
    }//GEN-LAST:event_continuar3ActionPerformed

    private void cobrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobrar3ActionPerformed

        double total = 0;
        double total2 = 0;
        double total1 = 0;
        if (minutos >= 0 && minutos <= 30) {
            total = 5;

        } else if (minutos >= 31 && minutos <= 59) {
            total = 10;

        }

        total2 = horas * 10;
        total1 = total + total2;

        totalf3 = totalf3 + total;

        registro3.append("\n" + " El total es: " + total1);

        try {
            File f = new File("registro.txt");

            FileWriter fw;
            BufferedWriter bw;
            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write("El Total de la Maquina 3 es: " + total1);

            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write("El Total de la Maquina 3 es: " + total1);
            }
            bw.close();
            fw.close();

        } catch (Exception ex) {
            Logger.getLogger(PC1.class.getName()).log(Level.SEVERE, null, ex);;

        }

        try {
            File f = new File("registro.txt");
            {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;

            }

        } catch (Exception e) {
            System.out.println(e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cobrar3ActionPerformed

    private void total3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total3ActionPerformed

        h.stop();

        segundos = 0;
        minutos = 0;
        horas = 0;
        cronometro3.setText("00:00:00");
        iniciar3.setEnabled(true);
        total3.setEnabled(false);
        pausar3.setEnabled(false);
        continuar3.setEnabled(false);
        cobrar3.setEnabled(true);

        tf3.setText("La cuenta total es: " + totalf3 + "\n");

        try {
            File v = new File("inventario.txt");

            FileWriter fw;
            BufferedWriter bw;
            if (v.exists()) {
                fw = new FileWriter(v, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write("" + "\n" + "la cuenta total de la maquina 3 es : " + totalf3 + "\n\n");

            } else {
                fw = new FileWriter(v);
                bw = new BufferedWriter(fw);
                bw.write("" + "\n" + "La cuenta total de la maquina 3 es: " + totalf3 + "\n\n");
            }
            bw.close();
            fw.close();

        } catch (Exception e) {
            System.out.println(e);

        }

        try {
            File v = new File("inventario.txt");
            {
                FileReader vr = new FileReader(v);
                BufferedReader br = new BufferedReader(vr);
                String linea;

            }

        } catch (Exception e) {
            System.out.println(e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_total3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cobrar3;
    private javax.swing.JButton continuar3;
    private javax.swing.JTextField cronometro3;
    private javax.swing.JButton iniciar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pausar3;
    private javax.swing.JTextArea registro3;
    private javax.swing.JTextField tf3;
    private javax.swing.JButton total3;
    // End of variables declaration//GEN-END:variables
}