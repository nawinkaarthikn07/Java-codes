package pack1;
import java.util.Scanner;
public class Grd {
	static void gc(int m) {
		String s;
		if(m>=90 && m<=100) {
			s="A";
		}
		else if(m>=80 && m<=100) {
			s="B";
		}
		else if(m>=70 && m<=100) {
			s="C";
		}
		else if(m<50 && m>=0) {
			s="Failed";
		}
		else {
			s="Invalid";
		}
		System.out.println("Your grade is "+s);	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark:");
		int m=sc.nextInt();
		gc(m);
		sc.close();
	}
}