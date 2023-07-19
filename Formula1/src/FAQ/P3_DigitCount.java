package FAQ;

public class P3_DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 123456789;
		int temp = number;
		int count = 0;
		
		while(temp!=0) {
			
			temp=temp/10;
			count++;
		}
		
		System.out.println("No of Digits : " +count);
	}

}
