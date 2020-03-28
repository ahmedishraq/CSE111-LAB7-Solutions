package Lab07;
import java.util.Scanner;
public class Task08 {
	public static String toLowerCase(String x){
		char[] temp = x.toCharArray();
		x="";
		for(int i=0;i<temp.length;++i) {
			if((int)temp[i]>=65 && (int)temp[i]<=90) {
				temp[i]=(char)((int)temp[i]+32);
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
		word=toLowerCase(word);
		System.out.println(word);
	}
}
