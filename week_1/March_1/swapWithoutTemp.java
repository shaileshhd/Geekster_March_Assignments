package week1.March_1;

// wrte a method to Swap Two Numbers without usng third variable

import java.util.*;

public class swapWithoutTemp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter two numbers: \na = ");
		int a = s.nextInt();
		System.out.print("b = ");
		int b = s.nextInt();
		swapNumbers(a, b);
		s.close();
	}

	static void swapNumbers(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.print("After swap: " + "\na = " + a + "\nb = " + b);
	}
}

//OUTPUT
/*
	Enter two numbers: 
	a = 56
	b = 98
	After swap: 
	a = 98
	b = 56
	
	Enter two numbers: 
	a = 8
	b = 3
	After swap: 
	a = 3
	b = 8
*/