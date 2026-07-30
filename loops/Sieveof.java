package loops;
import java.util.Arrays;
import java.util.Scanner;
public class Sieveof {
	static void pp(int n){
		boolean p[]=new boolean[n+1];
		Arrays.fill(p, true);
		p[0]=p[1]=false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(p[i]) {
				for(int j=i*i;j<=n;j+=i) {
					p[j]=false;
				}
			}
		}
		for(int i=0;i<=n;i++) {
			if(p[i]) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		pp(n);//O(root(n) log n)
		sc.close();
	}
}