package recursion;
/*
 * Step 1 Create a function with an Args 
 * Step 2 Apply base condition as (a==11)& return to make recursion finite 
 * Step 3 Print the number in console 
 * Step 4 Call out the function with modification m1(a+1) 
 * means keep increase the value by 1 digit 
 * 
 * */
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
