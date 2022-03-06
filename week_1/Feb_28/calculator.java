package week1.Feb_28;

import java.util.*;

// Write Calculator program including add, diff, multiply, divide, average and modulo. Include menu driven logic for above operations and ask if user want to continue using do while"

public class calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		addition(a, b);
		subtraction(a, b);
		multiplication(a, b);
		division(a, b);

		boolean again = false;
		do {
			System.out.print("Do You Want To Continue: (Y/N): ");
			char c = s.next().charAt(0);
			if (c == 'Y' || c == 'y') {
				again = true;
				main(null);
				again = false;
			} else {
				again = false;
			}
		} while (again);
		s.close();
	}

	static void addition(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	static void subtraction(int a, int b) {
		int sub = a - b;
		System.out.println(sub);
	}

	static void multiplication(int a, int b) {
		int product = a * b;
		System.out.println(product);
	}

	static void division(int a, int b) {
		float div = (float) a / b;
		System.out.println(div);
	}
}

//OUTPUT
/*
	45
	21
	66
	24
	945
	2.142857
	Do You Want To Continue: (Y/N): y
	
	12
	8
	20
	4
	96
	1.5
	Do You Want To Continue: (Y/N): y
	
	654
	98
	752
	556
	64092
	6.6734695
	Do You Want To Continue: (Y/N): n
*/
