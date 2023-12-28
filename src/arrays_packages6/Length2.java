package arrays_packages6;

import java.util.Scanner;

//2D REGULAR ARRAY USING LENGTH VARIABLE
public class Length2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][] a=new int[3][4];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.println("Enter the age");
				 a[i][j]=scan.nextInt();
			}
			
			 
			 
			
				
		}
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.println(a[i][j]);
				 
			}
			
	}

	}
	

}
