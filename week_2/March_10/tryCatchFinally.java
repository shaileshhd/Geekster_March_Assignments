package week2.March_10;

public class tryCatchFinally {
	public static void main(String[] args) {
		int i = 11, j = 0, k;
		try {
			k = i/j;
			System.out.println(k);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			j++;
		} finally {
			k = i/j;
			System.out.println(k);
		}
	}
}

//OUTPUT
/*
	/ by zero
	11
*/