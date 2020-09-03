package by.java_intro_online.mod02.task35_51_decomposition;

// Write method that find the second largest number in an array.

import java.util.Arrays;

public class Task39 {

	public static void main(String[] args) {

		int array[] = { 10, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.print("Second greatest number of array is " + searchSecondGreat(array));
	}

	public static int searchSecondGreat(int array[]) {

		Arrays.sort(array);

		int sgn = array[array.length - 2];

		return sgn;
	}
}
