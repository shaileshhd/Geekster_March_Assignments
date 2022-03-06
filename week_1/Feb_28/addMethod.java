package week1.Feb_28;

// write a method that adds 2 nums and return the answer

import java.util.*;

public class addMethod {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int sum = addition(a, b);
		System.out.println("sum = " + sum);
		s.close();
	}

	static int addition(int a, int b) {
		return a + b;
	}
}

//OUTPUT
/*
	45
	5
	sum = 50
	
	2
	5
	sum = 7
	
	-5
	-6
	sum = -11
*/