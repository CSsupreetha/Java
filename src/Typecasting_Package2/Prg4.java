package Typecasting_Package2;

public class Prg4 {

	public static void main(String[] args) {
		int a =5;
		int b =a++ + --a + ++a - a-- - --a + ++a + a++;
		System.out.println(a);
		System.out.println(b);
		int c =001;//value is one 
		int d= c++;
		System.out.println(c);//after incrementing output will be 2
		System.out.println(d);//first use the variable value a it is (i.e 1)
		int f = c++;
		System.out.println(f);
		int e=--c;
		System.out.println(e);
		
		
		
	}

}
