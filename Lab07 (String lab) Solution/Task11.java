package Lab07;
import java.util.Scanner;
public class Task11 {
	public static void equalsIgnoreCase(String x,String y){
		char[] str1 = x.toCharArray();
		char[] str2 = y.toCharArray();
		if(str1.length==str2.length) {
			for(int i=0;i<str1.length;++i) {
				int diff = str1[i]-str2[i];
				if(str1[i]==str2[i] || diff==32 || diff==-32) {
					if(i==str1.length-1) {
						System.out.println("true");
					}
				}
				else {
					System.out.println("false");
					break;
				}
			}
		}
		else {
			System.out.println("false");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two Strings");
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		equalsIgnoreCase(word1,word2);
	}
}
