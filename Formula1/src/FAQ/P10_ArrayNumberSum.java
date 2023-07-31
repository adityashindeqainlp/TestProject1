package FAQ;

public class P10_ArrayNumberSum {

	public static void main(String[] args) {

		int a[] = { 25, 4, 5, 3, 2, 1 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
		}

		System.out.println("The sum of the array number is : " + sum);
	}

}
