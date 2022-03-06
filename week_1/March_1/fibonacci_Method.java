package week1.March_1;

import java.util.*;

// write a method to print fibonacci series

public class fibonacci_Method {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter nth value: ");
		int n = s.nextInt();
		fibonacci(n);
		s.close();
	}

	static void fibonacci(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		if (n == 0) {
			System.out.println(a);
		} else if (n == 1) {
			System.out.println(b);
		} else {
			System.out.print(a + " " + b);
			for (int i = 2; i <= n; i++) {
				c = a + b;
				a = b;
				b = c;
				System.out.print(" " + c);
			}
		}
	}
}

//OUTPUT
/*
Enter nth value: 0
0
Enter nth value: 1
1
Enter nth value: 2
0 1 1
Enter nth value: 10
0 1 1 2 3 5 8 13 21 34 55
*/
