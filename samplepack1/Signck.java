package samplepack1;
import java.util.Scanner;
public class Signck {
	static void sign(int n) {
		if(n>0) {
			System.out.println("Positive");
		}
		else if(n<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		sign(n);
		sc.close();
	}
}
