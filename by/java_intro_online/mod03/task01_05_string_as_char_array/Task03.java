package by.java_intro_online.mod03.task01_05_string_as_char_array;

// String as char array.
// Find number of digits in a string.

public class Task03 {

	public static void main(String[] args) {

		String str = "a 01 b 23 c 45 d 67 e 89";
		
		char[] arr = str.toCharArray();

		System.out.print("Number of digits in the string is " + countDigits(arr));
	}

	public static int countDigits(char[] arr) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (Character.isDigit(arr[i])) {
				count++;
			}
		}
		return count;
	}
}
