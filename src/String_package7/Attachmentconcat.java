package String_package7;
//using concat() method; FOR CONCAT() METHOD EVERY VALUES GETS STORED IN NON CONSTANT POOL
public class Attachmentconcat {

	public static void main(String[] args) {
		String s1="JAVA";
		String s2="PYTHON";
		String s3="JAVA".concat("PYTHON");//when both are string it will be stored in  NON CONSTANT POOL of heap segment
		String s4=s1.concat(s2);//when both are references it will be stored in NON CONSTANT POOL  of heap segment
		String s5="JAVA".concat(s2);//when atleast one is reference it wil be present in NON CONSTANT POOL  of heap segment
		String s6=s1.concat("PYTHON");//when atleast one is reference it wil be present in NON CONSTANT POOL  of heap segment
		if(s3==s4)//to check with the refernces
		{
			System.out.println("References are equal");//if the same  values are present in constant loop
		}
		else
		{
			System.out.println("References are unequal");//if the same values are present in non constant pool
		}
		

	}

}
