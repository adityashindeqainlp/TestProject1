package FAQ;

public class P14_MaxMinNumberInArray {

	public static void main(String[] args) {

		int[] a = { 40, 46, 56, 2, 34, 7, 78, 96, 321, 41, 656, 15 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}

		System.out.println("Minimium Value in Array : " + a[0]);
		System.out.println("Maximum Value in Array : " + a[11]);
	}

}
