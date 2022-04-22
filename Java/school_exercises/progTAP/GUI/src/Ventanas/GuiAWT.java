/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class GuiAWT {

    public static void main(String args[]) {

        Frame v1 = new Frame();
        v1.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent we) {

                System.exit(0);
            }
        });

        Label a1 = new Label();
        Button b1 = new Button("Hola Mundo");
        CheckboxGroup cbg = new CheckboxGroup();

        v1.setTitle("MiVentana");
        v1.setSize(500, 500);
        v1.setLocation(300, 300);
        v1.setVisible(true);

        v1.setLayout(new FlowLayout());
        a1.setText("Hello World");
        v1.add(a1);
        v1.add(b1);
        v1.setVisible(true);

        v1 = new v1("Prueba JFrame");
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //v1.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
        v1.setLocationRelativeTo(b1);

        v1.add(new Checkbox("wifi", null, true));
        v1.add(new Checkbox("3G"));
        v1.add(new Checkbox("Camera", null, true));
        v1.add(new Checkbox("one", cbg, false));
        v1.add(new Checkbox("two", cbg, true));
        v1.add(new Checkbox("three", cbg, false));

        v1.setVisible(true);

    }
}
