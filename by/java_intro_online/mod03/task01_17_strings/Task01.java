package by.java_intro_online.mod03.task01_17_strings;

// Given an array of variables names in camel case. Convert the names in snake case.

public class Task01 {

	public static void main(String[] args) {

		String[] variableNames = { "FirstVariable", "SecondVariable", "ThirdVariable", "FourthVariable", "FifthVariable" };

		print(variableNames);

		print(convertStrings(variableNames));

	}

	public static String[] convertStrings(String[] strings) {

		String[] newStrings = new String[strings.length];

		for (int i = 0; i < strings.length; i++) {

			newStrings[i] = camelToSnake(strings[i]);
		}
		return newStrings;
	}

	public static String camelToSnake(String camel) {

		String snake = "" + Character.toLowerCase(camel.charAt(0));

		for (int i = 1; i < camel.length(); i++) {

			char c = camel.charAt(i);

			if (Character.isUpperCase(c)) {

				snake = snake + "_" + Character.toLowerCase(c);

			} else {

				snake = snake + c;
			}
		}
		return snake;
	}
	
	public static void print(String[] stringArray) {

		for (int i = 0; i < stringArray.length; i++) {

			System.out.print(stringArray[i] + " ");
		}
		System.out.println();
	}

}
