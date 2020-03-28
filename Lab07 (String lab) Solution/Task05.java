package Lab07;
import java.util.Scanner;
public class Task05 {
	static void replaceFirst(String s,char x) {
		char[] str1= s.toCharArray();
		str1[0]=x;
		for(int i=0;i<str1.length;++i) {
			System.out.print(str1[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word and a character");
		String s = sc.nextLine();
		char x = sc.nextLine().charAt(0);
		replaceFirst(s,x);
	}
}
