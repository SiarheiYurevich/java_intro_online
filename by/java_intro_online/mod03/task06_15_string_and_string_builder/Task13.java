package by.java_intro_online.mod03.task06_15_string_and_string_builder;

// There is a string containing words.
// Find and output the longest word. Case if such words are several do not process.

public class Task13 {

	public static void main(String[] args) {

		String str = "one two three seven eleven";

		if (isOneLongestWord(str)) {
			System.out.print(findLongestWord(str));
		} else {
			System.out.print("In the string are severel longest words");
		}
	}

	public static String findLongestWord(String str) {

		String longest = "";
		int index = 0;
		int temp = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {

				temp = countWordLength(str, i);

				if (temp > index) {
					index = temp;
					longest = str.substring(i, i + temp);
				}
				i = i + temp;
			}
		}
		return longest;
	}

	public static int countWordLength(String str, int startIndex) {

		int wordLength = 0;

		for (int i = startIndex; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {
				wordLength++;
			} else {
				break;
			}
		}
		return wordLength;
	}

	private static boolean isOneLongestWord(String str) {

		int l1 = 0;
		int l2 = 0;

		int temp = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {
				temp = countWordLength(str, i);

				if (temp == l1) {
					l2 = temp;
				}
				if (temp > l1) {
					l1 = temp;
				}

			}
			i = i + temp;
		}
		if (l1 == l2) {
			return false;
		}
		return true;
	}

}
