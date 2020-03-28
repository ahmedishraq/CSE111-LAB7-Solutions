package Lab07;
import java.util.Scanner;
public class Task03 {
	static Scanner sc = new Scanner(System.in);
	public static void startsWith() {
		System.out.println("Please enter two words to check if their preffixes matches");
		String x = sc.nextLine();
		String y = sc.nextLine();
		char[] str1 = x.toCharArray();
		char[] str2 = y.toCharArray();
		if(x.equals("") || y.equals("")) {
			System.out.println("Invalid input");
		}
		else if(str1[0]==str2[0]) 
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	public static void main(String[] args) {
		startsWith();
	}
}
