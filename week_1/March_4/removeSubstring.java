package week1.March_4;

// Java Program to Remove a Given Word From a String

import java.util.*;

public class removeSubstring {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = "Hii There, Geekster";
		System.out.print(str + "\nEnter the word to remove: ");
		String word = s.next();
		removeWord(str, word);
	}

	static void removeWord(String str, String word) {
		String newStr = "";
		if (str.contains(word)) {
			newStr = str.replace(word, "");
		} else {
			newStr = "word not found";
		}
		System.out.println("Modified String: " + newStr);
	}
}

//OUTPUT
/*
	Hii There, Geekster
	Enter the word to remove: There
	Modified String: Hii , Geekster
*/