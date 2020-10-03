package by.java_intro_online.mod03.task01_05_string_as_char_array;

// String as char array.
// Find number of numbers in a string.

public class Task04 {

	public static void main(String[] args) {

		String str = "a 01 b 23 c 45 d 67 e 89";
		
		char[] arr = str.toCharArray();

		System.out.print("Number of numbers in the string is " + countNumbers(arr));
	}

	public static int countNumbers(char[] arr) {

		int count = 0;
		boolean detectNumber = false;

		for (int i = 0; i < arr.length; i++) {

			if (Character.isDigit(arr[i]) && !detectNumber) {
				detectNumber = true;
			}
			if (!Character.isDigit(arr[i]) && detectNumber) {
				count++;
				detectNumber = false;
			}

			if (i == arr.length - 1 && detectNumber) {
				count++;
			}
		}
		return count;
	}
}
