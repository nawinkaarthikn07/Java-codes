package loops;

import java.util.Scanner;

public class Rev {
	static void rv(Long n) {
		String s=n.toString();
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		long n=sc.nextLong();
		rv(n);
		sc.close();
	}

}