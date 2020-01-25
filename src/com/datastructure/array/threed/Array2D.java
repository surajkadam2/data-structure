package com.datastructure.array.threed;

import com.datastructure.utilts.ArrayUtils;

public class Array2D {
	
	public static void main(String[] args) {
		
		
		// create array
		int [][] a = {{1,2}, {3,9}};
		
		//retrive
		for (int i = 0; i < a.length; i++) {
			//print outer array
			System.out.println(a[i]);
			for (int j = 0; j < a[i].length; j++) {
				//print inner array
				System.out.println(a[i][j]);
			}
		}
		
		ArrayUtils.printLine();
		// Print as matrix
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		ArrayUtils.printLine();
		
		
		//direct retrive row/coloumn
		System.out.println(a[1][1]);
		
		
		
	}

}
