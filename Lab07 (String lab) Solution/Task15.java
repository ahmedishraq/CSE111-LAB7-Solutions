package Lab07;
import java.util.Scanner;
public class Task15 {
	public static void substring(String x,int p,int q) {
		char[] str = x.toCharArray();
		--p;
		--q;
		if(p<0 || p>str.length-1 || q<0 || q>str.length-1) {
			System.out.println("Index out of bounds");
		}
		else {
			for(int c=p;c<=q;++c) {
				System.out.print(str[c]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give a word and an indice to extract the substring");
		String str=sc.nextLine();
		int start = sc.nextInt();
		int end = sc.nextInt();
		substring(str,start,end);
	}
}
