package arrays_packages6;
//sort,copyof,tostring,fill are the methods inside array classs where as length is the variable
import java.util.Arrays;
import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] a=new int[5];
		int[]c=new int[3];
		for(int i=0;i<=4;i++)

		{
			System.out.println("Enter the data 1");
			a[i]=scan.nextInt();
		}
		for(int i=0;i<=2;i++)

		{
			System.out.println("Enter the data 2");
			c[i]=scan.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.fill(c, 20);
		int[] d=Arrays.copyOf(c,5);
		System.out.println("Sorted array is: "+ Arrays.toString(a));
		System.out.println("Inserting integer in array:" + Arrays.toString(c));
		System.out.println("Duplicate of of an array c:" + Arrays.toString(d));
		
		
		

	}

}
