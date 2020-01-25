package com.datastructure.array.oned.operations;

import com.datastructure.utilts.ArrayUtils;
import com.datastructure.utilts.ConsoleLogger;

public class SelectionSort {

	public static void main(String[] args) {

		// Algorithm

		// create array
		int[] a = { 4, 5, 2, 9, 12, 78, 90, 567, 3, 2, 567, 890, 32, 45, 678, 9, 0, 567, 3, 21, 32, 4567 };
		ArrayUtils.printArrayStat(a);
		ConsoleLogger.printLine();
		ArrayUtils.printArray(a);
		ConsoleLogger.printLine();

		// 1. Find then min ele in array and place at start

		// asc
		for (int i = 0; i < a.length-1; i++) {
			ConsoleLogger.printLine();
			System.out.println("Pass = " + i);
			ConsoleLogger.printLine();
			for (int j = i + 1; j < a.length; j++) {
				ArrayUtils.printArrayHighlights(a, i, j);
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		ConsoleLogger.printLine();
		ArrayUtils.printArray(a);
		ConsoleLogger.printLine();

		// desc
		for (int i = 0; i < a.length; i++) {
			ConsoleLogger.printLine();
			System.out.println("Pass = " + i);
			ConsoleLogger.printLine();
			for (int j = i + 1; j < a.length; j++) {
				ArrayUtils.printArrayHighlights(a, i, j);
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		ConsoleLogger.printLine();
		ArrayUtils.printArray(a);
		ConsoleLogger.printLine();

	}

}
