package pack1;
import java.util.Scanner;
public class Charck {
	static void ck(char c) {
		String vowels="aeiouAEIOU";
		if (vowels.indexOf(c)!=-1) {
			System.out.println("Its a vowel");
		}
		else {
			System.out.println("Its a consonant");
		}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");	
		char c=sc.next().charAt(0);
		sc.close();
		if(Character.isLetter(c)) {
			System.out.println("Invlaid");
			return ;
		}
		ck(c);
	}
}