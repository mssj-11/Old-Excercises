/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
class V2 extends JFrame{
    private JButton boton;
    public V2(){
        super("Segunda Ventana");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        boton = new JButton("Estas en el segundo boton de otra ventana");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                v1 obj = new v1();
            }
        });
        add(boton);
        setVisible(true);
    }
    
}
