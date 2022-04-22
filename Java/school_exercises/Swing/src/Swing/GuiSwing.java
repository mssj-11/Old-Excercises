/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;
//import java.awt.Checkbox;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class GuiSwing {

    public static void main(String[] args) {
        JFrame F = new JFrame();
        F.setTitle("VENTANA");
        F.setSize(300, 300);
        F.setVisible(true);
        F.setLocation(500, 200);
        F.setLayout(new FlowLayout());

        JLabel L = new JLabel();
        L.setText("Hola Mundo");
        L.setVisible(true);

        F.add(L);
        JButton B = new JButton("Seleccionar");
        F.add(B);

        // JCheckBox CN=new JCheckBox();
        F.add(new JCheckBox("1", true));
        F.add(new JCheckBox("2", false));
        F.add(new JCheckBox("3", false));

    }

}
