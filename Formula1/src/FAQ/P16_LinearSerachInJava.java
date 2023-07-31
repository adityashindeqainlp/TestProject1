package FAQ;

public class P16_LinearSerachInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 30, 40, 50 };

		int serach_Elemnt = 30;
		boolean flag = false;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == serach_Elemnt) {

				System.out.println("Element Found At : " + i);
				flag = true;
				break;
			}

		}

		if (flag == false) {

			System.out.println("Element Not Found in Array ");
		}

	}

}
