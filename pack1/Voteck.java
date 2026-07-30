package pack1;
import java.util.Scanner;
public class Voteck {
	static void vck(int age) {
		if(age>=18) {
			System.out.println("You are Eligible to vote");
		}
		else {
			System.out.println("you are Not Elible to vote");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		sc.close();
		if (age<=0 || age>120){
			System.out.println("Invalid age!");
			return;
		}
		vck(age);
	}
}