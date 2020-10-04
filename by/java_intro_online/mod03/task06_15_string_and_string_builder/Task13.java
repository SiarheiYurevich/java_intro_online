package by.java_intro_online.mod03.task06_15_string_and_string_builder;

// There is a string containing words.
// Find and output the longest word. Case if such words are several do not process.

public class Task13 {

	public static void main(String[] args) {

		String str = "one two three seven eleven";

		findLongestWord(str);
	}

	private static void findLongestWord(String str) {

		int length1 = 0;
		int index1 = 0;

		int length2 = 0;

		int temp = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {

				temp = readWord(str, i).length();

				if (temp == length1) {
					length2 = temp;
				}
				if (temp > length1) {
					length1 = temp;
					index1 = i;
				}
			}
			i = i + temp;
		}

		if (length1 == length2) {
			System.out.print("In the string are severel longest words");
		} else {
			System.out.print("The longest word in the string is " + readWord(str, index1));
		}
	}

	public static String readWord(String str, int start) {

		int wordLength = 0;

		for (int i = start; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {
				wordLength++;
			} else {
				break;
			}
		}
		return str.substring(start, start + wordLength);
	}
}
