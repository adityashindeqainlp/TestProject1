package FAQ;

public class P2_LargestNummber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		int b =200;
		int c =30;
		
		if(a>b && a>c) {
			System.out.println("a is greater than b & c");
		}
		else if(b>a && b>c) {
			System.out.println("b is greater than a & c");
		}
		else {
			
			System.out.println("c is greater than a & b");
		}

		
		int greater = (a>b?a:b)>c?(a>b?a:b):c;
		System.out.println("Larger Value :" + greater);
		
	}

}
