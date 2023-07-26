package recursion;

/* 1 define the method with 3 parameters 
 * 2 first para. represents the value of iteration
 * 3 second para. represents the value of n
 * 4 third para. represents the value of sum
 * 5 Base Condition set for (i==n) 
 * 6 return the sum value 
 * 7 add the iteration value in sum 
 * 8 Self call the function with adding 1 digit in Iteration 
 * 9 Print the index value in console 
 * */
public class P3_PrintNaturalNumberSum {

	public static void naturalNumberCal(int i, int n, int sum) {

		if (i == n) {

			sum += i;
			System.out.println(sum);
			return;
		}

		sum += i;
		naturalNumberCal(i + 1, n, sum);
		System.out.println(i);
	}

	public static void main(String[] args) {

		
		naturalNumberCal(1,5,0);
		
	}
}
