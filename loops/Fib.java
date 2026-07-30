package loops;
import java.util.Scanner;
public class Fib{
	static void fib(int n) {
		int p1=1,p2=0,c=0;
		for (int i=0;i<n;i++) {
			if(i==0||i==1) {
				if(i==0) {
					System.out.print(p2+" ");
				}
				else {
					System.out.print(p1+" ");
				}
			}
			else {
			c=p1+p2;
			System.out.print(c+" ");
			if(i%2==0) {
				p1=c;
			}
			else {
				p2=c;
			}
			}
		}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		fib(n);
		sc.close();
	}
}