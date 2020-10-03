package by.java_intro_online.mod03.task06_15_string_and_string_builder;

// In a string insert character 'b' after each 'a'.

public class Task07 {

	public static void main(String[] args) {

		String str = "There a lot a of a symbols a in a the a string";

		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < sb.length(); i++) {

			if (sb.charAt(i) == 'a') {
				sb.insert(i + 1, 'b');
			}
		}
		System.out.print(sb);
	}

}
