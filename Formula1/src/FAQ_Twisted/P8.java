package FAQ_Twisted;

public class P8 {

	public static int a;
	public int b;

	static {

		System.out.println("Static Block 1");
	}

	static {

		System.out.println("Static Block 2");
	}

	static {

		// Initializing static variable in static block
		a = 1;

		// Initializing non static variable in static block
		P8 obj = new P8();
		obj.b = 2;
		
		//Print the global variable in console 
		System.out.println(a + " " +obj. b);
	}

	public static void main(String[] args) {

		System.out.println("Main");
	}
}
