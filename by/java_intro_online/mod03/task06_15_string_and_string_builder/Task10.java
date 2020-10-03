package by.java_intro_online.mod03.task06_15_string_and_string_builder;

// Count number of 'a' characters in a string.

public class Task10 {

	public static void main(String[] args) {

		String str = "There is counting of 'a' characters in this string";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.print("Number of 'a' characters in the string is " + count);
	}

}