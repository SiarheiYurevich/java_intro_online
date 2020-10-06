package by.java_intro_online.mod03.task06_15_string_and_string_builder;

import java.util.Scanner;

// Count number of upper case and lower case letters (English alphabet) in an entered string.

public class Task14 {

	public static void main(String[] args) {

		String str = inputString("Enter string >>");

		countLetters(str);
	}

	private static void countLetters(String str) {

		int upper = 0;
		int lower = 0;

		for (int i = 0; i < str.length(); i++) {
			
			char letter = str.charAt(i);

			if (letter >= 'A' && letter <= 'Z') {
				upper++;
			}
			if (letter >= 'a' && letter <= 'z') {
				lower++;
			}
		}
		System.out.println("Number of upper case letters in the string is " + upper);
		System.out.println("Number of lower case letters in the string is " + lower);

	}

	private static String inputString(String message) {

		@SuppressWarnings("resource")
		Scanner inputString = new Scanner(System.in);

		System.out.print(message);

		String string = inputString.nextLine();

		return string;
	}

}
