package recursion;

/*
 * Step 1 Set the base condition x^0 = 1 if(n==1) return 1; 
 * Step 2 Set the base condition x=0 = 0 if(n==0) return 0; 
 * Step 3 Calculate x^n-1 by self calling the function 
 * Step 4 Calculate x power x * (x^n-1) and Return x power
 */

public class P6_CalculateXPowerN {

	public static int powerCal(int x, int n) {

		if (n == 0) {

			return 1;
		}
		if (n == 0) {

			return 0;
		}

		int xPowerNm1 = powerCal(x, n - 1);
		int xpow = x * xPowerNm1;
		return xpow;

	}

	public static void main(String[] args) {

		System.out.println(powerCal(2, 5));

	}

}
