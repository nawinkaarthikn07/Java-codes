package pack1;
import java.util.Scanner;
public class Sclac{
	static  void cal(int a,int b,char c){
		switch (c){
		case '+':
			System.out.println((a+b));
			break;
		case '-':
			System.out.println((a-b));
			break;
		case '*':
			System.out.println((a*b));
			break;
		case '/':
			if(b==0) {System.out.println("Infinity"); break;}
			System.out.println((a/b));
			break;
		case '%':
			System.out.println((a%b));
			break;
		}
	}
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);	
		System.out.println("Enter 2 operands followed by 1 operator");
		int a=sc.nextInt();
		int b=sc.nextInt();
		char c=sc.next().charAt(0);
		cal(a,b,c);
		sc.close();
	}
}