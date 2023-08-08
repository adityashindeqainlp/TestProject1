package FAQ_Twisted;

public class P7 {

	public static void m1(Object a) {

		System.out.println("Object Argument");
	}

	public static void m1(String s) {

		System.out.println("String Argument");
	}

	/* String and String Buffers are 2 independent entities
	 * It Won't  
	 *  */
	
//	public static void m1(StringBuffer s) {
//		
//		System.out.println("String Buffer Argument ");
//	}
	
	
	public static void main(String[] args) {

		
		m1(null);
		
		/* Overloading of M1 with different signature as Object and String 
		 * Null argument is pass JVM will call most obvious method / Scenario matching to Null
		 * Null is mostly refer as an element of the String Class 
		 * In hierarchy of the class object class is master of all class perhaps it will pick string argument first
		 *
		 **/

	}
}
