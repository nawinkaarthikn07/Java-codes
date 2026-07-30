package loops;
import java.util.Scanner;
public class OneToN {
	static void lp(int n) {
		for (int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		lp(n);
		sc.close();
	}

}
