package by.java_intro_online.mod03.task01_05_string_as_char_array;

// String as char array.
// Replace all occurrences of "word" in a string with "letter".

public class Task02 {

	private static final char[] FIRST_INSTANCE = { 'w', 'o', 'r', 'd' };
	private static final char[] SECOND_INSTANCE = { 'l', 'e', 't', 't', 'e', 'r' };

	public static void main(String[] args) {

		String str = "There are words! They have a word and we have a word!";
		System.out.println(str);

		char[] arr = str.toCharArray();
		char[] newArr = replaceAllFirstsWithSeconds(arr);

		String newStr = new String(newArr);
		System.out.print(newStr);
	}

	public static char[] replaceAllFirstsWithSeconds(char[] arr) {

		char[] newArr = arr;

		while (findIndexOfFirstInstance(newArr) >= 0) {
			newArr = replaceFirstWithSecond(newArr);
		}
		return newArr;
	}

	public static char[] replaceFirstWithSecond(char[] arr) {

		char[] newArr = new char[arr.length + SECOND_INSTANCE.length - FIRST_INSTANCE.length];
		int i = findIndexOfFirstInstance(arr);

		for (int j = 0; j < newArr.length; j++) {

			if (j < i) {
				newArr[j] = arr[j];
			}
			if (j >= i && j < i + SECOND_INSTANCE.length) {
				newArr[j] = SECOND_INSTANCE[j - i];
			}
			if (j >= i + SECOND_INSTANCE.length) {
				newArr[j] = arr[j - 2];
			}
		}
		return newArr;
	}

	public static int findIndexOfFirstInstance(char[] arr) {

		for (int i = 0; i <= arr.length - FIRST_INSTANCE.length; i++) {
			if (isInArrayFirstInstance(arr, i)) {
				return i;
			}
		}
		return -1;
	}

	public static boolean isInArrayFirstInstance(char[] arr, int i) {

		for (int j = 0; j < FIRST_INSTANCE.length; j++) {
			if (arr[i + j] != FIRST_INSTANCE[j]) {
				return false;
			}
		}
		return true;
	}
}
