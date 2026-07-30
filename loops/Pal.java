package loops;
import java.util.Scanner;
public class Pal {
	static void pck(int n) {
		int r=0;
		for(int t=n;t>=0;t=t/10) {
			int rm=t%10;
			r=rm*10+r;
			t=t/10;
		}
		if (r==n) {
			System.out.println("Its a palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		pck(n);
		sc.close();
	}

}
