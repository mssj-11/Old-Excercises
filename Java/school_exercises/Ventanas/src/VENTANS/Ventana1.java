package VENTANS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author HP
 */
public class Ventana1 extends JFrame{
    private JButton boton;
    public Ventana1(){
        super("Dumb Demo");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        boton = new JButton("Abre otra ventana");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Ventana2 obj = new Ventana2();
                dispose();
            }
        });
        add(boton);
        setVisible(true);
    }
}
