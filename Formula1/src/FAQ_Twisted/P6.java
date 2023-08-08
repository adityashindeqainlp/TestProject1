package FAQ_Twisted;

public class P6 {

	public static void main(String[] args) {

		
		/* With no final keyword it will invoke the static block first 
		 * with final keyword it will invoke variable only
		 * */
		
		System.out.println(m2.a);
		
	}

}

class m2 {

	/*
	 * If we apply final keyword with variable then it will only load the variable 
	 * If we remove final keyword it will load the class m2 
	 * */
	public  static int a = 1000;

	
	// Once remove the final keyword then it will load the static block first 
	static {
		
		System.out.println("m2 class static block...!");

	}

}