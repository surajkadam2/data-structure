package com.datastructure.utilts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import com.datastructure.array.oned.operations.BubbleSort;

public class ConsoleLogger {

	public static void printLine() {
		System.out.println("-------------------------------------");
	}
	
	private static void outputToFile(String className) { 

		PrintStream printStream;
		try {
			printStream = new PrintStream("output/"+new File(className+"_output.txt"));
			System.setOut(printStream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static <T> void outputToFile(Class<T> clazz1) {
		PrintStream printStream;
		try {
			printStream = new PrintStream("output/"+new File(clazz1.getName()+"_output.txt"));
			System.setOut(printStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
