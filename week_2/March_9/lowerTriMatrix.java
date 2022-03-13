package week2.March_9;

import java.util.Arrays;

public class lowerTriMatrix {
	public static void main(String[] args) {
		int matrixA[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		lowerTriMatrix(matrixA);
	}
	
	static void lowerTriMatrix(int arr[][]) {
		String str[] = new String[arr.length];
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr[x].length; y++) {
				if(y > x) {
					continue;
				}
				System.out.print(arr[x][y] + ", ");
			}
			System.out.println();
		}
	}
}

//OUTPUT
/*
	1, 
	4, 5, 
	7, 8, 9, 
*/