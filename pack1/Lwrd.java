package pack1;
import java.util.Scanner;
public class Lwrd {
	static void lw(String s) {
		String sarr[]=s.split("\\s+");
		int m=0;
		String res="";
		for (String word:sarr){
			if(m<word.length()){
				m=word.length();
				res=word;
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		lw(s);
		sc.close();
}}