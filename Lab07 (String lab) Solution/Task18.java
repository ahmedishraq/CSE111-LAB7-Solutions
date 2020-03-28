package Lab07;
import java.util.Scanner;
public class Task18 {
	public static void indexOff(String s,char c,int p) {
		char[] str = s.toCharArray();
		for(int i=p;i<str.length;++i) {
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
		System.out.println("Give a word and a character also an integer tao jodi apnar mon chai");
		String s = sc.nextLine();
		char c = sc.nextLine().charAt(0);
		int p = sc.nextInt();
		indexOff(s,c,p);
	}
}
