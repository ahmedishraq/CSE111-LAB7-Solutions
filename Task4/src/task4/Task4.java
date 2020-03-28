/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author DOLPHIN
 */
import java.util.Scanner;

public class Task4 {

    static Scanner sc = new Scanner(System.in);

    public static void endsWith() {
        System.out.println("Enter two strings to check if their suffixes mathces or not");
        String a = sc.nextLine();
        String b = sc.nextLine();
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        for (int i =arr2.length-1; i >0; i--) {
          /*  if (a.equals("") || b.equals("")) {
                System.out.println("Invalid input");
            }*/ 
if (arr2[arr2.length] == arr1[arr1.length]) {
               // if (i == arr2.length - 1) {
                    System.out.println("True");
                //}
            } else {
                System.out.println("False");
                break;
            }
        }
    }

    public static void main(String[] args) {
        endsWith();
    }

}
