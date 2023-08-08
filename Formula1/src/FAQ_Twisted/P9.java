package FAQ_Twisted;

public class P9 {

	public static void main(String[] args) {

		// Note do the comment out in line by line manner

		// System.out.println(Test.a);

		System.out.println(new Test().a);
	}

}

class Test {

	// If removes the static from variable then it will loads the class
	// static block will execute
	static {

		System.out.println("Static Block Of ...... Test Class");
	}

	// With static keyword in variable it will directly invoke variable
	// Instead of loading of class
	public final int a = 10;
}
