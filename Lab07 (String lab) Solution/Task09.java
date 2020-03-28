package Lab07;
import java.util.Scanner;
public class Task09 {
	public static String toUpperCase(String x){
		char[] temp = x.toCharArray();
		x="";
		for(int i=0;i<temp.length;++i) {
			if((int)temp[i]>=97 && (int)temp[i]<=122) {
				temp[i]=(char)((int)temp[i]-32);
			}
		}
		for(int i=0;i<temp.length;++i) {
			x += temp[i];
		}
		return x;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give an input");
		String word=sc.nextLine();
		word=toUpperCase(word);
		System.out.println(word);
	}
}
