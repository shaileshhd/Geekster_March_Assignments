package week2.March_10;

// Java Program to Use Try and Catch for Exception Handling

public class tryCatch {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		int k;
		try {
			k = i/j;
			System.out.println(k);
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

//OUTPUT
/*
	/ by zero
*/