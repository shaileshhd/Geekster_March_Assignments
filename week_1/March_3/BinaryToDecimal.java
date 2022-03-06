package week1.March_3;

// WAP to convert binary number to decimal

import java.util.*;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int binary = s.nextInt();
		int decimal = binToDeci(binary);
		System.out.println("binary to decimal = " + decimal);
	}
	
	static int binToDeci(int binary) {
		int deci = 0;
		int pow = 0;
		while(binary > 0) {
			deci += (binary%10) * Math.pow(2, pow);
			pow++;
			binary /= 10;
		}
		return deci;
	}
}