package week2.March_9;

public class oddEvenFreq {
	public static void main(String[] args) {
		int matrixA[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		oddEvenCount(matrixA);
	}

	static void oddEvenCount(int arr[][]) {
		int oddCount = 0;
		int evenCount = 0;
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
				if (arr[x][y] % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}
			}
		}
		System.out.println("odd frequency : " + oddCount + "\neven frequency : " + evenCount);
	}
}

//OUTPUT
/*
	odd frequency : 5
	even frequency : 4
*/