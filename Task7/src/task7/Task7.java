/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7;

/**
 *
 * @author DOLPHIN
 */
import java.util.Scanner;

public class Task7 {

    public static void replaceAll(String a, char x) {
        char[] arr1 = a.toCharArray();
        arr1[arr1.length - 1] = x;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string and a charecter to replace ");
        replaceAll(sc.nextLine(), sc.nextLine().charAt(0));
    }

}
