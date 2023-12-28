package String_package7;
////Concatenation using +
public class AttachmentPlus {

	public static void main(String[] args) {
		String s1="JAVA";
		String s2="PYTHON";
		String s3="JAVA"+"PYTHON";//when both are string it will be stored in CONSTANT POOL of heap segment
		String s4=s1+s2;//when both are references it will be stored in NON CONSTANT POOL  of heap segment
		String s5="JAVA"+s2;//when atleast one is reference it wil be present in NON CONSTANT POOL  of heap segment
		String s6=s1+"PYTHON";//when atleast one is reference it wil be present in NON CONSTANT POOL  of heap segment
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
