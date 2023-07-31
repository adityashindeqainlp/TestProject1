package recursion;

public class P8_PrintStringReverse {

	public static void printStr(String s, int i) {

		if (i == 0) {

			char ch = s.charAt(i);
			System.out.println(ch);
			return;
		}

		char ch = s.charAt(i);
		System.out.println(ch);
		printStr(s, i - 1);

	}

	public static void main(String[] args) {

		String s = "abcd";
		
		int i = s.length() - 1;
		
		printStr(s, i);

	}

}
