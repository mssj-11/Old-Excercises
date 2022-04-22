/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;

/**
 *
 * @author HP
 */
public class CheckBoxDemo {

    public static void main(String args[]) {

        Frame f = new Frame();
        f.setSize(150, 150);
        f.setLayout(new GridLayout(3, 1));
        CheckboxGroup cbg = new CheckboxGroup();

        f.add(new Checkbox("one", cbg, false));
        f.add(new Checkbox("two", cbg, true));
        f.add(new Checkbox("one", cbg, false));

    }

}
