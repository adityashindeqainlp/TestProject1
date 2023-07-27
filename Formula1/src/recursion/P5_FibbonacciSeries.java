package recursion;
/*
 * Algorithm For Fibonacci Series 
 * Step 1  Set The base Condition n=0 and return to controls
 * Step 2  Do addition between a and b store inside some ref variable 
 * Step 3  Print the Output in console 
 * Step 4  Calling of the Function Itself as transfer old value of b to a and new value of c to b  
 * Step 5  Keep Decrease number of iteration/terms  by single digit as n-1
 * 
 **/

public class P5_FibbonacciSeries {

	public static void fibo(int a, int b, int n) {

		if (n == 0) {
			return;
		}
		int c = a + b;
		System.out.println(c);
		fibo(b, c, n - 1);
	}

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int n = 7;
		System.out.println(a);
		System.out.println(b);

		fibo(a, b, n - 2);

	}
}
