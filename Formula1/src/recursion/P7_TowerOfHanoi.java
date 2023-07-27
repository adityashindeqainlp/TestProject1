package recursion;

public class P7_TowerOfHanoi {

	public static void towerOfHanoi(int n, String src, String trgt, String ex) {

		if (n == 1) {

			System.out.println("move disk: " + n + " from: " + src + " to: " + trgt);
			return;
		}

		towerOfHanoi(n - 1, src, trgt, ex);
		System.out.println("move disk: " + n + " from: " + src + " to: " + trgt);
		towerOfHanoi(n - 1, ex, src, trgt);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		towerOfHanoi(n, "sorce", "target", "extra");

	}

}
