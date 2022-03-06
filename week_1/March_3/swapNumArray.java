package week1.March_3;

public class swapNumArray {
	public static void main(String[] args) {
		int arr[] = { 5, 8 };
		swapNums(arr);
	}

	static void swapNums(int arr[]) {
		arr[0] = arr[0] ^ arr[1];
		arr[1] = arr[0] ^ arr[1];
		arr[0] = arr[0] ^ arr[1];
		System.out.print("swapped array: [ " + arr[0] + ", " + arr[1] + " ]");
	}
}

//OUTPUT
/*
	swapped array: [ 8, 5 ]
*/