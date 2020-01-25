package com.datastructure.utilts;

import java.io.PrintStream;
import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public class ArrayUtils {

	public static final String ANSI_RED = "\u001B[31m";
	public static final String RESET = "\033[0m"; // Text Reset

	public static void printLine() {
		System.out.println("-------------------------------------");
	}

	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void printArrayHighlights(int a[], int first, int second) {
		for (int i = 0; i < a.length; i++) {
		if (i == first || i == second) {
			System.out.print("[" + a[i] + "] ");
		} else { 
			System.out.print(a[i]+ " ");
		}}
		System.out.println();

	}

	public static void printArrayStat(int a[]) {
		boolean isEmpty = a.length == 0 ? true : false;
		System.out.println("Is empty : " + isEmpty);
		if (!isEmpty)
			System.out.println("Lenght of Array : " + a.length);
	}

}
