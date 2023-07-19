package FAQ;

public class P5_PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 121;
		int temp = num;
		int rev = 0;

		while (temp != 0) {

			rev = rev * 10 + temp % 10;
            temp = temp/10;
            
		}

		if(rev==num) {
			
			System.out.println("It is a Palindrome Number : " + rev);
		}
		else {
			System.out.println("It is not a Palindrome Number : " + rev);
		}
		
	}

}
