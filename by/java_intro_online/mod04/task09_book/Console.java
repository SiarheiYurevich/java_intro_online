package by.java_intro_online.mod04.task09_book;

/* Create a class Book whose specification is given below.
 * Write constructors, set- and get- methods, and toString method.
 * Write a class that aggregates an array of type Book with appropriate constructors and methods.
 * Specify data selection criteria and output this data to the console.
 * Book: id, name, author(s), publisher, year of publication, number of pages, price, binding type.
 * Find and output:
 * a) list of books of specified author;
 * b) list of books of specified publisher;
 * c) list of books published after specified year.
 */

import java.util.ArrayList;

public class Console {

	public Console() {
	}

	public void outputBooks(ArrayList<Book> store) {

		for (int i = 0; i < store.size(); i++) {
			System.out.println(store.get(i));
		}
	}

}
