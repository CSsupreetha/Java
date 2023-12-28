package Variable_package4;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value1: ");
		int a=s.nextInt();
		System.out.println("Enter the value2: ");
		int b=s.nextInt();
		int c=a+b;
		int d=a-b;
		int e=a*b;
		float i=(float)b/a;
		double f=(double)a/b;
		int g=a%b;
		boolean h=a>b;
		
		System.out.println("Addidtion:" + c);
		System.out.println("Substraction:" + d);
		System.out.println("Multiplication:" + e);
		System.out.println("Division:" + f);
		System.out.println("Remainder:" + g);
		System.out.println("Boolean: " + h);
		System.out.println("Division: " + i);
		
		
		
		
		
		

	}

}
