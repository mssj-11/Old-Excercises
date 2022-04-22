/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;

/**
 *
 * @author HP
 */
public class GuiSWING {

    public static void main(String[] args) {

        Frame v1 = new Frame();
        Label j1 = new Label();
        Label j2 = new Label();
        Label j3 = new Label();
        Label j4 = new Label();
        Label j5 = new Label();

        j1.setText("HOLAAA ");
        j2.setText("HOLAAA ");
        j3.setText("HOLAAA ");
        j4.setText("HOLAAA ");
        j5.setText("HOLAAA ");

        v1.add(j1);
        v1.add(j2);
        v1.add(j3);
        v1.add(j4);
        v1.add(j5);

        v1.setLayout(new BorderLayout(700, 700));
        v1.add(j1, BorderLayout.NORTH);
        v1.add(j2, BorderLayout.CENTER);
        v1.add(j3, BorderLayout.SOUTH);
        v1.add(j4, BorderLayout.EAST);

        v1.setTitle("Hola Mundo");
        v1.setSize(500, 500);

        /*JFrame v1 = new v1("Prueba JFrame");
    v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        v1.setSize(420, 420);
        v1.add(j1);
        v1.setLocationRelativeTo(null);

        v1.setVisible(true);

    }

}