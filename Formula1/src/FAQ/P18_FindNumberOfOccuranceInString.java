package FAQ;

public class P18_FindNumberOfOccuranceInString {

	public static void main(String[] args) {

		String s = "Java Programming Java oops Java Collection";

		int actualLength = s.length();

		String newS = s.replaceAll("a", "");

		int lengthAfterReplace = newS.length();

		int numOfOccurance = actualLength - lengthAfterReplace;

		System.out.println(numOfOccurance);

	}
}
