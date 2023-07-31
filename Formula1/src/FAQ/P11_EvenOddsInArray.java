package FAQ;

public class P11_EvenOddsInArray {

	public static void main(String[] args) {

		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < a.length; i++) {

			if (i % 2 == 0) {

				System.out.println("Even Number : " + i);
			} else {

				System.out.println("Odd Number : " + i);
			}

		}
	}
}
