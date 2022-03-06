package week1.March_3;

import java.util.*;

public class differenceOfArrays {
	public static void main(String[] args) {
		int arr1[] = { 1, 5, 6, 8, 19, 46, 54, 8, 7, 5 };
		int arr2[] = { 5, 6, 8, 5, 21, 35, 45, 6, 98, 4 };
		int diffArray[] = (arr1.length >= arr2.length) ? differenceOfArr(arr1, arr2) : differenceOfArr(arr2, arr1);
		printArray(diffArray);
	}

	static int[] differenceOfArr(int large[], int small[]) {
		int diffArray[] = large;
		for (int i = 0; i < small.length; i++) {
			diffArray[i] -= small[i];
		}
		return diffArray;
	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

//OUTPUT
/*
	-4 -1 -2 3 -2 11 9 2 -91 1 
*/