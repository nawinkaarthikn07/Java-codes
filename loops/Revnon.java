package loops;

import java.util.Scanner;

public class Revnon {
	static void rv(int n) {
		int f=0;
		int t=n;
		while(t>=0) {
			int r=t%10;
			f=f*10 + r;
			t=t/10;
		}
		System.out.println(f);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		rv(n);
		sc.close();
	}
}