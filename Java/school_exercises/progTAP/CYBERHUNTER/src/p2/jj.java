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
import javax.swing.JTextField;
import p2.k;

/**
 *
 * @author ASUS
 */
public class jj extends javax.swing.JPanel implements Runnable {
    
    
    
    
    
    int segundos=0, minutos = 0, horas = 0;
   public static double totalf;
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
             Logger.getLogger(jj.class.getName()).log(Level.SEVERE, null, ex);
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
     * Creates new form jj
     */
    public jj() {
        initComponents();
        p.setEnabled(false);
         c.setEnabled(false);
         t.setEnabled(false);
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
        tf = new javax.swing.JTextField();
        i = new javax.swing.JButton();
        p = new javax.swing.JButton();
        c = new javax.swing.JButton();
        co = new javax.swing.JButton();
        t = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        cronometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cronometroActionPerformed(evt);
            }
        });

        registro.setColumns(20);
        registro.setRows(5);
        jScrollPane1.setViewportView(registro);

        i.setText("iniciar");
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });

        p.setText("pausar");
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });

        c.setText("continuar");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        co.setText("cobrar");
        co.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coActionPerformed(evt);
            }
        });

        t.setText("total");
        t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tActionPerformed(evt);
            }
        });

        jLabel1.setText("maquina 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(i)
                            .addComponent(p)
                            .addComponent(c)
                            .addComponent(co)
                            .addComponent(t))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cronometro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(i)
                        .addGap(4, 4, 4)
                        .addComponent(p)
                        .addGap(7, 7, 7)
                        .addComponent(c)
                        .addGap(9, 9, 9)
                        .addComponent(co)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t)))
                .addGap(18, 18, 18)
                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        // TODO add your handling code here:
        h=new Thread(this);
        i.setEnabled(false);
        p.setEnabled(true);
        t.setEnabled(true);
        c.setEnabled(true);
          h.start();
        
    }//GEN-LAST:event_iActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        // TODO add your handling code here:
          c.setEnabled(true);
        p.setEnabled(false);

       h.suspend();
    }//GEN-LAST:event_pActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
        c.setEnabled(false);
        p.setEnabled(true);
                        h.resume();
    }//GEN-LAST:event_cActionPerformed

    private void tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tActionPerformed
        // TODO add your handling code here:
         h.stop();
        
        segundos=0;
       minutos=0;
        horas=0;
       cronometro.setText("00:00:00");
        i.setEnabled(true);
        t.setEnabled(false);
        p.setEnabled(false);
        c.setEnabled(false);
        co.setEnabled(true);
        
               tf.setText("cuenta total: "+totalf + "\n" );
     
         try{ 
            File v= new File("inventario.txt");
           
            FileWriter fw;
            BufferedWriter bw;
            if(v.exists()){
                fw=new FileWriter(v, true);
                bw=new  BufferedWriter(fw);
                bw.newLine();
                bw.write("--" +"\n" + "cuenta total de la maquina 1 es : "+totalf + "\n\n" );
              
            } else{
                fw=new FileWriter(v);
                bw=new BufferedWriter(fw);
                 bw.write("----" +"\n" + "cuenta total de la maquina 1 es: "+totalf +  "\n\n" );
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
    }//GEN-LAST:event_tActionPerformed

    private void coActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coActionPerformed
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
   
       totalf= totalf + total1;
       
        registro.append("\n" +  " total es: "+total1  ); 
        
        
       
        
          try{ 
            File f= new File("registro.txt");
           
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists()){
                fw=new FileWriter(f, true);
                bw=new  BufferedWriter(fw);
                bw.newLine();
                bw.write("maquina 1 el total es: "+total1 );
                
            } else{
                fw=new FileWriter(f);
                bw=new BufferedWriter(fw);
                 bw.write("maquina 1 el total es: "+total1 );
            }
            bw.close();
            fw.close();
         
            
        }catch (Exception ex){
            Logger.getLogger(jj.class.getName()).log(Level.SEVERE, null, ex);;
                
            
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
        
         
    }//GEN-LAST:event_coActionPerformed

    private void cronometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cronometroActionPerformed
        // TODO add your handling code here:
       
       
    }//GEN-LAST:event_cronometroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton c;
    private javax.swing.JButton co;
    private javax.swing.JTextField cronometro;
    private javax.swing.JButton i;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton p;
    private javax.swing.JTextArea registro;
    private javax.swing.JButton t;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}
