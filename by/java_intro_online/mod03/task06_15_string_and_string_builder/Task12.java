package by.java_intro_online.mod03.task06_15_string_and_string_builder;

// Remove all repeated characters and all spaces from string.

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

		String str = inputString("Enter string >> ");

		System.out.println("Cleaned string: " + removeRepeatingsAndSpaces(str));
	}

	public static String removeRepeatingsAndSpaces(String str) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (checkContent(sb, c) && c != ' ') {
				sb.append(c);
			}
		}
		String cutStr = new String(sb);

		return cutStr;
	}

	private static boolean checkContent(StringBuilder sb, char c) {

		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == c) {
				return false;
			}
		}
		return true;
	}

	private static String inputString(String message) {

		String string;

		@SuppressWarnings("resource")
		Scanner inputString = new Scanner(System.in);

		System.out.print(message);

		string = inputString.nextLine();

		return string;
	}
}
