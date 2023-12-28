package String_package7;

public class CompareTo {
	public static void main(String args[])
	{
		String s1="JAVA";
		String s2="PYTHON";
		String s3=s1.compareTo(s2);
		
		
		if(s3==0)
		{
			System.out.println("Strings are equal");
		}
		else if(s3>0)
		{
			System.out.println("s1>s2");
		}
		else
		{
			System.out.println("s2>s1");
		}
	}
	

}
