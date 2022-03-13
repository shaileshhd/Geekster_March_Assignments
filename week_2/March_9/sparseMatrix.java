package week2.March_9;

public class sparseMatrix {
	public static void main(String[] args) {
		int matrixA[][] = { { 0, 2, 0 }, { 4, 0, 0 }, { 0, 0, 9 } };
		boolean isSparseMatrix = checkSparseMatrix(matrixA);
		System.out.println("sparse matrix: " + isSparseMatrix);
	}

	static boolean checkSparseMatrix(int arr[][]) {
		int zeroCount = 0;
		int non_zerCount = 0;
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
				if (arr[x][y] == 0) {
					zeroCount++;
				} else {
					non_zerCount++;
				}
			}
		}
		if (zeroCount > non_zerCount) {
			return true;
		}
		return false;
	}
}