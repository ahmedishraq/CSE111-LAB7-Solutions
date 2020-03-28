package Lab07;
import java.util.Scanner;
public class Task04 {
	static Scanner sc = new Scanner(System.in);
	static void endsWith() {
		System.out.println("Please enter two words/String");
		String x = sc.nextLine();
		String y = sc.nextLine();
		char[] str1 = x.toCharArray();
		char[] str2 = y.toCharArray();
		for(int i=0;i<str2.length;++i) {
			if(str2[i]==(str1[str1.length-str2.length+i])) {
				if(i==str2.length-1) {
					System.out.println("True");
				}
			}
			else {
				System.out.println("False");
				break;
			}
		}
	}
	public static void main(String[] args) {
		endsWith();
	}

}
