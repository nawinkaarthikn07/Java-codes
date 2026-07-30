package samplepack1;
import java.util.Scanner;
public class FindAreanPerimeter{
	static Scanner sc=new Scanner(System.in);
	static void rect(){
		System.out.println("Enter length:");
		double l=sc.nextDouble();
		System.out.println("Enter breadth:");
		double b=sc.nextDouble();
		double area=l*b;
		double peri=2*(l+b);
		System.out.println("Area(Rectangle) is:"+area);
		System.out.println("Perimeter(Rectangle) is:"+peri);
	}
	static void cir(){
		System.out.println("Enter radius:");
		double r=sc.nextDouble();
		System.out.println("Area(Cicle) is:"+(3.14*(r*r)));
		System.out.println("Circumference(Circle) is:"+(2*3.14*r));
	}
	public static void main(String[] args){
		rect();
		cir();
		sc.close();
	}
}