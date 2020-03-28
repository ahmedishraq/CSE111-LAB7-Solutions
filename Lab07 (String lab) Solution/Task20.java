package Lab07;
import java.util.Scanner;
public class Task20 {
	static char[] concat(String str1,String str2) {
		str1 += str2;
		char[] str = str1.toCharArray();
		return str;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input two words");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		char[] str = concat(s1,s2);
		for(int i=0;i<str.length;++i) {
			System.out.print(str[i]);
		}
	}
}
