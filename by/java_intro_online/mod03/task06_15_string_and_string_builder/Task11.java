package by.java_intro_online.mod03.task06_15_string_and_string_builder;

// Using a string, create a new one where each character of the original string is repeated twice.

public class Task11 {

	public static void main(String[] args) {

		String str = "Each characters of this string will be repeated twice";

		int repeater = 2;
		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			for (int j = repeater; j > 0; j--) {
				sb.append(str.charAt(i));
			}
		}

		System.out.println(str);
		System.out.print(sb);
	}

}
