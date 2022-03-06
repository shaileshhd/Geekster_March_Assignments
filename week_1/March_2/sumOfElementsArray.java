package week1.March_2;

import java.util.*;

// make an array with user inputs of size 10. , then find sum of all elements in array

public class sumOfElementsArray {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("input elements to array of length 10");
		int array[] = makeAnArray();
		int sum = sumOfElements(array);
		System.out.println("sum of array elements = " + sum);
	}

	static int[] makeAnArray() {
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + i + "] = ");
			arr[i] = s.nextInt();
		}
		return arr;
	}

	static int sumOfElements(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}

//OUTPUT
/*
	input elements to array of length 10
	[0] = 5
	[1] = 6
	[2] = 45
	[3] = 56
	[4] = 2
	[5] = 3
	[6] = 4
	[7] = 5
	[8] = 6
	[9] = 1
	sum of array elements = 133
*/
