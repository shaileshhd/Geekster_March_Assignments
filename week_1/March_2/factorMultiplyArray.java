package week1.March_2;

import java.util.*;

public class factorMultiplyArray {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("input elements to array of length 10");
		int array[] = makeAnArray();
		int multipliedArray[] = factorProductArray(array);
		printArray(multipliedArray);
	}
	
	static int[] makeAnArray() {
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + i + "] = ");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	static int[] factorProductArray(int arr[]) {
		int d = s.nextInt();
		for(int i = 0; i < arr.length; i++) {
			arr[i] *= d;
		}
		return arr;
	}
	
	static void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

//OUTPUT
/*
	input elements to array of length 10
	[0] = 1
	[1] = 2
	[2] = 3
	[3] = 4
	[4] = 5
	[5] = 6
	[6] = 7
	[7] = 8
	[8] = 9
	[9] = 10
	6
	6 12 18 24 30 36 42 48 54 60 
*/