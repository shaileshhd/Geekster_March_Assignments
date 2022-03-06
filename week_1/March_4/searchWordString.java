package week1.March_4;

// search a word inside a string?

public class searchWordString {
	public static void main(String[] args) {
		String word = "Geekster";
		String str = "Hii Geekster";
		searchString(str, word);
	}

	static void searchString(String str, String word) {
		str = str.toLowerCase();
		word = word.toLowerCase();

		System.out.println(str);
		if (str.contains(word)) {
			System.out.print("word is present in str of index: " + str.indexOf(word));
		} else {
			System.out.println("word isn't present in str");
		}
	}
}
