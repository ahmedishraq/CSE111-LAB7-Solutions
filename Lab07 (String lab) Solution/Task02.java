package Lab07;
import java.util.Scanner;
public class Task02{
	public static void printChar(String x,int i) {
		if(i>x.length()-1) {
			System.out.println("Invalid Index");
		}
		else {
			System.out.println(x.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String and then the index");
		String x=sc.nextLine();
		int i = sc.nextInt();
		printChar(x,i);
	}
}
