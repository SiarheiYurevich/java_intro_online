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

public class BookStore {

	private ArrayList<Book> store;

	{
		store = new ArrayList<Book>();
	}

	public BookStore() {
	}

	public BookStore(int numberOfBooks) {
		store = new ArrayList<Book>(numberOfBooks);
	}

	public ArrayList<Book> getStore() {
		return store;
	}

	public void addBook(Book book) {
		store.add(book);
	}

	public void addStackOfBooks(ArrayList<Book> stack) {
		store.addAll(stack);
	}

	@Override
	public String toString() {
		return "Book store [ " + store + " ]";
	}
}
