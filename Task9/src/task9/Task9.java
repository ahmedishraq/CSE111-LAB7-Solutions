/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task9;

/**
 *
 * @author DOLPHIN
 */
import java.util.Scanner;

public class Task9 {

    public static String toLowerCase(String a) {
        char[] arr1 = a.toCharArray();
        a = "";
        for (int i = 0; i < arr1.length; i++) {
            if ((int) arr1[i] >= 97 && (int) arr1[i] <= 122) {
                arr1[i] = (char) ((int) arr1[i] - 32);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            a += arr1[i];
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an input ");
        String w = sc.nextLine();
        w = toLowerCase(w);
        System.out.println(w);
    }

}
