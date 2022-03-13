package week2.March_10;

public class nestedTry {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		try {
			System.out.println(arr[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getLocalizedMessage());
			try {
				int i = 4;
				System.out.println(arr[i]);
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		}
	}
}

//OUTPUT
/*
Index 6 out of bounds for length 5
5
*/