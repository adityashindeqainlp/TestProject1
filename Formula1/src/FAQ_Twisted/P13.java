package FAQ_Twisted;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Find Duplicates in String with Number Of Occurrences Algorithm 
 *1) Make static function with string args
 *2) Apply condition 1 If given string is null then return nothing    
 *3) Apply Condition 2 If given String is empty then return Nothing 
 *4) Apply Condition 3 If given String is a single char string then return nothing 
 *5) Convert String to an array and create one hash map with <k,v> should be <character ,integer>
 *
 *  
 *  
 *  
 **/

public class P13 {

	// 1) Make static function with string args
	public static void printDuplicateCharacters(String str) {

		// 2) Apply condition 1 If given string is null then return nothing
		if (str == null) {

			System.out.println("String is Null");
			return;
		}
		// 3) Apply Condition 2 If given String is empty then return Nothing
		if (str.isEmpty()) {

			System.out.println("String is Empty");
			return;
		}
		// 4) Apply Condition 3 If given String is a single char string then return
		// nothing
		if (str.length() == 1) {

			System.out.println("This is a single character string");
			return;
		}
		// 5) Convert String to an array and create one hash map with <k,v> should be
		// <character ,integer>
		char[] words = str.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

		// 6) Extract all elements from an array with return type of wrapper class
		// "Character"
		for (Character ch : words) {

			// 7) apply condition HashMap Contains Same Key Extract from an array

			if (charMap.containsKey(ch)) {

				// Then use put as a key and get the key return an INTEGER and then ADD + 1
				// Value for
				// update occurrences
				charMap.put(ch, charMap.get(ch) + 1);
			}
			// Or put as new key with value 1
			else {

				charMap.put(ch, 1);
			}

		}

		// 8) Print the HashMap Using EntrySet Method
		// invoke entry set method by using Hash-map refer var.
		// Returns Set<Map.Entry<k,v>>
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();

		// 9) Use for Each loop to extract a single set from entrySet 
		// having return type Map.Entry<k,v>
		for (Map.Entry<Character, Integer> entry : entrySet) {

		// 10) 
			if (entry.getValue() > 1) {

				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}

	}

	public static void main(String[] args) {

		printDuplicateCharacters(null);
		printDuplicateCharacters("");
		printDuplicateCharacters("#");
		printDuplicateCharacters("aditya");
		printDuplicateCharacters("aditya is a tester");

	}

}
