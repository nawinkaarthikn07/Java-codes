package loops;
import java.util.Scanner;
public class Sum {
	static void s(int n) {
		int sm=0;
		for (int i=1;i<=n;i++) {
			sm+=i;
		}
		System.out.println("Sum: "+sm);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		s(n);
		sc.close();
	}

}
