/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballos;

import java.awt.*;
import java.applet.*;

/**
 *
 * @author HP
 */
public class Caballo extends Panel implements Runnable {

    int dorsal, y = 50, metros, avancealeatorio, pos;
    Label l6, l7;
    Canvas c;
    String[] cas;
    Caballos cab;

    public Caballo(int d, int m, Label g, Label s) {
        dorsal = d;
        metros = m;
        l6 = g;
        l7 = s;

        cab = Caballos(l6.getParent());

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
            pos += (int) (Math.random() * 0.02 + 5);

            if (pos > metros) {
                pos = metros;
            }

            c.setSize(pos * 200 / metros, 20);
        }

        if (pos == metros) {
            cas = new String[dorsal];
            cab.posicionar(cas);
        }

        if (l6.getText().equalsIgnoreCase("")) {
            l6.setText("Dorsal: " + dorsal);
        } else {
            if (l7.getText().equalsIgnoreCase("")) {
                l7.setText("Dorsal: " + dorsal);
            }
        }
    }
    
    private Caballos Caballos(Container parent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
