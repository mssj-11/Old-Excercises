/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caballos;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;

/**
 *
 * @author HP
 */

public class Caballos extends Panel implements Runnable {

    int dorsal, y = 50, metros, pos;
    Label l6, l7;
    Canvas c;
    int[] contador;

    public Caballos(int d, int m, Label g, Label s, int[] co) {
        dorsal = d;
        metros = m;
        l6 = g;
        l7 = s;
        contador = co;

        setLayout(null);

        Label num = new Label("" + dorsal);
        num.setBounds(10, y + 22 * dorsal, 30, 20);
        add(num);

        c = new Canvas();
        c.setBounds(50, y + 22 * dorsal, 1, 20);
        c.setBackground(Color.blue);
        add(c);
    }

    @Override
    public void run() {
        pos = 0;

        while (pos < metros) {
            pos += (int) (Math.random() * 202 + 8);
        }

        if (pos >= metros) {
            pos = metros;
            c.setSize(pos * 200 / metros, 20);

            int j = 0;
            while (contador[j] == 0) {
                contador[j] = dorsal;
                j++;
                break;
            }

            if (l6.getText().equalsIgnoreCase("")) {
                l6.setText("Dorsal: " + dorsal);
            } else {
                if (l7.getText().equalsIgnoreCase("")) {
                    l7.setText("Dorsal: " + dorsal);
                }
            }
        }
    }

    void posicionar(String[] cas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
