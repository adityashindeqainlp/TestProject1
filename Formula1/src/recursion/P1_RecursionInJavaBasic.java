package recursion;

/*Recursion 
 * Calling the self function again and again
 * 
 * Requires Base Condition to make recursion finite
 * 
 * Print 10-1 number in console 
 * 
 * */

public class P1_RecursionInJavaBasic {

	public static void m1(int n) {

		if (n == 0)
			return;
		System.out.println(n);
		m1(n-1);

	}

	public static void main(String[] args) {

		
		m1(10);
		
	}

}
