package FAQ;

public class P19_MissingNumberInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 5 };
		int sum1 = 0;

		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}

		int sum2 = 0;

		for (int i = 1; i <= 5; i++) {

			sum2 = sum2 + i;
		}

		int missingNum = sum2 - sum1;

		System.out.println("Missing Number in Array is : " + missingNum);

	}
}
