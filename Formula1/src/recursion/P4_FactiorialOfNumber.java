package recursion;
/*
 * Define function with single args accept integer & return type int 
 * Define Base Condition as num=1 or num=0 to make recursion finite 
 * Return 1 value once condition 
 * Call Function with modification of (num-1)
 * Store function in variable 
 * Do Multiplication with variable 
 * Return The Result 
 * 
 **/


public class P4_FactiorialOfNumber {

	public static int factorialCal(int num) {

		if (num == 1 || num == 0) {

			return 1;
		}

		int fact_numM1 = factorialCal(num - 1);
		int fact_num = num * fact_numM1;
		return fact_num;
	}

	public static void main(String[] args) {

		System.out.println(factorialCal(5));
		
	}
}
