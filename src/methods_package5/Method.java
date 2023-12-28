package methods_package5;
class Calculator
{
	
	void add() 
	{
	int a=45;
	int b=50;
	int c= a + b;
	System.out.println(c);
	
	
}
	int sub()
	{
		return(20-10);
		
	}
	float mul(float a,float b)
	{
		
		float c=a*b;
		return(c);
		
		
		
	}
}

public class Method {
	

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.add();
		
	}

}
