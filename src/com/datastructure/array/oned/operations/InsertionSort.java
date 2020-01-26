package com.datastructure.array.oned.operations;

import com.datastructure.utilts.ArrayUtils;
import com.datastructure.utilts.ConsoleLogger;

/**
 * @author suraj
 *
 */
public class InsertionSort {

	public static void main(String[] args) {

		// create array
		int[] a = { 1, 100, 4, 5, 2, 9, 12, 78, 90, 567, 3, 2, 567, 890, 32, 45, 678, 9, 0, 567, 3, 21, 32, 4567 };

		ConsoleLogger.printLine();
		ArrayUtils.printArray(a);
		ConsoleLogger.printLine();

		for (int i = 0; i < a.length; i++) {
			// ArrayUtils.printArray(a);
			int key = a[i];
			int j = i - 1;
			// System.out.println("Key : " +key+ " J = "+ j);
			while (j >= 0 && a[j] > key) {
				ArrayUtils.printArrayHighlights(a, j + 1, j);
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}

		ConsoleLogger.printLine();
		ArrayUtils.printArray(a);
		ConsoleLogger.printLine();
	}

}
