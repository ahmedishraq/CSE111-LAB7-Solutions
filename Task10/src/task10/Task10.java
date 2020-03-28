/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task10;

/**
 *
 * @author DOLPHIN
 */
import java.util.Scanner;

public class Task10 {

    public static void equals(String a, String b) {
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length;i++) {
                if (arr1[i] == arr2[i]) {
                    if (i == arr1.length - 1) {
                        System.out.println("True");
                    } 
                    }
                else {
                        System.out.println("False");
                        break;
                }
            }
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        equals(sc.nextLine(), sc.nextLine());
    }

}
