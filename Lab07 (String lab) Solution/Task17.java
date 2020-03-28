package Lab07;
import java.util.Scanner;
public class Task17 {
	public static void lastIndexOff(String s,char c) {
		char[] str = s.toCharArray();
		for(int i=str.length-1;i>=0;--i) {
			if(str[i]==c) {
				System.out.println(i);
				break;
			}
			if(i==0) {
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
		lastIndexOff(s,c);
	}
}
