package week1.March_2;

import java.util.*;

// make an array with user inputs of size 10. , then find midle element in an array

public class middleElementArray {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("input elements to array of length 10");
		int array[] = makeAnArray();
		String middleElement = findMiddleElement(array);
		System.out.println("Middle Element/s: " + middleElement);
	}

	static int[] makeAnArray() {
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + i + "] = ");
			arr[i] = s.nextInt();
		}
		return arr;
	}

	static String findMiddleElement(int arr[]) {
		String middleArrayString = "";
		int j = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(i - j) == 1) {
				middleArrayString = arr[j] + " " + arr[i];
			} else if (i == j) {
				middleArrayString += arr[i];
			}
			j--;
		}
		return middleArrayString;
	}
}

//OUTPUT
/*
	input elements to array of length 10
	[0] = 12
	[1] = 32
	[2] = 45
	[3] = 65
	[4] = 78
	[5] = 98
	[6] = 15
	[7] = 95
	[8] = 75
	[9] = 35
	Middle Element/s: 78 98
*/