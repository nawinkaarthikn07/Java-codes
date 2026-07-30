package samplepack1;
import java.util.Scanner;
public class Swap2 {
	void swap(int a,int b) {
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping:"+a+" "+b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 nos:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swapping:"+a+" "+b);
		Swap2 s=new Swap2();
		s.swap(a, b);
		sc.close();
}}