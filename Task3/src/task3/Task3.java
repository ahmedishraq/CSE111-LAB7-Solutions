/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.Scanner;

public class Task3 {

    static Scanner sc = new Scanner(System.in);                   //  have to be static scanner.

    public static void startsWith() {
        System.out.println("Enter two strings to check if their prefixes matches or not ");
        String a = sc.nextLine();
        String b = sc.nextLine();
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        if (a.equals("") || b.equals("")) {
            System.out.println("Invalid input");
        } else if (arr1[0] == arr2[0]) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        startsWith();
    }

}
