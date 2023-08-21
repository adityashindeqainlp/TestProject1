package FAQ_Twisted;

import java.util.HashSet;
import java.util.Set;

/**
 * Find The Duplicate Elements in String Array Method 1 Brute Force Using 2 For
 * Loops and 1 if Statement Algorithm
 * 
 * 
 */

public class P12 {

	public static void main(String[] args) {

		System.out.println("************************Burte Force Mechanism******************");

		String[] ar = { "Aws", "Azure", "Jenkins", "Selenium", "Aws", "Jenkins", "Karate", "Azure" };

		for (int i = 0; i < ar.length; i++) {

			for (int j = i + 1; j < ar.length; j++) {

				if (ar[i].equals(ar[j])) {

					System.out.println(ar[i]);
				}
			}
		}

		System.out.println("************************Hash Set Mechanism******************");

		Set<String> data = new HashSet<String>();

		for (String a : ar) {

			if (data.add(a) == false) {

				System.out.println(a);
			}
		}

	}

}
