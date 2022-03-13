package week2.March_7;

// Java Program to find all the permutations of a string

public class permutationString {
	public static void main(String[] args) {
		String str = "abcd";
		Permutations(str);
	}
	
	static void Permutations(String str) {
		char arr[] = str.toCharArray();
		int length = arr.length;
		int fact = 1;
		while(length > 0) {
			fact *= length;
			length--;
		}
		int limit = fact/arr.length;
		int z = 1;
		int k = 0;
		for(int i = 0; i < limit; i++) {
			int count = 0;
			for(int j = k; j < arr.length + k; j++) {
				if(j == arr.length) {
					j = 0;
				}
				int prev = (j-z) < 0 ? arr.length - z: j-z;
				int next = (j+z) < arr.length ? j+z : 0;
				char temp = arr[prev];
				arr[prev] = arr[next];
				arr[next] = temp;
				System.out.println(String.valueOf(arr));
				count++;
				System.out.println(count);
				if(count == arr.length) {
					break;
				}
			}
			k++;
			
		}
	}
}