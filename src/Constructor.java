

	class Bank
	{
		private int acc;
		private int pw;
		//1.default constructor is created bt java when the user doesnot create any constroctor
		//Bank()
		//{   }
		public Bank(int acc, int pw)//2.parameterized constructor(it can be empty or with instructions)
		{
			this.acc=acc;
			this.pw=pw;
		}
		public Bank()//3.Zero parameterrized constructor(it can be empty or with instructions)
		{
			this.acc=111;
			this.pw=123;
		}
		
		

	public int getAcc() {
			return acc;
		}
		public int getPw() {
			return pw;
		}
		public class Constructor {
	public static void main(String[] args) {
		Bank b=new Bank(123,123);
		System.out.println(b.getAcc());
		System.out.println(b.getPw());
		Bank b1=new Bank();
		System.out.println(b.getAcc());
		System.out.println(b.getPw());
		
		
			
		}

	}

}
