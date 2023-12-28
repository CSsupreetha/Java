package arrays_packages6;
//3D REGULAR ARRAY USING LENGTH VARIABLE

import java.util.Scanner;

public class Length3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][][] a=new int[3][4][2];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				for(int k=0;k<=a[i][j].length-1;k++)
				{
					
				System.out.println("Enter the age");
				 a[i][j][k]=scan.nextInt();
			}
			}
			
			 
			 
			
				
		}
			for(int i=0;i<=a.length-1;i++)
			{
				for(int j=0;j<=a[i].length-1;j++)
				{
					for(int k=0;k<=a[i][j].length-1;k++)
					{
						
					System.out.println(a[i][j][k]);
					
				}
			
	}

	}
		}
	}
	


