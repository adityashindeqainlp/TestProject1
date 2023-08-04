package FAQ_Twisted;

public class P2 {

	/**
	 * Print 1-100 Numbers In Console Without Using Any Loops
	 * Using Recursion
	 * Create Function with 2 args 
	 * provide base condition as start end values are same then return 
	 * print number in console 
	 * call function by increasing the value by single digit
	 **/

	public static void printNumber(int start, int end) {

		if (start == end) {

			return;
		}

		System.out.println(start);

		printNumber(start + 1, end);
	}

	public static void main(String[] args) {

		printNumber(0, 101);

	}

}
