package arrays_packages6;
//ENHANCED LOOP
import java.util.Scanner;
public class Enhancedloop {

	public static void main(String[] args) {
		
		
		
				Scanner scan=new Scanner(System.in);
				int[] a=new int[3];
				for(int i=0;i<=a.length-1;i++)
				{
					System.out.println("Enter the data");
					a[i]=scan.nextInt();
					
				}
				for(int b:a)
				{
					System.out.print(b+" ");
				}
				
				

			}

		


	}


