package loops;
import java.util.Arrays;
import java.util.Scanner;//listen -- silent
public class Anagram {
	static int[] freq(StringBuilder ss) {
		int[] f=new int[123];
		for(int i=0;i<ss.length();i++) {
			char c=ss.charAt(i);
			f[c]++;
		}
		return f;
	}
	static void anack(StringBuilder sa,StringBuilder sb) {
		int f1[]=freq(sa);
		int f2[]=freq(sb);
		if(Arrays.equals(f1,f2)) {
			System.out.println("Anagram!");
		}
		else {
			System.out.println("Not Anaram!");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		StringBuilder sa=new StringBuilder(sc.next());
		System.out.println("Enter another String:");
		StringBuilder sb=new StringBuilder(sc.next());
		anack(sa,sb);
		sc.close();
	}

}
