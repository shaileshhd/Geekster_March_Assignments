package week1.March_3;

import java.util.*;
// WAP to find first index at which element is present in array

public class firstIndexOfElement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = { 1, 2, 3, 5, 6, 5, 8, 2, 9, 6, 10 };
		findIndex(arr, n);
	}

	static void findIndex(int arr[], int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				System.out.println("First index of element = " + i);
				break;
			}
		}
	}
}

//OUTPUT
/*
	2
	First index of element = 1
	
	3
	First index of element = 2
	
	6
	First index of element = 4
*/