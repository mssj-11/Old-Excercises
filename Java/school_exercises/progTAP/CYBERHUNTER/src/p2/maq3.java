/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class maq3 extends javax.swing.JPanel implements Runnable  {
    int segundos=0, minutos = 0, horas = 0;
   public static double totalf3;
   double b;
     
    Thread h;
    @Override
    
    public void run(){
         
        
     while(true){
        
         try {
             segundos++;
             cronometro.setText(" "+horas+" : "+minutos+" : "+ segundos);
             
             Thread.sleep(10);
         } catch (InterruptedException ex) {
             Logger.getLogger(maq3.class.getName()).log(Level.SEVERE, null, ex);
         }
     if(segundos == 59 ){
     segundos = 0;
     minutos++;
     }
     
     if (minutos == 59){
         minutos = 0;
     horas++;
     }
     
     }
    }
    

    /**
     * Creates new form maq3
     */
    public maq3() {
        initComponents();
        p3.setEnabled(false);
         c3.setEnabled(false);
         t3.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cronometro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        registro = new javax.swing.JTextArea();
        tf3 = new javax.swing.JTextField();
        i3 = new javax.swing.JButton();
        p3 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        co3 = new javax.swing.JButton();
        t3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        registro.setColumns(20);
        registro.setRows(5);
        jScrollPane1.setViewportView(registro);

        i3.setText("iniciar");
        i3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i3ActionPerformed(evt);
            }
        });

        p3.setText("pausar");
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });

        c3.setText("continuar");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        co3.setText("cobrar");
        co3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                co3ActionPerformed(evt);
            }
        });

        t3.setText("total");
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        jLabel1.setText("maquina 3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(i3)
                            .addComponent(p3)
                            .addComponent(c3)
                            .addComponent(co3)
                            .addComponent(t3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cronometro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(i3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c3)
                        .addGap(2, 2, 2)
                        .addComponent(co3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void i3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i3ActionPerformed
        // TODO add your handling code here:
         h=new Thread(this);
        i3.setEnabled(false);
        p3.setEnabled(true);
        t3.setEnabled(true);
        c3.setEnabled(true);
          h.start();
    }//GEN-LAST:event_i3ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
        // TODO add your handling code here:
          c3.setEnabled(true);
        p3.setEnabled(false);

       h.suspend();
    }//GEN-LAST:event_p3ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        // TODO add your handling code here:
        c3.setEnabled(false);
        p3.setEnabled(true);
                        h.resume();
    }//GEN-LAST:event_c3ActionPerformed

    private void co3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_co3ActionPerformed
        // TODO add your handling code here:
         double total=0;
         double total2=0;
         double total1=0;
        if(minutos>=0 && minutos <=30){
             total =  5;
             
        }
        else if(minutos>=31 && minutos <=59){
             total =  10;
        
        }
        
             total2 =horas  * 10;
      total1 = total+ total2;
       totalf3= totalf3 + total1;
       
        registro.append("\n" +  " total es: "+total1  ); 
        
        
       
        
          try{ 
            File f= new File("registro.txt");
           
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists()){
                fw=new FileWriter(f, true);
                bw=new  BufferedWriter(fw);
                bw.newLine();
                bw.write("maquina 3 " +  "el total es : "+total1 );
                
            } else{
                fw=new FileWriter(f);
                bw=new BufferedWriter(fw);
                 bw.write("maquina 3 "+  "el total es: "+total1 );
            }
            bw.close();
            fw.close();
         
            
        }catch (Exception ex){
            Logger.getLogger(maq3.class.getName()).log(Level.SEVERE, null, ex);;
                
            
        }
    
         try {
                File f=new File("registro.txt");
                {
                FileReader fr=new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                String linea;
                
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }

    }//GEN-LAST:event_co3ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
        h.stop();
        
        segundos=0;
       minutos=0;
        horas=0;
       cronometro.setText("00:00:00");
        i3.setEnabled(true);
        t3.setEnabled(false);
        p3.setEnabled(false);
        c3.setEnabled(false);
        co3.setEnabled(true);
        
               tf3.setText("cuenta total : "+totalf3 + "\n" );
     
         try{ 
            File v= new File("inventario.txt");
           
            FileWriter fw;
            BufferedWriter bw;
            if(v.exists()){
                fw=new FileWriter(v, true);
                bw=new  BufferedWriter(fw);
                bw.newLine();
                bw.write("--" +"\n" + "cuenta total de la maquina 3 es: "+totalf3 + "\n\n" );
              
            } else{
                fw=new FileWriter(v);
                bw=new BufferedWriter(fw);
                 bw.write("-------------" +"\n" + "cuenta total: "+totalf3 +  "\n\n" );
            }
            bw.close();
            fw.close();
         
            
        }catch (Exception e){
                System.out.println(e);
            
        }
    
        try {
                File v=new File("inventario.txt");
                {
                FileReader vr=new FileReader(v);
                BufferedReader br=new BufferedReader(vr);
                String linea;
                
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }
    }//GEN-LAST:event_t3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton c3;
    private javax.swing.JButton co3;
    private javax.swing.JTextField cronometro;
    private javax.swing.JButton i3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton p3;
    private javax.swing.JTextArea registro;
    private javax.swing.JButton t3;
    private javax.swing.JTextField tf3;
    // End of variables declaration//GEN-END:variables
}
