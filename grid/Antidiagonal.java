package grid;

import java.util.Scanner;

public class Antidiagonal {
	static void gc(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j>=n-1) {
					System.out.print(i+""+j+' ');
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		gc(n);
		sc.close();
	}

}
