package samplepack1;
import java.util.Scanner;
public class Swap1 {
	static void swap(int a,int b) {
		int c=b;
		b=a;
		a=c;
		System.out.println("After swapping:"+a+" "+b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		System.out.println("Before swapping:"+a+" "+b);
		swap(a, b);
		sc.close();
	}
}