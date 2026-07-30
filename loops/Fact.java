package loops;
import java.util.Scanner;
public class Fact {
	static void s(int n) {
		int p=1;
		for (int i=1;i<=n;i++) {
			p*=i;
		}
		System.out.println("factorial: "+p);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		s(n);
		sc.close();
	}

}
