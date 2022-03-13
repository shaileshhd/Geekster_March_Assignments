package week2.March_7;

// Java Program to swap two string variables without using third or temp variable.

public class swapStrings {
	public static void main(String[] args) {
		String str1 = "Hii there!";
		String str2 = "How are you???";

		str1 = str1.concat(str2);
		System.out.println(str1);

		str2 = str1.substring(0, str1.length() - str2.length());
		System.out.println(str2);

		str1 = str1.replace(str2, "");
		System.out.println(str1);
	}
}
