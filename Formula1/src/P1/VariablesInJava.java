package P1;

public class VariablesInJava {

	public static int a;
	public int b;

	public static void m1() {

		// Calling of global static variable in static method
		System.out.println(a);

		// Calling of global non static variable in static method
		VariablesInJava obj = new VariablesInJava();
		System.out.println(obj.b);
	}

	public void m2() {

		// Calling of global static variable in Non static Method
		System.out.println(a);

		// Calling of global non static method var in non static method
		System.out.println(b);

	}

	public static void m3() {

		int a = 1;
		int b = 2;

		// Calling of local Variable
		System.out.println(a);

		// Calling of global static Variable
		System.out.println(VariablesInJava.a);

		// Calling of local variable
		System.out.println(b);

		// Calling of global non static variable
		VariablesInJava obj = new VariablesInJava();
		System.out.println(obj.b);

	}

	public void m4() {

		int a = 1;
		int b = 2;

		// Calling of local Variable
		System.out.println(a);
		
		//Calling of global static variable 
		System.out.println(VariablesInJava.a);

		// Calling of local Variable
		System.out.println(b);
		
		//Calling of global non static variable 
        System.out.println(this.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calling Of global static variable
		System.out.println(a);

		// Value assign to global static variable
		a = 20;

		// Calling of global non static variable
		VariablesInJava obj = new VariablesInJava();
		System.out.println(obj.b);

		// Value asssign to global non static variable
		obj.b = 10;

		// Calling of static method in main
		m3();

		// Calling of Non static method in Main
		obj.m4();
	}

}
