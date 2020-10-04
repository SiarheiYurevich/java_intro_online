package by.java_intro_online.mod03.task06_15_string_and_string_builder;

// Find number of sentences in a string.
// The sentences are separated by periods, exclamation or question marks.

public class Task15 {
	
	public static void main(String [] args) {
		
		String str = "One. Two! Three?";
		
		System.out.print("Number of sentences in the string is " + countSentences(str));
	}
	
	public static int countSentences(String str) {
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			char c = str.charAt(i);
			
			if (c == '.' || c == '!' || c == '?') {
				count++;
			}
		}
		return count;
	}
}
