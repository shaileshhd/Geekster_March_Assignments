package week1.March_1;

import java.util.*;

// write a method to Reverse a Number in Java

public class reverse_Method {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		reverseNum(num);
	}

	static void reverseNum(int n) {
		// find the unit place
		int n1 = n;
		int unitsplace = 1;
		while (n1 > 0) {
			unitsplace *= 10;
			n1 /= 10;
		}
		unitsplace /= 10;

		// reverse the number
		int reverse = 0;
		while (n > 0) {
			reverse += (n % 10) * unitsplace;
			unitsplace /= 10;
			n /= 10;
		}
		System.out.println(reverse);
	}
}

//OUTPUT
/*
	4585
	5854
	
	100302
	203001
	
	2004
	4002
	
	2022
	2202
*/