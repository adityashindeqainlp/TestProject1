package P1;

public class P1 {

	public static int m2(int a, int b) {// 3

		int c = a + b;

		return c; // 3
	}

	public static void m1(int num) {

		int d = m2(2, 1); // 3
		int d1 = d + 25 + 37;

		System.out.println(d);

	}

	public static void main(String[] args) {

		/* 1-5in console */

//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		System.out.println("4");
//		System.out.println("5");

		System.out.println(m2(1, 2));

	}

}
