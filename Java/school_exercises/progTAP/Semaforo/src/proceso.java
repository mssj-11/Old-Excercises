
import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.*;

public class proceso implements Runnable {

    JButton rojo;
    JButton amarillo;
    JButton verde;
    JTextField texto;
    int contador = 0, temp = 0, temp2 = 0, temp3 = 0, temp4 = 0;

    public proceso(JButton entrada1, JButton entrada2, JButton entrada3, JTextField entrada4) {

        this.rojo = entrada1;
        this.amarillo = entrada2;
        this.verde = entrada3;
        this.texto = entrada4;

    }

    @Override
    public void run() {

        while (true) {

            contador++;

            if (contador >= 1 && contador <= 15) {
                temp++;
                texto.setText("" + temp);
            }
            if (contador == 1) {
                rojo.setBackground(Color.red);
                amarillo.setBackground(Color.gray);
                verde.setBackground(Color.gray);
            }

            if (contador >= 15 && contador <= 18) {
                temp2++;
                texto.setText("" + temp2);
            }
            if (contador == 15) {
                rojo.setBackground(Color.gray);
                amarillo.setBackground(Color.yellow);
                verde.setBackground(Color.gray);
            }

            if (contador >= 15 && contador <= 23) {
                temp3++;
                texto.setText("" + temp3);
            }
            if (contador == 18) {
                rojo.setBackground(Color.gray);
                amarillo.setBackground(Color.gray);
                verde.setBackground(Color.green);
            }

            if (contador >= 23 && contador <= 26) {
                temp4++;
                texto.setText("" + temp4);
            }
            if (contador == 23) {
                rojo.setBackground(Color.gray);
                amarillo.setBackground(Color.yellow);
                verde.setBackground(Color.gray);
            }

            if (contador == 22) {
                contador = 0;
                temp = 0;
                temp2 = 0;
                temp3 = 0;
                temp4 = 0;
            }

            try {
                sleep(1000);
            } catch (Exception e) {
            }

        }

    }

    public void start() {
        new Thread(this).start();
    }
}
