package week2.March_7;

// Java Program to print smallest and biggest possible palindrome word in a given string

public class largestPalindrome {
	static int length = 0;
	static String largestPalindromesStore = "";
	static String smallestPalindromeStore = "";

	public static void main(String[] args) {
		String str = "eyeinitheSky";
		getSubString(str);
		System.out.println("Largest palindromes are: " + largestPalindromesStore);
		System.out.println("Smallest palindromes are: " + smallestPalindromeStore);
	}

	static void getSubString(String str) {
		String sub = "";
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			int end = str.length() + i - j;
			if (end > str.length()) {
				i = -1;
				j++;
				continue;
			}
			sub = str.substring(i, end);
			isPalindrome(sub);
		}
	}

	static void isPalindrome(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
				count++;
			}

			if (count == str.length() && str.length() >= length) {
				length = str.length();
				largestPalindromesStore += str + ", ";
			} else if (count == str.length() && str.length() == 1) {
				smallestPalindromeStore += str + ", ";
			}
		}
	}
}

//OUTPUT
/*
	Largest palindromes are: eye, ini, 
	Smallest palindromes are: e, y, e, i, n, i, t, h, e, S, k, y, 
*/
