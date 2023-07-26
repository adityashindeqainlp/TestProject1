package Practice30may;

public class ConstructorInJava {
	
	
	/*Constructor --> 
	 * 1  It is a Specialized Method --> Afghanistan(); 
	 * 2  Name of the constructor should be same as class name >> ClassName();
	 * 3  It should not have any return type (No Void)
	 * 4  It should be Non static entity (No Static)
	 * 5  When Object of the class gets create then it will calls constructor 
	 * 6  we can define n number of constructor in same class But WITH Different Args  
	 * 7 
	 * 
	 * */

	public ConstructorInJava() {

		this(1);
		System.out.println("Hi I am a Constructor of Java .......");

	}

	public ConstructorInJava(int a) {
		
	
		System.out.println("A for AFG");

	}
	
//	public ConstructorInJava(int b , int c) {
//		
//		this('y');
//		System.out.println("B for BAN & C for China");
//		
//	}
//	
//	public ConstructorInJava(char ch) {
//	
//		System.out.println("Character......");
//	}
//	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
  new ConstructorInJava();

	}

}
