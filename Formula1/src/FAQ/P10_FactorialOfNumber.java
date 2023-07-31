package FAQ;

public class P10_FactorialOfNumber {

	public static void main(String[] args) {

		int num = 5;
		long factorial = 1;

		for (int i = 1; i <= num; i++) {

			factorial = factorial * i;
		}

		System.out.println("Factorial Of Number : " + num + " is " + factorial);
	}
}
