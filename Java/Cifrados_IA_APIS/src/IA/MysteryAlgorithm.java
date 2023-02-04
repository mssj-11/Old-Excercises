/*
    Algoritmo Misterioso
 */
package IA;
/**
 * @author HP - MSS
 */
import java.util.Scanner;
public class MysteryAlgorithm {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("*****   Mystery Algorithm   *****");
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        
        int x = a;
        int y = b;
        
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        
        System.out.println("The result is: " + x);
    }
    
    
}