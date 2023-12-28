package Pattern_package3;//NP Daimond

public class Prn13 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i+1;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*(5-i+1);j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
