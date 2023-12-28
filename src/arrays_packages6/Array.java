package arrays_packages6;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<=4;i++)
		{
			System.out.println("Enter the age of " +(i+1)+" student");
			 a[i]=scan.nextInt();
			
		}
		System.out.println("The ages of the students");
		for(int i=0;i<=4;i++)
		{
			System.out.print(a[i]+" ");
			 
			
		}

	}

}
