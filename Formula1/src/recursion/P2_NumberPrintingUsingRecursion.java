package recursion;

public class P2_NumberPrintingUsingRecursion {

	public static void m1(int a) {

		if (a == 11)
			return;

		System.out.println(a);
		
		m1(a+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1(1);
		
	}

}
