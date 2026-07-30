package loops;

import java.util.Scanner;

public class Mul {
	static void m(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+" X "+i+" = "+n*i);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		m(n);
		sc.close();
	}

}
