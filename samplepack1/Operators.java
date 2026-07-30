package samplepack1;
public class Operators {
	static void arith(int a,int b) {
		System.out.println((a+b)+"\n"+(a-b)+"\n"+(a*b)+"\n"+(a/b)+"\n"+(a%b));
	}
	static void rel(int a,int b) {
		System.out.println((a >= b)+"\n"+(a <= b)+"\n"+(a==b)+"\n"+(a!=b));
	}
	static void logical(boolean a,boolean b) {
		System.out.println((a && b)+"\n"+(a || b)+"\n"+(!a)+"\n"+(!b));
	}
	static void asg(int a,int b) {
		System.out.println("a+=b"+"a-=b"+"a*=b"+"a/=b"+"a%=b");
	}
	public static void main(String args[]) {
		int a=10,b=20;
		arith(a,b);
		rel(a,b);
	}
}
