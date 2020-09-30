package by.java_intro_online.mod03.task01_05_string_as_char_array;

//Given an array of variables names in camel case. Convert the names in snake case.

public class Task01 {

	public static void main(String[] args) {

		String[] variables = { "FirstVariable", "SecondVariable", "ThirdVariable", "FourthVariable", "FifthVariable" };

		for (String string : variables) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		for (String string : variables) {
			System.out.print(convertCamelToSnake(string) + " ");
		}
	}

	public static String convertCamelToSnake(String camelStr) {

		char[] camelCharArray = camelStr.toCharArray();
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

		String snakeStr = String.valueOf(snakeCharArray);

		return snakeStr;
	}

	private static int countOfUpperCase(char[] camelCharArray) {

		int count = 0;

		for (int i = 1; i < camelCharArray.length; i++) {

			if (Character.isUpperCase(camelCharArray[i])) {

				count++;
			}
		}
		return count;
	}
}