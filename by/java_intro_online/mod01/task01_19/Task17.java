package by.java_intro_online.mod01.task01_19;

// Display the correspondence between symbols and their numerical designation.

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {

		char ch;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter symbol >> ");

		ch = scan.next().charAt(0);

		System.out.print(ch + " - " + (int) ch);

	}
}