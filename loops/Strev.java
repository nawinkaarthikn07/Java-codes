package loops;
import java.util.Scanner;
public class Strev {
	static void rv(String s) {
		char ac[]=s.toCharArray();
		String s1="";
		for(int i=ac.length-1;i>=0;i--) {
			s1=s1+ac[i];	
		}
		System.out.println(s1);
		if(s1==s) {
			System.out.println("Palindrome!");
		}
		else {
			System.out.println("Not a plaindrome!");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		rv(s);
		sc.close();
	}

}
