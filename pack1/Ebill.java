package pack1;
import java.util.Scanner;
public class Ebill {
	static void genBill(int u) {
		if(u<=100) {
			System.out.println("Free!");
		}
		else if(u>100) {
			if (u<=200) {
				System.out.println("Price:"+(u*5));
			}
			else if(u>200 && u<=300) {
				System.out.println("Price:"+(u*10));
			}
			else if(u>300 && u<=400) {
				System.out.println("Price:"+(u*20));
			}
			else {
				System.out.println("Price:"+(u*50));
			}
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how much unit used:");
		int u=sc.nextInt();
		sc.close();
		if(u<0){
			System.out.println("Invalid input!");
			return;
		}
		genBill(u);
	}
}