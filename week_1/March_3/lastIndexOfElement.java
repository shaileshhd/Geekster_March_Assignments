package week1.March_3;

// WAP to find last index at which element is present in array

import java.util.*;

public class lastIndexOfElement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = { 1, 2, 3, 5, 6, 5, 8, 2, 9, 6, 10 };
		lastIndex(arr, n);
	}

	static void lastIndex(int arr[], int n) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				index = i;
			}
		}
		System.out.println("Last Index Of Element = " + index);
	}
}

//OUTPUT
/*
	5
	Last Index Of Element = 5
	
	6
	Last Index Of Element = 9
	
	2
	Last Index Of Element = 7
*/