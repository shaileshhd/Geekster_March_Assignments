package week1.March_2;

import java.util.*;

// make an array with user inputs of size 10. then print count of all even numbers in an array

public class countEvenNums {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("input elements to array of length 10");
		int array[] = makeAnArray();
		int countEven = countEvenEle(array);
		System.out.println("Count of Evens: " + countEven);
	}

	static int[] makeAnArray() {
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + i + "] = ");
			arr[i] = s.nextInt();
		}
		return arr;
	}

	static int countEvenEle(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		return count;
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
	Count of Evens: 5
*/
