/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author DOLPHIN
 */
import java.util.Scanner;

public class Task2 {

    public static void printChar(String a, int n) {
        if (n > a.length() - 1) {
            System.out.println("Invalid Index");
        } else {
            System.out.println(a.charAt(n));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string and then enter a number");
        printChar(sc.nextLine(), sc.nextInt());
    }

}
