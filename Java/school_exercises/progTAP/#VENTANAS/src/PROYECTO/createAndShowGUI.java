/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author HP
 */

private static void createAndShowGUI() {
JFrame.setDefaultLookAndFeelDecorated(true);
JFrame frame = new JFrame("FrameDemo");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel emptyLabel = new JLabel("");
emptyLabel.setPreferredSize(new Dimension(175, 100));
frame.getContentPane().add(emptyLabel,BorderLayout.CENTER);
frame.pack();
frame.setVisible(true);
}
public static void main(String[] args) {
javax.swing.SwingUtilities.invokeLater(new Runnable() {public void run() {
createAndShowGUI();
}});}}
