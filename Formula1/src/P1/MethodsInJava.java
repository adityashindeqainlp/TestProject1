package P1;

public class MethodsInJava {

	public static void m1() {

		System.out.println("This is static method");
	}

	public void m3() {

		System.out.println("This is non method");
	}

	public static void m2() {

		// Calling static method static method
		m1();

		// Calling static method non static method
		MethodsInJava obj = new MethodsInJava();
		obj.m3();
	}

	public void m4() {
		// Calling static method in non static
		m1();

		// Calling Non static method in non static method
		m3();
	}

	public static void main(String[] args) {

		m1();
		m2();

		MethodsInJava obj = new MethodsInJava();
		obj.m3();
		obj.m4();
	}

}
