/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task12;

/**
 *
 * @author DOLPHIN
 */
import java.util.Scanner;

public class Task12 {

    public static void compareTo(String x, String y) {
        char[] str1 = x.toCharArray();
        char[] str2 = y.toCharArray();
        for (int i = 0; i < str1.length; ++i) {
            if (i > str2.length - 1) {
                System.out.println(str1.length);
                break;
            } else if (i > str1.length - 1) {
                System.out.println(str2.length);
                break;
            } else if ((int) str1[i] - (int) str2[i] != 0) {
                System.out.println((int) str1[i] - (int) str2[i]);
                break;
            } else {
                if (i == str1.length - 1) {
                    System.out.println((int) str1[i] - (int) str2[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two words as input");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        compareTo(str1, str2);
    }

}
