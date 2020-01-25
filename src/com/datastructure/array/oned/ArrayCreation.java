package com.datastructure.array.oned;

import com.datastructure.utilts.ArrayUtils;

public class ArrayCreation {

	public static void main(String[] args) {

		// Create int array
		int[] intA = { 1, 2, 3, 4, 5 };

		// print Array
		for (int i = 0; i < intA.length; i++) {
			System.out.println(i);
		}
		ArrayUtils.printLine();

		// Create int array with size
		int[] B = new int[10];

		// add values
		for (int i = 0; i < B.length; i++) {
			B[i] = i;
		}

		// print Array
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
		ArrayUtils.printLine();

		// Retrieve element from array from position
		int index = 25;
		if (index < B.length) {
			System.out.println(B[index]);
			ArrayUtils.printLine();
		}

		int keyToFind = 9;
		boolean isPresent = false;
		// Is array contains a key
		for (int i = 0; i < B.length; i++) {
			if (B[i] == keyToFind) {
				isPresent = true;
				break;
			}
		}
		System.out.println(isPresent);
		ArrayUtils.printLine();

		// delete int 5 from B array
		int key = 5;

		// Find the index of i
		int indexOfKey = 0;
		for (int i = 0; i < B.length; i++) {
			if (B[i] == key) {
				indexOfKey = i;
			}
		}

		// remove element
		// Determine new size after removal
		int newLen = B.length - 1;

		// start from index of key upto new len
		// Assign next element to current
		for (int i = indexOfKey; i < newLen; i++) {
			B[i] = B[i + 1];
		}

		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
		ArrayUtils.printLine();

	}
}
