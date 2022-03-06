package week1.Feb_28;

// write 3 different mathods each takes int, float, long numbers as input and returns its multiplication value

import java.util.*;

public class multiplicationValue {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter int values : ");
		int intA = s.nextInt();
		int intB = s.nextInt();

		System.out.println("Enter float values : ");
		float floatA = s.nextFloat();
		float floatB = s.nextFloat();

		System.out.println("Enter long values : ");
		long longA = s.nextLong();
		long longB = s.nextLong();

		int intMul = intProduct(intA, intB);
		float floatMul = floatProduct(floatA, floatB);
		long longMul = longProduct(longA, longB);

		System.out.println("int multiplication : " + intMul + "\nfloat multiplication : " + floatMul
				+ "\nlong multiplication : " + longMul);
	}

	static int intProduct(int a, int b) {
		int mul = a * b;
		return mul;
	}

	static float floatProduct(float a, float b) {
		return a * b;
	}

	static long longProduct(long a, long b) {
		return a * b;
	}
}

//OUTPUT
/*
	Enter int values : 
	5
	6
	Enter float values : 
	5.5
	6.6
	Enter long values : 
	100000
	10000000
	int multiplication : 30
	float multiplication : 36.3
	long multiplication : 1000000000000
*/
