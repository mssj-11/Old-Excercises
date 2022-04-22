/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO;

/**
 *
 * @author HP
 */
import javax.swing.*;
public class HelloWorldSwing {
private static void createAndShowGUI() {
JFrame.setDefaultLookAndFeelDecorated(true);
JFrame frame = new JFrame("HelloWorldSwing");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel label = new JLabel("Hello World");
frame.getContentPane().add(label);
frame.pack();
frame.setVisible(true); }
public static void main(String[] args) {
javax.swing.SwingUtilities.invokeLater(new Runnable() {
@Override
public void run() {
createAndShowGUI(); } });
}}
