package Lab07;
import java.util.Scanner;
public class Task14 {
	public static void substring(String x,int i) {
		char[] str = x.toCharArray();
		--i;
		if(i<0 || i>str.length-1) {
			System.out.println("Index out of bounds");
		}
		else {
			for(int c=i;c<str.length;++c) {
				System.out.print(str[c]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give a word and an index to extract the substring");
		String str=sc.nextLine();
		int i = sc.nextInt();
		substring(str,i);
	}
}
