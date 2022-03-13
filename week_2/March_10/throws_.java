package week2.March_10;

import java.io.IOException;

public class throws_ {
	public static void main(String[] args) {
		int i = 5;
		int j = 10;
		try {
			div(i, j);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void div(int i, int j) throws IOException {
		System.out.println(j/i);
		throw new IOException("throws exception occured");
	}
}
 
//OUTPUT
/*
	2
	throws exception occured
*/