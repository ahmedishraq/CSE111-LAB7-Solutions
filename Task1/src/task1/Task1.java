/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author DOLPHIN
 */
import java.util.Scanner;

public class Task1 {

    public static void printLength(String a) {
        char[] arr = a.toCharArray();
        System.out.println(arr.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        printLength(sc.nextLine());
    }

}
