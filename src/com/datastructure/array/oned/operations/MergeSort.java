package com.datastructure.array.oned.operations;

import com.datastructure.utilts.ArrayUtils;
import com.datastructure.utilts.ConsoleLogger;

/**
 * @author suraj
 *
 */
public class MergeSort {

	public static void main(String[] args) {

		int[] a = { 4, 5, 2, 9, 12, 78, 90, 567, 3, 2, 567, 890, 32, 45, 678, 9, 0, 567, 3, 21, 32, 4567 };

		// find the mid
		int start = 0;
		int end = a.length - 1;

		// 1. sort
		ConsoleLogger.printLine();
		ArrayUtils.printArray(a);
		ConsoleLogger.printLine();
		sort(a, start, end);
		ConsoleLogger.printLine();
		ArrayUtils.printArray(a);
		ConsoleLogger.printLine();

	}

	// sort

	private static void sort(int[] arr, int start, int end) {

		if (start < end) {

			// 2. find the mid
			int mid = (start + end) / 2;

			// 3. sort two half recursively
			System.out.println("Divide Left tree: Start : " + start + " End : " + mid);
			sort(arr, start, mid);
			ConsoleLogger.printLine();
			System.out.println("Divide Right tree: Start : " + (mid + 1) + " End : " + end);
			ConsoleLogger.printLine();
			sort(arr, mid + 1, end);
			ConsoleLogger.printLine();

			// 4. merge
			System.out.println("Merge: Start : " + start + " Mid : " + mid + " End : " + end);
			merge(arr, start, mid, end);
		}

	}

	private static void merge(int[] arr, int start, int mid, int end) {

		// 4. Find the size of tow new array;

		int firstArrSize = mid - start + 1;
		int secondArrSize = end - mid;

		// 5. Create two arrays
		int firstHalf[] = new int[firstArrSize];
		int secondHalf[] = new int[secondArrSize];

		// 6. Copy data in first array
		for (int i = 0; i < firstArrSize; i++) {
			firstHalf[i] = arr[start + i];
		}

		// 7. Copy data in second array
		for (int i = 0; i < secondArrSize; i++) {
			secondHalf[i] = arr[mid + 1 + i];
		}

		// 8. Merge 2 arrays

		// index of first and sencond array
		int i = 0, j = 0;

		// int index of meage array
		int k = start;

		while (i < firstArrSize && j < secondArrSize) {

			if (firstHalf[i] < secondHalf[j]) {
				arr[k] = firstHalf[i];
				i++;
			} else {
				arr[k] = secondHalf[j];
				j++;
			}
			k++;
		}

		while (i < firstArrSize) {
			arr[k] = firstHalf[i];
			i++;
			k++;
		}

		while (j < secondArrSize) {
			arr[k] = secondHalf[j];
			j++;
			k++;
		}
		System.out.println("Left tree: " + ArrayUtils.getArray(firstHalf));// ArrayUtils.printArray(firstHalf);
		System.out.println("Right tree: " + ArrayUtils.getArray(secondHalf));

	}

}
