package FAQ;

public class P7_CountOddAndEvenInNum {

	public static void main(String[] args) {

		int num = 1234567;
		int countOdd = 0;
		int countEven = 0;

		while (num != 0) {

			int reminder = num % 10;

			if (reminder % 2 == 0) {

				countEven++;
			} else {

				countOdd++;
			}

			num = num / 10;
		}

		System.out.println("Count of Odd Numbers : " + countOdd);
		System.out.println("Count of Even Number : " + countEven);

	}

}
