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

public class Logic {

	public Logic() {
	}

	public ArrayList<Book> getBooksPublishedAfterYear(ArrayList<Book> store, int year) {

		ArrayList<Book> booksPublishedAfterYear = new ArrayList<Book>();

		for (int i = 0; i < store.size(); i++) {
			if (store.get(i).getYear() >= year) {
				booksPublishedAfterYear.add(store.get(i));
			}
		}
		return booksPublishedAfterYear;
	}

	public ArrayList<Book> getBooksOfPublisher(ArrayList<Book> store, String publisher) {

		ArrayList<Book> booksOfPublisher = new ArrayList<Book>();

		for (int i = 0; i < store.size(); i++) {
			if (isTheSameWord(publisher, store.get(i).getPublisher())) {
				booksOfPublisher.add(store.get(i));
			}
		}
		return booksOfPublisher;
	}

	public ArrayList<Book> getBooksOfAuthor(ArrayList<Book> store, String author) {

		ArrayList<Book> booksOfAuthor = new ArrayList<Book>();

		for (int i = 0; i < store.size(); i++) {
			if (isTheSameWord(author, store.get(i).getAuthor())) {
				booksOfAuthor.add(store.get(i));
			}
		}
		return booksOfAuthor;
	}

	private boolean isTheSameWord(String word1, String word2) {

		char[] wordInCharArr1 = word1.toCharArray();
		char[] wordInCharArr2 = word2.toCharArray();

		if (wordInCharArr1.length != wordInCharArr2.length) {
			return false;
		} else {
			for (int i = 0; i < wordInCharArr1.length; i++) {
				if (wordInCharArr1[i] != wordInCharArr2[i]) {
					return false;
				}
			}
		}
		return true;
	}
}
