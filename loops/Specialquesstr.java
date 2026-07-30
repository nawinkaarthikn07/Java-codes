package loops;
import java.util.Scanner;
public class Specialquesstr {
	static void f(StringBuilder sb) {
		StringBuilder sl=new StringBuilder();
		StringBuilder sf=new StringBuilder();
		for (int i=sb.length()-1;i>=0;i--) {
			if(Character.isLetter(sb.charAt(i))) {
				if(Character.isUpperCase(sb.charAt(i))) {
					sl.append(Character.toLowerCase(sb.charAt(i)));
				}
				else if(Character.isLowerCase(sb.charAt(i))) {
					sl.append(Character.toUpperCase(sb.charAt(i)));
				}
			}
		}
		int k=0;
		for(int i=0;i<sb.length();i++){
			if(Character.isLetter(sb.charAt(i))) {
				sf.append(sl.charAt(k));
				k++;
			}
			else {
				sf.append(sb.charAt(i));
			}
		}
		System.out.println(sf);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		StringBuilder sb=new StringBuilder(sc.nextLine());
		f(sb);
		sc.close();
	}
}