package week1.March_4;

// replace a substring inside a string by another one

import java.util.*;

public class replaceWord {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String sentence = "Hii there, Master";
		System.out.println(sentence);
		System.out.print("Word to place: ");
		String wordTOPlace = s.next();
		System.out.print("Word to replace: ");
		String wordToReplaca = s.next();
		replace(sentence, wordTOPlace, wordToReplaca);
	}

	static void replace(String sentence, String wordPlace, String wordReplace) {
		String newStr = sentence.replace(wordReplace, wordPlace);
		System.out.println("Modified String: " + newStr);
	}
}

//OUTPUT
/*
	Hii there, Master
	Word to place: Geek
	Word to replace: Ma
	Modified String: Hii there, Geekster
*/