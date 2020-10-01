package by.java_intro_online.mod03.task01_05_string_as_char_array;

// String as char array.
// Remove all excess spaces in a string.

public class Task05 {

	public static void main(String[] args) {

		String str = " There are  many  excess      spaces  in  this string  ,  but   soon they   all   will   be deleted  !  ";
		System.out.println(str);

		char[] arr = str.toCharArray();
		char[] newArr = removeExcessSpaces(arr);

		String newStr = new String(newArr);
		System.out.print(newStr);

	}

	public static char[] removeExcessSpaces(char[] arr) {

		char[] newArr = arr;

		while (findExcessSpace(newArr) >= 0) {
			newArr = removeSpace(newArr);
		}
		return newArr;
	}

	private static char[] removeSpace(char[] arr) {

		char[] newArr = new char[arr.length - 1];
		int index = findExcessSpace(arr);

		for (int i = 0; i < newArr.length; i++) {

			if (i < index) {
				newArr[i] = arr[i];
			}
			if (i >= index) {
				newArr[i] = arr[i + 1];
			}
		}
		return newArr;
	}

	private static int findExcessSpace(char[] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == ' ') {

				// excess space at beginning, middle and end of string
				if (i == 0 || i < arr.length - 1 && arr[i + 1] == ' ' || i == arr.length - 1) {
					return i;
				}

				// before . , ! ?
				if (arr[i + 1] == '.' || arr[i + 1] == ',' || arr[i + 1] == '!' || arr[i + 1] == '?') {
					return i;
				}
			}
		}
		return -1;
	}
}
