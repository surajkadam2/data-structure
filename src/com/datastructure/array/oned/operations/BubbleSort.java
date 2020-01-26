package com.datastructure.array.oned.operations;

import com.datastructure.utilts.ArrayUtils;
import com.datastructure.utilts.ConsoleLogger;

/**
 * @author suraj
 *
 */
public class BubbleSort {

	public static void main(String[] args) {

		ConsoleLogger.outputToFile(BubbleSort.class);

		// create array
		int[] a = { 1, 100, 4, 5, 2, 9, 12, 78, 90, 567, 3, 2, 567, 890, 32, 45, 678, 9, 0, 567, 3, 21, 32, 4567 };

		ConsoleLogger.printLine();
		ArrayUtils.printArray(a);
		ConsoleLogger.printLine();

		for (int i = 0; i < a.length - 1; i++) {
			System.out.println("Pass = " + i);
			ArrayUtils.printArray(a);
			for (int j = 0; j < a.length - i - 1; j++) {
				ArrayUtils.printArrayHighlights(a, j, j + 1);
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}

		ConsoleLogger.printLine();
		ArrayUtils.printArray(a);
		ConsoleLogger.printLine();

		for (int i = 0; i < a.length - 1; i++) {
			System.out.println("Pass = " + i);
			for (int j = 0; j < a.length - i - 1; j++) {
				ArrayUtils.printArrayHighlights(a, j, j + 1);
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}
		ConsoleLogger.printLine();
		ArrayUtils.printArray(a);
		ConsoleLogger.printLine();

	}
}
