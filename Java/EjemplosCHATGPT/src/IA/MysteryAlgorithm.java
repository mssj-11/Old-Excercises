/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IA;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class MysteryAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input two integers: a, b: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int x = a;
        int y = b;
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        System.out.println("Result: " + x);
    }
}
