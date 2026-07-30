package samplepack1;
import java.util.Scanner;
//SI = (P × R × T) / 100
// A = P(1 + R/100)^n
//where A is the total amount after n years. Compound interest is then calculated as CI = A − P.
public class SimplenCompound {
	static Scanner sc=new Scanner(System.in);
	static void si(double p,double r,double n) {
		System.out.println("SI:"+((p*r*n)/100));
	}
	static void ci(double p,double r,double t) {
		System.out.println("Compound Interest"+"\n"+"Enter n years:");
		int n=sc.nextInt();
		double s=(1+r/100);
		double a=p*Math.pow(s,n*t);
		System.out.println("CI:"+(a-p)); 
	}
	public static void main(String[] args) {
		System.out.println("Enter Time period:");
		double t=sc.nextDouble();
		System.out.println("Enter Principle:");
		double p=sc.nextDouble();
		System.out.println("Enter Rate:");
		double r=sc.nextDouble();
		si(p,r,t);
		ci(p,r,t);
}}