package samplepack1;
import java.util.Scanner;
public class CandfConversions{
	static void ctof(int c){
		int f1=c*(9/5)+32;
		System.out.println("Farenheit is:"+f1);
	}
	static void ftoc(int f){
		int c1=(f-32)*5/9;
		System.out.println("Celcius is:"+c1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter farenheit:");
		int f=sc.nextInt();
		System.out.println("Enter celcius:");
		int c=sc.nextInt();
		sc.close();
		ctof(c);
		ftoc(f);
}}