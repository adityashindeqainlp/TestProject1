package FAQ_Twisted;

public class P10 {

	static {

		System.out.println("Static Block");
	}

	{

		System.out.println("Instance Initialization Block");
	}

	public P10() {

		System.out.println("Constructor");
	}

	public static void main(String[] args) {

		// Without any instance only static block and main method will execute
		System.out.println("Main Method");

		// With Instance first Instance Initialization Block will execute then
		// constructor
		new P10();

	}
}
