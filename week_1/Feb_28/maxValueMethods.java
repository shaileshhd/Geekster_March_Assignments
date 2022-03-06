package week1.Feb_28;

// write 3 different mathods each takes different number of int arguments and return its max value

public class maxValueMethods {
	public static void main(String[] args) {
		int a = 6, b = 5;
		int method1 = maxValue1(a, b);
		System.out.println("Method1 = " + method1);

		int c = 8, d = 9;
		int method2 = maxValue2(c, d);
		System.out.println("Method2 = " + method2);

		int e = 25, f = 56;
		int method3 = maxValue3(e, f);
		System.out.println("Method3 = " + method3);
	}

	static int maxValue1(int a, int b) {
		return (a > b) ? a : b;
	}

	static int maxValue2(int a, int b) {
		return (a > b) ? a : b;
	}

	static int maxValue3(int a, int b) {
		return (a > b) ? a : b;
	}
}

//OUTPUT
/*
	Method1 = 6
	Method2 = 9
	Method3 = 56
*/