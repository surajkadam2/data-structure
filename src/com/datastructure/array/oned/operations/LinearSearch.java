package com.datastructure.array.oned.operations;

import com.datastructure.utilts.ArrayUtils;
import com.datastructure.utilts.ConsoleLogger;

/**
 * @author suraj
 *
 */
public class LinearSearch {

	public static void main(String[] args) {

		ConsoleLogger.outputToFile(LinearSearch.class);

		// create array
		int[] a = { 4, 5, 2, 9, 12, 78, 90, 567, 3, 2, 567, 890, 32, 45, 678, 9, 0, 567, 3, 21, 32, 4567 };

		ArrayUtils.printArray(a);

		// key
		int key = 9;

		int count = 0;
		// search key position
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				System.out.println(i);
				count++;
			}
		}
		ConsoleLogger.printLine();

		System.out.println("Number of " + key + " occurance = " + count);

	}

}
