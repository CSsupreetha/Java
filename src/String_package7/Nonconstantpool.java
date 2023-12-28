package String_package7;
//Non constant pool
public class Nonconstantpool {

	public static void main(String[] args) {
		
				String s1=new String("JAVA");
				String s2=new String("JAVA");
				if(s1==s2)//to check if the refernce of the string is same or not
				{
					System.out.println("Reference is equal");
				}
				else
				{
					System.out.println("Reference is unequal");
				}
				if(s1.equals(s2))//to check if the values of the string is same or not
				{
					System.out.println("values is equal");
				}
				else
				{
					System.out.println("values is unequal");
				}
				
				
			}

		

	}


