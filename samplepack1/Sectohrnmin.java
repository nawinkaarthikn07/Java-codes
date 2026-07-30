package samplepack1;
import java.util.Scanner;
public class Sectohrnmin {
	static void stoh(int s) {
		System.out.println("Hours= "+(s/(3600))+" hr(s) "+((s%3600)/60)+" minute(s) "+((s%3600)%60)+" second(s)");
	}
	static void stom(int s) {
		System.out.println("Minutes= "+(s/60)+" minute(s) "+(s%60)+" second(s)");
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter seconds:");
		int s=sc.nextInt();
		stoh(s);
		stom(s);
		sc.close();
	}
}