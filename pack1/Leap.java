package pack1;
import java.util.Scanner;
public class Leap {
	static void cl(int y) {
		if(y%400==0 || (y%100!=0 && y%4==0)) {
			System.out.println("Leap year!");
		}
		else {
			System.out.println("Not leap year !");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year:");
		int y=sc.nextInt();
		cl(y);
		sc.close();
	}
}