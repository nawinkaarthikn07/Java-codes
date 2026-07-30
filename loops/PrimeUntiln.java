package loops;
import java.util.Scanner;
public class PrimeUntiln {
	static boolean ck(int n) {
		if(n==1) {
			return false;//edge case
		}
		int f=0;
		for (int i=2;i<n;i++) {
			if(n%i==0) {                   
				f=1;
				break;
			}
		}
		boolean b=(f==0)?true:false;
		return b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		for(int i=2;i<n;i++) {
			if(ck(i)) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
}