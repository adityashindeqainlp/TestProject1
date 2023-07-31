package FAQ;

public class P15_DuplicateElementsInArray {

	public static void main(String[] args) {

		String[] lang = { "Java", "C#", "C++", "Python", "Java" };

		
		for (int i = 0; i < lang.length; i++) {

			for (int j = i + 1; j < lang.length; j++) {

				if(lang[i]==lang[j]) {
				
					System.out.println("Duplicate Element Found in Array : " + lang[i]);
					
				}
				
			}

		}

	}
}
