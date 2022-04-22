/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmoMultiplicadorConstante;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class MultiplicadorConstante extends JFrame {

    private Container contenedor;
    private GridBagLayout esquema;
    private GridBagConstraints restricciones;
    JLabel l1, l2, l3, l4, l5, l6;
    JButton b1, b2;
    JTextField t1, t2, t3;
    JTextArea a1, a2, a3;
    int n1 = 0, c1 = 0, ntamano = 0, ctamano = 0, multiplicacion = 0;
    String dato1 = "", dato2 = "", dato3 = "", nn = "", sub = "", newcua = "";
    String[] da1;
    String[] da2;
    String[] da3;
    int veces;

    public MultiplicadorConstante() {
        setSize(350, 350);
        setTitle(" Michael Salgado");
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

        contenedor = getContentPane();
        esquema = new GridBagLayout();
        contenedor.setLayout(esquema);

        //**********************************************************
        //-   Permite ingresar imagen de fondo.              -
        //----------------------------------------------------------
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon img = new ImageIcon("6.jpg");
        JLabel fondo = new JLabel(img);
        fondo.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        //----------------------------------------------------------

        restricciones = new GridBagConstraints();
        restricciones.insets = new Insets(5, 5, 5, 5);

        restricciones.fill = GridBagConstraints.BOTH;

        l1 = new JLabel(" Multiplicador Constante");
        l1.setFont(new Font("Segoe UI", Font.BOLD, 30));
        l1.setForeground(Color.RED);
        establecerValores(0, 0, 4, 1);
        restricciones.fill = GridBagConstraints.BOTH;
        esquema.setConstraints(l1, restricciones);
        contenedor.add(l1);

        //----- Valor de X0 -----  
        l2 = new JLabel("Valor de X0:");
        l2.setFont(new Font("Segoe UI", Font.BOLD, 14));
        l2.setForeground(Color.BLUE);
        establecerValores(0, 2, 2, 1);
        restricciones.fill = GridBagConstraints.CENTER;
        esquema.setConstraints(l2, restricciones);
        contenedor.add(l2);

        t1 = new JTextField(10);
        t1.setToolTipText("Escribe Numero");
        t1.setBorder(BorderFactory.createLoweredBevelBorder());
        establecerValores(2, 2, 2, 1);
        restricciones.fill = GridBagConstraints.CENTER;
        esquema.setConstraints(t1, restricciones);
        contenedor.add(t1);

        //----- Valor de Ai -----  
        l3 = new JLabel("Valor constante A:");
        l3.setFont(new Font("Segoe UI", Font.BOLD, 14));
        l3.setForeground(Color.BLUE);
        establecerValores(0, 3, 2, 1);
        restricciones.fill = GridBagConstraints.CENTER;
        esquema.setConstraints(l3, restricciones);
        contenedor.add(l3);

        t2 = new JTextField(10);
        t2.setToolTipText("Escribe Numero");
        t2.setBorder(BorderFactory.createLoweredBevelBorder());
        establecerValores(2, 3, 2, 1);
        restricciones.fill = GridBagConstraints.CENTER;
        esquema.setConstraints(t2, restricciones);
        contenedor.add(t2);

        //----- Cantidad de numeros a generar -----
        l4 = new JLabel("N Iteraciones:");
        l4.setFont(new Font("Segoe UI", Font.BOLD, 14));
        l4.setForeground(Color.BLUE);
        establecerValores(0, 5, 2, 1);
        restricciones.fill = GridBagConstraints.CENTER;
        esquema.setConstraints(l4, restricciones);
        contenedor.add(l4);

        t3 = new JTextField(10);
        t3.setToolTipText("Escribe Numero");
        t3.setBorder(BorderFactory.createLoweredBevelBorder());
        establecerValores(2, 5, 2, 1);
        restricciones.fill = GridBagConstraints.CENTER;
        esquema.setConstraints(t3, restricciones);
        contenedor.add(t3);

        b1 = new JButton("SOLUCION");
        b1.setToolTipText("Clic Para Convertir");
        b1.setBorder(new EmptyBorder(10, 15, 10, 15));
        b1.setMnemonic(KeyEvent.VK_H);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 14));
        b1.setForeground(Color.RED);
        establecerValores(1, 6, 2, 1);
        restricciones.fill = GridBagConstraints.CENTER;
        esquema.setConstraints(b1, restricciones);
        contenedor.add(b1);

        b2 = new JButton("LIMPIAR");
        b2.setToolTipText("Clic Para Limpiar Datos");
        b2.setBorder(new EmptyBorder(10, 15, 10, 15));
        b2.setMnemonic(KeyEvent.VK_L);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 14));
        b2.setForeground(Color.RED);
        establecerValores(3, 6, 2, 1);
        restricciones.fill = GridBagConstraints.CENTER;
        esquema.setConstraints(b2, restricciones);
        contenedor.add(b2);

        l4 = new JLabel("Yi");
        l4.setFont(new Font("Segoe UI", Font.BOLD, 14));
        l4.setForeground(Color.BLUE);
        establecerValores(1, 7, 1, 1);
        restricciones.fill = GridBagConstraints.CENTER;
        esquema.setConstraints(l4, restricciones);
        contenedor.add(l4);

        a1 = new JTextArea(10, 6);
        a1.setEditable(false);
        a1.setBorder(BorderFactory.createLoweredBevelBorder());
        establecerValores(1, 8, 1, 1);
        restricciones.fill = GridBagConstraints.CENTER;
        esquema.setConstraints(a1, restricciones);
        contenedor.add(a1);

        l5 = new JLabel("Xi");
        l5.setFont(new Font("Segoe UI", Font.BOLD, 14));
        l5.setForeground(Color.BLUE);
        establecerValores(2, 7, 1, 1);
        restricciones.fill = GridBagConstraints.CENTER;
        esquema.setConstraints(l5, restricciones);
        contenedor.add(l5);

        a2 = new JTextArea(10, 6);
        a2.setEditable(false);
        a2.setBorder(BorderFactory.createLoweredBevelBorder());
        establecerValores(2, 8, 1, 1);
        restricciones.fill = GridBagConstraints.CENTER;
        esquema.setConstraints(a2, restricciones);
        contenedor.add(a2);

        l6 = new JLabel("Ri");
        l6.setFont(new Font("Segoe UI", Font.BOLD, 14));
        l6.setForeground(Color.BLUE);
        establecerValores(3, 7, 1, 1);
        restricciones.fill = GridBagConstraints.CENTER;
        esquema.setConstraints(l6, restricciones);
        contenedor.add(l6);

        a3 = new JTextArea(10, 6);
        a3.setEditable(false);
        a3.setBorder(BorderFactory.createLoweredBevelBorder());
        establecerValores(3, 8, 1, 1);
        restricciones.fill = GridBagConstraints.CENTER;
        esquema.setConstraints(a3, restricciones);
        contenedor.add(a3);

        ManejadorCamposTexto m = new ManejadorCamposTexto();
        b1.addActionListener(m);
        b2.addActionListener(m);

        pack();

    }

//**********************************************************************************
    public void establecerValores(int columna, int fila, int anchura, int altura) {
        restricciones.gridx = columna;
        restricciones.gridy = fila;

        restricciones.gridwidth = anchura;
        restricciones.gridheight = altura;
    }
//**********************************************************************************

    public static void main(String args[]) {
        new MultiplicadorConstante();
    }

    private class ManejadorCamposTexto implements ActionListener {

        public void actionPerformed(ActionEvent evento) {
            if (evento.getSource() == b1) {
                if (t1.getText().equals("")) //********** Permite verificar si la caja de texto esta vacia **********//
                {
                    JOptionPane.showMessageDialog(null, "Ingresa valor de semilla");
                } else {

                    if (t2.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Ingresa valor de constante A");
                    } else {

                        if (t3.getText().equals("")) {
                            JOptionPane.showMessageDialog(null, "Ingresa cantidad de datos");
                        } else {
                            try {

                                n1 = Integer.parseInt(t1.getText());
                                c1 = Integer.parseInt(t2.getText());
                                veces = Integer.parseInt(t3.getText());

                                String nt = String.valueOf(n1);
                                ntamano = nt.length();

                                //----------------------------------
                                // Esto Valida la cantidad de digitos que utilizaremos
                                if (n1 <= 999 && c1 <= 999) {
                                    JOptionPane.showMessageDialog(null, "Valor de Xo y Xi debe ser mayor a tres digitos");
                                    t1.setText("");
                                    t2.setText("");
                                } else {

                                    if (veces <= 0) {
                                        JOptionPane.showMessageDialog(null, "El numero de datos a generar \nno puede ser igual o menor a 0", "error", JOptionPane.ERROR_MESSAGE);
                                        t3.setText("");
                                    } else {

                                        for (int i = 0; i < veces; i++) {

                                            multiplicacion = n1 * c1;
                                            String cua = String.valueOf(multiplicacion);
                                            ctamano = cua.length();

                                            if (ctamano % 2 == 0) {
                                                int d1 = (ctamano - ntamano) / 2;
                                                int d2 = d1 + ntamano;

                                                nn = String.valueOf(multiplicacion);
                                                sub = nn.substring(d1, d2);

                                                n1 = Integer.parseInt(sub);
                                            } else {
                                                newcua = "0" + cua;
                                                ctamano = newcua.length();

                                                //----- cheka
                                                int d1 = (ctamano - ntamano) / 2;
                                                int d2 = d1 + ntamano;

                                                nn = newcua;
                                                sub = nn.substring(d1, d2);

                                                n1 = Integer.parseInt(sub);

                                            }

                                            da1 = new String[veces];
                                            da1[i] = nn;
                                            dato1 += "y" + i + ":  " + da1[i] + "\n";

                                            da2 = new String[veces];
                                            da2[i] = sub;
                                            dato2 += "x" + (i + 1) + ":  " + da2[i] + "\n";

                                            da3 = new String[veces];
                                            da3[i] = "r" + i + ":  0." + sub;
                                            dato3 += da3[i] + "\n";

                                        }

                                    }

                                    a1.setText(dato1);
                                    a2.setText(dato2);
                                    a3.setText(dato3);

                                }

                            } catch (java.lang.NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Dato invalido");
                                t1.setText("");
                                t2.setText("");
                                t3.setText("");
                                a1.setText("");
                                a2.setText("");
                                a3.setText("");
                            }

                        }  // else
                    }
                }

            }  // get source b1

            if (evento.getSource() == b2) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                a1.setText("");
                a2.setText("");
                a3.setText("");

                //----- Permite vaciar el arreglo -----
                if (dato1 != null && dato2 != null && dato3 != null) {
                    dato1 = "";
                    dato2 = "";
                    dato3 = "";
                }

                if (da1 != null && da2 != null && da3 != null) {
                    for (int x = 0; x < veces; x++) {
                        da1 = null;
                        da2 = null;
                        da3 = null;
                    }
                }

            }

        }

    }

}
