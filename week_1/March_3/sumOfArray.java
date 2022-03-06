package week1.March_3;

// write a method to return sum of array

public class sumOfArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 6, 90, 8, 50 };
		int sum = sumArray(arr);
		System.out.println("sum of array = " + sum);
	}

	static int sumArray(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}

//OUTPUT
/*
	sum of array = 162
*/