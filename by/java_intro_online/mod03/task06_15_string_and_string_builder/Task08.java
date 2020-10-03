package by.java_intro_online.mod03.task06_15_string_and_string_builder;

// Check if a word is a palindrome.

public class Task08 {

	public static void main(String[] args) {

		String w1 = "word";
		String w2 = "madam";

		checkOnPalindrome(w1);
		checkOnPalindrome(w2);
	}

	public static void checkOnPalindrome(String str) {

		StringBuilder sb = new StringBuilder(str);
		String str2 = new String(sb.reverse());

		if (str.equals(str2)) {
			System.out.println(str + " - is palindrome");
		} else {
			System.out.println(str + " - is not palindrome");
		}
	}
}
