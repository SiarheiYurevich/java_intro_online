package by.java_intro_online.mod01.task01_19;

//Find the sum of squares of first hundred numbers.

public class Task14 {

	public static void main(String[] args) {

		int i;
		int sum;

		sum = 0;

		for (i = 1; i <= 100; i += 1) {

			sum += i * i;
		}

		System.out.print(sum);
	}
}