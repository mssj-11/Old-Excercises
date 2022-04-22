/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package semaforo;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import static java.lang.Thread.sleep;
/**
 *
 * @author HP
 */

public class semaforo extends Applet implements ActionListener {

    Button b1 = new Button("Iniciar");
    Button b2 = new Button("Pausar");
    Panel panel = new Panel();
    Conteo c1;
                
    @Override
    public void init() {
        // propiedad inicial del panel
        panel.setBackground(Color.gray);
        
        setLayout(new GridLayout(1, 1));
        add(panel);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void empezar() {
        c1 = new Conteo(1000, panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(b1)) {
            empezar();
            c1.start();

        }
        if (e.getSource().equals(b2)) {
            c1.stop();
        }
    }

    class Conteo extends Thread {

        long tiempo;
        Panel Area;
        boolean contando = true;

        public Conteo(long tiempo, Panel Area) {
            this.tiempo = tiempo;
            this.Area = Area;

        }

        @Override
        public void run() {
            
            while (contando) {
                Area.setBackground(Color.red);
                try {
                    sleep(tiempo);
                } catch (InterruptedException e) {

                }
                Area.setBackground(Color.blue);
                try {
                    sleep(tiempo);
                } catch (InterruptedException e) {
                }
            }
        }
    }

}
