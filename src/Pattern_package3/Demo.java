package Pattern_package3;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter");
			int n=scan.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j);
				}
				System.out.println();
				
			}
		}
		
	}


