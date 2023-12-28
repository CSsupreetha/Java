package Package1;

public class Implicit {

	public static void main(String[] args) {
		byte a = 65;
		int b;
		short c;
		long d;
		char e;
		float f;
		double g;
		b=a;
		c=a;
		d=a;
		f=a;
		g=a;
		e=(char)a; // explicit since size of the char(2byte) is greater than byte(1byte)
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);

	}

}
