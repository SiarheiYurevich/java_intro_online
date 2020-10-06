package by.java_intro_online.mod03.task06_15_string_and_string_builder;

// There is a string containing words.
// Find and output the longest word. Case if such words are several do not process.

public class Task13 {

	public static void main(String[] args) {

		String str = "one two three seven eleven";

		findLongestWord(str);
	}

	private static void findLongestWord(String str) {

		int lengthFirstWord = 0;
		int indexFirstWord = 0;
		int lengthSecondWord = 0;
		int temp = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {

				temp = readWord(str, i).length();

				if (temp == lengthFirstWord) {
					lengthSecondWord = temp;
				}
				if (temp > lengthFirstWord) {
					lengthFirstWord = temp;
					indexFirstWord = i;
				}
			}
			i = i + temp;
		}

		if (lengthFirstWord == lengthSecondWord) {
			System.out.print("In the string are severel longest words");
		} else {
			System.out.print("The longest word in the string is " + readWord(str, indexFirstWord));
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
