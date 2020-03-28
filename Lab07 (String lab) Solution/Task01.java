package Lab07;
import java.util.Scanner;
public class Task01 {
	public static void printLength(String x) {
		char[] temp = x.toCharArray();
		System.out.println(temp.length);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		printLength(sc.next());
	}
}
