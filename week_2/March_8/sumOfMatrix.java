package week2.March_8;

import java.util.Arrays;

public class sumOfMatrix {
	public static void main(String[] args) {
		int matrixA[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int matrixB[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		String sumMatrix = sumMatrix(matrixA, matrixB);
		System.out.println(sumMatrix);
	}

	static String sumMatrix(int arr1[][], int arr2[][]) {
		int sum[][] = new int[arr1.length][arr1[arr1.length - 1].length];
		String str[] = new String[sum.length];
		for (int x = 0; x < sum.length; x++) {
			for (int y = 0; y < sum[x].length; y++) {
				sum[x][y] = arr1[x][y] + arr2[x][y];
			}
			str[x] = Arrays.toString(sum[x]);
		}
		return Arrays.toString(str);
	}
}

//OUTPUT
/*
	[[2, 4, 6], [8, 10, 12], [14, 16, 18]]
*/
