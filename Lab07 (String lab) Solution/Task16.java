package Lab07;
import java.util.Scanner;
public class Task16 {
	public static void indexOff(String s,char c) {
		char[] str = s.toCharArray();
		for(int i=0;i<str.length;++i) {
			if(str[i]==c) {
				System.out.println(i);
				break;
			}
			if(i==str.length-1) {
				System.out.println(-1);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a word and a character");
		String s = sc.nextLine();
		char c = sc.next().charAt(0);
		indexOff(s,c);
	}
}
