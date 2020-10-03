package by.java_intro_online.mod03.task06_15_string_and_string_builder;

// Using copy and concatenation operation build word 'tomato' from characters of word 'information'.

public class Task09 {

	public static void main(String[] args) {

		String source = "information";
		String template = "tomato";

		StringBuilder target = new StringBuilder();

		for (int i = 0; i < template.length(); i++) {

			for (int j = 0; j < source.length(); j++) {

				if (template.charAt(i) == source.charAt(j)) {
					target.append(source.charAt(j));
					break;
				}
			}
		}
		System.out.print(target);
	}

}
