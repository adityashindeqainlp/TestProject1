package FAQ_Twisted;

/*Print Hello World Without Using SemiColon 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

public class P3 {

	public static void main(String[] args) {

		// Generic approach

		System.out.println("Hello WOrld");

		// approach 1

		if (System.out.printf("Hello World"+"\n") == null) {

		}

		// Approach 2

		if (System.out.append("Hello World" + "\n") == null) {

		}
		
		//Approach 3
		
		if(System.out.append("Hello World" + "\n").equals(null)) {
			
		}
		
		//Approach 4
		
		for(int i=0 ;i<=1 ; System.out.println("Hello World")) {
		
			i++;
		}

	} 

}
