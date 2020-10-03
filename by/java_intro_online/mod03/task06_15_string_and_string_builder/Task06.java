package by.java_intro_online.mod03.task06_15_string_and_string_builder;

// Find the largest number of consecutive spaces in a string.

public class Task06 {

	public static void main(String[] args) {

		String str = "   There    are   ten   spaces  in   brackets (          )  !    ";

		System.out.print(countMaxSpaceRow(str));
	}

	public static int countMaxSpaceRow(String str) {

		int count = 0;
		int tempCount = 0;

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (isSpace(c)) {
				tempCount++;
				if (i == str.length() - 1 && tempCount > count) {
					count = tempCount;
				}
			}
			if (!isSpace(c) && tempCount != 0) {
				if (tempCount > count) {
					count = tempCount;
				}
				tempCount = 0;
			}
		}
		return count;
	}

	public static boolean isSpace(char c) {
		if (c == ' ') {
			return true;
		}
		return false;
	}
}
