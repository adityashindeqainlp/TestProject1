package FAQ;

public class P9_PrimeNumber {

	public static void main(String[] args) {

		int num = 5;
		int count = 0;

		if (1 <= num) {

			for (int i = 1; i <= num; i++) {

				if (num % i == 0) {

					count++;
				}

			}

			if (count == 2) {

				System.out.println("It is a Prime Number");
			} else {

				System.out.println("It is Not a Prime Number");
				
			}

		}

	}
}
