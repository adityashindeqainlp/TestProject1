package FAQ;

import java.util.Arrays;

public class P17_BinarySearch {

	public static void main(String[] args) {

		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Required Sorted Array

		boolean flag = false;
		int key = 5;
		int l = 0;
		int h = a.length - 1;

		while (l <= h) {

			int m = (l + h) / 2;

			if (a[m] == key) {

				System.out.println("Element Found ...");
				flag = true;
				break;
			}

			if (key > a[m]) {

				l = m + 1;
			}
			if (key < a[m]) {

				h = m - 1;
			}
		}

		if (flag == false) {

			System.out.println("Element Not Found......");
		}
		
	/*Approach 2 Binary Search Method From Arrays Class(ArrayName , Key)*/	
		
	//System.out.println(Arrays.binarySearch(a, 7));
		
		
		
	}

}
