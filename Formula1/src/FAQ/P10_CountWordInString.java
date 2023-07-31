package FAQ;

public class P10_CountWordInString {

	public static void main(String[] args) {

		String s = "I am a Quality Asurance Analyst";

		int count = 1;

		for (int i = 0; i < s.length() - 1; i++) {

			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {

				count++;
			}

		}

		System.out.println("No of Words in String : " + count);

	}

}
