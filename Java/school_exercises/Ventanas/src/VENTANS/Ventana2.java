/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VENTANS;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author HP
 */
public class Ventana2 extends JFrame{
    private JButton boton;
    public Ventana2(){
        super("Segunda Ventana");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        boton = new JButton("Soy el segundo boton de otra ventana");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                Ventana1 obj = new Ventana1();
            }
        });
        add(boton);
        setVisible(true);
    }
}
