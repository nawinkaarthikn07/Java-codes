package loops;
import java.util.Scanner;
public class Primeornot {
	static void ck(int n) {
		int f=0;
		for (int i=2;i<n;i++) {
			if(n%i==0) {
				f=1;
				break;
			}
		}
		String s=(f==0)?"Prime!":"Not prime!";
		System.out.println(s);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		ck(n);
		sc.close();
	}
}