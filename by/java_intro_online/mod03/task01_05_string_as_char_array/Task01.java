package by.java_intro_online.mod03.task01_05_string_as_char_array;

// String as char array.
// Given an array of variables names in camel case. Convert the names in snake case.

public class Task01 {

	public static void main(String[] args) {

		String[] variableNames = { "FirstVariable", "SecondVariable", "ThirdVariable", "FourthVariable", "FifthVariable" };
		print(variableNames);

		String[] variable_names = convertCamelToSnake(variableNames);
		print(variable_names);
	}

	public static String[] convertCamelToSnake(String[] camelNames) {

		String[] snake_names = new String[camelNames.length];

		for (int i = 0; i < snake_names.length; i++) {
			snake_names[i] = convertCamelToSnake(camelNames[i]);
		}
		return snake_names;
	}

	public static String convertCamelToSnake(String camelName) {

		char[] camelCharArray = camelName.toCharArray();
		char[] snakeCharArray = new char[camelCharArray.length + countOfUpperCase(camelCharArray)];
		int count = 0;

		snakeCharArray[0] = Character.toLowerCase(camelCharArray[0]);

		for (int i = 1; i < camelCharArray.length; i++) {

			char c = camelCharArray[i];

			if (Character.isUpperCase(c)) {

				snakeCharArray[i + count] = '_';
				count++;
				snakeCharArray[i + count] = Character.toLowerCase(c);

			} else {

				snakeCharArray[i + count] = c;
			}
		}
		String snake_name = String.valueOf(snakeCharArray);

		return snake_name;
	}

	public static int countOfUpperCase(char[] camelCharArray) {

		int count = 0;

		for (int i = 1; i < camelCharArray.length; i++) {

			if (Character.isUpperCase(camelCharArray[i])) {

				count++;
			}
		}
		return count;
	}

	public static void print(String[] strings) {

		for (String string : strings) {
			System.out.print(string + " ");
		}
		System.out.println();
	}
}